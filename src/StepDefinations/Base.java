package StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	static AppiumDriver<MobileElement> driver1;
	public static String sImagePath = "/Users/digital2.0/Desktop/Eclipse/Digital2.0UAT/Images/";
	public static IOSDriver<MobileElement> driver;
	//public static void main(String[] args) throws FindFailed, InterruptedException, MalformedURLException, AWTException {
		
		
		public static void setup() throws Exception {
			
			
			
			
			
			 try { DesiredCapabilities caps = new DesiredCapabilities();
			  
			  //caps.setCapability("platformName", "ANDROID");
			  //caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Digital's iPhone");
			 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
			// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 Ultra 5G");
				//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			  //caps.setCapability(MobileCapabilityType.UDID, "R5CT2218L5J");
			  //caps.setCapability("appPackage", "com.rak");
				//caps.setCapability("appActivity", "com.rak.SplashActivity");
			// caps.setCapability(MobileCapabilityType.UDID, "00008110-00166DD91128401E");
			 caps.setCapability(MobileCapabilityType.UDID, "00008110-0016343E0E3B801E");
			 
				caps.setCapability("bundleId", "com.rak.convergence");
				//caps.setCapability("appActivity", "com.rak.SplashActivity");
			  //caps.setCapability("appPackage", "ae.skiply.rakbank");
			  //caps.setCapability("appActivity", "ae.skiply.rakbank.MainActivity");
			  caps.setCapability("noReset", true);
			  //caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			  
			  URL url = new URL("http://0.0.0.0:4724/wd/hub");
		       driver = new IOSDriver<MobileElement>(url,caps);
			  //driver = new AppiumDriver<MobileElement>(url,caps); //driver = new
			  //AndroidDriver<MobileElement>(url,caps); //
			 // IOSDriver<MobileElement>(url,caps);
			
			 }catch(Exception exp) { System.out.println("Cause is : " +exp.getCause());
			 System.out.println("Cause is : " +exp.getMessage());
			 
			 exp.printStackTrace(); }
			
			
		}
		public static void swipe(String direction, String text)
	    {
	    sleep(4000);
	    IOSDriver<MobileElement> iOSDriver = driver;
	    HashMap<String, String> scrollObject = new HashMap<>();
	    scrollObject.put("direction", direction);
	    scrollObject.put("predicateString", "label == '" + text + "'");
	    iOSDriver.executeScript("mobile: swipe", new Object[] {scrollObject});
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
		
		public static String getColumnNumber(String FilePath,String sColumName, String sTestcaseID) throws Exception 
		{
			File src =new File(FilePath);
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
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
			
			String sFieldValue = sheet1.getRow(iRowCount).getCell(0).getStringCellValue();
			sFieldValue = sFieldValue.replace("'", "");
			
			wb.close();
			return sFieldValue;
			
		}
		
		
	}

		
		/*FindImagForSikuli.FindElement(sImagePath+"Rak Bank Logo",0.8D,200);
		FindImagForSikuli.ClickOnElement(sImagePath+"Rak Bank Logo",0.8D);
		Thread.sleep(5000);
		FindImagForSikuli.FindElement(sImagePath+"New Customer.png",0.5D,200);
        FindImagForSikuli.ClickOnElement(sImagePath+"New Customer.png",0.5D);
        Thread.sleep(2000);
        FindImagForSikuli.FindElement(sImagePath+"English.png",0.5D,200);
		 FindImagForSikuli.ClickOnElement(sImagePath+"English.png",0.5D);
		 
		 
		 FindImagForSikuli.FindElement(sImagePath+"Next.png",0.8D,200);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Next.png",0.8D);
		 Thread.sleep(2000);
		 FindImagForSikuli.FindElement(sImagePath+"Next.png",0.8D,200);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Next.png",0.8D);
 		 
 		Thread.sleep(2000);
 		FindImagForSikuli.FindElement(sImagePath+"Open a Bank Account.png",0.8D,200);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Open a Bank Account.png",0.8D);
 		Thread.sleep(2000);
 		FindImagForSikuli.FindElement(sImagePath+"Enter Mobile Number.png",0.8D,200);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Enter Mobile Number.png",0.8D);
 		 FindImagForSikuli.EntertextOnElement(sImagePath+"Enter Mobile Number.png","551272185", 0.8D);
 		FindImagForSikuli.FindElement(sImagePath+"SMS an OTP.png",0.8D,20);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"SMS an OTP.png",0.8D);
 		 
 		FindImagForSikuli.Message();
 		
 		//FindImagForSikuli.ClickOnElement(sImagePath+"Simply Resume.png",0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"RAK BANK.png",0.8D,20);
 		FindImagForSikuli.ClickOnElement(sImagePath+"RAK BANK.png",0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"Open a Current Account.png",0.8D,200);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Open a Current Account.png",0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"Purpose of Account.png",0.8D,20);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Purpose of Account.png",0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"Business.png",0.8D,20);
 		 FindImagForSikuli.ClickOnElement(sImagePath+"Business.png",0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"Do you require a Check Bool (Yes).png",0.8D,20);
 		FindImagForSikuli.ClickDownofElement(sImagePath+"Do you require a Check Bool (Yes)",30, 0.8D);
 		Thread.sleep(1000);
 		FindImagForSikuli.FindElement(sImagePath+"Do you want Debit Card(Yes).png",0.8D,20);
		 FindImagForSikuli.ClickDownofElement(sImagePath+"Do you want Debit Card(Yes)",30, 0.8D);
		 Thread.sleep(1000);
		 FindImagForSikuli.FindElement(sImagePath+"View Key Facts.png",0.8D,20);
		 FindImagForSikuli.ClickOnElement(sImagePath+"View Key Facts.png",0.8D);
		 Thread.sleep(1000);
		 
		
		 FindImagForSikuli.FindElement(sImagePath+"I have read and understood",0.8D,200);
		 //FindImagForSikuli.ClickOnElement(sImagePath+"I have read and understood",0.8D);
		 FindImagForSikuli.ClickOnElement(sImagePath+"RAKBANK",0.8D);
		  Robot ro = new Robot();
			 ro.keyPress(KeyEvent.VK_TAB);
			 ro.keyRelease(KeyEvent.VK_TAB);
			 Thread.sleep(2000);
			 ro.keyPress(KeyEvent.VK_TAB);
			 ro.keyRelease(KeyEvent.VK_TAB);
			 Thread.sleep(2000);
			 ro.keyPress(KeyEvent.VK_TAB);
			 ro.keyRelease(KeyEvent.VK_TAB);
			 
			 Thread.sleep(2000);
			 ro.keyPress(KeyEvent.VK_ENTER);
			 ro.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		 FindImagForSikuli.FindElement(sImagePath+"Next.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Next.png",0.8D);
		 Thread.sleep(1000);
		 FindImagForSikuli.FindElement(sImagePath+"Email Address.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Email Address.png",0.8D);
		 FindImagForSikuli.EntertextOnElement(sImagePath+"Email Address.png","shahrukh.aatar05@gmail.com", 0.5D);
		 Thread.sleep(1000);
		 FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
		 Thread.sleep(1000);
		 FindImagForSikuli.FindElement(sImagePath+"Send Key Facts.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Send Key Facts.png",0.8D);
		 Thread.sleep(2000);
		 FindImagForSikuli.FindElement(sImagePath+"Mother maiden name.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Mother maiden name.png",0.8D);
		 FindImagForSikuli.EntertextOnElement(sImagePath+"Mother maiden name.png","abc", 0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"Country of birth.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Country of birth.png",0.8D);
		
		 FindImagForSikuli.FindElement(sImagePath+"Aland Islands.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Aland Islands.png",0.8D);
		
		 
		 FindImagForSikuli.FindElement(sImagePath+"Do you have dual nationality(Yes)",0.8D,20000);
		 FindImagForSikuli.ClickDownofElement(sImagePath+"Do you have dual nationality(Yes)",30, 0.8D);
		
		 FindImagForSikuli.FindElement(sImagePath+"Select Dual nationality option.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Select Dual nationality option.png",0.8D);
		
		 
		 FindImagForSikuli.FindElement(sImagePath+"Afghan.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Afghan.png",0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"Are you politically Exposed person(Yes)",0.8D,20000);
		 FindImagForSikuli.ClickDownofElement(sImagePath+"Are you politically Exposed person(Yes)",30, 0.8D);
		
		 
		 
		
		 FindImagForSikuli.FindElement(sImagePath+"Down",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Down",0.8D);
			 Thread.sleep(2000);
			 Screen screen = new Screen();
			 screen.wheel(org.sikuli.script.Mouse.WHEEL_UP, 5);
			 FindImagForSikuli.FindElement(sImagePath+"Confirm.png",0.8D,20000);
		FindImagForSikuli.ClickOnElement(sImagePath+"Confirm.png",0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"You are a PEP by (Association).png",0.8D,20000);
		 FindImagForSikuli.ClickDownofElement(sImagePath+"You are a PEP by (Association).png",30, 0.8D);
		
		 FindImagForSikuli.FindElement(sImagePath+"Political Designation Held.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Political Designation Held.png",0.8D);
		 FindImagForSikuli.EntertextOnElement(sImagePath+"Political Designation Held.png","abc", 0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"Done",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
		
		 
		 FindImagForSikuli.FindElement(sImagePath+"Confirm.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Confirm.png",0.8D);
		
		 FindImagForSikuli.FindElement(sImagePath+"Your Relationship.png",0.8D,20000);
		 FindImagForSikuli.ClickOnElement(sImagePath+"Your Relationship.png",0.8D);
		 FindImagForSikuli.FindElement(sImagePath+"Brother.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Brother.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Name of the PEP.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Name of the PEP.png",0.8D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Name of the PEP.png","abc", 0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Done",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Country where the PEP holds the status.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Country where the PEP holds the status.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Aland Islands",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Aland Islands.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Confirm.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Confirm.png",0.8D);
			
			
			
			
			FindImagForSikuli.FindElement(sImagePath+"Villa or Flat Number.png",0.5D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Villa or Flat Number.png",0.5D);
			
			FindImagForSikuli.EntertextOnElement(sImagePath+"Villa or Flat Number","205", 0.5D);
		
			FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20);		
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Building Villa Name",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"Building Villa Name",0.5D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Building Villa Name","Palace Tower", 0.5D);
			
			FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Street Location.png",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"Street Location.png",0.8D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Street Location","DSO", 0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"P O Box.png",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"P O Box.png",0.8D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"P O Box","3450", 0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Emirate City.png",0.8D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Emirate City.png",0.8D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Dubai.png",0.8D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Dubai.png",0.8D);
			
			
			Thread.sleep(4000); 
			// Screen screen = new Screen();
			 screen.wheel(org.sikuli.script.Mouse.WHEEL_UP, 5);
			 FindImagForSikuli.FindElement(sImagePath+"Confirm Address.png",0.8D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Confirm Address.png",0.8D);
		
		FindImagForSikuli.FindElement(sImagePath+"Salaried",0.8D,20000);
		FindImagForSikuli.ClickOnElement(sImagePath+"Salaried",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Total Monthly Salary",0.5D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Total Monthly Salary",0.5D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Total Monthly Salary","50000", 0.5D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Done1.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done1.png",0.8D);
			FindImagForSikuli.FindElement(sImagePath+"What percentage of your income",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"What percentage of your income",0.8D);
			
			FindImagForSikuli.FindElement(sImagePath+"Company Name",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Company Name",0.8D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Company Name","Rak Bank", 0.8D);
			FindImagForSikuli.FindElement(sImagePath+"RAK BANK STAFF",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"RAK BANK STAFF",0.8D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Designation",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Designation",0.8D);
			FindImagForSikuli.EntertextOnElement(sImagePath+"Designation","Tester", 0.8D);
			FindImagForSikuli.FindElement(sImagePath+"Done.png",0.8D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Done.png",0.8D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Submit.png",0.8D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Submit.png",0.8D);
		
			
			
			Thread.sleep(4000); 
			
			FindImagForSikuli.FindElement(sImagePath+"Salary Cerificate",0.5D,20000);
			FindImagForSikuli.ClickOnElement(sImagePath+"Salary Cerificate",0.5D);
			
			
			FindImagForSikuli.FindElement(sImagePath+"Add document",0.8D,200);
			FindImagForSikuli.ClickOnElement(sImagePath+"Add document",0.8D);
			  
			FindImagForSikuli.FindElement(sImagePath+"Gallery",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Gallery",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Camera.png",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Camera",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Image",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Image",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Upload",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Upload",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Bank Statement",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Bank Statement",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Add document",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Add document",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Gallery",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Gallery",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Camera.png",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Camera",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Image",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Image",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Upload",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Upload",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Trade License",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Trade License",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Add document",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Add document",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Gallery",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Gallery",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Camera.png",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Camera",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Image",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Image",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Upload",0.8D,200);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Upload",0.8D);
			
			  FindImagForSikuli.FindElement(sImagePath+"some PDF Doc",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"some PDF Doc",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Add document",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Add document",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Gallery",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Gallery",0.8D);
			  FindImagForSikuli.FindElement(sImagePath+"Camera.png",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Camera",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Image",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Image",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Upload",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Upload",0.8D);
			  
			 FindImagForSikuli.FindElement(sImagePath+"Submit",0.8D,20000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Submit",0.8D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"US Green Card(No)",0.8D,200);
				FindImagForSikuli.ClickDownofElement(sImagePath+"US Green Card(No)",70, 0.8D);
				FindImagForSikuli.FindElement(sImagePath+"Pay Tax In UAE(NO)",0.8D,20);
				FindImagForSikuli.ClickDownofElement(sImagePath+"Pay Tax In UAE(NO)",50, 0.8D);
				FindImagForSikuli.FindElement(sImagePath+"Submit.png",0.8D,20);
				FindImagForSikuli.ClickOnElement(sImagePath+"Submit.png",0.8D);
				
				FindImagForSikuli.FindElement(sImagePath+"Email.png",0.8D,200);
				FindImagForSikuli.ClickOnElement(sImagePath+"Email.png",0.8D);
				FindImagForSikuli.FindElement(sImagePath+"Marketing Offers(No)",0.8D,20);
				FindImagForSikuli.ClickDownofElement(sImagePath+"Marketing Offers(No)",50, 0.8D);
				
				FindImagForSikuli.FindElement(sImagePath+"assess onboarding(No)",0.8D,20);
				FindImagForSikuli.ClickDownofElement(sImagePath+"assess onboarding(No)",50, 0.8D);
				 Thread.sleep(2000);
				 //Screen screen1 = new Screen();
				 screen.wheel(org.sikuli.script.Mouse.WHEEL_UP, 5);
				 FindImagForSikuli.FindElement(sImagePath+"Submit",0.8D,20);
				FindImagForSikuli.ClickOnElement(sImagePath+"Submit",0.8D);
			  
			 
			  FindImagForSikuli.FindElement(sImagePath+"Terms Conditions",0.8D,20000);
			  FindImagForSikuli.ClickDownofElement(sImagePath+"Terms Conditions",80, 0.8D);
			  
			   FindImagForSikuli.FindElement(sImagePath+"RAKBANK2",0.5D,2000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"RAKBANK2",0.5D);
			  Thread.sleep(2000);
			 // Robot ro = new Robot();
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_ENTER);
				ro.keyRelease(KeyEvent.VK_ENTER);
			  
			  
			   FindImagForSikuli.FindElement(sImagePath+"Next",0.5D,2000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"Next",0.5D);
			  
			  FindImagForSikuli.FindElement(sImagePath+"Consents Declarations",0.8D,20000);
			  FindImagForSikuli.ClickDownofElement(sImagePath+"Consents Declarations",80, 0.8D);
			  Thread.sleep(2000);		
		
			  FindImagForSikuli.FindElement(sImagePath+"RAKBANK3",0.5D,2000);
			  FindImagForSikuli.ClickOnElement(sImagePath+"RAKBANK3",0.5D);
			  Thread.sleep(2000);
			     
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_TAB);
				 ro.keyRelease(KeyEvent.VK_TAB);
				 
				 Thread.sleep(2000);
				 ro.keyPress(KeyEvent.VK_ENTER);
				ro.keyRelease(KeyEvent.VK_ENTER);
			  
				
				FindImagForSikuli.FindElement(sImagePath+"Next",0.5D,2000);
				  FindImagForSikuli.ClickOnElement(sImagePath+"Next",0.5D);
				  
				  
				  FindImagForSikuli.FindElement(sImagePath+"Submit",0.5D,2000);
				  FindImagForSikuli.ClickOnElement(sImagePath+"Submit",0.5D);
				  
				  FindImagForSikuli.FindElement(sImagePath+"Will be in touch",0.5D,2000);
				  FindImagForSikuli.ClickOnElement(sImagePath+"App Closed",0.5D);*/
				  
				  
				  
			  
			
		//setup() ;
	
	
	/*	public static void setup() throws MalformedURLException {
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Samsung A12");
			capabilities.setCapability("udid", "R5CT2218L5J");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "12.0");
			//capabilities.setCapability("appPackage", "com.whatsapp");
			//capabilities.setCapability("appActivity", "com.whatsapp.HomeActivity");
			capabilities.setCapability("appPackage", "com.rak");
			capabilities.setCapability("appActivity", "com.rak.SplashActivity");
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("newCommandTimeout",10000);
			driver = new AndroidDriver<>(new URL("http://localhost:4756/wd/hub"),capabilities);
			
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
			//caps.setCapability("simpleIsVisibleCheck", true);
			//caps.setCapability("useJSONSource", true);
			
			//caps.setCapability("fullReset", true);
			//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			
			//URL url = new URL("http://127.0.0.1:4756/wd/hub");
			driver = new AndroidDriver<>(new URL("http://localhost:4756/wd/hub"),caps);
			
			//driver = new AppiumDriver<MobileElement>(url,caps);
			//((HasSettings) driver).setSetting(Setting.WAIT_FOR_SELECTOR_TIMEOUT,5000);
			//driver = new AndroidDriver<MobileElement>(url,caps);
			//driver = new IOSDriver<MobileElement>(url,caps);
			
			}catch(Exception exp) {
				System.out.println("Cause is : " +exp.getCause());
				System.out.println("Cause is : " +exp.getMessage());
				
				exp.printStackTrace();
			}*/
			
			


