package StepDefinations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinations.BaseClass;
import StepDefinations.Framework;
import StepRunner.Runner;
import cucumber.api.java.en.Given;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class ApplyCreditCardsArabic extends BaseClass {
	// public static IOSDriver<MobileElement> driver;
	public static String sErrorLog;
	public static String MobileNumber;

	@Given("^Arabic Application is on landing Cards Page$")
	public void application_is_on_landing_cards_page() throws Throwable {
		System.out.println("1111111111111111111");

		Runner.status = false;
		Framework.test = Framework.extent.createTest(
				"Test case ID:" + Runner.sTestcase + "<br>" + "Test case Description:Application landing page" + "<br>"
						+ "Expected Result:Application launch successfully" + "</br>");
		Framework.test.assignCategory(Framework.Category);
		Framework.WriteExtentReport = Framework.test.createNode("Navigate to Application landing page <br>");

		BaseClass.setup();
		driver = BaseClass.driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {

			BaseClass.swipe("left", "Meet your needs Apply for credit card");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
					.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy
							.xpath("(//XCUIElementTypeOther[@name=\"Meet your needs Apply for credit card\"])[5]"))))
					.isDisplayed();
			driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Meet your needs Apply for credit card\"])[5]"))
					.click();

			Runner.status = true;

		} catch (Exception e) {
			Runner.status = false;

			sErrorLog = e.toString();
		}

		if (Runner.status == true) {
			Framework.CreateResults(true, "Step Pass");
		} else {
			Framework.CreateResults(false, "Step Fail :" + sErrorLog);
		}
	}

	@Given("^Arabic application is on landing Cards$")
	public void Application_is_on_landing_saving_salaride_page() throws Throwable {
		System.out.println("1111111111111111111");
		BaseClass.setup();
		driver = BaseClass.driver;

		Runner.status = false;
		try {
			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 10L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK"))))
						.isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("OK"))).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
				System.out.println("ok button not found");
			}
			BaseClass.swipe("left", "Meet your needs Apply for credit card");
			((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
					.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy
							.xpath("(//XCUIElementTypeOther[@name=\"Meet your needs Apply for credit card\"])[5]"))))
					.isDisplayed();
			driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Meet your needs Apply for credit card\"])[5]"))
					.click();

			Runner.status = true;

		} catch (Exception e) {
			Runner.status = false;

		}

		if (Runner.status == true) {
			Framework.CreateResults(true, "Step Pass");
		} else {
			Framework.CreateResults(false, "Step Fail :" + sErrorLog);
		}
	}

	@Given("^Arabic Simple page cards$")
	public void Simple_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Come Back Joureny Page <br>");

			try {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????? ???????????? button")));
				driver.findElement(By.id("???????? ???????????? button")).click();
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();

			}
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Preferred Language Cards Page$")
	public void preferred_language_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Runner.status = false;

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Preferred Language page <br>");

			try {

				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("English language")))).isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ??????????"))).click();
				sleep(1000);
				// driver.findElement(By.id("Let's go")).click();
				driver.findElement(
						By.xpath("//XCUIElementTypeOther[@name=\"Let's go button\" or @content-desc='?????????? button']"))
						.click();

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Rak Bank Mission Cards Page$")
	public void rak_bank_mission_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Rak Bank Mission page <br>");
			try {
				sleep(1000);
				Thread.sleep(1000);
				driver.findElement(By.id("????????????")).isDisplayed();
				driver.findElement(By.id("????????????")).click();
				// sleep(3000);
				// sleep(10000);
				// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// driver.getPageSource();
				// sleep(10000);
				// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.id("RAKBANK
				// Mission")))).isDisplayed();
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.id("Next")))).isDisplayed();
				// driver.findElement(By.id("Next")).click();
				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Select A Journey Apply For Credit Card Page$")
	public void select_a_product_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {
			Runner.status = false;

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Select A Journey Apply For Credit Card Page<br>");
			try {
				WebDriverWait wait = new WebDriverWait(driver, 60);

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("Meet your needs Apply for a credit card")));
				driver.findElement(By.id("Meet your needs Apply for a credit card")).click();

				System.out.println("11111333333333333333");
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.name("Simply Better
				// Banking Open a Bank Account")))).isDisplayed();
				// driver.findElement(By.name("Simply Better Banking Open a Bank
				// Account")).click();
				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Enter Mobile Number Cards Page$")
	public void enter_mobile_number_saving_salaride_page() throws Throwable {

		// Xls_Reader reader = new
		// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			// BaseClass.Test6();
			String sTestCaseid = "";
			int min = 1035650;
			int max = 1999999;
			System.out.println("Random value of type double between " + min + " to " + max + ":");
			double a = Math.random() * (max - min + 1) + min;
			MobileNumber = "55" + String.valueOf(Math.round(a));
			System.out.println("MobileNumber================>>" + MobileNumber);

			WirteMobileNumber(MobileNumber);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Enter Mobile Number Cards Page<br>");
			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("undefined field")));
				// driver.findElement(By.id("Get Credit where its due Apply for Credit
				// Cards")).click();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("undefined field")))
						.sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
				// driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("undefined field")));
				driver.findElement(By.id("???????? ?????? ????????????")).click();
				Thread.sleep(1000);

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Enter Mobile Number Cards Page1$")
	public void _mobile_number_saving_salaride_page() throws Throwable {

		// Xls_Reader reader = new
		// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			// BaseClass.Test6();
			String sTestCaseid = "";

			System.out.println(MobileNumber);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Enter Mobile Number Cards Page<br>");
			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("undefined field")));
				// driver.findElement(By.id("Get Credit where its due Apply for Credit
				// Cards")).click();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("undefined field")))
						.sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
				// driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("undefined field")));
				driver.findElement(By.id("???????? ?????? ????????????")).click();
				Thread.sleep(1000);

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic OTP enter Cards Page$")
	public void otp_enter_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {
			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			// String OTP = getColumnNumber(Spath,"OTP",sTestCaseid);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to OTP enter Cards Page<br>");

			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 60);

				sleep(5000);
				TouchAction action = new TouchAction(driver);

				action.tap(PointOption.point(126, 503)).release().perform();
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("//XCUIElementTypeSecureTextField[@name=\"?????? ???????????? field\"]")));

				driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"?????? ???????????? field\"]")).click();
				driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"?????? ???????????? field\"]"))
						.sendKeys(new CharSequence[] { "123456" + Keys.ENTER });

				Runner.status = true;
			}

			catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	// FindImagForSikuli.ClickOnElement(sImagePath+"Simply Resume.png",0.8D);

	@Given("^Arabic Card Selection Page$")
	public void select_a_product_youd_prefer_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			// WebDriverWait wait = new WebDriverWait(driver, 15);
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestcaseID = "";
			String SelectProducts = BaseClass.getColumnNumber(Spath, "SelectProducts", sTestcaseID);
			String YourTotalMonthlyIncome = "0";
			try {
				YourTotalMonthlyIncome = BaseClass.getColumnNumber(Spath, "YourTotalMonthlyIncome", sTestcaseID);

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Select a Product you
			// prefer Page"+"<br>"+"Expected Result:Select a Product you prefer Page launch
			// successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Card Selection Page<br>");
			try {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? ???????? ???????????? field")));
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Your
				// total monthly income field")))).isDisplayed();
				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Your
				// total monthly income field")));
				driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Radio button item 0\"])[2]")).click();
				driver.findElement(By.id("???????????? ???????? ???????????? field"))
						.sendKeys(new CharSequence[] { YourTotalMonthlyIncome + Keys.ENTER });

				try {
					if (SelectProducts.equals("Show all Cards")) {
						wait.until(
								(Function) ExpectedConditions.presenceOfElementLocated(By.id("Radio button item 0")));
						driver.findElement(By.id("Radio button item 0")).click();
					}

					if (SelectProducts.equals("RAKIslamic")) {
						wait.until(
								(Function) ExpectedConditions.presenceOfElementLocated(By.id("Radio button item 1")));
						driver.findElement(By.id("Radio button item 1")).click();
					}

					if (SelectProducts.equals("Conventional only")) {
						wait.until(
								(Function) ExpectedConditions.presenceOfElementLocated(By.id("Radio button item 2")));
						driver.findElement(By.id("Radio button item 2")).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block

				}

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? button")));
				driver.findElement(By.id("???????????? button")).click();

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Card Type Page$")
	public void pick_an_account_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestcaseID = "";
			String CardsType = BaseClass.getColumnNumber(Spath, "CardsType", sTestcaseID);

			WebDriverWait wait = new WebDriverWait(driver, 15);
			System.out.println("CardsType = =" + CardsType);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Card Type Page<br>");
			try {
				sleep(5000);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				if (CardsType.equals("Emirates Skywards World Elite Credit Card")) { //

					wait.until(
							(Function) ExpectedConditions.presenceOfElementLocated(By.id("???????? ?????????? ?????????? ????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("Emirates Skywards World Elite Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[1]"))
							.click();
					System.out.println("Emirates Skywards World Elite Credit Card clicked");
				}

				if (CardsType.equals("World Credit Card")) {
					System.out.println("World Credit Card");

					BaseClass.swipe("right", "");

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ?????????? ????????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("World Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[2]"))
							.click();

					System.out.println("World Credit Card clicked");
				}

				if (CardsType.equals("HighFlyer Platinum Credit Card")) {
					sleep(2000);
					BaseClass.swipe("right", "?????????? ?????? ?????????? ????????????????????");

					BaseClass.swipe("right", "?????????? ?????? ?????????? ????????????????????");

					wait.until((Function) ExpectedConditions
							.presenceOfElementLocated(By.id("?????????? ?????? ?????????? ????????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("HighFlyer Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[3]"))
							.click();
					System.out.println("HighFlyer Credit Card clicked");
				}

				if (CardsType.equals("Titanium Credit Card")) {

					for (int iCount = 1; iCount <= 3; iCount++) {
						BaseClass.swipe("right", "?????????? ??????????????????");
					}

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ??????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("Titanium Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[4]"))
							.click();
					System.out.println("Titanium Credit Card clikced");
				}

				if (CardsType.equals("RED Credit Card")) {

					for (int iCount = 1; iCount <= 4; iCount++) {
						BaseClass.swipe("right", "?????????? ?????? ????????????????????");

					}
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ?????? ????????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("RED Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[5]"))
							.click();
					System.out.println("RED Credit Card clicked");
				}

				if (CardsType.equals("RAKislamic Emirates Skywards World Elite Credit Card")) {

					for (int iCount = 1; iCount <= 5; iCount++) {
						BaseClass.swipe("right", "?????????? ?????? ???????????????? ???????? ?????????? ?????????? ???????????????? ?????????? ??????????");

					}
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(
							By.id("?????????? ?????? ???????????????? ???????? ?????????? ?????????? ???????????????? ?????????? ??????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("Emirates Skywards World Elite Credit Card");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[6]"))
							.click();
					System.out.println("Emirates Skywards World Elite Credit Card clicked");
				}

				if (CardsType.equals("RAKislamic World Credit Card")) {

					for (int iCount = 1; iCount <= 6; iCount++) {
						sleep(1000);
						BaseClass.swipe("right", "?????????? ???????????? ?????????? ????????????????????");

					}
					wait.until((Function) ExpectedConditions
							.presenceOfElementLocated(By.id("?????????? ???????????? ?????????? ????????????????????")));

					sleep(1000);
					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("Murabaha World Credit Card ");
					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[7]"))
							.click();
					System.out.println("Murabaha World Credit Card clicked");
				}

				if (CardsType.equals("RAKislamic Platinum Credit Card")) {

					for (int iCount = 1; iCount <= 7; iCount++) {
						BaseClass.swipe("right", "?????????? ???????????????? ???????????????? ????????????????????");

					}
					wait.until((Function) ExpectedConditions
							.presenceOfElementLocated(By.id("?????????? ???????????????? ???????????????? ????????????????????")));

					new TouchAction(driver).press(PointOption.point(190, 621))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
							.moveTo(PointOption.point(190, 254)).release().perform();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					System.out.println("Murabaha Platinum Credit Card");

					sleep(4000);
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ?????? ?????????????? button\"])[8]"))
							.click();
					System.out.println("Murabaha Platinum Credit Card clicked");

				}

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic PDF Cards Page$")
	public void account_option_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to PDF Cards Page<br>");
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			WebDriverWait wait = new WebDriverWait(driver, 15);

			try {
				Thread.sleep(3000);

				new TouchAction(driver).press(PointOption.point(191, 565))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(50L))).moveTo(PointOption.point(190, 305))
						.release().perform();

				new TouchAction(driver).press(PointOption.point(191, 565))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(50L))).moveTo(PointOption.point(190, 305))
						.release().perform();

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("???????? ?????????????? ?????????? ???? ???? ??????????????????")));
				driver.findElement(By.id("???????? ?????????????? ?????????? ???? ???? ??????????????????")).click();

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.xpath("//XCUIElementTypeOther[@name='???????????? button']")));
				driver.findElement(By.xpath("//XCUIElementTypeOther[@name='???????????? button']")).click();

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Email Cards Page$")
	public void pdf_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String EmailAddress = getColumnNumber(Spath, "EmailAddress", sTestCaseid);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Email Cards Page<br>");

			/*
			 * sleep(5000); String s=driver.getPageSource();
			 * 
			 * System.out.println(s); sleep(10000);
			 */

			// WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {
				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Email
				// Address")));
				driver.findElement(By.id("???????????? ????????????????????"))
						.sendKeys(new CharSequence[] { EmailAddress + Keys.ENTER });
				sleep(2000);
				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Send
				// document")));
				driver.findElement(By.id("???????? button")).click();
				sleep(2000);

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Lets Know You More Cards Page$")
	public void email_address_saving_salaride_page() throws Throwable {

		// Xls_Reader reader = new
		// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// String sheetName = "Registration";
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			String Countryofbirth = getColumnNumber(Spath, "Countryofbirth", sTestCaseid);
			// String AreYouPoliticallyExposedPerson = reader.getCellData(sheetName, 5, 2);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Lets Know You More Cards Page<br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????? ???????????? value")));
				driver.findElement(By.id("?????? ???????????? value")).click();

				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for (int iCount = 1; iCount <= 100; iCount++) {
					try {
						// Thread.sleep(2000);
						driver.findElement(By.id(Countryofbirth)).click();
						break;
					} catch (Exception e) {
						// boolean b1=false;
						// while (true) {
						Thread.sleep(2000);
						BaseClass.swipe("up", Countryofbirth);

					}

				}

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				if (AreYouPoliticallyExposedPerson.equalsIgnoreCase("Yes"))
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"?????? radio\"])[2]")).click();
				else
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???? radio\"])[2]")).click();

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("No
				// radio")));
				// driver.findElement(By.id("No radio")).click();

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? button")));
				driver.findElement(By.id("???????????? button")).click();

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^I Agree To Waiver The 5day Cooling Period Cards Page$")
	public void I_Agree_To_Waiver_The_5day_Cooling_Period_Cards_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("I Agree To Waiver The 5day Cooling Period Cards Page");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("I agree to waiver the 5-day cooling period")));

				driver.findElement(By.id("I agree to waiver the 5-day cooling period")).click();
				driver.findElement(By.id("Proceed button")).click();

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic About your PEP Status Cards Page$")
	public void review_your_personal_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String YouareaPEPby = getColumnNumber(Spath, "YouareaPEPby", sTestCaseid);
			String PoliticalDesignation = getColumnNumber(Spath, "PoliticalDesignation", sTestCaseid);
			// String DoYouHaveDualNationality =
			// getColumnNumber(Spath,"DoYouHaveDualNationality",sTestCaseid);
			// String DualNationalityCountry =
			// getColumnNumber(Spath,"DualNationalityCountry",sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			// WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to About your PEP Status Cards Page<br>");

			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				if (AreYouPoliticallyExposedPerson.equals("Yes")) {

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(YouareaPEPby)));
					driver.findElement(By.id(YouareaPEPby)).click();

					// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Self
					// radio")));
					// driver.findElement(By.id("Self radio")).click();

					// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Previous
					// Designation field")));
					// driver.findElement(By.id("Previous Designation field")).click();

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ???????????? field")));
					driver.findElement(By.id("?????????? ???????????? field"))
							.sendKeys(new CharSequence[] { PoliticalDesignation + Keys.ENTER });

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? button")));
					driver.findElement(By.id("???????????? button")).click();

					Runner.status = true;

				}

				else {
					Runner.status = true;

				}

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic PEP Status By Association Cards Page$")
	public void about_your_pep_status_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YouareaPEPby = getColumnNumber(Spath, "YouareaPEPby", sTestCaseid);
			// String PoliticalDesignation =
			// getColumnNumber(Spath,"PoliticalDesignation",sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			String YourRelationship = getColumnNumber(Spath, "YourRelationship", sTestCaseid);
			String NameOfThePEP = getColumnNumber(Spath, "NameOfThePEP", sTestCaseid);
			String CountryWhereThePEPHoldsTheStatus = getColumnNumber(Spath, "CountryWhereThePEPHoldsTheStatus",
					sTestCaseid);

			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to PEP Status By Association Cards Page<br>");
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				if (AreYouPoliticallyExposedPerson.equals("Yes")) {

					if (YouareaPEPby.equals("Association radio")) {
						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????? ?????????????? value")));
						driver.findElement(By.id("?????? ?????????????? value")).click();

						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(YourRelationship)));
						driver.findElement(By.id(YourRelationship)).click();

						// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Brother
						// option")));
						// driver.findElement(By.id("Brother option")).click();

						wait.until((Function) ExpectedConditions
								.presenceOfElementLocated(By.id("?????? ?????????????? ???????????????? field")));
						driver.findElement(By.id("?????? ?????????????? ???????????????? field"))
								.sendKeys(new CharSequence[] { NameOfThePEP + Keys.ENTER });

						wait.until((Function) ExpectedConditions
								.presenceOfElementLocated(By.id("???????? ?????????? ?????????????? ???????????????? value")));
						driver.findElement(By.id("???????? ?????????? ?????????????? ???????????????? value")).click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {
								// Thread.sleep(2000);
								driver.findElement(By.id(CountryWhereThePEPHoldsTheStatus)).click();
								break;
							} catch (Exception e) {
								// boolean b1=false;
								// while (true) {
								Thread.sleep(2000);
								BaseClass.swipe("up", CountryWhereThePEPHoldsTheStatus);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id(CountryWhereThePEPHoldsTheStatus)));
						// driver.findElement(By.id(CountryWhereThePEPHoldsTheStatus)).click();

						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? button")));
						driver.findElement(By.id("???????????? button")).click();

					}

				}

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Review Your Employment Details Cards Page$")
	public void pep_status_by_association_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			// String TotalMonthlySalary =
			// getColumnNumber(Spath,"TotalMonthlySalary",sTestCaseid);
			String CompanyName = getColumnNumber(Spath, "CompanyName", sTestCaseid);
			// String CompanyNameOther =
			// getColumnNumber(Spath,"CompanyNameOther",sTestCaseid);
			String Designation = getColumnNumber(Spath, "Designation", sTestCaseid);
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String IndustryCategoryvalue = getColumnNumber(Spath, "IndustryCategoryvalue", sTestCaseid);
			String SubIndustryvalue = getColumnNumber(Spath, "SubIndustryvalue", sTestCaseid);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Review Your Employment Details Cards Page<br>");

			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				try {
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????? ?????? ????????")));
					driver.findElement(By.id("?????? ?????? ????????")).click();

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("Search bar")));
					driver.findElement(By.id("Search bar")).sendKeys(new CharSequence[] { CompanyName + Keys.ENTER });

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(CompanyName)));
					driver.findElement(By.id(CompanyName)).click();

					try {
						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????? ?????????? value")));
						driver.findElement(By.id("???????? ?????????? value")).click();

						wait.until(
								(Function) ExpectedConditions.presenceOfElementLocated(By.id(IndustryCategoryvalue)));
						driver.findElement(By.id(IndustryCategoryvalue)).click();

						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? value")));
						driver.findElement(By.id("???????????? value")).click();

						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(SubIndustryvalue)));
						driver.findElement(By.id(SubIndustryvalue)).click();

					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(" Employment sector value not required");
					}

					// TouchAction action = new TouchAction(driver);
					// sleep(3000);
					// action.tap(PointOption.point(88, 679)).release().perform();

					driver.findElement(By.id("???????????? field")).sendKeys(Designation);

					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"" + Designation + "\"])[2]")).click();

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("calender icon")));
					driver.findElement(By.id("calender icon")).click();

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("Done link")));
					driver.findElement(By.id("Done link")).click();

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("???????????? button")));
					driver.findElement(By.id("???????????? button")).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status = true) {
				Framework.CreateResults(true, "Step Passed");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Consents Declarations Cards Page$")
	public void your_residential_address_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your Residential Address
			// page"+"<br>"+"Expected Result:Your Residential Address"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Consents Declarations Cards Page<br>");

			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("(//XCUIElementTypeOther[@name=\"?????? ???? ?????? ???????? ????????????\"])[2]")));
				driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"?????? ???? ?????? ???????? ????????????\"])[2]")).click();

				new TouchAction(driver).press(PointOption.point(191, 565))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(50L))).moveTo(PointOption.point(190, 305))
						.release().perform();

				new TouchAction(driver).press(PointOption.point(191, 565))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(50L))).moveTo(PointOption.point(190, 305))
						.release().perform();

				sleep(2000);

				// TouchAction action = new TouchAction(driver);
				// action.tap(PointOption.point(194, 769)).release().perform(); /// i agree to
				// keep going button

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("//XCUIElementTypeOther[@name=\"?????????? ?????? ???? ?????? ???????? button\"]")));
				driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"?????????? ?????? ???? ?????? ???????? button\"]")).click();

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name=\"????????????\"]")));
				driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"????????????\"]")).click();

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic How Would You Like To Prove Your Income Cards Page$")
	public void your_employment_type_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {
			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String ProveYourIncome = getColumnNumber(Spath, "ProveYourIncome", sTestCaseid);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your employment type
			// page"+"<br>"+"Expected Result:Your employment type"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to How Would You Like To Prove Your Income Cards Page<br>");
			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);

				if (ProveYourIncome.equals("FTSCheck")) {
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.xpath(
							"(//XCUIElementTypeOther[@name=\"???? ???????????? ?????? ?????????????? ?????? 48 ????????\"])[2]/XCUIElementTypeOther")));
					driver.findElement(By.xpath(
							"(//XCUIElementTypeOther[@name=\"???? ???????????? ?????? ?????????????? ?????? 48 ????????\"])[2]/XCUIElementTypeOther"))
							.click();

				}

				else {

					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.xpath(
							"(//XCUIElementTypeOther[@name='???????????? ???????????? ?????? ?????????? ????????????'])[2]/XCUIElementTypeOther")));
					driver.findElement(By.xpath(
							"(//XCUIElementTypeOther[@name='???????????? ???????????? ?????? ?????????? ????????????'])[2]/XCUIElementTypeOther"))
							.click();

				}
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Please Verify Your Income Cards Page$")
	public void details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String IBANNumber = getColumnNumber(Spath, "IBANNumber", sTestCaseid);
			String ProveYourIncome = getColumnNumber(Spath, "ProveYourIncome", sTestCaseid);

			WebDriverWait wait = new WebDriverWait(driver, 90);
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Self employed Details
			// page"+"<br>"+"Expected Result:Self employed Details"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Please Verify Your Income Cards Page<br>");

			try {

				try {

					if (ProveYourIncome.equals("BankStatements")) {
						Thread.sleep(1000);

						// TouchAction action = new TouchAction(driver);

						// action.tap(PointOption.point(192, 735)).release().perform();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????? button"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????? ?????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ?????? button"))).click();
						new WebDriverWait((WebDriver) driver, 60L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Pdf1")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Pdf1"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????? ?????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ?????? button"))).click();
						new WebDriverWait((WebDriver) driver, 60L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Pdf2")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Pdf2"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????? ?????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ?????? button"))).click();
						new WebDriverWait((WebDriver) driver, 60L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Pdf3")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Pdf3"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????? button"))).click();

						sleep(60000);

						new WebDriverWait((WebDriver) driver, 90L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("??????????")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("??????????"))).click();

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic We Need Your IBAN Number Cards Page$")
	public void self_employed_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String IBANNumber = getColumnNumber(Spath, "IBANNumber", sTestCaseid);
			String ProveYourIncome = getColumnNumber(Spath, "ProveYourIncome", sTestCaseid);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Self employed Details
			// page"+"<br>"+"Expected Result:Self employed Details"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to We Need Your IBAN Number Cards Page<br>");

			try {

				try {
					if (ProveYourIncome.equals("FTSCheck")) {
						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("IBAN field")));
						driver.findElement(By.id("IBAN field"))
								.sendKeys(new CharSequence[] { IBANNumber + Keys.ENTER });

						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? button")));
						driver.findElement(By.id("?????????? button")).click();
					}
				} catch (Exception e) {

				}

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Average Monthly Spend On Cards Page$")
	public void first_company_details_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			String Lifestyle = getColumnNumber(Spath, "Lifestyle", sTestCaseid);
			String ServiceExpenses = getColumnNumber(Spath, "ServiceExpenses", sTestCaseid);
			String Additionalloans = getColumnNumber(Spath, "Additionalloans", sTestCaseid);
			String AnyOtherExpenses = getColumnNumber(Spath, "AnyOtherExpenses", sTestCaseid);
			String Totalhousehold = getColumnNumber(Spath, "Totalhousehold", sTestCaseid);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:First Company Details
			// page"+"<br>"+"Expected Result:First Company Details"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Average Monthly Spend On Cards Page<br>");
			try {

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("Lifestyle expenses/month field")));
				driver.findElement(By.id("Lifestyle expenses/month field"))
						.sendKeys(new CharSequence[] { Lifestyle + Keys.ENTER });

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Service
				// expenses field")));
				driver.findElement(By.id("Bills/month field"))
						.sendKeys(new CharSequence[] { ServiceExpenses + Keys.ENTER });

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Additional
				// loans taken field")));
				driver.findElement(By.id("Other commitments/month field"))
						.sendKeys(new CharSequence[] { Additionalloans + Keys.ENTER });

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Any
				// other expenses field")));
				driver.findElement(By.id("Any other expenses/month field"))
						.sendKeys(new CharSequence[] { AnyOtherExpenses + Keys.ENTER });

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Total
				// household income field")));
				driver.findElement(By.id("Total household income field"))
						.sendKeys(new CharSequence[] { Totalhousehold + Keys.ENTER });

				TouchAction action = new TouchAction(driver);
				sleep(1000);

				new TouchAction(driver).press(PointOption.point(190, 621))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200L)))
						.moveTo(PointOption.point(190, 254)).release().perform();

				int x = driver
						.findElement(By.xpath(
								"//XCUIElementTypeOther[@name=\"Number of Dependents 0\"]/XCUIElementTypeOther[2]"))
						.getLocation().getX();
				int y = driver
						.findElement(By.xpath(
								"//XCUIElementTypeOther[@name=\"Number of Dependents 0\"]/XCUIElementTypeOther[2]"))
						.getLocation().getY();
				System.out.println(x + " number of dep" + y);
				driver.findElement(
						By.xpath("//XCUIElementTypeOther[@name=\"Number of Dependents 0\"]/XCUIElementTypeOther[2]"))
						.click();

				sleep(1000);
				BaseClass.swipe("up", "???????????? button");
				driver.findElement(By.id("???????????? button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Here Your Cards Limit Cards Page$")
	public void second_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			String CardsName = getColumnNumber(Spath, "CardsName", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Second Company Details
			// page"+"<br>"+"Expected Result:Second Company Details successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Here Your Cards Limit Cards Page<br>");
			try {

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Great,
				// let's keep going... button")));
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ?????? ?????????????? field")));
				driver.findElement(By.id("?????????? ?????? ?????????????? field")).clear();
				driver.findElement(By.id("?????????? ?????? ?????????????? field"))
						.sendKeys(new CharSequence[] { CardsName + Keys.ENTER });
				driver.findElement(By.xpath("//XCUIElementTypeOther[@value=\"checkbox\"]")).click();
				BaseClass.swipe("up", "???????????? button");
				driver.findElement(By.id("???????????? button")).click();

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Do You Want Income Protection Cards Page$")
	public void third_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {
			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			String CreditShieldPlus = getColumnNumber(Spath, "CreditShieldPlus", sTestCaseid);

			String RAKProtect = getColumnNumber(Spath, "RAKProtect", sTestCaseid);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Third Company Details
			// page"+"<br>"+"Expected Result:Third Company Details "+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Do You Want Income Protection Cards Page<br>");

			try {
				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ???? ??????????????\"])[2]")));
				// driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Tap for
				// more details link\"])[1]")).click();

				Thread.sleep(2000);

				Thread.sleep(2000);
				if (CreditShieldPlus.equalsIgnoreCase("I want to enroll"))
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???????? ???? ??????????????\"])[2]")).click();
				else
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"???? ???????? ???? ??????????????\"])[2]")).click();
				BaseClass.swipe("up", "???????????? button");

				driver.findElement(By.id("???????????? button")).click();
				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Terms Conditions Cards Page$")
	public void fourth_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Fourth Company Details
			// page"+"<br>"+"Expected Result:Fourth Company Details"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Terms Conditions Cards Page <br>");
			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("(//XCUIElementTypeOther[@name=\"?????????????? ??????????????????\"])[1]")));
				driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"?????????????? ??????????????????\"])[1]")).click();

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("?????????? ?????? ???? ???? ???????? ???? ??????????????")));
				for (int i = 0; i <= 4; i++) {

					new TouchAction(driver).press(PointOption.point(193, 611))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(50L)))
							.moveTo(PointOption.point(194, 118)).release().perform();

				}
				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("?????????? ?????? ???? ???? ???????? ???? ??????????????")));
				driver.findElement(By.id("?????????? ?????? ???? ???? ???????? ???? ??????????????")).click();
				driver.findElement(By.id("???????????? button")).click();
				driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"??????????\"])[3]")).click();

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}

		}

	}

	@Given("^Arabic Where Would You Prefer Your Physical Card To Be Delivered Cards Page$")
	public void salaried_details_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {
			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String AddressType = getColumnNumber(Spath, "AddressType", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 15);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details
			// page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Where Would You Prefer Your Physical Card To Be Delivered Cards Page<br>");
			try {

				try {

					wait.until((Function) ExpectedConditions
							.presenceOfElementLocated(By.id("?????? ?????? ?????????? ???? ???????? ?????????? ?????????? ???????????????? field")));
					driver.findElement(By.id("?????? ?????? ?????????? ???? ???????? ?????????? ?????????? ???????????????? field"))
							.sendKeys(new CharSequence[] { "001234567" + Keys.ENTER });
					driver.findElement(By.xpath("(//XCUIElementTypeOther[@value='checkbox'])[1]")).click();

					new TouchAction(driver).press(PointOption.point(193, 611))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(194, 118)).release().perform();

					driver.findElement(By.id("???????????? button")).click();
				} catch (Exception e) {

				}

				if (AddressType.equals("Residential Address")) {
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ??????????")));
					driver.findElement(By.id("?????????? ??????????")).click();
				}

				else {
					wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ????????")));
					driver.findElement(By.id("?????????? ????????")).click();
				}

				// Work Address
				// Residential Address

				Runner.status = true;
			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Your Work Address Cards Page$")
	public void verify_your_income_islamic_saving_self_employed_page() throws Throwable {
		if (Runner.status == true) {
			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String VillaFlatNumber = getColumnNumber(Spath, "VillaFlatNumber", sTestCaseid);
			String BuildingVillaName = getColumnNumber(Spath, "BuildingVillaName", sTestCaseid);
			String StreetLocation = getColumnNumber(Spath, "StreetLocation", sTestCaseid);
//					  field removed					String CityName = getColumnNumber(Spath,"CityName",sTestCaseid);
			String POBox = getColumnNumber(Spath, "POBox", sTestCaseid);
			String EmirateCity = getColumnNumber(Spath, "EmirateCity", sTestCaseid);
			String AddressType = getColumnNumber(Spath, "AddressType", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income
			// page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Your Work Address Cards Page<br>");
			try {

				try {
					if (AddressType.equals("Work Address")) {

						Thread.sleep(2000);

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")))
								.sendKeys(new CharSequence[] { VillaFlatNumber + Keys.ENTER });
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ?????????????? field")))
								.sendKeys(new CharSequence[] { BuildingVillaName + Keys.ENTER });
						new TouchAction(driver).press(PointOption.point(176, 803))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(177, 574)).release().perform();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????????? / ???????????? field")))
								.sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("?????????????? value")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????????? value"))).click();
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId(EmirateCity)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(EmirateCity))).click();

						Thread.sleep(2000);
						new TouchAction(driver).press(PointOption.point(176, 803))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(177, 574)).release().perform();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????? ?????????????? field")))
								.sendKeys(new CharSequence[] { POBox + Keys.ENTER });

						BaseClass.swipe("up", "???????????? button");
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("???????????? button")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????????? button"))).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block

				}

				Runner.status = true;
			}

			catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Your Residential Address Cards Page$")
	public void please_verify_your_income_islamic_saving_self_employed_page() throws Throwable {
		if (Runner.status == true) {
			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String VillaFlatNumber = getColumnNumber(Spath, "VillaFlatNumber", sTestCaseid);
			String BuildingVillaName = getColumnNumber(Spath, "BuildingVillaName", sTestCaseid);
			String StreetLocation = getColumnNumber(Spath, "StreetLocation", sTestCaseid);
// field removed				String CityName = getColumnNumber(Spath,"CityName",sTestCaseid);
			String POBox = getColumnNumber(Spath, "POBox", sTestCaseid);
			String EmirateCity = getColumnNumber(Spath, "EmirateCity", sTestCaseid);
			String AddressType = getColumnNumber(Spath, "AddressType", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income
			// page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Your Residential Address Cards Page<br>");
			try {

				//

				if (AddressType.equals("Residential Address")) {
					// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Allow
					// Once")));
					// driver.findElement(By.id("Allow Once")).click();
					Thread.sleep(3000);

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")))
							.sendKeys(new CharSequence[] { VillaFlatNumber + Keys.ENTER });
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ?????????????? field")))
							.sendKeys(new CharSequence[] { BuildingVillaName + Keys.ENTER });

					new TouchAction(driver).press(PointOption.point(176, 803))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(177, 574)).release().perform();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????????? / ???????????? field")))
							.sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("?????????????? value")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????????? value"))).click();
					new WebDriverWait((WebDriver) driver, 60L).until(
							(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(EmirateCity)));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId(EmirateCity))).click();

					new TouchAction(driver).press(PointOption.point(176, 803))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(177, 574)).release().perform();

					BaseClass.swipe("up", "???????????? button");

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????? ?????????????? field")))
							.sendKeys(new CharSequence[] { POBox + Keys.ENTER });

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("???????????? button")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????????? button"))).click();
				}
				// Thread.sleep(2000);

				Runner.status = true;
			}

			catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}
	}

	@Given("^Arabic Home Country Address Cards Page$")
	public void Upload_your_documents_Islamic_Saving_Self_Employed_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String VillaFlatNumber = getColumnNumber(Spath, "VillaFlatNumber", sTestCaseid);
			String BuildingVillaName = getColumnNumber(Spath, "BuildingVillaName", sTestCaseid);
			String StreetLocation = getColumnNumber(Spath, "StreetLocation", sTestCaseid);
