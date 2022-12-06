package StepDefinations;

//import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//mport org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.perfecto.reportium.test.TestContext;
//import com.perfecto.sampleproject.PerfectoLabUtils;

import StepRunner.Runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
//import io.cucumber.java.Scenario;

public class BaseClass extends TouchActionsHelper {
	
	//static AppiumDriver<MobileElement> driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static DateFormat df;
	static String folder_name;
	//public static Scenario scenario; 
	
	//static AppiumDriver<MobileElement> driver1;
	public static String sImagePath = "/Users/digital2.0/Desktop/Eclipse/Digital2.0UAT/Images/";
	public static IOSDriver<MobileElement> driver;
	public static String Test6= "TC_06";
	public static String Test7= "TC_07";
	public static String Test8= "TC_08";
	public static void setup() {
		
		/*try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 Ultra 5G");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		caps.setCapability(MobileCapabilityType.UDID, "R5CT2218L5J");
		caps.setCapability("appPackage", "com.rak");
		caps.setCapability("appActivity", "com.rak.SplashActivity");
		caps.setCapability("noReset", true);
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		URL url = new URL("http://127.0.0.1:4756/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		//driver = new AndroidDriver<MobileElement>(url,caps);
		//driver = new IOSDriver<MobileElement>(url,caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is : " +exp.getCause());
			System.out.println("Cause is : " +exp.getMessage());
			
			exp.printStackTrace();
		}*/
		
		 try { 
			 driver= null;
			 
			 DesiredCapabilities caps = new DesiredCapabilities();
		  
		  //caps.setCapability("platformName", "ANDROID");
		  //caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Digital's iPhone");
		  //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "QA’s iPhone");
		 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
		// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 Ultra 5G");
			//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		  //caps.setCapability(MobileCapabilityType.UDID, "R5CT2218L5J");
		  //caps.setCapability("appPackage", "com.rak");
			//caps.setCapability("appActivity", "com.rak.SplashActivity");
		 caps.setCapability(MobileCapabilityType.UDID, "00008110-00166DD91128401E");
		// caps.setCapability(MobileCapabilityType.UDID, "00008110-0016343E0E3B801E");
			caps.setCapability("bundleId", "com.rak.convergence");
			//caps.setCapability("bundleId", "rakcorp.ae");
			//caps.setCapability("appActivity", "com.rak.SplashActivity");
		  //caps.setCapability("appPackage", "ae.skiply.rakbank");
		  //caps.setCapability("appActivity", "ae.skiply.rakbank.MainActivity");
		  caps.setCapability("noReset", true);
		  caps.setCapability("self.useJSONSource", true);
		  caps.setCapability("waitForIdleTimeout", 0);
		  caps.setCapability("disableWindowAnimation", true);
		  caps.setCapability("newCommandTimeout", 500);
		  caps.setCapability("shouldTerminateApp", true);
		  //caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		  
		 // URL url = new URL("http://0.0.0.0:4723/wd/hub");
		  
		  driver = new IOSDriver(new URL("http://0.0.0.0:4743/wd/hub"), caps);
		 // driver = new IOSDriver<MobileElement>(url,caps);
		  //driver = new AppiumDriver<MobileElement>(url,caps); //driver = new
		  //AndroidDriver<MobileElement>(url,caps); //
		 // IOSDriver<MobileElement>(url,caps);
		  //((IOSDriver)driver).closeApp();
		
		 }
		 catch(Exception exp) 
		 { 
			 System.out.println("Cause is : " +exp.getCause());
		     System.out.println("Cause is : " +exp.getMessage());
		     exp.printStackTrace(); 
		     Framework.WriteExtentReport.log(Status.FAIL, "Could not take screenshots:"+exp.toString());
		 }
	
	}
	
	
	public void sampleTest() throws Exception {
		
		String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		//String Test6= "TC_06";
		//String MobileNumber = getColumnNumber(Spath,"",sTestCaseid);
		
		System.out.println();
		System.out.println("Application is lounch ");
		
		
	}
	
	public static String getColumnNumber(String FilePath,String sColumName, String sTestcaseID1) throws Exception 
	{
		String sTestcaseID=Runner.sTestcase;
		/*File src =new File(FilePath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);*/
		XSSFSheet sheet1=Runner.sheet1;
		int iCloumnCount = 0;
		for(int iColCount=0;iColCount<=1000;iColCount++)
		{
			String sCloumnvalues = sheet1.getRow(0).getCell(iColCount).getStringCellValue();
			if(sCloumnvalues.equalsIgnoreCase(sColumName))
			{
				iCloumnCount=iColCount;
				break;
			}
		}
		
		int iRowCount =0;
		for(int iRCount=0;iRCount<=1000;iRCount++) {
			String sRowvalues = sheet1.getRow(iRCount).getCell(0).getStringCellValue();
			if(sRowvalues.equalsIgnoreCase(sTestcaseID))
			{
				iRowCount=iRCount;
				break;
			}
		}
		
		String sFieldValue = sheet1.getRow(iRowCount).getCell(iCloumnCount).getStringCellValue();
		sFieldValue = sFieldValue.replace("'", "");
		
		//wb.close();
		return sFieldValue;
		
	}
	
