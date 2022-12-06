package backup;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinations.BaseClass;
import StepDefinations.Framework;
import StepRunner.Runner;
import cucumber.api.java.en.Given;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;





public class ApplyForIslamicSavingSelfEmployed  extends BaseClass{
	public static IOSDriver<MobileElement> driver;
	public static String sErrorLog;
	public static String MobileNumber;
	
	
	
	 /*@Given("^Application is on landing page23$")
	    public void application_is_on_landing_saving_salaride_page23() throws Throwable {
		 BaseClass.setup();
		 System.out.println("1111111111111111111");
		 try {
			BaseClass.driver.closeApp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 BaseClass.driver.quit();
	 }*/
	
	@Given("^Close App$")
    public void CloseApp() throws Throwable {
		try {
			sleep(10000);
            BaseClass.driver.closeApp();
            //BaseClass.driver.close(
           
            BaseClass.driver.quit();
        } catch (Exception e) {
            e.getMessage();
            
        }
	}
	
			 
		 @Given("^Application is on landing Islamic Saving Self Employed page$")
		    public void application_is_on_landing_saving_salaride_page() throws Throwable {
			 System.out.println("1111111111111111111");
		
			   Runner.status=false;
			 Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			 Framework.test.assignCategory(Framework.Category);	
			 Framework.WriteExtentReport=Framework.test.createNode("Navigate to Application landing page <br>");
			 
			 BaseClass.setup();
			 driver=BaseClass.driver;
			 
			 
 			/* sleep(10000);
             String s1 = driver.getPageSource();
				
				System.out.println("Page Source" +s1);
				
				
				sleep(10000);*/
			
				try {
					//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK")))).isDisplayed();
					//driver.findElement(By.id("OK")).click();
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a bank account\"])[5]")))).isDisplayed();
			            	driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a bank account\"])[5]")).click();
			            	
			            	Runner.status=true;
			            	
				}
				catch(Exception e) {
					Runner.status=false;
					
					
				}
				
				//boolean status=driver.findElement(By.id("English language")).isDisplayed();
			
				if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
			}
		 
		 @Given("^application is on landing Islamic Saving Self Employed page$")
		    public void Application_is_on_landing_saving_salaride_page() throws Throwable {
			 System.out.println("1111111111111111111");
			 BaseClass.setup();
			 driver=BaseClass.driver;
			 
			
			Runner.status=false;
			 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			// Framework.test.assignCategory(Framework.Category);	
			 Framework.WriteExtentReport=Framework.test.createNode("Navigate to Application landing page <br>");
			/* sleep(10000);
          String s1 = driver.getPageSource();
				
				System.out.println("Page Source" +s1);
				
				
				sleep(10000);*/
			
				try {
					//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK")))).isDisplayed();
					//driver.findElement(By.id("OK")).click();
					
					try {
						((WebElement) (new WebDriverWait((WebDriver) driver, 10L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("OK"))).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a bank account\"])[5]")))).isDisplayed();
	            	driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a bank account\"])[5]")).click();
			            	
			            	Runner.status=true;
			            	
				}
				catch(Exception e) {
					Runner.status=false;
					
					
				}
				
				//boolean status=driver.findElement(By.id("English language")).isDisplayed();
			
				if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
			}
		 
		 
		 
		
		 @Given("^Preferred Language Islamic Saving Self Employed Page$")
		    public void preferred_language_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
				 System.out.println("111155647375111");
			 
			       Runner.status=false;
		         sleep(1000);
		        // Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Preferred Language page <br>");
					//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Next")))).isDisplayed();
					
						try {
							((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("English language")))).isDisplayed();
							((MobileElement)driver.findElement(MobileBy.AccessibilityId("English language"))).click();
							Runner.status=true;
						} catch (Exception e) {
							Runner.status=false;
							sErrorLog = e.toString();
						}

						sleep(1000);
						driver.findElement(By.id("Let's go")).click();
				
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 }
	
		    }


		 @Given("^Select a Product Islamic Saving Self Employed Page$")
		    public void select_a_product_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Select a Product page <br>");
				try {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a Bank account\"])[2]")))).isDisplayed();
			           driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a Bank account\"])[2]")).click();
			           Runner.status=true;
				} catch (Exception e) {
					Runner.status=false;
					sErrorLog = e.toString();
					
				}
						
			 		 
			 			
			 			 
			 		 
				if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
			 }
		 }
		 
		 
		 @Given("^Rak Bank Mission Islamic Saving Self Employed Page$")
		    public void rak_bank_mission_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Rak Bank Mission page <br>");
				try {
					sleep(1000);
					//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("RAKBANK Mission")))).isDisplayed();					
						 driver.findElement(By.id("Next")).click();
						 Runner.status=true;
				} catch (Exception e) {
					Runner.status=false;
					sErrorLog = e.toString();
				}
					 
		 		 
		 			
		 			 
		 		 
				if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
			 }

			}
		 
		 
			
		 @Given("^Enter Mobile Number Islamic Saving Self Employed Page$")
		    public void enter_mobile_number_saving_salaride_page() throws Throwable {
			 
				// Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;	
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				//BaseClass.Test6();
					String sTestCaseid= "";
				 
					//String MobileNumber = getColumnNumber(Spath,"MobileNumber",sTestCaseid);
				//	String OTP = getColumnNumber(Spath,"OTP",sTestCaseid);
			 		//String FilePath1="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 		//String sheetName = "Registration";
			 		
			 		//String MobileNumber = reader.getCellData(sheetName, 1, 2);
			 		//System.out.println(MobileNumber);
			 		int min = 1035650;
                    int max = 1999999;    
                    System.out.println("Random value of type double between "+min+" to "+max+ ":");
                    double a = Math.random()*(max-min+1)+min;  
                     MobileNumber = "55"+String.valueOf(Math.round(a));
                    System.out.println("MobileNumber================>>"+MobileNumber);
                    
                    
                    WirteMobileNumber(MobileNumber);
                    
				 //String SPath = "";
				 
				// String sTestCaseid = sTestCaseidval;
				 
				// String mobilenumber = getColumnNumber(SPath,"mobilenumber", sMobileNumber);
                    
                    
                    
			 		
			 		// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Enter Mobile Number page <br>");
					try {
						((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("undefined field"))).sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
						//driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
						((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send OTP")))).isDisplayed();
						 driver.findElement(By.id("Send OTP")).click();
						 Runner.status=true;
					} catch (Exception e) {
						
						Runner.status=false;
						
						sErrorLog = e.toString();
					}
				
		    
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		 }
			
		 @Given("^Enter Mobile Number Come Back Employed Page$")
		    public void enter_number_saving_salaride_page() throws Throwable {
			 
				// Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;	
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				//BaseClass.Test6();
					String sTestCaseid= "";
				 
					//String MobileNumber = getColumnNumber(Spath,"MobileNumber",sTestCaseid);
					
			 
			 		// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Enter Mobile Number page <br>");
					try {
						((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("undefined field"))).sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
						//driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
						((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send OTP")))).isDisplayed();
						 driver.findElement(By.id("Send OTP")).click();
						 Runner.status=true;
					} catch (Exception e) {
						
						Runner.status=false;
						
						sErrorLog = e.toString();
					}
				
		    
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		 }
		 
		 
		 
		 @Given("^OTP enter Islamic Saving Self Employed Page$")
		    public void otp_enter_saving_salaride_page() throws Throwable {
				
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				
				//String OTP = getColumnNumber(Spath,"OTP",sTestCaseid);
				
				 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to OTP enter page <br>");
				
				
				 try {
					 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					 WebDriverWait wait = new WebDriverWait(driver, 60);
					 sleep(20000);
					 
					  TouchAction action = new TouchAction(driver);
						
						action.tap(PointOption.point(126, 503)).release().perform();  
					 
					 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Verification Code field\"]")));
					 
					 driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Verification Code field\"]")).click();
					 
					 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Verification Code field"))).sendKeys(new CharSequence[] { "123456" + Keys.ENTER });
					 //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Verification Code field")))).isDisplayed();
					 //((MobileElement)driver.findElement(MobileBy.xpath("//XCUIElementTypeSecureTextField[@name=\"Verification Code field\"]"))).sendKeys(new CharSequence[] { "123456" + Keys.ENTER });
					
					
					 Runner.status=true;
					 }
		 		 catch(Exception e) {
		 			Runner.status=false;
		 			sErrorLog = e.toString();
		 			 
		 		 }
				/*{
				JFrame parent =new JFrame();
				JLabel lab = new JLabel("Enter Otp and click on OK",0);
				JOptionPane pane = new JOptionPane(lab);
				JDialog dialog =pane.createDialog(parent,"Message");
				dialog.setSize(600,400);
				dialog.setAlwaysOnTop(true);
				dialog.show();
				dialog.toFront();
				dialog.setFocusable(true); 
		 }*/
				 if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		 }
		 
		 
		 @Given("^Simple page$")
		    public void Simple_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				
			
				
				 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Come Back Joureny Page <br>");
				
				
				 try {
					 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 WebDriverWait wait = new WebDriverWait(driver, 30);
					
					 
					// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Yes, let’s continue button")));
					// driver.findElement(By.id("Yes, let’s continue button")).click();
					 
					 //accounts
					 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Yes, let’s keep going button")));
					driver.findElement(By.id("Yes, let’s keep going button")).click();
					 Runner.status=true;
					 }
		 		 catch(Exception e) {
		 			Runner.status=false;
		 			sErrorLog = e.toString();
		 			 
		 		 }
				/*{
				JFrame parent =new JFrame();
				JLabel lab = new JLabel("Enter Otp and click on OK",0);
				JOptionPane pane = new JOptionPane(lab);
				JDialog dialog =pane.createDialog(parent,"Message");
				dialog.setSize(600,400);
				dialog.setAlwaysOnTop(true);
				dialog.show();
				dialog.toFront();
				dialog.setFocusable(true); 
		 }*/
				 if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
			 
			 
		 }
		 
		 
	 		//FindImagForSikuli.ClickOnElement(sImagePath+"Simply Resume.png",0.8D);
	 		
		 @Given("^Select a Product you prefer Islamic Saving Self Employed Page$")
		    public void select_a_product_youd_prefer_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String SelectProducts = getColumnNumber(Spath,"SelectProducts",sTestCaseid);
					
					//Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Select a Product you prefer  Page"+"<br>"+"Expected Result:Select a Product you prefer  Page launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Select a Product you prefer page <br>");
					try {
				 if(SelectProducts.equals("Rakislamic")) {
					 
				
					// sleep(2000);
				        
	                  //  TouchAction action = new TouchAction(driver);
						
						//action.tap(PointOption.point(136, 296)).release().perform();                                                                                                                             
		 		
		 			((WebElement) (new WebDriverWait((WebDriver) driver, 60L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Banking based on the principles of Shariah Law\"])[2]")))).isDisplayed();
		 			((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Banking based on the principles of Shariah Law\"])[2]"))).click();
					
		 		 
					/* sleep(10000);
	                 String s = driver.getPageSource();
						
						System.out.println("Page Source" +s);
						
						
						sleep(10000);*/
		 		
		 			
		 			 
				 }
				 else {
					 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Conventional banking\"])[2]")))).isDisplayed();
					 
					 
						 ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Conventional banking\"])[2]"))).click();
				 }
				 

					
				 
					 Runner.status=true;
	
					}
					catch(Exception e) {
						Runner.status=false;
						sErrorLog = e.toString();
					}
			 
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
					
			 }
		 }
		 
		 @Given("^Pick an Account Islamic Saving Self Employed Page$")
		    public void pick_an_account_saving_salaride_page() throws Throwable {
		   
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Pick an Account page <br>");
				 try {
				
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String AccountType = getColumnNumber(Spath,"AccountType",sTestCaseid);
			
				 if(AccountType.equals("Savings")) {
					 
					 sleep(3000);
					 
					 
					 
					 TouchAction action = new TouchAction(driver);
						
						action.tap(PointOption.point(167, 670)).release().perform();
						//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Savings Account Earn attractive interest  Card-less cash withdrawals  Available in AED for residents Open a Savings  Account\"])[3]")))).isDisplayed();
			 		   
			 		 
			 			// driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Savings Account Earn attractive interest  Card-less cash withdrawals  Available in AED for residents Open a Savings  Account\"])[3]")).click();
							 
				 		 
				 }else {
					 sleep(3000);
					 
					
						
					 TouchAction action = new TouchAction(driver);
						
						action.tap(PointOption.point(174, 398)).release().perform();
					 
					//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.className("Current Account")))).isDisplayed();
			 	
			 			//driver.findElement(By.className("Current Account")).click();
						
		
				 }
			 		  //Savings Account Debit Card with 24/7global access via MasterCard ATMs Monthly quarterly or bi-annual statements Transfer funds between accounts easily and securely Open a Savings  Account
				 Runner.status=true;
					
					}
					catch(Exception e) {
						Runner.status=false;
						sErrorLog = e.toString();
					}
		    
				 if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		 }
	 		
		 @Given("^Account Option Islamic Saving Self Employed Page$")
		    public void account_option_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Account Option page <br>");
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String AccountType = getColumnNumber(Spath,"AccountType",sTestCaseid);
					String PurposeofAccount = getColumnNumber(Spath,"PurposeofAccount",sTestCaseid);
					String Others = getColumnNumber(Spath,"Others",sTestCaseid);
					String DoYouRequireaChequeBook = getColumnNumber(Spath,"DoYouRequireaChequeBook",sTestCaseid);
					String DoYouWantDebitCard = getColumnNumber(Spath,"DoYouWantDebitCard",sTestCaseid);
					String DoesTheFollowingApplyToYou = getColumnNumber(Spath,"DoesTheFollowingApplyToYou",sTestCaseid);
			 		
			 		
			 		//String sheetName = "Registration";
					
			 		//String PurposeofAccount = reader.getCellData(sheetName, 2, 2);
			 		//String DoYouRequireaChequeBook = reader.getCellData(sheetName, 3, 2);
			 		//String DoYouWantDebitCard = reader.getCellData(sheetName, 4, 2);
			 		
			 		
					try {
				((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Purpose of account value")))).isDisplayed();
				  
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Purpose of account value"))).click();
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(PurposeofAccount)))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(PurposeofAccount))).click();
				        
				        if(PurposeofAccount.equals("Others (please specify) option")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Others field")))).isDisplayed();
					 		
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Others field"))).sendKeys(new CharSequence[] { Others + Keys.ENTER });
				        
				        }
				        
				        
		    if(AccountType.equals("Current"))  {     
					if(DoYouRequireaChequeBook.equals("Yes")) {
						
						System.out.println("1111111");
						((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]"))).click();
					}
					else {
						System.out.println("66666666666");
						((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]"))).click();
				        		
					}
			  
					
					
					if(DoYouWantDebitCard.equals("Yes")) {
						System.out.println("77777777777");
						((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[4]")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[4]"))).click();
					}
					else {
						
						System.out.println("8888888888");
						((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]"))).click();                    
					}
				
					 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[6]")))).isDisplayed();
				        
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[6]"))).click();
					
		    }
					else {
						
						if(DoYouWantDebitCard.equals("Yes")) {
							System.out.println("77777777777");
							((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]"))).click();
						}
						else {
							
							System.out.println("8888888888");
							((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]"))).click();                    
						}
						
								 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]")))).isDisplayed();
							        
							        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]"))).click();
						
					}
		   
		        BaseClass.swipe("up", "Let's keep going button");
		    
		    
		    ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap to open and read\"])[1]")))).isDisplayed();
		       
	        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap to open and read\"])[1]"))).click();  			        
	    
	        sleep(2000);
	        new TouchAction(driver).press(PointOption.point(194, 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
			.moveTo(PointOption.point(185, 142)).release().perform();
	      
	        new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("I have read and accepted")));
	        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("I have read and accepted"))).click(); 				        
	        
	        new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Next button")));
	        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click();  
		    
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Let's keep going button")))).isDisplayed();
				        
				        	 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Let's keep going button"))).click();
				        	 
				        	 
				        	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							// WebDriverWait wait = new WebDriverWait(driver, 30);
				        	 
				        	 
				        	try {
								if(((WebElement)new WebDriverWait((WebDriver)driver, 10L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("I'm sure button")))).isDisplayed())
								        {
								            
								                ((MobileElement)driver.findElement(MobileBy.AccessibilityId("I'm sure button"))).click();
								                
								        }
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        	
					
				        Runner.status=true;
						
					}
					catch(Exception e) {
						Runner.status=false;
						sErrorLog = e.toString();
					}
			 		
			 
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
					
		    }
	 		
		 @Given("^PDF  Islamic Saving Self Employed Page$")
		    public void pdf_saving_salaride_page() throws Throwable {
				
			 if(Runner.status==true)
			 {
				 Runner.status=false;
					 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to PDF page <br>");
		 			try {
		 			
		 				sleep(3000);
		 			new TouchAction(driver).press(PointOption.point(190, 621)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
		 			.moveTo(PointOption.point(190, 254)).release().perform();
		 			
		 			
		 			
		 			
		 			((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("I agree")))).isDisplayed();
		 		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("I agree"))).click(); 
		 		        sleep(2000);
		 		        
		 		        
		 		     
		 		    	  ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Let's keep going button"))).click(); 
		 		
		 			 
			
		 		      Runner.status=true;
						
					}
					catch(Exception e) {
						Runner.status=false;
						
						sErrorLog = e.toString();
					}
				 
		 		
		 			if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		    }
	 		
		 @Given("^Email Address Islamic Saving Self Employed Page$")
		    public void email_address_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 		
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String EmailAddress = getColumnNumber(Spath,"EmailAddress",sTestCaseid);
				
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 WebDriverWait wait = new WebDriverWait(driver, 30);
			 		
			 		//String sheetName = "Registration";
			 		
			 		//String EmailAddress = reader.getCellData(sheetName, 5, 2);
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Email Address page <br>");
						
						try {
							
							wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Email address")));
		 			//((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Email Address")))).isDisplayed();
		 		
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Email address"))).sendKeys(new CharSequence[] { EmailAddress + Keys.ENTER });
			        
			        wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Send Key Facts")));
			       // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send document")))).isDisplayed();
				
			        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Send Key Facts"))).click(); 
						
						
						
			        	
			        	
			        Runner.status=true;
					
			}
			catch(Exception e) {
				Runner.status=false;
				
				sErrorLog = e.toString();
			}
		 		
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 }
				 
		    }
		 
		 
		 @Given("^Scan Emirates ID and Passport Page$")
		    public void saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 		
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					
				
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					 WebDriverWait wait = new WebDriverWait(driver, 30);
			 		
			 		//String sheetName = "Registration";
			 		
			 		//String EmailAddress = reader.getCellData(sheetName, 5, 2);
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Scan Emirates ID and Passport Page <br>");
						
						try {
							
							wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("To know you better")));
		 			
			        	
			        Runner.status=true;
					
			}
			catch(Exception e) {
				Runner.status=false;
				
				sErrorLog = e.toString();
			}
		 		
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 }
				 
		    }
		 
	 	
		 @Given("^Come Back Joureny Page$")
		    public void Come_Back_Joureny_Page() throws Throwable {
			 
			 sleep(30000);
			 BaseClass.driver.closeApp();
			 
			 BaseClass.setup();
			 driver=BaseClass.driver;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String SelectProducts = getColumnNumber(Spath,"SelectProducts",sTestCaseid);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 WebDriverWait wait = new WebDriverWait(driver, 30);
			 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("New Customer button")))).isDisplayed();
         	driver.findElement(By.id("New Customer button")).click();
         	((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("English language")))).isDisplayed();
			((MobileElement)driver.findElement(MobileBy.AccessibilityId("English language"))).click();
			sleep(1000);
			driver.findElement(By.id("Next")).click();
			
			((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.name("Money management Open a Bank account")))).isDisplayed();
	           driver.findElement(By.name("Money management Open a Bank account")).click();
	           
	           ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("RAKBANK Mission")))).isDisplayed();
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Next")))).isDisplayed();
				 driver.findElement(By.id("Next")).click();
				 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field")))).isDisplayed();
				 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("undefined field"))).sendKeys(new CharSequence[] { "55888786" + Keys.ENTER });
				//driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send OTP")))).isDisplayed();
				 driver.findElement(By.id("Send OTP")).click();
				 
				 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Verification Code field")));
				 //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Verification Code field")))).isDisplayed();
				 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Verification Code field"))).sendKeys(new CharSequence[] { "123456" + Keys.ENTER });
			
				 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Simply Resume button")));
				 driver.findElement(By.id("Simply Resume button")).click();
				 
				 
			Runner.status=true;
			 
		 }
		 
		 @Given("^Review your personal details Islamic Saving Self Employed Page$")
		    public void review_your_personal_details_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String Mothermaidenname = getColumnNumber(Spath,"Mothermaidenname",sTestCaseid);
					String Countryofbirth = getColumnNumber(Spath,"Countryofbirth",sTestCaseid);
					String DoYouHaveDualNationality = getColumnNumber(Spath,"DoYouHaveDualNationality",sTestCaseid);
					String DualNationalityCountry = getColumnNumber(Spath,"DualNationalityCountry",sTestCaseid);
					String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
			 	
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Review your personal details page <br>");
						
						try {
		 		((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Mother's maiden name field")))).isDisplayed();
		 			
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Mother's maiden name field"))).sendKeys(new CharSequence[] { Mothermaidenname + Keys.ENTER });
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Country of birth value")))).isDisplayed();
				       
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country of birth value"))).click(); 
			
				        
				        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for(int iCount=1;iCount<=100;iCount++)
						{
					       try {
								
					    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(Countryofbirth))).click();
								break;
							} catch (Exception e) {
								
								
								BaseClass.swipe("up",Countryofbirth );
							        	
							 }
                    
					}
			       
			       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				        
				     
					
			      
				        if(DoYouHaveDualNationality.equals("Yes")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]"))).click(); 
					        
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Select... value"))).click(); 
					       
					        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
							for(int iCount=1;iCount<=100;iCount++)
							{
						       try {
									
						    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(DualNationalityCountry))).click();
									break;
								} catch (Exception e) {
									
									
									BaseClass.swipe("up",DualNationalityCountry );
								        	
								 }
	                    
						}
				     
				       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
				        }else {
				        	 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]")))).isDisplayed();
						        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]"))).click(); 
				        	
				        }

				        if(AreYouPoliticallyExposedPerson.equals("Yes")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[4]")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[4]"))).click(); 
				        }
				        else {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]"))).click(); 
				        	
				        }
				   
				        
				        
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(194, 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
						.moveTo(PointOption.point(185, 142)).release().perform();
				
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//XCUIElementTypeOther[@name=\"Keep going button\"]")))).isDisplayed();
				 
				        	((MobileElement)driver.findElement(MobileBy.xpath("//XCUIElementTypeOther[@name=\"Keep going button\"]"))).click(); 
									 
									 Runner.status=true;
										
						}
						catch(Exception e) {
							Runner.status=false;
							sErrorLog = e.toString();
						}
				
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog );
						}
			 }
		 		
		    }
			 
		 @Given("^About your PEP Status Islamic Saving Self Employed Page$")
		    public void about_your_pep_status_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			 		
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String YouareaPEPby = getColumnNumber(Spath,"YouareaPEPby",sTestCaseid);
					String PoliticalDesignation = getColumnNumber(Spath,"PoliticalDesignation",sTestCaseid);
					String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
					
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to About your PEP Status page <br>");
			 		try {
			 		if(AreYouPoliticallyExposedPerson.equals("Yes")) {
				 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(YouareaPEPby)))).isDisplayed();
				 
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(YouareaPEPby))).click(); 
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Previous Designation field")))).isDisplayed();
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Previous Designation field"))).sendKeys(new CharSequence[] { PoliticalDesignation + Keys.ENTER });
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed(); 
			       
			      
			        	 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();  
				
			 		}
			 		
			 		Runner.status=true;
			 		
			 		}
					catch(Exception e) {
						Runner.status=false;
						
						sErrorLog = e.toString();
					}
				 
		 		
			 		if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		    }

		 @Given("^PEP Status by association Islamic Saving Self Employed Page$")
		    public void pep_status_by_association_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 
				 //Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			 		
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String YourRelationship = getColumnNumber(Spath,"YourRelationship",sTestCaseid);
					String NameOfThePEP = getColumnNumber(Spath,"NameOfThePEP",sTestCaseid);
					String CountryWhereThePEPHoldsTheStatus = getColumnNumber(Spath,"CountryWhereThePEPHoldsTheStatus",sTestCaseid);
					String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
					String YouareaPEPby = getColumnNumber(Spath,"YouareaPEPby",sTestCaseid);
					
			 		
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to PEP Status by association page <br>");
						
						try {
			 		if(AreYouPoliticallyExposedPerson.equals("Yes")) {
			 		
			 			    if(YouareaPEPby.equals("Association radio")) {
				                    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Your relationship value")))).isDisplayed();
				
			                         ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Your relationship value"))).click(); 
			                     new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(YourRelationship)));
			                      ((MobileElement)driver.findElement(MobileBy.AccessibilityId(YourRelationship))).click(); 
			                     new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Name of the PEP field")));
			                      ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Name of the PEP field"))).sendKeys(new CharSequence[] { NameOfThePEP + Keys.ENTER });
			        
			        
			                      new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Resident country of the PEP value")));
			                      ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Resident country of the PEP value"))).click(); 
			                      
			                      
			                      
			                      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
									for(int iCount=1;iCount<=100;iCount++)
									{
								       try {
											
								    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CountryWhereThePEPHoldsTheStatus))).click();
											break;
										} catch (Exception e) {
											
											
											 BaseClass.swipe("up", CountryWhereThePEPHoldsTheStatus);
										        	
										 }
			                    
								}
						     
						       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			                      
			                
			                      new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));
			                      
			                       
			                       
			                    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click(); 
			 			    }
			 		}
			 		
			 		 Runner.status=true;
			  			
				 		}
						catch(Exception e) {
							Runner.status=false;
							sErrorLog = e.toString();
							
						}
			                       
			                       if(Runner.status=true)
			       				{
			       					Framework.CreateResults(true, "Step Passed");
			       				}
			       				else
			       				{
			       					Framework.CreateResults(false, sErrorLog);
			       				}
			 }
		 			
		}
			
		 @Given("^Your employment type Islamic Saving Self Employed Page$")
		    public void your_employment_type_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your employment type page"+"<br>"+"Expected Result:Your employment type"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Your employment type page <br>");
				 try {
						
						
				 if(YourEmploymentType.equals("Salaried")) {
					 
				
				 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Salaried")))).isDisplayed();
			        
			        
			        try {
			        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Salaried"))).click();
								 }
					 		 catch(Exception e) {
					 			
							 
					 		 }
				 }
				 else {	 
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Self-employed")))).isDisplayed();
			   
			      ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Self-employed"))).click();
				 }
		 		
				 Runner.status=true;
		  			
			 		}
					catch(Exception e) {
						Runner.status=false;
						sErrorLog = e.toString();
					}
				 
				 if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
		    }
				
		 @Given("^Self employed Details Islamic Saving Self Employed Page$")
		    public void self_employed_details_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
				System.out.println(YourEmploymentType);
				String TotalMonthlySalarySelfEmployment = getColumnNumber(Spath,"TotalMonthlySalarySelfEmployment",sTestCaseid);
				System.out.println(TotalMonthlySalarySelfEmployment);
				String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,"NumberofCompaniesyouhavetieswithvalue",sTestCaseid);
				System.out.println(NumberofCompaniesyouhavetieswithvalue);
				
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Self employed Details page"+"<br>"+"Expected Result:Self employed Details"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Self employed Details page <br>");
					
					try {
			 if(YourEmploymentType.equals("Self-employed")) {
				 
				 System.out.println("666666666666");
				 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Total Monthly Income field")));
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Total Monthly Income field"))).sendKeys(new CharSequence[] { TotalMonthlySalarySelfEmployment + Keys.ENTER });
			        sleep(1000);
			        
                    TouchAction action = new TouchAction(driver);
					
					action.tap(PointOption.point(190, 515)).release().perform();
					
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Number of companies you are associated with\"])[1]")))).isDisplayed();
			        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Number of companies you are associated with\"])[1]"))).click();
			        sleep(1000);                                        
              
			        if(NumberofCompaniesyouhavetieswithvalue.equals("1")) {
			        	System.out.println("111111111");
			        	
			        	
			   
			        	sleep(1000);
			        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(193, 717)).release().perform();
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//XCUIElementTypePickerWheel[@value=\"One\"]")))).isDisplayed();
			       
			        
			        sleep(1000);
                     
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
			        
			        }
			        
			        if(NumberofCompaniesyouhavetieswithvalue.equals("2")) {
			        	System.out.println("22222222");
			        	sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
	                      
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
				        }
			        
			        if(NumberofCompaniesyouhavetieswithvalue.equals("3")) {
			        	System.out.println("333333");
			        	sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
	                      
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
				        }
			        
			        if(NumberofCompaniesyouhavetieswithvalue.equals("4")) {
			        	System.out.println("4444444");
			        	sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
				        new TouchAction(driver).press(PointOption.point(197, 769)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(193, 717)).release().perform();
				        sleep(1000);
	                     
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
				        }
			        
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep Going button")))).isDisplayed();
			        
			        
			        
			      
			        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
								
					 		
			 }	
							 
					 		
			        Runner.status=true;
		  			
		 		}
				catch(Exception e) {
					Runner.status=false;
					sErrorLog = e.toString();
				}
			        
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}  
					
			 }
			        
			        
				 
			 
			 
			 
		 }
		 
		 @Given("^First Company Details Islamic Saving Self Employed Page$")
		    public void first_company_details_saving_salaride_page() throws Throwable {
			 
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
				String CompanyName1 = getColumnNumber(Spath,"CompanyName1",sTestCaseid);
				String OtherCompanyName1 = getColumnNumber(Spath,"OtherCompanyName1",sTestCaseid);
				String Designation1 = getColumnNumber(Spath,"Designation1",sTestCaseid);
				String IndustryCategoryValue1 = getColumnNumber(Spath,"IndustryCategoryValue1",sTestCaseid);
				String IndustryValue1 = getColumnNumber(Spath,"IndustryValue1",sTestCaseid);
				String ShareholdingPercentage1 = getColumnNumber(Spath,"ShareholdingPercentage1",sTestCaseid);
				String ListCountrywithWhichBusinessConducted1 = getColumnNumber(Spath,"ListCountrywithWhichBusinessConducted1",sTestCaseid);
				String CountryOfIncorporationValue1 = getColumnNumber(Spath,"CountryOfIncorporationValue1",sTestCaseid);
				String AnnualTurnover1 = getColumnNumber(Spath,"AnnualTurnover1",sTestCaseid);
				String AnnualProfit1 = getColumnNumber(Spath,"AnnualProfit1",sTestCaseid);
				
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:First Company Details page"+"<br>"+"Expected Result:First Company Details"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to First Company Details page <br>");
					try {
				 if(YourEmploymentType.equals("Self-employed")) {
					 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Company name field")))).isDisplayed();
					 if(CompanyName1.equals("OTHERS")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName1)))).isDisplayed();
					       //new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName1))).click();
					        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
						       
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { OtherCompanyName1 + Keys.ENTER });
					      
				        }
					 else {
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Company name field"))).sendKeys(new CharSequence[] { CompanyName1 + Keys.ENTER });
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName1)))).isDisplayed();
		        sleep(2000);
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName1))).click();
					 }
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Job title field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { Designation1 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Field of work value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Field of work value"))).click();
		        
		        
		        
		        
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue1)))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue1))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Work category value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Work category value"))).click();
		        
		        System.out.println(IndustryValue1);
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryValue1))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", IndustryValue1);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        //BaseClass.swipe("up", IndustryValue1);
		        //((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue1+"\"])[2]")))).isDisplayed();
		       // ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue1+"\"])[2]"))).click();
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Shareholding percentage field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Shareholding percentage field"))).sendKeys(new CharSequence[] { ShareholdingPercentage1 + Keys.ENTER });
		        System.out.println("sjhsjhdfgbdj");
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Countries the company does business with")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Countries the company does business with"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted1))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", ListCountrywithWhichBusinessConducted1);
					        	
					 }
            
			}
	     
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
		   
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))).click();
		        
		        BaseClass.swipe("up", "Keep Going button");
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Country of Incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country of Incorporation value"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue1))).click();
						break;
					} catch (Exception e) {
						
						
						 BaseClass.swipe("up", CountryOfIncorporationValue1);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       sleep(1000);
	       new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
			.moveTo(PointOption.point(176, 250)).release().perform();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Year of incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Year of incorporation value"))).click();
		        
		        sleep(1000);
		        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				.moveTo(PointOption.point(196, 717)).release().perform();
			        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(196, 717)).release().perform();
			        sleep(1000);
			        TouchAction action = new TouchAction(driver);
					    action.tap(PointOption.point(355, 604)).release().perform();
					  
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual turnover field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual turnover field"))).sendKeys(new CharSequence[] { AnnualTurnover1 + Keys.ENTER });
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual profit field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual profit field"))).sendKeys(new CharSequence[] { AnnualProfit1 + Keys.ENTER });
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep Going button")))).isDisplayed();
				        
				        
				        
				        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
									 
						 		
				 }
				 Runner.status=true;
		  			
			 		}
					catch(Exception e) {
						Runner.status=false;
						sErrorLog = e.toString();
					}
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
			 
		        
		    }
		 
		 @Given("^Second Company Details Islamic Saving Self Employed Page$")
		    public void second_company_details_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
				String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,"NumberofCompaniesyouhavetieswithvalue",sTestCaseid);
				
				int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
				String CompanyName2 = getColumnNumber(Spath,"CompanyName2",sTestCaseid);
				String OtherCompanyName2 = getColumnNumber(Spath,"CompanyName2",sTestCaseid);
				String Designation2 = getColumnNumber(Spath,"Designation2",sTestCaseid);
				String IndustryCategoryValue2 = getColumnNumber(Spath,"IndustryCategoryValue2",sTestCaseid);
				String IndustryValue2 = getColumnNumber(Spath,"IndustryValue2",sTestCaseid);
				String ShareholdingPercentage2 = getColumnNumber(Spath,"ShareholdingPercentage2",sTestCaseid);
				String ListCountrywithWhichBusinessConducted2 = getColumnNumber(Spath,"ListCountrywithWhichBusinessConducted2",sTestCaseid);
				String CountryOfIncorporationValue2 = getColumnNumber(Spath,"CountryOfIncorporationValue2",sTestCaseid);
				String AnnualTurnover2 = getColumnNumber(Spath,"AnnualTurnover2",sTestCaseid);
				String AnnualProfit2 = getColumnNumber(Spath,"AnnualProfit2",sTestCaseid);
				 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Second Company Details page"+"<br>"+"Expected Result:Second Company Details successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Second Company Details page <br>");
				try {
				 if(YourEmploymentType.equals("Self-employed")) {
					 if( number>=2) {
					
					 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Company name field")))).isDisplayed();
					 if(CompanyName2.equals("OTHERS")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName2)))).isDisplayed();
					       //new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName2))).click();
					        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
						       
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { OtherCompanyName2 + Keys.ENTER });
					      
				        }
					 else {
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Company name field"))).sendKeys(new CharSequence[] { CompanyName2 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName2)))).isDisplayed();
		        sleep(2000);
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName2))).click();
					 }
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Job title field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { Designation2 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Field of work value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Field of work value"))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue2)))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue2))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Work category value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Work category value"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryValue2))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", IndustryValue2);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       
		       // BaseClass.swipe("up", IndustryValue2);
		     // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue2)))).isDisplayed();
		        //((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue2+"\"])[2]"))).click();
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Shareholding percentage field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Shareholding percentage field"))).sendKeys(new CharSequence[] { ShareholdingPercentage2 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Countries the company does business with")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Countries the company does business with"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    				for(int iCount=1;iCount<=100;iCount++)
		    				{
		    			       try {
		    						
		    			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted2))).click();
		    						break;
		    					} catch (Exception e) {
		    						
		    						
		    						BaseClass.swipe("up", ListCountrywithWhichBusinessConducted2);
		    					        	
		    					 }
		                
		    			}
		    				
		    	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		          
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))).click();
		        BaseClass.swipe("up", "Keep Going button");
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Country of Incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country of Incorporation value"))).click();
		        
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    				for(int iCount=1;iCount<=100;iCount++)
		    				{
		    			       try {
		    						
		    			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue2))).click();
		    						break;
		    					} catch (Exception e) {
		    						
		    						
		    						 BaseClass.swipe("up", CountryOfIncorporationValue2);
		    					        	
		    					 }
		                
		    			}
		    				
		    	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	       sleep(1000);
		    	       new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
		    			.moveTo(PointOption.point(176, 250)).release().perform();
		      
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Year of incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Year of incorporation value"))).click();
		        
		        sleep(1000);
		        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				.moveTo(PointOption.point(196, 717)).release().perform();
			        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(196, 717)).release().perform();
			        sleep(1000);
			        TouchAction action = new TouchAction(driver);
					    action.tap(PointOption.point(355, 604)).release().perform();
					    
					    
					    
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual turnover field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual turnover field"))).sendKeys(new CharSequence[] { AnnualTurnover2 + Keys.ENTER });
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual profit field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual profit field"))).sendKeys(new CharSequence[] { AnnualProfit2 + Keys.ENTER });
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep Going button")))).isDisplayed();
				        
				        
				       
				        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
									 
					  
				       
			        }
				 }
					 
					 Runner.status=true;}
		 		 catch(Exception e) {
		 			Runner.status=false;
		 			sErrorLog = e.toString();
				 
		 		 }
		        
				if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
			 }
		    }
		 
		 @Given("^Third Company Details Islamic Saving Self Employed Page$")
		    public void third_company_details_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
				String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,"NumberofCompaniesyouhavetieswithvalue",sTestCaseid);
				int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
				String CompanyName3 = getColumnNumber(Spath,"CompanyName3",sTestCaseid);
				String OtherCompanyName3 = getColumnNumber(Spath,"OtherCompanyName3",sTestCaseid);
				String Designation3 = getColumnNumber(Spath,"Designation3",sTestCaseid);
				String IndustryCategoryValue3 = getColumnNumber(Spath,"IndustryCategoryValue3",sTestCaseid);
				String IndustryValue3 = getColumnNumber(Spath,"IndustryValue3",sTestCaseid);
				String ShareholdingPercentage3 = getColumnNumber(Spath,"ShareholdingPercentage3",sTestCaseid);
				String ListCountrywithWhichBusinessConducted3 = getColumnNumber(Spath,"ListCountrywithWhichBusinessConducted3",sTestCaseid);
				String CountryOfIncorporationValue3 = getColumnNumber(Spath,"CountryOfIncorporationValue3",sTestCaseid);
				String AnnualTurnover3 = getColumnNumber(Spath,"AnnualTurnover3",sTestCaseid);
				String AnnualProfit3 = getColumnNumber(Spath,"AnnualProfit3",sTestCaseid);
				
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Third Company Details page"+"<br>"+"Expected Result:Third Company Details "+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Third Company Details page <br>");
					
					try {
						
						
				         if(YourEmploymentType.equals("Self-employed")) {
					 if(number>=3) {
					 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Company name field")))).isDisplayed();
					 if(CompanyName3.equals("OTHERS")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search ...")))).isDisplayed();
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName3)))).isDisplayed();
					       //new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName3))).click();
					        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
						       
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { OtherCompanyName3 + Keys.ENTER });
					      
				        }
					 else {
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Company name field"))).sendKeys(new CharSequence[] { CompanyName3 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName3)))).isDisplayed();
		        sleep(2000);
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName3))).click();
					 }
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Job title field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { Designation3 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Field of work value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Field of work value"))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue3)))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue3))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Work category value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Work category value"))).click();
		        
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryValue3))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", IndustryValue3);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		       // BaseClass.swipe("up", IndustryValue3);
		       // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue3)))).isDisplayed();
		       // ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue3+"\"])[2]"))).click();
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Shareholding percentage field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Shareholding percentage field"))).sendKeys(new CharSequence[] { ShareholdingPercentage3 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Countries the company does business with")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Countries the company does business with"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted3))).click();
						break;
					} catch (Exception e) {
						
						
						 BaseClass.swipe("up", ListCountrywithWhichBusinessConducted3);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
		        
		      
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))).click();
		        BaseClass.swipe("up", "Keep Going button");
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Country of Incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country of Incorporation value"))).click();
		        
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue3))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", CountryOfIncorporationValue3);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       sleep(1000);
	       new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
			.moveTo(PointOption.point(176, 250)).release().perform();
	       
		
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Year of incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Year of incorporation value"))).click();
		        
		        sleep(1000);
		        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				.moveTo(PointOption.point(196, 717)).release().perform();
			        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(196, 717)).release().perform();
			        sleep(1000);
			        TouchAction action = new TouchAction(driver);
					    action.tap(PointOption.point(355, 604)).release().perform();
					    
					    
					    
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual turnover field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual turnover field"))).sendKeys(new CharSequence[] { AnnualTurnover3 + Keys.ENTER });
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual profit field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual profit field"))).sendKeys(new CharSequence[] { AnnualProfit3 + Keys.ENTER });
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep Going button")))).isDisplayed();
			
				        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
									 
					   
			        }
				 }
				 Runner.status=true;
				 }
			 		 catch(Exception e) {
			 			Runner.status=false;
			 			sErrorLog = e.toString();
			 			
					 
			 		 }
				 
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
					
			 }
		        
		    }
		 
		 @Given("^Fourth Company Details Islamic Saving Self Employed Page$")
		    public void fourth_company_details_saving_salaride_page() throws Throwable {
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
				String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,"NumberofCompaniesyouhavetieswithvalue",sTestCaseid);
				int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
				String CompanyName4 = getColumnNumber(Spath,"CompanyName4",sTestCaseid);
				String OtherCompanyName4 = getColumnNumber(Spath,"OtherCompanyName4",sTestCaseid);
				String Designation4 = getColumnNumber(Spath,"Designation4",sTestCaseid);
				String IndustryCategoryValue4 = getColumnNumber(Spath,"IndustryCategoryValue4",sTestCaseid);
				String IndustryValue4 = getColumnNumber(Spath,"IndustryValue4",sTestCaseid);
				String ShareholdingPercentage4 = getColumnNumber(Spath,"ShareholdingPercentage4",sTestCaseid);
				String ListCountrywithWhichBusinessConducted4 = getColumnNumber(Spath,"ListCountrywithWhichBusinessConducted4",sTestCaseid);
				String CountryOfIncorporationValue4 = getColumnNumber(Spath,"CountryOfIncorporationValue4",sTestCaseid);
				String AnnualTurnover4 = getColumnNumber(Spath,"AnnualTurnover4",sTestCaseid);
				String AnnualProfit4 = getColumnNumber(Spath,"AnnualProfit4",sTestCaseid);
				
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Fourth Company Details page"+"<br>"+"Expected Result:Fourth Company Details"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Fourth Company Details page <br>");
					try {
						
						try {
				          if(YourEmploymentType.equals("Self-employed")) {
					 
					      if(number>=4) {
					 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Company name field")))).isDisplayed();
					 if(CompanyName4.equals("OTHERS")) {
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search ...")))).isDisplayed();
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName4)))).isDisplayed();
					       //new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName4))).click();
					        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
						       
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { OtherCompanyName4 + Keys.ENTER });
					      
				        }
					 else
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Company name field"))).sendKeys(new CharSequence[] { CompanyName4 + Keys.ENTER });
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName4)))).isDisplayed();
				        sleep(2000);
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName4))).click();
					 }
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Job title field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { Designation4 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Field of work value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Field of work value"))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue4)))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue4))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Work category value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Work category value"))).click();
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(IndustryValue4))).click();
						break;
					} catch (Exception e) {
						
						
						BaseClass.swipe("up", IndustryValue4);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       
		      // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue4)))).isDisplayed();
		        
		        
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Shareholding percentage field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Shareholding percentage field"))).sendKeys(new CharSequence[] { ShareholdingPercentage4 + Keys.ENTER });
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Countries the company does business with")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Countries the company does business with"))).click();
		       
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted4))).click();
						break;
					} catch (Exception e) {
						
						
						 BaseClass.swipe("up", ListCountrywithWhichBusinessConducted4);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
		        
		        
		        
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))).click();
		        BaseClass.swipe("up", "Submit button");
		        
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Country of Incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country of Incorporation value"))).click();
		        
		        
		        
		        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for(int iCount=1;iCount<=100;iCount++)
				{
			       try {
						
			    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue4))).click();
						break;
					} catch (Exception e) {
						
						
						 BaseClass.swipe("up", CountryOfIncorporationValue4);
					        	
					 }
            
			}
				
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       sleep(1000);
	       new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
			.moveTo(PointOption.point(176, 250)).release().perform();
		 
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Year of incorporation value")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Year of incorporation value"))).click();
		       
		        sleep(1000);
		        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				.moveTo(PointOption.point(196, 717)).release().perform();
			        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(196, 717)).release().perform();
			        sleep(1000);
			        TouchAction action = new TouchAction(driver);
					    action.tap(PointOption.point(355, 604)).release().perform();
					    
					    
					    
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual turnover field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual turnover field"))).sendKeys(new CharSequence[] { AnnualTurnover4 + Keys.ENTER });
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Annual profit field")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Annual profit field"))).sendKeys(new CharSequence[] { AnnualProfit4 + Keys.ENTER });
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep Going button")))).isDisplayed();
				        
				        
				        
				       
				        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
									
					   
				        
			        }
				          
						}
				 		 catch(Exception e) {
				 		
				 		 }
				 Runner.status=true;
				 
					}
			 		 catch(Exception e) {
			 			Runner.status=false;
			 			sErrorLog = e.toString();
					 
			 		 }
				 
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
	}
			
		 @Given("^Salaried Details Islamic Saving Self Employed Page$")
		    public void salaried_details_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String TotalMonthlySalary = getColumnNumber(Spath,"TotalMonthlySalary",sTestCaseid);
					String CompanyName = getColumnNumber(Spath,"CompanyName",sTestCaseid);
					String CompanyNameOther = getColumnNumber(Spath,"CompanyNameOther",sTestCaseid);
					String Designation = getColumnNumber(Spath,"Designation",sTestCaseid);
					String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
					String SalariedIndustryCategoryvalue = getColumnNumber(Spath,"SalariedIndustryCategoryvalue",sTestCaseid);
					String SalariedIndustryvalue = getColumnNumber(Spath,"SalariedIndustryvalue",sTestCaseid);
			 		
			 		
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Salaried Details page <br>");
						try {
							
							try {
					 if(YourEmploymentType.equals("Salaried")) {
		 			
				 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Total Monthly Income field")));
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Total Monthly Income field"))).sendKeys(new CharSequence[] { TotalMonthlySalary + Keys.ENTER });
			        sleep(1000);
			        
                     TouchAction action = new TouchAction(driver);
					
					action.tap(PointOption.point(191, 540)).release().perform();
			        ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Employer name field")))).isDisplayed();
			       
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Employer name field"))).click();
			        
			        if(CompanyName.equals("OTHERS")) {
			        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search ...")))).isDisplayed();
			        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName)))).isDisplayed();
				       //new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName))).click();
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
					       
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { CompanyNameOther + Keys.ENTER });
				      
			        }else {
			       
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
			       
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Search bar"))).sendKeys(new CharSequence[] { CompanyName + Keys.ENTER });
			        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
			        sleep(2000);
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(CompanyName))).click();
			        }
			        sleep(2000);
			        BaseClass.swipe("up", "Keep Going button");
			        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Job title field")))).isDisplayed();
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { Designation + Keys.ENTER });
			        
			       // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Field of work value")))).isDisplayed();
			       // ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Field of work value"))).click();
			        sleep(2000);
			        
			        
			      /*  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for(int iCount=1;iCount<=100;iCount++)
					{
				       try {
							
				    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(SalariedIndustryCategoryvalue))).click();
							break;
						} catch (Exception e) {
							
							
							   BaseClass.swipe("up", SalariedIndustryCategoryvalue);
						        	
						 }
	            
				}*/
					
		      // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			        
			     
			        
			        System.out.println(SalariedIndustryCategoryvalue);
			       
			        System.out.println(SalariedIndustryCategoryvalue);
			        
			       // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Work category value")))).isDisplayed();
			       // ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Work category value"))).click();
			        sleep(2000);
			        
			        
			       /* driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for(int iCount=1;iCount<=100;iCount++)
					{
				       try {
							
				    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(SalariedIndustryvalue))).click();
							break;
						} catch (Exception e) {
							
							
							 BaseClass.swipe("up", SalariedIndustryvalue);
						        	
						 }
	            
				}*/
					
		       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
			        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Keep Going button")));
			       
			        
			       
			        	 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep Going button"))).click();
			
					 }
					 
							} catch (Exception e) {
								
					
							        	
							 }
					
					 Runner.status=true;
					 }
 		 catch(Exception e) {
 			Runner.status=false;
 			sErrorLog = e.toString();
		 
 		 }
 		 	
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 }
					
		    }
		 
		 
		 @Given("^Previous Employment Details Previous Page$")
		    public void Past_Employment_Details_Previous_Page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
				 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
					String IWasNotInEmploymentEarlier = getColumnNumber(Spath,"IWasNotInEmploymentEarlier",sTestCaseid);
					String NewToUAE = getColumnNumber(Spath,"NewToUAE",sTestCaseid);
					String PreviousEmployerName = getColumnNumber(Spath,"PreviousEmployerName",sTestCaseid);
					String PositionHeld = getColumnNumber(Spath,"PositionHeld",sTestCaseid);
					String PastEmploymentCountryValue = getColumnNumber(Spath,"PastEmploymentCountryValue",sTestCaseid);
					String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
					
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Previous Employment Details Previous Page<br>");
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							try {
								WebDriverWait wait = new WebDriverWait(driver, 30);
								try {
									
									
								if(YourEmploymentType.equals("Salaried")) {
					 if(IWasNotInEmploymentEarlier.equals("Yes")) {
						 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("I don't have any previous employer")));
				
			        driver.findElement(By.id("I don't have any previous employer")).click();
			        
			        
			        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\""+NewToUAE+"\"])[2]")).click();
			                sleep(2000);                    
			        BaseClass.swipe("up", "Keep going button");
			        
			        driver.findElement(By.id("Keep going button")).click();
					 }
			        else {
			        	
			        	     wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Employer name field")));
			        	   
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Employer name field"))).sendKeys(new CharSequence[] { PreviousEmployerName + Keys.ENTER });
					   
					        wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id(PreviousEmployerName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(PreviousEmployerName))).click();
					        
					        
					        
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { PositionHeld + Keys.ENTER });
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country value"))).click();
					        wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id(PastEmploymentCountryValue)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue))).click();
					        driver.findElement(By.id("Start Year value")).click();
					        

					        sleep(1000);
					        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
							.moveTo(PointOption.point(196, 717)).release().perform();
						        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						        sleep(1000);
						       // TouchAction action = new TouchAction(driver);
								    //action.tap(PointOption.point(355, 604)).release().perform();
						        
						        driver.findElement(By.id("Done link")).click();
						        
						        driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\""+NewToUAE+"\"])[2]")).click();
						                                    
					        BaseClass.swipe("up", "Keep going button");
					        
					        driver.findElement(By.id("Keep going button")).click();
					        
			        }
								}
								
								}
								 
								 catch(Exception e) {
									Runner.status=false;
									sErrorLog = e.toString();
								 
								      }
			       			
					 Runner.status=true;
					 }
		 catch(Exception e) {
			Runner.status=false;
			sErrorLog = e.toString();
		 
		      }
		 	
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 
					
		    }
	      }
		 
		 
		 @Given("^Past Employment Details Page$")
		    public void Past_Employment_Details_Last_Page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
				 
				 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
					String PastIWasNotInEmploymentEarlier1 = getColumnNumber(Spath,"PastIWasNotInEmploymentEarlier1",sTestCaseid);
					
					String PastEmployerName = getColumnNumber(Spath,"PastEmployerName",sTestCaseid);
					String PastPositionHeld = getColumnNumber(Spath,"PastPositionHeld",sTestCaseid);
					String PastEmploymentCountryValue1 = getColumnNumber(Spath,"PastEmploymentCountryValue1",sTestCaseid);
					String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
					
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Past Employment Details Page <br>");
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
							try {
								WebDriverWait wait = new WebDriverWait(driver, 30);
								try {
									
								
									
								if(YourEmploymentType.equals("Salaried")) {
					 if(PastIWasNotInEmploymentEarlier1.equals("Yes")) {
						 wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("I don't have any previous employer")));
				
			        driver.findElement(By.id("I don't have any previous employer")).click();
			       
			        BaseClass.swipe("up", "Keep going button");
			        
			        driver.findElement(By.id("Keep going button")).click();
					 }
			        else {
			        	
			        	     wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Employer name field")));
			        	   
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Employer name field"))).sendKeys(new CharSequence[] { PastEmployerName + Keys.ENTER });
					        wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id(PastEmployerName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(PastEmployerName))).click();
					        
					        
					        
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Job title field"))).sendKeys(new CharSequence[] { PastPositionHeld + Keys.ENTER });
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Country value"))).click();
					        wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id(PastEmploymentCountryValue1)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue1))).click();
					        driver.findElement(By.id("Start Year value")).click();
					        

					        sleep(1000);
					        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
							.moveTo(PointOption.point(196, 717)).release().perform();
						        new TouchAction(driver).press(PointOption.point(198, 770)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						        sleep(1000);
						       // TouchAction action = new TouchAction(driver);
								    //action.tap(PointOption.point(355, 604)).release().perform();
						        
						        driver.findElement(By.id("Done link")).click();
						        
						        
						        
					        BaseClass.swipe("up", "Keep going button");
					        
					        driver.findElement(By.id("Keep going button")).click();
					        
			                        }
								}
								}
							
			                  catch(Exception e) {
				           
			 
			                         }
								
								
					 Runner.status=true;
					 }
		                  catch(Exception e) {
			                 Runner.status=false;
			                sErrorLog = e.toString();
		 
		      }
		 	
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 
					
		    }
	      }
		 
		 
		 @Given("^Declare Your Investments Page$")
		    public void Declare_Your_Investments_Page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
			 
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
			 
			 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);	 	
			 String CryptoNFTs = getColumnNumber(Spath,"CryptoNFTs",sTestCaseid);
			 String RealEstate = getColumnNumber(Spath,"RealEstate",sTestCaseid);
			 String Inheritance = getColumnNumber(Spath,"Inheritance",sTestCaseid);
			 String Othersource = getColumnNumber(Spath,"Othersource",sTestCaseid);
			 String CryptoTotalMonthlyIncome= getColumnNumber(Spath,"CryptoTotalMonthlyIncome",sTestCaseid);
			 String RealEstateTotalMonthlyIncome= getColumnNumber(Spath,"RealEstateTotalMonthlyIncome",sTestCaseid);
			 String InheritanceTotalMonthlyIncome= getColumnNumber(Spath,"InheritanceTotalMonthlyIncome",sTestCaseid);
			 String OtherSourceTotalMonthlyIncome= getColumnNumber(Spath,"OtherSourceTotalMonthlyIncome",sTestCaseid);
			 String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
				
		// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			     Framework.WriteExtentReport=Framework.test.createNode("Navigate to Declare Your Investments Page <br>");
			     
			
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				   WebDriverWait wait = new WebDriverWait(driver, 30);
				   
				   try {
					   
					   
				 // wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Declare your investments title")));
				  
				  if(CryptoNFTs.equals("Yes")) {
				  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")).click();
					
				                                
				  driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"Total monthly income field\"])[1]")).sendKeys(new CharSequence[] { CryptoTotalMonthlyIncome + Keys.ENTER });
				  
				  
				  }
				  else {
					  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]")).click();
				  
				  }
				  
				  if(RealEstate.equals("Yes")) {
					  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[4]")).click();
					  driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"Total monthly income field\"])[2]")).sendKeys(new CharSequence[] { RealEstateTotalMonthlyIncome + Keys.ENTER });
					  }
					  else {
						  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[4]")).click();
					  
					  }
				  
				  BaseClass.swipe("up", "Keep Going button");
				  
				  
				  if(Inheritance.equals("Yes")) {
					  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[6]")).click();
					  driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"Total monthly income field\"])[3]")).sendKeys(new CharSequence[] { InheritanceTotalMonthlyIncome + Keys.ENTER });
					  }
					  else {
						  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[6]")).click();
					  
					  }
				  
				  if(Othersource.equals("Yes")) {
					  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[8]")).click();
					  driver.findElement(By.id("Please specify field")).sendKeys(new CharSequence[] { "abc" + Keys.ENTER });
                      sleep(1000);
					  driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"Total monthly income field\"])[4]")).sendKeys(new CharSequence[] { OtherSourceTotalMonthlyIncome + Keys.ENTER });
					                            
					  }
					  else {
						  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[8]")).click();
			  
					  }
				 
				  
				  
				  BaseClass.swipe("up", "Keep Going button");
				  
				  driver.findElement(By.id("Keep Going button")).click();
				  
				   
				   
			    }
		 	   catch(Exception e) {
		 		          }
				  
				  
	        	Runner.status=true;
						 
			}
			 	catch(Exception e) {
			 			Runner.status=false;
			 			sErrorLog = e.toString();
					 
			 		 }
	 		
			if(Runner.status==true)
			{
				Framework.CreateResults(true, "Step Pass");
			}
			else
			{
				Framework.CreateResults(false, sErrorLog);
			}
		 }
	 }
		
		 @Given("^Products Services Page$")
		    public void Products_Services_Page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
			 
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
			 String NewToUAE = getColumnNumber(Spath,"NewToUAE",sTestCaseid);
			 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);	 	
			 String ProductsDescription = getColumnNumber(Spath,"ProductsDescription",sTestCaseid);
			 String AreYouPoliticallyExposedPerson = getColumnNumber(Spath,"AreYouPoliticallyExposedPerson",sTestCaseid);
			
				
		// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport=Framework.test.createNode("Navigate to Products Services Page <br>");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {
				   WebDriverWait wait = new WebDriverWait(driver, 30);
				   
				   try {
					  
					   
				   if(YourEmploymentType.equals("Self-employed")) {
				  wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.xpath("(//XCUIElementTypeTextView[@name=\"Describe the types of products or Services your business offer... field\"])[1]")));
				  
				  ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeTextView[@name=\"Describe the types of products or Services your business offer... field\"])[1]"))).sendKeys(new CharSequence[] { ProductsDescription + Keys.ENTER });
				  
				  sleep(4000);
				  driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")).click();
				 //driver.findElement(By.id("Description on the specific products or services your companies are dealing in")).sendKeys(new CharSequence[] { ProductsDescription + Keys.ENTER });
			
				sleep(4000);
				 driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")).click();
				
				
				  
				  driver.findElement(By.id("Next button")).click();
				   }
				   
				   }
				   
				   catch(Exception e) {
			 			
					 
			 		 }
			
	        	Runner.status=true;
						 
			}
			 	catch(Exception e) {
			 			Runner.status=false;
			 			sErrorLog = e.toString();
					 
			 		 }
	 		
			if(Runner.status==true)
			{
				Framework.CreateResults(true, "Step Pass");
			}
			else
			{
				Framework.CreateResults(false, sErrorLog);
			}
		 }
	 }
	
	 @Given("^Please verify your income Islamic Saving Self Employed Page$")
		    public void please_verify_your_income_islamic_saving_self_employed_page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
		// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport=Framework.test.createNode("Navigate to Please verify your income page <br>");
			try {
		// ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please verify your income")))).isDisplayed();
		 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Let's go button")))).isDisplayed();
	        
	        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Let's go button"))).click();
			
	        	Runner.status=true;
						 
			}
			 	catch(Exception e) {
			 			Runner.status=false;
			 			sErrorLog = e.toString();
					 
			 		 }
	 		
			if(Runner.status==true)
			{
				Framework.CreateResults(true, "Step Pass");
			}
			else
			{
				Framework.CreateResults(false, sErrorLog);
			}
		 }
	 }
	 
	 
	 @Given("^Upload your documents Self Employed Page$")
	    public void Upload_documents_Islamic_Saving_Self_Employed_Page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
		
		 
		 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		 String sTestCaseid= "";
		 String FileName = getColumnNumber(Spath,"FileName",sTestCaseid);
		 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
		 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport=Framework.test.createNode("Navigate to Upload your documents Salaried Page <br>");
			 try {
				
		 if(YourEmploymentType.equals("Salaried")) {
				
			 try {
				 System.out.println("11111111111 inside try");
					((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months UAE Personal bank statement\"])[4]")))).isDisplayed();
					    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months UAE Personal bank statement\"])[4]"))).click();
					                                                       
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
					  
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
					    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
					    sleep(4000);
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						 
							
				} catch (Exception e) {
					
					System.out.println("11111111111 inside catch");
					
					((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months Personal bank statement\"])[6]")))).isDisplayed();
				    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months Personal bank statement\"])[6]"))).click();
				    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
				    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
				  
				    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
				    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
				    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
				    sleep(4000);
					 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
					 
					 ((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Salary certificate\"])[5]")))).isDisplayed();
					    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Salary certificate\"])[5]"))).click();
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
					  
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
					    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
					    sleep(4000);
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
					
					
				}
 
 //((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
	/*((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"Account Type undefined\"])[2]")))).isDisplayed();
     ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"Account Type undefined\"])[2]"))).click();
     new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
     ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
    /* new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
     ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
     new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
     ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();*/
    /* new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
     ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
     ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
		 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
				/* try {
						((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Payslip\"])[4]")))).isDisplayed();
						    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Payslip\"])[4]"))).click();
						    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
						    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
						    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
						    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
							 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						    
							 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"WPS receipt\"])[4]")))).isDisplayed();
						        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"WPS receipt\"])[4]"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
								 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						    
								 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("(//XCUIElementTypeOther[@name=\"Labour contract\"])[4]")))).isDisplayed();
							        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("(//XCUIElementTypeOther[@name=\"Labour contract\"])[4]"))).click();
							        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
							        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
							        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
							        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
							        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
							        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
							        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
							        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
							        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
									 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				
				 
				       //((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
		                    sleep(4000);
						 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						 
				 }
				 
				 
						 Runner.status=true;
		 }
		 catch(Exception e) {
			 Runner.status=false;
			 sErrorLog = e.toString();
		 }
		        
					       
			 		 
					        
		        
		        
			 if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog );
				}
		 }
		 
		 
	 }
	 		
	 @Given("^Upload your documents Salaried Page$")
	    public void Upload_your_documents_Islamic_Saving_Self_Employed_Page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
		
		 
		 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		 String sTestCaseid= "";
		 String FileName = getColumnNumber(Spath,"FileName",sTestCaseid);
		 String YourEmploymentType = getColumnNumber(Spath,"YourEmploymentType",sTestCaseid);
		 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport=Framework.test.createNode("Navigate to Upload your documents Self Employed Page <br>");
			 try {
				 
				 if(YourEmploymentType.equals("Self-employed")) {
		// ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
					 try {
						((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months UAE Personal bank statement\"])[4]")))).isDisplayed();
						    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months UAE Personal bank statement\"])[4]"))).click();
						    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
						  
						    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
						    sleep(4000);
							 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
							 
							 
							 ((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]")))).isDisplayed();
							    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]"))).click();
							    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
							    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
							  
							    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
							    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
							    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
							    sleep(4000);
								 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
							 
					} catch (Exception e) {
						
						((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months Personal Bank Statement\"])[4]")))).isDisplayed();
					    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3 months Personal Bank Statement\"])[4]"))).click();
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
					  
					    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
					    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
					    sleep(4000);
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						 
						 
						 ((WebElement)new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]")))).isDisplayed();
						    ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]"))).click();
						    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
						  
						    new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
						    sleep(4000);
							 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
						
					}
	        
	        //((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
			/*((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"Account Type undefined\"])[2]")))).isDisplayed();
		        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeStaticText[@name=\"Account Type undefined\"])[2]"))).click();
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
		       
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
		        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
				 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
	        
				 try {
					((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Account Type 2")))).isDisplayed();
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Account Type 2"))).click();
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
					    new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
					    ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
					    ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
					    
						 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Account Type 3")))).isDisplayed();
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Account Type 3"))).click();
					        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
					        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
					        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
					        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
					        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
							 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
					    
							 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Account Type 4")))).isDisplayed();
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Account Type 4"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
						        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
								 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
						 
						 
						 
			       /* ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
					 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("EMID - Second Page")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("EMID - Second Page"))).click();
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Choose Files")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Choose Files"))).click();
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Browse")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Browse"))).click();
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Downloads")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Downloads"))).click();
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(FileName))).click();
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Submit button")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Submit button"))).click();
				        
				        */
				 
				 sleep(3000);
				       //((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload your documents title")))).isDisplayed();
						 ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
						 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
				 }
						 
						 Runner.status=true;
		 }
		 catch(Exception e) {
			 Runner.status=false;
			 sErrorLog = e.toString();
		 }
	
		        
			 if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog );
				}
		 }
		 
		 
	 }
	 
	 @Given("^Your Residential Address Islamic Saving Self Employed Page$")
	    public void your_residential_address_saving_salaride_page() throws Throwable {
		 if(Runner.status==true)
		 {
		 
			 Runner.status=false;
			 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			 String sTestCaseid= "";
				String VillaFlatNumber = getColumnNumber(Spath,"VillaFlatNumber",sTestCaseid);
				String BuildingVillaName = getColumnNumber(Spath,"BuildingVillaName",sTestCaseid);
				String StreetLocation = getColumnNumber(Spath,"StreetLocation",sTestCaseid);
				String POBox = getColumnNumber(Spath,"POBox",sTestCaseid);
				String EmirateCity = getColumnNumber(Spath,"EmirateCity",sTestCaseid);
			
				 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your Residential Address page"+"<br>"+"Expected Result:Your Residential Address"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Your Residential Address page <br>");
		 		
	 			try {
			 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Villa or Flat Number field")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Villa or Flat Number field"))).sendKeys(new CharSequence[] { VillaFlatNumber + Keys.ENTER });
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Building / Villa Name field"))).sendKeys(new CharSequence[] { BuildingVillaName + Keys.ENTER });
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Street / Location field"))).sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Emirate / City value")));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Emirate / City value"))).click(); 
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(EmirateCity)));
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId(EmirateCity))).click();
		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("P.O Box field"))).sendKeys(new CharSequence[] { POBox + Keys.ENTER });
		        
		        BaseClass.swipe("up", "Keep going button");
		        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));
		       
		        	((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
							
		        Runner.status=true;
	  			
		 		}
				catch(Exception e) {
					Runner.status=false;
					sErrorLog = e.toString();
				}
	 		
	 			if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false, sErrorLog);
				}
		 }
	    }
	 
	 		
		
				  
		 @Given("^Does the Following apply to you Islamic Saving Self Employed page$")
		    public void does_the_following_apply_to_you_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String DoesTheFollowingApplyToYou = getColumnNumber(Spath,"DoesTheFollowingApplyToYou",sTestCaseid);
					String PayTaxInUAE = getColumnNumber(Spath,"PayTaxInUAE",sTestCaseid);
					String TaxCountry = getColumnNumber(Spath,"TaxCountry",sTestCaseid);
					String TINNumber = getColumnNumber(Spath,"TINNumber",sTestCaseid);
					String Reasonifunknown = getColumnNumber(Spath,"Reasonifunknown",sTestCaseid);
					String Pleasespecify = getColumnNumber(Spath,"Pleasespecify",sTestCaseid);
					 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Does the Following apply to you page <br>");
			 	
			 		
		 		try {
			 		
			 		
			 		if(PayTaxInUAE.equals("Yes")){
			 			((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]")))).isDisplayed();
				        
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes radio\"])[2]"))).click();
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
				        
				        
				        //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Countries you paid for tax during the previous calendar year?\"])[1]")))).isDisplayed();
				        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);                                                                                                                   
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Countries where you paid tax during the previous calendar year?\"])[1]"))).click(); 
				             
				        
				        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for(int iCount=1;iCount<=100;iCount++)
						{
					       try {
								
					    	   ((MobileElement)driver.findElement(MobileBy.AccessibilityId(TaxCountry))).click();
								break;
							} catch (Exception e) {
								
								
								BaseClass.swipe("up", TaxCountry);
							        	
							 }
		            
					}
						
			       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				        
				      
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Close Button")))).isDisplayed();
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Close Button"))).click();
				        
				        ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("TIN Number (if known) field")))).isDisplayed();
					       
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("TIN Number (if known) field"))).sendKeys(new CharSequence[] { TINNumber + Keys.ENTER });
				        
				        //((MobileElement)driver.findElement(MobileBy.AccessibilityId("Reason (if unknown) value"))).click();
				       // ((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(Reasonifunknown)))).isDisplayed();
				       // ((MobileElement)driver.findElement(MobileBy.AccessibilityId(Reasonifunknown))).click();
				        
				       /* if(Reasonifunknown.equals("REASON B UNABLE TO GET TIN option")){
				        	((WebElement)new WebDriverWait((WebDriver)driver, 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please specify field")))).isDisplayed();
						       
					        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] { Pleasespecify + Keys.ENTER });
				 			
				 		}*/
				        
			 			
			 		}else {
			 			((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]")))).isDisplayed();
				        
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No radio\"])[2]"))).click();
			 			
			 		}
			
			        ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Keep going button")))).isDisplayed();
			        //new WebDriverWait((WebDriver)TestRak.driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Submit button")));
			       
			        	 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Keep going button"))).click();
								 Runner.status=true;
								 
		 		}
					 		 catch(Exception e) {
					 			Runner.status=false;
					 			 sErrorLog = e.toString();
							 
					 		 }
			
		 		if(Runner.status==true)
				{
					Framework.CreateResults(true, "Step Pass");
				}
				else
				{
					Framework.CreateResults(false,  sErrorLog);
				}
			 }
		 		
		    }
	
		 @Given("^Communication preferences Islamic Saving Self Employed Page$")
		    public void communication_preferences_saving_salaride_page() throws Throwable {
			 
				 //Xls_Reader reader = new Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			 		
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
					String AdvicesCommunication = getColumnNumber(Spath,"AdvicesCommunication",sTestCaseid);
					String MarketingPromotionalOffers = getColumnNumber(Spath,"MarketingPromotionalOffers",sTestCaseid);
					String MarketingPromotionalOffersOption = getColumnNumber(Spath,"MarketingPromotionalOffersOption",sTestCaseid);
					String ThirdPartyPlatform = getColumnNumber(Spath,"ThirdPartyPlatform",sTestCaseid);
					
			 		//String sheetName = "Registration";
			 		//String AdvicesCommunication  = reader.getCellData(sheetName, 30, 2);
			 		//String MarketingPromotionalOffers = reader.getCellData(sheetName, 31, 2);
			 		//String MarketingPromotionalOffersOption = reader.getCellData(sheetName, 32, 2);
			 		//String ThirdPartyPlatform = reader.getCellData(sheetName, 33, 2);
			 	
					// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
						Framework.WriteExtentReport=Framework.test.createNode("Navigate to Communication preferences page <br>");
						
						
						
						
						try {
							
							
							 if(AdvicesCommunication.equals("Yes")){
								  new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]")));
							        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]"))).click();
							 }
							 else {
								 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, send me through post radio\"])[2]")));
							        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, send me through post radio\"])[2]"))).click();
								 
							 }
							 
							
				  
			        		
			       if(MarketingPromotionalOffers.equals("Yes")){
			    	   new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes, please radio\"])[2]")));
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes, please radio\"])[2]"))).click();
				        
				        
				        new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
						.moveTo(PointOption.point(176, 250)).release().perform();
				        
				        if(MarketingPromotionalOffersOption.equals("Email radio")){
				        	
				        	sleep(3000);
				        	/*TouchAction action = new TouchAction(driver);
				    		sleep(3000);
				    		action.tap(PointOption.point(98, 756)).release().perform();*/
				    		
				    		((MobileElement)driver.findElement(MobileBy.id("Email"))).click();
				        	
				        	//((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Email radio\"])[4]"))).click();
				        }
				        if(MarketingPromotionalOffersOption.equals("Phone Call radio")){
				        	/*TouchAction action = new TouchAction(driver);
				    		sleep(3000);
				    		action.tap(PointOption.point(93, 814)).release().perform();*/
				        	sleep(3000);
				    		((MobileElement)driver.findElement(MobileBy.id("Phone Call"))).click();
				        	//((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Phone Call radio\"])[2]"))).click();
				        }
				        
				        
				        if(MarketingPromotionalOffersOption.equals("SMS radio")){
				        	
				        	/*TouchAction action = new TouchAction(driver);
				    		sleep(3000);
				    		action.tap(PointOption.point(102, 700)).release().perform();*/
				        	sleep(3000);
				        	((MobileElement)driver.findElement(MobileBy.id("SMS"))).click();
				        }
				        
				       
				       // ((MobileElement)driver.findElement(MobileBy.AccessibilityId(MarketingPromotionalOffersOption))).click();
				        
			       }else {
			    	   new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, thanks radio\"])[2]")));
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, thanks radio\"])[2]"))).click();
				        
			    	   
			       }
			       
			      /* sleep(2000);
			        new TouchAction(driver).press(PointOption.point(174, 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(191, 193)).release().perform();*/
			       
			       new TouchAction(driver).press(PointOption.point(171, 671)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
					.moveTo(PointOption.point(176, 250)).release().perform();
			        		
			        if(ThirdPartyPlatform.equals("Yes")){
			        
			        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes, please radio\"])[4]")));
			        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Yes, please radio\"])[4]"))).click();
			        }
			        
			        else {
			        	new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, thanks radio\"])[4]")));
				        ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"No, thanks radio\"])[4]"))).click();
			        	
			              }
			
			    	new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Keep going\"]")));
			    	   ((MobileElement)driver.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Keep going\"]"))).click(); 
			    	   
								 Runner.status=true;
								 
			      }
					 	 catch(Exception e) {
					 			Runner.status=false;
					 			sErrorLog = e.toString();
							 
					 		 }
		
						if(Runner.status==true)
						{
							Framework.CreateResults(true, "Step Pass");
						}
						else
						{
							Framework.CreateResults(false, sErrorLog);
						}
			 }
		 		
		    }
	 
	 		
		 @Given("^Terms Conditions Islamic Saving Self Employed Page$")
		    public void terms_conditions_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
		 			
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Terms Conditions page <br>");
					try {
				 ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap to open and read\"])[2]")))).isDisplayed();
				// new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap to open and read\"])[2]")));
			       
			        
			       
			        	 ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap to open and read\"])[2]"))).click();
									 Runner.status=true;
									 
					}
						 		 catch(Exception e) {
						 			Runner.status=false;
						 			sErrorLog = e.toString();
								 
						 		 }
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
					  
		 		
		    }
				  
		 @Given("^Consents Declarations Islamic Saving Self Employed Page$")
		    public void consents_declarations_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				 String sTestCaseid= "";
				 String SelectProducts = getColumnNumber(Spath,"SelectProducts",sTestCaseid);
				 sleep(2000);
				 //Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Consents Declarations page"+"<br>"+"Expected Result:Consents Declarations "+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Consents Declarationsg page <br>");
					
					try {
						
						 if(SelectProducts.equals("Rakislamic")) {
							 for(int i=0; i<=5; i++) {
								 
								 new TouchAction(driver).press(PointOption.point(194, 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
									.moveTo(PointOption.point(185, 142)).release().perform();
							 
						 }
						 }
						 else {	
				for(int i=0; i<=8; i++) {
					 
					 new TouchAction(driver).press(PointOption.point(194, 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
						.moveTo(PointOption.point(185, 142)).release().perform();
				               }
				
						 }
			
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("I have read and accepted")));
				        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("I have read and accepted"))).click(); 				        
				        
				        new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Next button")));
				       
				        	 ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click();  
										 Runner.status=true;
										 
					}
							 		 catch(Exception e) {
							 			Runner.status=false;
							 			sErrorLog = e.toString();
									 
							 		 }
				  
					if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
					
			 }
		 		
		    }  
		
		 @Given("^Will be in touch Islamic Saving Self Employed Page$")
		    public void will_be_in_touch_saving_salaride_page() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Will be in touch page"+"<br>"+"Expected Result:Will be in touch"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Will be in touch page <br>");
			        try {
			        
			        
			        	WebDriverWait wait = new WebDriverWait(driver, 60);
			        ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Tap to open and read")))).isDisplayed();
				       
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Tap to open and read"))).click(); 
			        
			        new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("I have read and accepted")));
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("I have read and accepted"))).click(); 				        
			        
			        new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Next button")));
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click(); 
			        
			        new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Submit")));
			        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Submit"))).click(); 
			      //  Welcome to your
			        //new account!
			     //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Thanks! we")))).isDisplayed();
			        
			      //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("have your application")))).isDisplayed();
			        	
			        	//((MobileElement)driver.findElement(MobileBy.AccessibilityId("Continue"))).click(); 
			        	
			        	//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Close button")))).isDisplayed();
			        	
			      
			        
			        
			        	try {
			        		 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Close button")));
							
						} catch (Exception e) {
							
							/* sleep(10000);
					          String s1 = driver.getPageSource();
									
									System.out.println("Page Source" +s1);
									
								
									sleep(10000);*/
							
						 new WebDriverWait((WebDriver)driver, 30L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));
						 
						 
						/* By sometext = MobileBy.xpath("//XCUIElementTypeOther[@name=\"Account No:\"]");
						 
						
						 String text = driver.findElement(sometext).getText();
						 System.out.println("111111111111"+text);
						 
						//XCUIElementTypeStaticText[@name="Account No: 8392970185901"]*/
						 
						try {
							String AccountNo = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Your account is all set\"]/following-sibling::XCUIElementTypeOther)[2]")).getText();
							 
							 //Account No: 8392970185901
							
                            System.out.println("AccountNo"+AccountNo);

                           WirteAccountNo(AccountNo);
						} catch (Exception e1) {
							
							/*sleep(10000);
					          String s1 = driver.getPageSource();
									
									System.out.println("Page Source" +s1);
									
									
									sleep(10000);*/
							
							String AccountNo = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Your account is all set\"]/following-sibling::XCUIElementTypeOther)")).getText();
							                                                 //XCUIElementTypeStaticText[@name='Your account is all set']
			                                                                //Account No: 8392970185901
							
                          System.out.println("AccountNo"+AccountNo);
                              WirteAccountNo(AccountNo);

							
						}
						 
						
							
						} 
			        	
			        	/*((MobileElement)driver.findElement(MobileBy.AccessibilityId("(//XCUIElementTypeOther[@name=\"Icon Button\"])[1]"))).click(); 
			        	
			        	
			        	wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Account Number field")));
						driver.findElement(By.id("Account Number field")).sendKeys(new CharSequence[] { "0192969669001" + Keys.ENTER });
						
						((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click(); 
						
						((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click(); 
						
						
						wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("OTP field")));
						//driver.findElement(By.id("OTP field")).sendKeys(new CharSequence[] { "989001" + Keys.ENTER });
						
						
						//((MobileElement)driver.findElement(MobileBy.AccessibilityId("Submit button"))).click(); */
									 Runner.status=true;
									 
			        }
						 		 catch(Exception e) {
						 			Runner.status=false;
						 			sErrorLog = e.toString();
								 
						 		 }
			        
			        if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
						  
		 		
		    }
		 
		 
		
		 
		 
		
		 @Given("^Will be in touch Islamic Saving Page$")
		    public void will_be_in_touch_saving_salaride_page1() throws Throwable {
			 
			 if(Runner.status==true)
			 {
			 
				 Runner.status=false;
				// Framework.test=Framework.extent.createTest("Test case ID:"+Runner.sTestcase+"<br>"+"Test case Description:Will be in touch page"+"<br>"+"Expected Result:Will be in touch"+"</br>");
					Framework.WriteExtentReport=Framework.test.createNode("Navigate to Will be in touch page <br>");
			        try {
			        
			        
			        	WebDriverWait wait = new WebDriverWait(driver, 30);
			        
			      //  Welcome to your
			        //new account!
			     //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Thanks! we")))).isDisplayed();
			        
			      //((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("have your application")))).isDisplayed();
			        	
			        	//((MobileElement)driver.findElement(MobileBy.AccessibilityId("Continue"))).click(); 
			        	
			        	//((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Close button")))).isDisplayed();
			        	
			        	try {
			        		 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Close button")));
			        		 driver.findElement(By.id("Close button")).click();
							
						} catch (Exception e) {
							
						 new WebDriverWait((WebDriver)driver, 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));
						 driver.findElement(By.id("Keep going button")).click();
						
							
						} 
			        	
			        	/*((MobileElement)driver.findElement(MobileBy.AccessibilityId("(//XCUIElementTypeOther[@name=\"Icon Button\"])[1]"))).click(); 
			        	
			        	
			        	wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Account Number field")));
						driver.findElement(By.id("Account Number field")).sendKeys(new CharSequence[] { "0192969669001" + Keys.ENTER });
						
						((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click(); 
						
						((MobileElement)driver.findElement(MobileBy.AccessibilityId("Next button"))).click(); 
						
						
						wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("OTP field")));
						//driver.findElement(By.id("OTP field")).sendKeys(new CharSequence[] { "989001" + Keys.ENTER });
						
						
						//((MobileElement)driver.findElement(MobileBy.AccessibilityId("Submit button"))).click(); */
									 Runner.status=true;
									 
			        }
						 		 catch(Exception e) {
						 			Runner.status=false;
						 			sErrorLog = e.toString();
								 
						 		 }
			        
			        if(Runner.status==true)
					{
						Framework.CreateResults(true, "Step Pass");
					}
					else
					{
						Framework.CreateResults(false, sErrorLog);
					}
			 }
						  
		 		
		    }

	    

	}