// field removed	String POBox = getColumnNumber(Spath,"POBox",sTestCaseid);
			String EmirateCity = getColumnNumber(Spath, "EmirateCity", sTestCaseid);
			String CityName = getColumnNumber(Spath, "CityName", sTestCaseid);
			String StateName = getColumnNumber(Spath, "StateName", sTestCaseid);
			String Countryvalue = getColumnNumber(Spath, "Countryvalue", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Home Country Address Cards Page<br>");

			try {

				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ???????????? field")))
						.sendKeys(new CharSequence[] { VillaFlatNumber + Keys.ENTER });
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???? ?????? ?????????????? field")))
						.sendKeys(new CharSequence[] { BuildingVillaName + Keys.ENTER });

				new TouchAction(driver).press(PointOption.point(176, 803))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
						.moveTo(PointOption.point(177, 574)).release().perform();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????????? / ???????????? field")))
						.sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????? ?????????????????? field")))
						.sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });
// field removed		        ((MobileElement)driver.findElement(MobileBy.AccessibilityId("PO Box field"))).sendKeys(new CharSequence[] { POBox + Keys.ENTER });

				Thread.sleep(2000);
				new TouchAction(driver).press(PointOption.point(176, 803))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
						.moveTo(PointOption.point(177, 574)).release().perform();

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????? ???????? ???????????? field")));
				driver.findElement(By.id("?????? ???????? ???????????? field"))
						.sendKeys(new CharSequence[] { "7254675347586" + Keys.ENTER });

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????????? / ???????????? field")));
				driver.findElement(By.id("?????????????? / ???????????? field"))
						.sendKeys(new CharSequence[] { CityName + Keys.ENTER });

				driver.findElement(By.id(CityName)).click();

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????????? field")));
				driver.findElement(By.id("?????????????? field")).sendKeys(new CharSequence[] { StateName + Keys.ENTER });

				driver.findElement(By.id(StateName)).click();

				driver.findElement(By.id("?????????? value")).click();

				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for (int iCount = 1; iCount <= 100; iCount++) {
					try {
						driver.findElement(By.id(Countryvalue)).click();
						break;
					} catch (Exception e) {
					
						Thread.sleep(2000);
						BaseClass.swipe("up", Countryvalue);

					}

				}

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				BaseClass.swipe("up", "???????????? button");
				new WebDriverWait((WebDriver) driver, 60L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("???????????? button")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????????? button"))).click();

				Runner.status = true;
			}

			catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Does the Following apply to you Cards Page$")
	public void does_the_following_apply_to_you_saving_salaride_page() throws Throwable {

		// Xls_Reader reader = new
		// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String DoesTheFollowingApplyToYou = getColumnNumber(Spath, "DoesTheFollowingApplyToYou", sTestCaseid);
			String PayTaxInUAE = getColumnNumber(Spath, "PayTaxInUAE", sTestCaseid);
			String TaxCountry = getColumnNumber(Spath, "TaxCountry", sTestCaseid);
			String TINNumber = getColumnNumber(Spath, "TINNumber", sTestCaseid);
			String Reasonifunknown = getColumnNumber(Spath, "Reasonifunknown", sTestCaseid);
			String Pleasespecify = getColumnNumber(Spath, "Pleasespecify", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Does the Following apply to you Cards Page<br>");

			try {
				if (DoesTheFollowingApplyToYou.equals("Yes")) {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? radio\"])[2]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? radio\"])[2]"))).click();

				} else {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???? radio\"])[2]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???? radio\"])[2]"))).click();

				}

				if (PayTaxInUAE.equals("Yes")) {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? radio\"])[4]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? radio\"])[4]"))).click();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????????? button"))).click();
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
									"(//XCUIElementTypeOther[@name=\"?????????? ???????? ?????? ???????????? ?????????????? ?????? ???????? ?????????? ????????????\"])[1]"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.xpath(
							"(//XCUIElementTypeOther[@name=\"?????????? ???????? ?????? ???????????? ?????????????? ?????? ???????? ?????????? ????????????\"])[1]")))
							.click();

					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {
							// Thread.sleep(2000);
							driver.findElement(By.id(TaxCountry)).click();
							break;
						} catch (Exception e) {
							// boolean b1=false;
							// while (true) {
							Thread.sleep(2000);
							BaseClass.swipe("up", TaxCountry);

						}

					}

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("Close Button")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("Close Button"))).click();

					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.AccessibilityId("?????? ?????????????? ?????????????? (?????? ?????? ??????????????) field"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.AccessibilityId("?????? ?????????????? ?????????????? (?????? ?????? ??????????????) field")))
							.sendKeys(new CharSequence[] { TINNumber + Keys.ENTER });

				} else {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???? radio\"])[4]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???? radio\"])[4]"))).click();

				}

				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("???????????? button")))).isDisplayed();
				// new WebDriverWait((WebDriver)TestRak.driver,
				// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Submit
				// button")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????????? button"))).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Communication preferences Cards Page$")
	public void communication_preferences_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestDataCards.xlsx";
			String sTestCaseid = "";
			String AdvicesCommunication = getColumnNumber(Spath, "AdvicesCommunication", sTestCaseid);
			String MarketingPromotionalOffers = getColumnNumber(Spath, "MarketingPromotionalOffers", sTestCaseid);
			// String MarketingPromotionalOffersOption =
			// getColumnNumber(Spath,"MarketingPromotionalOffersOption",sTestCaseid);
			String ThirdPartyPlatform = getColumnNumber(Spath, "ThirdPartyPlatform", sTestCaseid);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Communication preferences Cards Page <br>");

			try {

				if (AdvicesCommunication.equals("Yes")) {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]")));
					((MobileElement) driver.findElement(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]"))).click();
				} else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ???????????? ???????????? radio\"])[2]")));
					((MobileElement) driver.findElement(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ???????????? ???????????? radio\"])[2]"))).click();

				}

				if (MarketingPromotionalOffers.equals("Yes")) {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???????? ???????? radio\"])[2]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???????? ???????? radio\"])[2]")))
							.click();

					new TouchAction(driver).press(PointOption.point(171, 671))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(176, 250)).release().perform();

					sleep(3000);
					((MobileElement) driver.findElement(MobileBy.id("???????????? ????????????????????"))).click();
					sleep(2000);
					((MobileElement) driver.findElement(MobileBy.id("?????????? ??????????"))).click();
					sleep(2000);
					((MobileElement) driver.findElement(MobileBy.id("?????????????? ????????????"))).click();
					// }

					// }

				} else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ?????????? radio\"])[2]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ?????????? radio\"])[2]")))
							.click();

				}
				new TouchAction(driver).press(PointOption.point(171, 671))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
						.moveTo(PointOption.point(176, 250)).release().perform();

				if (ThirdPartyPlatform.equals("Yes")) {

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???????? ???????? radio\"])[4]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"???????? ???????? radio\"])[4]")))
							.click();
				}

				else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ?????????? radio\"])[4]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"?????? ?????????? radio\"])[4]")))
							.click();

				}

				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"????????????\"]")));
				((MobileElement) driver.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"????????????\"]")))
						.click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^What Happens Next Cards Page$")
	public void terms_conditions_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 50);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to What Happens Next Cards Page<br>");
			try {
				Thread.sleep(10000);

				wait.until((Function) ExpectedConditions
						.presenceOfElementLocated(By.id("Great, let's keep going button")));

				driver.findElement(By.id("Great, let's keep going button")).click();

				Thread.sleep(1000);
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Income Assessment Cards Page$")
	public void consents_declarations_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Consents Declarations
			// page"+"<br>"+"Expected Result:Consents Declarations "+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Income Assessment Cards Page<br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("//XCUIElementTypeStaticText[@name=\"Income Assessment\"]")));

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Welcome onboard$")
	public void welcome_onboard_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Consents Declarations
			// page"+"<br>"+"Expected Result:Consents Declarations "+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Welcome Onboard Page<br>");

			try {
				Thread.sleep(25000);
				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ??????????")));
				driver.findElement(By.id("?????????? ??????????")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Create Login Details Page$")
	public void Create_Login_Details_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Create Login Details Page<br>");

			String Password = "";

			Random r = new Random();
			String Username = "";
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for (int i = 0; i < 8; i++) {
				Username = Username + String.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
			}
			WirteUsername(Username);
			int min2 = 230000;
			int max2 = 239999;
			String Password1 = "";
			System.out.println("Random value of type double between " + min2 + " to " + max2 + ":");
			double a2 = Math.random() * (max2 - min2 + 1) + min2;
			Password1 = "T" + String.valueOf(Math.round(a2));

			Password = "Rakbank@1234";
			System.out.println(Password);

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????? ???????????????? field")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????? ???????????????? field")))
						.sendKeys(new CharSequence[] { Username + Keys.ENTER });
				// WirteAccountNo(Username);
				sleep(2000);
				driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"????????\"])[2]")).click();
				sleep(5000);
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("???????? ???????? field")))
						.sendKeys(new CharSequence[] { Password + Keys.ENTER });

				// WirtePassword(Password);
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("?????????? ???????? ???????????? field")))
						.sendKeys(new CharSequence[] { Password + Keys.ENTER });

				driver.findElement(By.id("???????????? button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Arabic Login Using Your Details$")
	public void Login_Using_Your_Details_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Login Using Your Details Page<br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("?????????? ???????????? button")));

				driver.findElement(By.id("?????????? ???????????? button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^After Login Page$")
	public void After_Login_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to After Login Page<br>");

			try {
				driver.findElement(By.id("Let's go button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Choose Your Card To Activate Page$")
	public void Choose_Your_Card_To_Activate_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Choose Your Card To Activate Page<br>");

			try {
			driver.findElement(By.id("Let's go button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Pick Your Pin Page$")
	public void Pick_Your_Pin_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
	
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Pick Your Pin Page<br>");

			try {

				driver.findElement(By.id("Let's go button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Review And Confirm Page$")
	public void Review_And_Confirm_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Review And Confirm Page<br>");

			try {
				driver.findElement(By.id("Confirm button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Enter Your OTP Page$")
	public void Enter_Your_OTP_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Enter Your OTP Page<br>");

			try {

				driver.findElement(By.id("Confirm button")).click();
				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

	@Given("^Thank You Page$")
	public void Thank_You_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			sleep(1000);
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Thank You Page<br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("Finish")));

				Runner.status = true;

			} catch (Exception e) {
				e.printStackTrace();
				Runner.status = false;
				sErrorLog = e.toString();

			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, "Step Fail :" + sErrorLog);
			}
		}

	}

}