	public static int getRowNumber(String FilePath,String sColumName, String sTestcaseID1) throws Exception 
	{
		String sTestcaseID=Runner.sTestcase;
		/*File src =new File(FilePath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);*/
		XSSFSheet sheet1=Runner.sheet1;
		int iCloumnCount = 0;
		for(int iColCount=0;iColCount<=1000;iColCount++)
		{
			String sCloumnvalues = sheet1.getRow(0).getCell(iColCount).getStringCellValue();
			if(sCloumnvalues.equalsIgnoreCase(sColumName))
			{
				iCloumnCount=iColCount;
				break;
			}
		}
		
		int iRowCount =0;
		for(int iRCount=0;iRCount<=1000;iRCount++) {
			String sRowvalues = sheet1.getRow(iRCount).getCell(0).getStringCellValue();
			if(sRowvalues.equalsIgnoreCase(sTestcaseID))
			{
				iRowCount=iRCount;
				break;
			}
		}
		
		//String sFieldValue = sheet1.getRow(iRowCount).getCell(iCloumnCount).getStringCellValue();
		//sFieldValue = sFieldValue.replace("'", "");
		
		//wb.close();
		return iRowCount;
		
	}
	
	public static int getColumnNumberIndex(String FilePath,String sColumName) throws Exception 
	{
		String sTestcaseID=Runner.sTestcase;
		/*File src =new File(FilePath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);*/
		XSSFSheet sheet1=Runner.sheet1;
		int iCloumnCount = 0;
		for(int iColCount=0;iColCount<=1000;iColCount++)
		{
			String sCloumnvalues = sheet1.getRow(0).getCell(iColCount).getStringCellValue();
			if(sCloumnvalues.equalsIgnoreCase(sColumName))
			{
				iCloumnCount=iColCount;
				break;
			}
		}
		
		
		return iCloumnCount;
		
	}
	
	
	public static void runAppiumService() {

        //Build parameters for appium server:
        AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder();
        appiumServiceBuilder.usingAnyFreePort()
        
                .withAppiumJS(new File("\\Users\\digital2.0\\Desktop\\Eclipse\\Digital2.0UAT\\Applications\\Appium.app\\Contents\\Resources\\app\\node_modules\\appium\\lib\\appium.js"))
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File(System.getProperty("user.dir") + "/target/resources/appium_server_logs" + Thread.currentThread().getId()));
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(appiumServiceBuilder);
        service.start();
        
        
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 Ultra 5G");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		caps.setCapability(MobileCapabilityType.UDID, "R5CT2218L5J");
		caps.setCapability("appPackage", "com.rak");
		caps.setCapability("appActivity", "com.rak.SplashActivity");
		caps.setCapability("noReset", true);
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		//URL url = new URL("http://0.0.0.0:4723/wd/hub");
        
         //driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),
       
