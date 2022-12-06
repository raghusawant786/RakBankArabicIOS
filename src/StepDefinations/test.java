package StepDefinations;

import java.awt.RenderingHints.Key;
import java.net.URL;
import java.time.Duration;

import StepDefinations.BaseClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

//import org.sikuli.hotkey.Keys;
import StepRunner.Runner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.flags.IOSServerFlag;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test {
	
	//public static AndroidDriver driver;
	public static IOSDriver<MobileElement> driver;
	//public static IOSDriver<WebElement> driver;
	public static boolean bStatus;
	//public static AppiumDriver driver;


	public static void main(String[] args) {


		try { 
			
			
			
			Framework.getreportfilename();
			Framework.statextentreport();
			 
			// driver=null;
			// DesiredCapabilities caps = new DesiredCapabilities();
		  
		  
		 
		/* DesiredCapabilities capabilities = new DesiredCapabilities();

	        
//	        capabilities.setCapability("deviceName", "Samsung A12");
	        capabilities.setCapability("udid", "R5CT2218L5J");
	        capabilities.setCapability("platformName", "Android");
//	        capabilities.setCapability("platformVersion", "11");
	        capabilities.setCapability("appPackage", "com.rakcorp");
	        capabilities.setCapability("appActivity", "com.rakcorp.FinacleMobileApp");
	        capabilities.setCapability("noReset", true);
	        capabilities.setCapability("self.useJSONSource", true);
	        capabilities.setCapability("waitForIdleTimeout", 0);
	       capabilities.setCapability("appWaitDuration", "70000");
	        capabilities.setCapability("disableWindowAnimation", true);
	        capabilities.setCapability("newCommandTimeout", 500);
	        capabilities.setCapability("shouldTerminateApp", true);
	      //  capabilities.setCapability("automationName", "UiAutomator2");
	   // WebDriverWait wait = new WebDriverWait(driver, 30);
	   driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);*/
			 
			// BaseClass.setup();
	   
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
				//caps.setCapability("bundleId", "com.rak.convergence");
				caps.setCapability("bundleId", "rakcorp.ae");
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
			  
			  driver = new IOSDriver(new URL("http://0.0.0.0:4724/wd/hub"), caps);
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
		
	//  WebDriverWait wait = new WebDriverWait(driver, 30);
	  
	   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   BaseClass.driver = driver;
	   Runner.sTestcase = "TC1_FundTransfer";
	   
	   Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Fund transfer to current account"+"<br>"+"Expected Result:Fund transfer should happen successfully"+"</br>");
	   Framework.test.assignCategory("Fund Transfer");
	   
	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to select customer screen <br>");   
	   bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Existing customer\"]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to select customer screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to select customer screen successfully");
	   }
	   
	   driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Existing customer\"]")).click();
	   
	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to Existing customer type screen <br>");  
	   bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Business\"]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Existing customer type screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Existing customer type screen successfully");
	   }
	   
	   
	   driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Business\"]")).click();
	   
	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to Login screen <br>");  
	   bStatus=   waitforelementvisibility("//XCUIElementTypeOther[@name=\"User ID\"]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Login screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Login screen successfully");
	   }
	   driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"User ID\"]")).sendKeys("jamesscme");
	   
	   driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Password\"]")).sendKeys("rakbank123");
	   
	  // driver.getKeyboard().sendKeys("rakbank123");
	   
	   driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Login\"]")).click();
	  // driver.send
	  // Thread.sleep(10000);
	   waitforelementvisibility("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage");
	   driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage")).click();
	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to Dashbord screen <br>");  
	   
	   bStatus=   waitforelementvisibility("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[2]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "User Logged-in successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "User could not User Logged-in successfully");
	   }
	   driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[2]")).click();
	   
	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to Send Money screen <br>"); 	     
	   bStatus=  waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Send Money\"]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Send Money screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Send Money screen successfully");
	   }
      driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Send Money\"]")).click();

	   Framework.WriteExtentReport=Framework.test.createNode("Navigate to Fund Transfer screen <br>");   
	   bStatus=   waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Fund Transfer\"]");
	   if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Fund Transfer screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Fund Transfer screen successfully");
	   }
	   
      driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Fund Transfer\"]")).click();
      Framework.WriteExtentReport=Framework.test.createNode("Navigate to Account List screen <br>");    
      bStatus=  waitforelementvisibility("//XCUIElementTypeOther[@name=\"RAKBankApp\"]");
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to My Rakbank account screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to My Rakbank account screen successfully");
	   }
      Thread.sleep(2000);
      for(int i=1; i<=15; i++)
      {
	      try {
	    	  System.out.println("Start"+i);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"RAKBankApp\"]")).click();
			System.out.println("End"+i);
			bStatus =  waitforelementvisibility("(//XCUIElementTypeStaticText[@name=\"Current Account\"])[1]",2);
			if(bStatus)
			{
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 Thread.sleep(1000);
			 System.out.println("Catch"+i);
			//e.printStackTrace();
		}
      }
     // My account list
      Framework.WriteExtentReport=Framework.test.createNode("Navigate to Send from account screen <br>");    
      bStatus=  waitforelementvisibility("(//XCUIElementTypeStaticText[@name=\"Current Account\"])[1]");
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Send from account screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Send from account screen successfully");
	   }
      driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Current Account\"])[1]")).click();  // send from account
      Framework.WriteExtentReport=Framework.test.createNode("Navigate to Transfer details screen <br>");    
      bStatus= waitforelementvisibility("//XCUIElementTypeOther[@name=\"Amount\"]");
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Transfer details screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Transfer details screen successfully");
	   }
     // Thread.sleep(2000);
      driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Amount\"]")).sendKeys("100");
      
   
      //Thread.sleep(2000);
     // driver.getKeyboard().sendKeys("100");
     // driver.hideKeyboard();
      //Thread.sleep(2000);
    //  adb shell input text "insert%syour%stext%shere"
	
      
      
	    	  driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Frequency Once\"]")).click(); // Frequency
	    	  System.out.println("-----------------Clicked Once");
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Daily\"]")).click();
	    	  Thread.sleep(2000);
	    	  System.out.println("-----------------Clicked Daily");
	    	
	      
	    	  //driver.findElement(By.xpath("//android.widget.TextView[@text='Once']")).click();
	    	  //driver.findElement(By.xpath("//android.view.View[@text='Daily']")).click(); 
	      
     
      driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"No Of Transfer\"]")).sendKeys(new CharSequence[] { "2" + Keys.ENTER });
	   //driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"No Of Transfer\"]")).click();
	   //driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"No Of Transfer\"]")).sendKeys("2");
	   //driver.hideKeyboard();
     // driver.hideKeyboard();
      Thread.sleep(2000);
      //driver.getKeyboard().sendKeys(Keys.TAB);
      //driver.getKeyboard().sendKeys(Keys.TAB);
      //Thread.sleep(1000);
      //driver.getKeyboard().sendKeys("Test");
      //driver.pressKey(new KeyEvent(
      
     // driver.getKeyboard().sendKeys("2");
     // String ss = driver.getPageSource();
   //   System.out.println(ss);
    //  driver.hideKeyboard();
      //Thread.sleep(2000);
      driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Reason\"]")).sendKeys("Test");
      

      driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Open calendar\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Next month\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]")).click();
      //Thread.sleep(4000);
      //driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"No Of Transfer\"]")).click();
      //Thread.sleep(2000);
     //driver.getKeyboard().sendKeys(Keys.TAB);
     //Thread.sleep(1000);
     //driver.getKeyboard().sendKeys("Test");
     //driver.hideKeyboard();
     //driver.findElement(By.xpath("//android.widget.EditText[@resource-id='reason']")).sendKeys("reason");
      Thread.sleep(2000);
  	new TouchAction(driver).press(PointOption.point(178, 606)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
		.moveTo(PointOption.point(172, 169)).release().perform();
  	
  	Thread.sleep(2000);
  	 TouchAction action = new TouchAction(driver);
		
		action.tap(PointOption.point(190, 692)).release().perform(); 
  	
      
      
      Framework.WriteExtentReport=Framework.test.createNode("Enter trasfer details <br>");    
     // bStatus=waitforelementvisibility("//android.widget.Button[@text='Next']");
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Transfer details entered successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not entered to Transfer details successfully");
	   }
      //driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Disclaimers']")).click();
      //driver.findElement(By.id("Close")).click();
     /* try {
		driver.findElement(By.id("Next")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		driver.findElement(By.id("Next")).click();
		e.printStackTrace();
	}*/
      
      Framework.WriteExtentReport=Framework.test.createNode("Navigated to Review fund trasfer details screen <br>");    
      bStatus=waitforelementvisibility("//XCUIElementTypeButton[@name=\"Confirm\"]");
      Thread.sleep(2000);
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Navigated to Review fund trasfer details screen successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not navigate to Review fund trasfer details screen successfully");
	   }
      driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirm\"]")).click();
      Framework.WriteExtentReport=Framework.test.createNode("Navigated to Transaction successful screen <br>");    
      bStatus=waitforelementvisibility("//XCUIElementTypeButton[@name=\"OK\"]");
      Thread.sleep(2000);
      if(bStatus==true)
	   {
			Framework.CreateResults(true, "Transaction completed successfully");
	   }
	   else
	   {
			Framework.CreateResults(false, "Could not completed transaction successfully");
	   }
      
      
      driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click(); 
    
		
		}
		
		catch(Exception exp) 
		{ 
			System.out.println("Cause is : " +exp.getMessage());
			Framework.WriteExtentReport=Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error "+exp.getMessage());
			exp.printStackTrace();
			
	    }

}
	
	public static boolean waitforelementvisibility(String we) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for(int i=1;i<=30;i++)
		{
			try {
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(we))));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(we))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement(By.xpath(we)).isDisplayed();
		System.out.println(we + " - Element found="+isElementPresent);
		return isElementPresent;
	}
	
	public static boolean waitforelementvisibility(String we,int iTime) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, iTime);
		for(int i=1;i<=iTime;i++)
		{
			try {
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(we))));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(we))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement(By.xpath(we)).isDisplayed();
		System.out.println(we + " - Element found="+isElementPresent);
		return isElementPresent;
	}
	
	public static boolean waitforelementvisibility1(String we) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for(int i=1;i<=30;i++)
		{
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement((MobileBy.AccessibilityId(we)))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement((MobileBy.AccessibilityId(we))).isDisplayed();
		System.out.println("Element found="+isElementPresent);
		return isElementPresent;
	}
	
}
