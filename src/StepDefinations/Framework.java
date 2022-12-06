package StepDefinations;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

import StepRunner.Runner;
import cucumber.api.java.en.Given;

public class Framework {
	
	public static String Basepathet;
	public static String sReportPath;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest WriteExtentReport;
	public static ExtentTest test;
	public static int iHeader=0;
	public static String SScreenshotdirpath;
	public static String sScreenshotFilePath;
	public static String sTCNew;
	public static String Category;
	
	public static void getreportfilename()
	{
		Basepathet = System.getProperty("user.dir") + "/Reports and Screenshots";
		Calendar cal = Calendar.getInstance();    
		File Dir = new File(Basepathet);
		Dir.mkdir();
		int year = cal.get(Calendar.YEAR);
		Dir = new File(Basepathet+"/"+year);
		Dir.mkdir();
		int month = cal.get(Calendar.MONTH);
		Dir = new File(Basepathet+"/"+year+"/"+(month+1));
		Dir.mkdir();
		int day = cal.get(Calendar.DATE);
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day);
		Dir.mkdir();
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day+"/"+System.getProperty("user.name"));
		Dir.mkdir();
		Date sDate = new Date();
		Dir = new File(Basepathet+"/"+year+"/"+(month+1)+"/"+day+"/"+System.getProperty("user.name")+"/Testrun_"+sDate.getHours()+"_"+sDate.getMinutes()+"_"+sDate.getSeconds());
		Dir.mkdir();
		sReportPath = Dir.getAbsolutePath();
	}
	
	public static void statextentreport() throws UnknownHostException
	{
		htmlReporter = new ExtentHtmlReporter(sReportPath+"/Report.html");
		htmlReporter.config().setDocumentTitle("Functional Testing");
		htmlReporter.config().setReportName("Functional Testing report");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//extent.setSystemInfo("Environment",Execution_Environment);
		//extent.setSystemInfo("Browser", ExecutionBrowser);
		extent.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostName());
		extent.setSystemInfo("User", System.getProperty("user.name"));
		extent.setSystemInfo("Build", Runner.Build);
		extent.setSystemInfo("Language", Runner.Language);
		extent.setSystemInfo("DeviceType", Runner.DeviceType);
	}
	
	public static void CreateResults(boolean iStatus,String sActualResult)
	{
		try
		{
			String sStatus = "";
			if(iStatus==true)
			{
				sStatus = "Passed";
				try {
					GetScreenshot();
					WriteExtentReport.log(Status.PASS, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"<br>"+sActualResult);
				} catch (Exception e) {
					if(e.toString().contains("FileAlreadyExistsException"))
					{
						WriteExtentReport.log(Status.PASS, "Could not take screenshots:"+"<br>"+e.toString());
					}
					else
					{
					   WriteExtentReport.log(Status.FAIL, "Could not take screenshots:"+"<br>"+e.toString());
					}
				}
				
			}
			else
			{
				sStatus = "Failed";
				if(sActualResult.equalsIgnoreCase("Skip"))
				{
					WriteExtentReport.log(Status.WARNING,"Keyword Skipped as dependent Test case was failed");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("SkipTC"))
				{
					WriteExtentReport.log(Status.WARNING,"Keyword Skipped as previous keywords were failed");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("No"))
				{
					WriteExtentReport.log(Status.SKIP,"Keyword Skipped as Runstatus is No");
					sStatus = "Skip";
				}
				else if(sActualResult.equalsIgnoreCase("TC_Was_Pass_Status"))
				{
					WriteExtentReport.log(Status.PASS,"Keyword Skipped as keyword already executed with Pass status");
					sStatus = "Skip";
				}
				else
				{
					try {
						GetScreenshot();
						WriteExtentReport.log(Status.FAIL, WriteExtentReport.addScreenCaptureFromPath(sScreenshotFilePath)+"<br>"+sActualResult+"<br>");
					} catch (Exception e) {
						if(e.toString().contains("FileAlreadyExistsException"))
						{
							WriteExtentReport.log(Status.FAIL, "Could not take screenshots:"+"<br>"+e.toString()+"<br>");
						}
						else
						{
						   WriteExtentReport.log(Status.FAIL, "Could not take screenshots:"+"<br>"+e.toString()+"<br>");
						}
					}
					
					//baseclass.ChangeBrowser(globalIdentifiers.ExecutionBrowser);
				}
				
			}
			
			saveresultstatustotestcase(sStatus);
			extent.flush();
			
		}
		catch(Exception e)
		{
			System.out.println("Error while generating report !!!!");
			e.printStackTrace();
			try
			{
				//baseclass.ChangeBrowser(globalIdentifiers.ExecutionBrowser);
				extent.flush();
			}
			catch(Exception e1)
			{	
			}
		}
	}
	
	//@Given("^Get test case id([^\"]*)$")
	//@Given("^Get test case id(.+) (.+)$")
	@Given("^Get test case id([^\"]*) ([^\"]*)$")
	//public void gettestcaseid(String sTestCase)
	public void gettestcaseid(String sTestCase,String sCategory)
	{
		Runner.sTestcase = sTestCase;
		Category = sCategory;
		if(Category.equalsIgnoreCase("Cards"))
		{
		  Runner.sheet1=Runner.wb.getSheetAt(1);
		}
		if(Category.equalsIgnoreCase("Accounts"))
		{
			Runner.sheet1=Runner.wb.getSheetAt(0);
		}
		
	}
	
	public static void GetScreenshot() throws IOException, HeadlessException, AWTException
	{
	String Basepathsc = Basepathet;//globalIdentifiers.Basepath + "Reports and Screenshots";
	Calendar cal = Calendar.getInstance();
	File Dir = new File(Basepathsc);
	Dir.mkdir();
	int year = cal.get(Calendar.YEAR);
	Dir = new File(Basepathsc+"/"+year);
	Dir.mkdir();
	int month = cal.get(Calendar.MONTH);
	Dir = new File(Basepathsc+"/"+year+"/"+(month+1));
	Dir.mkdir();
	int day = cal.get(Calendar.DATE);
	Dir = new File(Basepathsc+"/"+year+"/"+(month+1)+"/"+day);
	Dir.mkdir();
	Dir = new File(Basepathsc+"/"+year+"/"+(month+1)+"/"+day);
	Dir.mkdir();
	Dir = new File(sReportPath+"/Screenshots and Statements");
	Dir.mkdir();
	Dir = new File(sReportPath+"/Screenshots and Statements"+"/"+Runner.sTestcase);
	Dir.mkdir();
	SScreenshotdirpath = Dir.getAbsolutePath().replace("\\", "/");
	Date sDate = new Date();
	String sScreenshotFilename = sDate.getHours()+"_"+sDate.getMinutes()+"_"+sDate.getSeconds();
	sScreenshotFilePath = SScreenshotdirpath + "/" + sScreenshotFilename + ".png";
	TakesScreenshot scrShot =((TakesScreenshot)BaseClass.driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File(sScreenshotFilePath);
	//BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	//ImageIO.write(image, "png", new File(DestFile.getAbsolutePath()));
	//(SrcFile.getAbsolutePath(), DestFile);
	Files.copy(SrcFile.toPath(), DestFile.toPath());
	
	}
	
	public static void saveresultstatustotestcase(String sStatus) throws Exception
	{
	   int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
	   int ColNum = BaseClass.getColumnNumberIndex("","Status");
	   Row resRow = Runner.sheet1.getRow(RowNum);
	   Cell cell = resRow.createCell(ColNum);
	   cell.setCellValue(sStatus);

	   FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
	   Runner.wb.write(fileout);
	   System.out.println("status");
	}
	
	@Given("^UpdateResult$")
    public void be_in_touch_saving_salaride_page() throws Throwable {
 System.out.println("updated");
 }	

}