        //driver = new AndroidDriver(service.getUrl(), caps);
     
}
	
	public static void swipe(String direction, String text)
    {
    sleep(4000);
    IOSDriver<MobileElement> iOSDriver = driver;
    HashMap<String, String> scrollObject = new HashMap<>();
    scrollObject.put("direction", direction);
    scrollObject.put("predicateString", "label == '" + text + "'");
    iOSDriver.executeScript("mobile: swipe", new Object[] {scrollObject});
    //driver.executeScript("mobile: swipe", new Object[] {scrollObject});
    }
	
	
	public static void Message()
	{
		
		JFrame parent =new JFrame();
		JLabel lab = new JLabel("Enter Otp and click on OK",0);
		JOptionPane pane = new JOptionPane(lab);
		JDialog dialog =pane.createDialog(parent,"Message");
		dialog.setSize(600,400);
		dialog.setAlwaysOnTop(true);
		dialog.show();
		dialog.toFront();
		dialog.setFocusable(true);
		
	}
	
	
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("***Unable to wait ********");
		}
	}
	
	
	public static void WirteMobileNumber(String Mobile) throws Exception
    {
       int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
       int ColNum = BaseClass.getColumnNumberIndex("","MobileNumber");
       Row resRow = Runner.sheet1.getRow(RowNum);
       Cell cell = resRow.createCell(ColNum);
       cell.setCellValue(Mobile);
       FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
       Runner.wb.write(fileout);
       System.out.println(Runner.sTestcase+" Mobile Number Is : " +Mobile);
       
    }
	
	
	public static void WirteAccountNo(String AccountNo) throws Exception
    {
       int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
       int ColNum = BaseClass.getColumnNumberIndex("","AccountNo");
       Row resRow = Runner.sheet1.getRow(RowNum);
       Cell cell = resRow.createCell(ColNum);
       cell.setCellValue(AccountNo);
       FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
       Runner.wb.write(fileout);
       System.out.println("Account Number Is : " +AccountNo);
       
    }
	
	public static void WirteUsername(String Username) throws Exception
    {
       int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
       int ColNum = BaseClass.getColumnNumberIndex("","Username");
       Row resRow = Runner.sheet1.getRow(RowNum);
       Cell cell = resRow.createCell(ColNum);
       cell.setCellValue(Username);
       FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
       Runner.wb.write(fileout);
       System.out.println("Username Is : " +Username);
       
    }
	
	public static void WirtePassword(String Password) throws Exception
    {
       int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
       int ColNum = BaseClass.getColumnNumberIndex("","Password");
       Row resRow = Runner.sheet1.getRow(RowNum);
       Cell cell = resRow.createCell(ColNum);
       cell.setCellValue(Password);
       FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
       Runner.wb.write(fileout);
       System.out.println("Password Is : " +Password);
       
    }



   public static void WriteProspectID(String ProspectID) throws Exception
       {
          int RowNum = BaseClass.getRowNumber("","TestCase", Runner.sTestcase);
          int ColNum = BaseClass.getColumnNumberIndex("","ProspectID");
          Row resRow = Runner.sheet1.getRow(RowNum);
          Cell cell = resRow.createCell(ColNum);
          cell.setCellValue(ProspectID);
         FileOutputStream fileout = new FileOutputStream(Runner.sFilePath);
          Runner.wb.write(fileout);
          System.out.println("ProspectID Is : " +ProspectID);
       
    
       }
   
  

	
public static void reportSetup()
	{
		 htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
       extent.attachReporter(htmlReporter);
	}
	
//public static void data(String Username,String Password ) {
//		
//		Xls_Reader reader = new Xls_Reader("./src/test/java/stepDefinations/TestData.xlsx");
//		
//		String sheetName = "Registration";
//		   
//		reader.getCellData(sheetName, 0, 2);
//		reader.getCellData(sheetName, 1, 2);
//		
//		System.out.println("Username"+Username);
//		System.out.println("Password"+Password);
//		
//		//int rowCount = reader.getRowCount(sheetName);
//		//System.out.println("aaaaaaaa"+rowCount);
//		
//		//reader.addColumn(sheetName, "status");
//		
//		
//		if(!reader.isSheetExist("Registration")) {
//			reader.addSheet("Registration");
//		}
//		
//		
//	reader.setCellData(sheetName, "Status", 2, "pass");
//
//	}

   

       /* public static void takeScreenShotAfterEveryStep() throws IOException {
        	
        	File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent,"image/png","image");
    }*/
	/*public static void captureScreenShots() throws IOException
	{
		  folder_name="screenshot"; 
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		//Date format for screenshot file_name 
		  df=new SimpleDateFormat("dd-MMM-yyyy_hh_mmssaa");
		  //create dir with given folder name 
		  new File(folder_name).mkdir();
		  //Setting file name
		   String file_name=df.format(new Date())+".png"; //Copy screenshot file into screenshot folder.
		   
			FileUtils.copyFile(f,new File(folder_name + "/"+file_name));
		
			// TODO Auto-generated catch block
			
		
		 
		System.out.println("BaseClassScreenShots");
	}*/
	
	 
		
	

	
	/*
	 * File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * 
	 * 
	 * FileUtils.copyFile(f,new File(System.getProperty("user.dir") +
	 * "\\"+s+".png"));
	 */
	



	/*
	 * public static void captureScreenShorts() throws IOException {
	 * folder_name="screenshot"; File
	 * f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Date format
	 * for screenshot file name df=new SimpleDateFormat("dd-MMM-yyyy_hh_mmssaa");
	 * //create dir with given folder name new File(folder_name).mkdir(); //Setting
	 * file name String file_name=df.format(new Date())+".png"; //Copy screenshot
	 * file into screenshot folder. FileUtils.copyFile(f,new File(folder_name + "/"+
	 * file_name));
	 * 
	 * }
	 */
	
	
	
    public  void teardown() throws IOException {
    	
    	
		driver.quit();
		System.out.println("Driver has been quited");
		
		
	}
	

}

