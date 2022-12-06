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
import org.openqa.selenium.remote.server.handler.SendKeys;
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

public class AddBene_FT {

	// public static AndroidDriver driver;
	public static IOSDriver<MobileElement> driver;
	// public static IOSDriver<WebElement> driver;
	public static boolean bStatus;
	// public static AppiumDriver driver;
	public static TouchAction action;
	public static String beneNickName = "";

	public static void main(String[] args) {

		try {

			Framework.getreportfilename();
			Framework.statextentreport();

			try {
				driver = null;

				DesiredCapabilities caps = new DesiredCapabilities();

				// caps.setCapability("platformName", "ANDROID");
				// caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Digital's iPhone");
				// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "QA’s iPhone");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
				// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
				// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 Ultra 5G");
				// caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
				// caps.setCapability(MobileCapabilityType.UDID, "R5CT2218L5J");
				// caps.setCapability("appPackage", "com.rak");
				// caps.setCapability("appActivity", "com.rak.SplashActivity");
				caps.setCapability(MobileCapabilityType.UDID, "00008110-00166DD91128401E");
				// caps.setCapability(MobileCapabilityType.UDID, "00008110-0016343E0E3B801E");
				// caps.setCapability("bundleId", "com.rak.convergence");
				caps.setCapability("bundleId", "rakcorp.ae");
				// caps.setCapability("appActivity", "com.rak.SplashActivity");
				// caps.setCapability("appPackage", "ae.skiply.rakbank");
				// caps.setCapability("appActivity", "ae.skiply.rakbank.MainActivity");
				caps.setCapability("noReset", true);
				caps.setCapability("self.useJSONSource", true);
				caps.setCapability("waitForIdleTimeout", 0);
				caps.setCapability("disableWindowAnimation", true);
				caps.setCapability("newCommandTimeout", 500);
				caps.setCapability("shouldTerminateApp", true);
				// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

				// URL url = new URL("http://0.0.0.0:4723/wd/hub");

				driver = new IOSDriver(new URL("http://0.0.0.0:4743/wd/hub"), caps);
				action = new TouchAction(driver);
				// driver = new IOSDriver<MobileElement>(url,caps);
				// driver = new AppiumDriver<MobileElement>(url,caps); //driver = new
				// AndroidDriver<MobileElement>(url,caps); //
				// IOSDriver<MobileElement>(url,caps);
				// ((IOSDriver)driver).closeApp();

			} catch (Exception exp) {
				System.out.println("Cause is : " + exp.getCause());
				System.out.println("Cause is : " + exp.getMessage());
				exp.printStackTrace();
				Framework.WriteExtentReport.log(Status.FAIL, "Could not take screenshots:" + exp.toString());
			}

			// WebDriverWait wait = new WebDriverWait(driver, 30);

			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			BaseClass.driver = driver;
			Runner.sTestcase = "TC1_AddBene";

			Framework.test = Framework.extent
					.createTest("Test case ID:" + Runner.sTestcase + "<br>" + "Test case Description: Add Beneficiary"
							+ "<br>" + "Expected Result:Fund transfer should happen successfully" + "</br>");
			Framework.test.assignCategory("Fund Transfer");

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to select customer screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Existing customer\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to select customer screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to select customer screen successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Existing customer\"]")).click();

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Existing customer type screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Business\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Existing customer type screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Existing customer type screen successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Business\"]")).click();

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Login screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeOther[@name=\"User ID\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Login screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Login screen successfully");
			}
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"User ID\"]")).sendKeys("jamesscme");

			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Password\"]")).sendKeys("rakbank123");

			// driver.getKeyboard().sendKeys("rakbank123");

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Login\"]")).click();
			// driver.send
			// Thread.sleep(10000);
			waitforelementvisibility(
					"//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage");
			driver.findElement(
					By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage"))
					.click();
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Dashbord screen <br>");

			bStatus = waitforelementvisibility("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[2]");
			if (bStatus == true) {
				Framework.CreateResults(true, "User Logged-in successfully");
			} else {
				Framework.CreateResults(false, "User could not User Logged-in successfully");
			}

			addBene();
			fundTransfer();
			cancelTrasaction();
			deleteBene();

//    //Add bene
//    
//           TouchAction action = new TouchAction(driver);
// 			action.tap(PointOption.point(110, 265)).release().perform();   ///add bene button
// 	
// 	///		Beneficiary information
// 			 int min2 = 10;
//		        int max2 = 99; 
//		        String beneNickName="";
//		        System.out.println("Random value of type double between "+min2+" to "+max2+ ":");
//		        double a2 = Math.random()*(max2-min2+1)+min2;  
//		        beneNickName = "Bene"+String.valueOf(Math.round(a2));
//		        
// 			   String beneName="RakbankUser", IBAN="AE380240029520074202001";
// 			
// 			 bStatus=  waitforelementvisibility("//XCUIElementTypeOther[@name=\"Beneficiary Name\"]");
// 			  driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Beneficiary Name\"]")).sendKeys(beneName);
// 			  driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Nick Name\"]")).sendKeys(beneNickName);
// 			  driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"IBAN Number\"]")).sendKeys(IBAN);
// 			 driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Next\"])[1]")).click();
// 			 
// 	// Review beneficiary information	
// 			 bStatus=  waitforelementvisibility("//XCUIElementTypeButton[@name=\"Confirm\"]");	
// 	String BeneNameOnReview =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Beneficiary Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")).getText();
//		 System.out.println("BeneNameOnReview ="+BeneNameOnReview);
//		 
//		 String BeneNickNameOnReview =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Nick Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")).getText();
//		 System.out.println("BeneNickNameOnReview ="+BeneNickNameOnReview);
//		 
//		 String BeneBankNameOnReview =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Bank Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")).getText();
//		 System.out.println("BeneBankNameOnReview ="+BeneBankNameOnReview);
//		
//		 String BeneIBANOnReview =  driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"IBAN\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")).getText();
//		 System.out.println("BeneIBANOnReview ="+BeneIBANOnReview);
//	//	 driver.findElement(By.id("Confirm")).click();
//	
//		 
		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getMessage());
			Framework.WriteExtentReport = Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error " + exp.getMessage());
			exp.printStackTrace();

		}

	}

	public static void cancelTrasaction() throws Exception {

		SendMoneyToAccountList();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[2]")).click();

		waitforelementvisibility("//XCUIElementTypeButton[@name=\"Scheduled\"]");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Scheduled\"]")).click();
		// XCUIElementTypeStaticText[@name="Automation"]
		waitforelementvisibility("//XCUIElementTypeStaticText[@name=\""+beneNickName+"\"]");
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\""+beneNickName+"\"]")).click();

		waitforelementvisibility("//XCUIElementTypeButton[@name=\"Stop Complete\"]");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Stop Complete\"]")).click();

		waitforelementvisibility("//XCUIElementTypeButton[@name=\"Confirm\"]");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirm\"]")).click();

		waitforelementvisibility("//XCUIElementTypeButton[@name=\"Submit\"]");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Submit\"]")).click();

		waitforelementvisibility("//XCUIElementTypeButton[@name=\"OK\"]");
		String sucessMsg = driver.findElement(By
				.xpath("//XCUIElementTypeStaticText[@name=\"The requested transaction has been submitted for stop.\"]"))
				.getText();
		System.out.println(sucessMsg);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();

		waitforelementvisibility("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[1]");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[1]")).click(); // back
																													// button

		waitforelementvisibility("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[1]");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[1]")).click(); // back
																													// button

	}

	public static void SendMoneyToAccountList() throws Exception {

		try {
			waitforelementvisibility("//XCUIElementTypeButton[@name=\"Toggle sidenav\"]");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeButton[2]")).click();

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Send Money screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Send Money\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Send Money screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Send Money screen successfully");
			}
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Send Money\"]")).click();

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Fund Transfer screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Fund Transfer\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Fund Transfer screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Fund Transfer screen successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Fund Transfer\"]")).click();
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Account List screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeOther[@name=\"RAKBankApp\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to My Rakbank account screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to My Rakbank account screen successfully");
			}
			Thread.sleep(6000);

		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getMessage());
			Framework.WriteExtentReport = Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error " + exp.getMessage());
			exp.printStackTrace();

		}
	}

	public static void fundTransfer() throws Exception {

		try {
//			SendMoneyToAccountList();
//			waitforelementvisibility("//XCUIElementTypeOther[@name=\"RAKBankApp\"]");
//			for (int i = 0; i < 2; i++) {
//
//				new TouchAction(driver).press(PointOption.point(360, 360))
//						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1500L)))
//						.moveTo(PointOption.point(150, 360)).release().perform();
//
//			}
		
			waitforelementvisibility("//XCUIElementTypeOther[@name=\"RAKBankApp\"]");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"RAKBankApp\"]")).click();

			action.tap(PointOption.point(91, 310)).release().perform();

			// My account list
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Send from account screen <br>");
			bStatus = waitforelementvisibility("(//XCUIElementTypeStaticText[@name=\"Current Account\"])[1]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Send from account screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Send from account screen successfully");
			}
			driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Current Account\"])[1]")).click(); // send
																													// from
																													// account
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Transfer details screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeOther[@name=\"Amount\"]");
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Transfer details screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Transfer details screen successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Amount\"]")).sendKeys("100");

			driver.findElement(By.xpath("///XCUIElementTypeOther[@name=\"Frequency\"]")).click();

			waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Daily\"]");
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Daily\"]")).click();

			waitforelementvisibility("//XCUIElementTypeOther[@name=\"No Of Transfer\"]");
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"No Of Transfer\"]"))
					.sendKeys(new CharSequence[] { "2" + Keys.ENTER });

			Thread.sleep(3000);
			new TouchAction(driver).press(PointOption.point(178, 606))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L))).moveTo(PointOption.point(172, 169))
					.release().perform();

			driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Charge Type\"])[2]")).click();

			waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"All Charges to my Account\"]");
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"All Charges to my Account\"]")).click();

			// waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Charge
			// Type\"]");
			Thread.sleep(3000);
			new TouchAction(driver).press(PointOption.point(178, 650))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L))).moveTo(PointOption.point(172, 250))
					.release().perform();

			// driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"No Of
			// Transfer\"]")).sendKeys(new CharSequence[] { "2" + Keys.ENTER });
			// waitforelementvisibility("(//XCUIElementTypeOther[@name=\"Reason\"])[1]");
			// driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Reason\"])[1]")).click();
			action.tap(PointOption.point(176, 525)).release().perform();
			Thread.sleep(3000);
			action.tap(PointOption.point(150, 250)).release().perform();

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add New Reason\"]")).click();

			waitforelementvisibility("(//XCUIElementTypeStaticText[@name=\"Reason\"])[2]");
			driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Reason\"])[2]"))
					.sendKeys(new CharSequence[] { "test reason" + Keys.ENTER });

			 new TouchAction(driver).press(PointOption.point(178,
			 250)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
			 .moveTo(PointOption.point(172, 500)).release().perform();

			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Open calendar\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Next month\"]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]")).click();

			// waitforelementvisibility("//XCUIElementTypeOther[@name=\"No Of Transfer\"]");
			Thread.sleep(3000);
			new TouchAction(driver).press(PointOption.point(178, 606))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L))).moveTo(PointOption.point(172, 169))
					.release().perform();

			// driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Next\"]")).click();

			action.tap(PointOption.point(187, 669)).release().perform(); // next button
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigated to Review fund trasfer details screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"Confirm\"]");
			Thread.sleep(2000);
			if (bStatus == true) {
				Framework.CreateResults(true, "Navigated to Review fund trasfer details screen successfully");
			} else {
				Framework.CreateResults(false, "Could not navigate to Review fund trasfer details screen successfully");
			}

			String ToName = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"To\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("ToName =" + ToName);

			String BeneficiaryName = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"Beneficiary Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("BeneficiaryName =" + BeneficiaryName);

			String IBAN = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"IBAN\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("IBAN =" + IBAN);

			String FromAccount = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"From\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("FromAccount =" + FromAccount);

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirm\"]")).click();
			Framework.WriteExtentReport = Framework.test.createNode("Navigated to Transaction successful screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"OK\"]");
			Thread.sleep(2000);
			if (bStatus == true) {
				Framework.CreateResults(true, "Transaction completed successfully");
			} else {
				Framework.CreateResults(false, "Could not completed transaction successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();

		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getMessage());
			Framework.WriteExtentReport = Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error " + exp.getMessage());
			exp.printStackTrace();

		}
	}

	public static void addBene() throws Exception {
		// Add bene
		try {

			SendMoneyToAccountList();
			waitforelementvisibility("//XCUIElementTypeOther[@name=\"RAKBankApp\"]");
			for (int i = 0; i < 2; i++) {

				new TouchAction(driver).press(PointOption.point(360, 360))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1500L)))
						.moveTo(PointOption.point(150, 360)).release().perform();

			}
			Thread.sleep(4000);
			action.tap(PointOption.point(110, 265)).release().perform(); /// add bene button

			/// Beneficiary information
			int min2 = 001;
			int max2 = 999;
			
			System.out.println("Random value of type double between " + min2 + " to " + max2 + ":");
			double a2 = Math.random() * (max2 - min2 + 1) + min2;
			beneNickName = "Automation" + String.valueOf(Math.round(a2));

			String beneName = "RakbankUser", IBANNumber = "380240029520074202001";

			bStatus = waitforelementvisibility("//XCUIElementTypeOther[@name=\"Beneficiary Name\"]");
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Beneficiary Name\"]"))
					.sendKeys("AutomationUser");
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Nick Name\"]")).sendKeys(beneNickName);
			Thread.sleep(800);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"IBAN Number\"]"))
			.sendKeys(new CharSequence[] { "A"});
			Thread.sleep(500);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"IBAN Number\"]"))
			.sendKeys(new CharSequence[] { "E"});
			Thread.sleep(500);
			for (int i = 0; i < IBANNumber.length(); i++) {
				driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"IBAN Number\"]"))
				.sendKeys(new CharSequence[] { ""+IBANNumber.charAt(i)});
				Thread.sleep(200);
			}
			
			
			
			driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Next\"])[1]")).click();

			// Review beneficiary information
			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"Confirm\"]");
			String BeneNameOnReview = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"Beneficiary Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("BeneNameOnReview =" + BeneNameOnReview);

			String BeneNickNameOnReview = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"Nick Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("BeneNickNameOnReview =" + BeneNickNameOnReview);

			String BeneBankNameOnReview = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"Bank Name\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("BeneBankNameOnReview =" + BeneBankNameOnReview);

			String BeneIBANOnReview = driver.findElement(By.xpath(
					"//XCUIElementTypeStaticText[@name=\"IBAN\"]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText"))
					.getText();
			System.out.println("BeneIBANOnReview =" + BeneIBANOnReview);
			driver.findElement(By.id("Confirm")).click();
			
			waitforelementvisibility("//XCUIElementTypeButton[@name=\"Submit\"]");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Submit\"]")).click();
	
			Framework.WriteExtentReport = Framework.test.createNode("Navigated to Transaction successful screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"OK\"]");
			Thread.sleep(2000);
			if (bStatus == true) {
				Framework.CreateResults(true, "Transaction completed successfully");
			} else {
				Framework.CreateResults(false, "Could not completed transaction successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();

	
		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getMessage());
			Framework.WriteExtentReport = Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error " + exp.getMessage());
			exp.printStackTrace();

		}
	}

	public static void deleteBene() throws Exception {
		// deleteBene
		try {

			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"Toggle sidenav\"]");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Toggle sidenav\"]")).click();

			waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Beneficiaries & Payees\"]");
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Beneficiaries & Payees\"]")).click();
			Thread.sleep(10000);
			action.tap(PointOption.point(142, 344)).release().perform(); /// select bene from list
			
			waitforelementvisibility("//XCUIElementTypeStaticText[@name=\"Delete\"]");
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Delete\"]")).click();
			
			waitforelementvisibility("//XCUIElementTypeButton[@name=\"Delete\"]");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Delete\"]")).click();	
			
			waitforelementvisibility("//XCUIElementTypeButton[@name=\"Submit\"]");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Submit\"]")).click();
	
			Framework.WriteExtentReport = Framework.test.createNode("Navigated to delete Bene Transaction successful screen <br>");
			bStatus = waitforelementvisibility("//XCUIElementTypeButton[@name=\"OK\"]");
			Thread.sleep(2000);
			if (bStatus == true) {
				Framework.CreateResults(true, "Transaction completed successfully");
			} else {
				Framework.CreateResults(false, "Could not completed transaction successfully");
			}

			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getMessage());
			Framework.WriteExtentReport = Framework.test.createNode("Failed with Error");
			Framework.CreateResults(false, "Error " + exp.getMessage());
			exp.printStackTrace();

		}
	}

	public static boolean waitforelementvisibility(String we) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for (int i = 1; i <= 30; i++) {
			try {
				// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(we))));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(we))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement(By.xpath(we)).isDisplayed();
		System.out.println(we + " - Element found=" + isElementPresent);
		return isElementPresent;
	}

	public static boolean waitforelementvisibility(String we, int iTime) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, iTime);
		for (int i = 1; i <= iTime; i++) {
			try {
				// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(we))));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(we))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement(By.xpath(we)).isDisplayed();
		System.out.println(we + " - Element found=" + isElementPresent);
		return isElementPresent;
	}

	public static boolean waitforelementvisibility1(String we) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		for (int i = 1; i <= 30; i++) {
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement((MobileBy.AccessibilityId(we)))));
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		boolean isElementPresent = driver.findElement((MobileBy.AccessibilityId(we))).isDisplayed();
		System.out.println("Element found=" + isElementPresent);
		return isElementPresent;
	}

}
