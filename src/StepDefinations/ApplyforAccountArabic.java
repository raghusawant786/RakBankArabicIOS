package StepDefinations;

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

import StepRunner.Runner;
import cucumber.api.java.en.Given;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class ApplyforAccountArabic extends BaseClass {
	public static IOSDriver<MobileElement> driver;
	public static String sErrorLog;
	public static String MobileNumber;


	@Given("^Close App$")
	public void CloseApp() throws Throwable {
		try {
			sleep(10000);
			BaseClass.driver.closeApp();
			// BaseClass.driver.close(

			BaseClass.driver.quit();
		} catch (Exception e) {
			System.out.println("Close app failed");

		}
	}

	@Given("^Arabic Application is on landing Islamic Saving Self Employed page$")
	public void application_is_on_landing_saving_salaride_page() throws Throwable {
		System.out.println("application_is_on_landing_saving_salaride_page");

		Runner.status = false;
		Framework.test = Framework.extent.createTest(
				"Test case ID:" + Runner.sTestcase + "<br>" + "Test case Description:Application landing page" + "<br>"
						+ "Expected Result:Application launch successfully" + "</br>");
		Framework.test.assignCategory(Framework.Category);
		Framework.WriteExtentReport = Framework.test.createNode("Navigate to Application landing page <br>");

		BaseClass.setup();
		driver = BaseClass.driver;

		

		try {
			Thread.sleep(5000);
			((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
					.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy
							.xpath("//XCUIElementTypeOther[@name='Get a new account in minutes Apply now']"))))
					.isDisplayed();
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Get a new account in minutes Apply now']"))
					.click();

			Runner.status = true;

		} catch (Exception e) {
			Runner.status = false;
			e.printStackTrace();
		}

		// boolean status=driver.findElement(By.id("English language")).isDisplayed();

		if (Runner.status == true) {
			Framework.CreateResults(true, "Step Pass");
		} else {
			Framework.CreateResults(false, sErrorLog);
		}
	}

	@Given("^Arabic application is on landing Islamic Saving Self Employed page$")
	public void Application_is_on_landing_saving_salaride_page() throws Throwable {
		System.out.println("application is on landing Islamic Saving Self Employed page");
		BaseClass.setup();
		driver = BaseClass.driver;

		Runner.status = false;
		// Framework.test=Framework.extent.createTest("Test case
		// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
		// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
		// Framework.test.assignCategory(Framework.Category);
		Framework.WriteExtentReport = Framework.test.createNode("Navigate to Application landing page <br>");

		try {
			// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
			// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK")))).isDisplayed();
			// driver.findElement(By.id("OK")).click();

			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 10L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("OK"))))
						.isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("OK"))).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Ok button not displayed");

			}

			((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
					.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy
							.xpath("//XCUIElementTypeOther[@name='Get a new account in minutes Apply now']"))))
					.isDisplayed();
			driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Get a new account in minutes Apply now']"))
					.click();

			Runner.status = true;

		} catch (Exception e) {
			Runner.status = false;
			e.printStackTrace();

		}

		// boolean status=driver.findElement(By.id("English language")).isDisplayed();

		if (Runner.status == true) {
			Framework.CreateResults(true, "Step Pass");
		} else {
			Framework.CreateResults(false, sErrorLog);
		}
	}

	@Given("^Arabic Preferred Language Islamic Saving Self Employed Page$")
	public void preferred_language_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {
			System.out.println("Preferred Language Islamic Saving Self Employed Page");

			Runner.status = false;
			sleep(1000);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Preferred Language page <br>");
			// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
			// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Next")))).isDisplayed();

			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("English language")))).isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لغة عربية"))).click();
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			sleep(1000);
			driver.findElement(By.id("Let's go")).click();

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Select a Product Islamic Saving Self Employed Page$")
	public void select_a_product_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("select_a_product_saving_salaride_page");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Select a Product page <br>");
			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
								"(//XCUIElementTypeOther[@name=\"Manage your money Open a Bank account\"])[2]"))))
						.isDisplayed();
				driver.findElement(
						By.xpath("(//XCUIElementTypeOther[@name=\"Manage your money Open a Bank account\"])[2]"))
						.click();
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Rak Bank Mission Islamic Saving Self Employed Page$")
	public void rak_bank_mission_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("rak_bank_mission_saving_salaride_page");

			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Rak Bank Mission page <br>");
			try {
				sleep(1000);
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("التالي button"))))
						.isDisplayed();
				driver.findElement(By.id("التالي button")).click();
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Enter Mobile Number Islamic Saving Self Employed Page$")
	public void enter_mobile_number_saving_salaride_page() throws Throwable {

		
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			System.out.println("enter_mobile_number_saving_salaride_page");
			String sTestCaseid = "";

		
			int min = 1035650;
			int max = 1999999;
			System.out.println("Random value of type double between " + min + " to " + max + ":");
			double a = Math.random() * (max - min + 1) + min;
			MobileNumber = "55" + String.valueOf(Math.round(a));
			System.out.println("MobileNumber================>>" + MobileNumber);

			WirteMobileNumber(MobileNumber);

			// String SPath = "";

			// String sTestCaseid = sTestCaseidval;

			// String mobilenumber = getColumnNumber(SPath,"mobilenumber", sMobileNumber);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Enter Mobile Number page <br>");
			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field")))).isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("undefined field")))
						.sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
				// driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("أرسل رمز التحقق")))).isDisplayed();
				driver.findElement(By.id("أرسل رمز التحقق")).click();
				Runner.status = true;
			} catch (Exception e) {

				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Enter Mobile Number Come Back Employed Page$")
	public void enter_number_saving_salaride_page() throws Throwable {

		
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			System.out.println("enter_number_saving_salaride_page");
			String sTestCaseid = "";

		
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Enter Mobile Number page <br>");
			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field")))).isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("undefined field")))
						.sendKeys(new CharSequence[] { MobileNumber + Keys.ENTER });
				// driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("أرسل رمز التحقق")))).isDisplayed();
				driver.findElement(By.id("أرسل رمز التحقق")).click();
				Runner.status = true;
			} catch (Exception e) {

				Runner.status = false;

				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic OTP enter Islamic Saving Self Employed Page$")
	public void otp_enter_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			System.out.println("otp_enter_saving_salaride_page");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to OTP enter page <br>");

			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 60);
				sleep(15000);

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(
						By.xpath("//XCUIElementTypeSecureTextField[@name=\"رمز التحقق field\"]")));

				driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"رمز التحقق field\"]")).click();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("رمز التحقق field")))
						.sendKeys(new CharSequence[] { "123456" + Keys.ENTER });
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Verification
				// Code field")))).isDisplayed();
				// ((MobileElement)driver.findElement(MobileBy.xpath("//XCUIElementTypeSecureTextField[@name=\"Verification
				// Code field\"]"))).sendKeys(new CharSequence[] { "123456" + Keys.ENTER });

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();

			}
			/*
			 * { JFrame parent =new JFrame(); JLabel lab = new
			 * JLabel("Enter Otp and click on OK",0); JOptionPane pane = new
			 * JOptionPane(lab); JDialog dialog =pane.createDialog(parent,"Message");
			 * dialog.setSize(600,400); dialog.setAlwaysOnTop(true); dialog.show();
			 * dialog.toFront(); dialog.setFocusable(true); }
			 */
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Simple page$")
	public void Simple_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Come Back Joureny Page <br>");
			System.out.println("Navigate to Come Back Joureny Page");

			try {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);

				// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Yes,
				// let’s continue button")));
				// driver.findElement(By.id("Yes, let’s continue button")).click();

				// accounts
				wait.until(
						(Function) ExpectedConditions.presenceOfElementLocated(By.id("نعم، لنواصل button")));
				driver.findElement(By.id("نعم، لنواصل button")).click();
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}
			/*
			 * { JFrame parent =new JFrame(); JLabel lab = new
			 * JLabel("Enter Otp and click on OK",0); JOptionPane pane = new
			 * JOptionPane(lab); JDialog dialog =pane.createDialog(parent,"Message");
			 * dialog.setSize(600,400); dialog.setAlwaysOnTop(true); dialog.show();
			 * dialog.toFront(); dialog.setFocusable(true); }
			 */
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	// FindImagForSikuli.ClickOnElement(sImagePath+"Simply Resume.png",0.8D);

	@Given("^Arabic Select a Product you prefer Islamic Saving Self Employed Page$")
	public void select_a_product_youd_prefer_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("Select a Product you prefer page");
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String SelectProducts = getColumnNumber(Spath, "SelectProducts", sTestCaseid);
			System.out.println("Navigate to Select a Product you prefer page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Select a Product you
			// prefer Page"+"<br>"+"Expected Result:Select a Product you prefer Page launch
			// successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Select a Product you prefer page <br>");
			try {
				if (SelectProducts.equals("Rakislamic")) {
					System.out.println("Rakislamic product");
					((WebElement) (new WebDriverWait((WebDriver) driver, 60L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
									"(//XCUIElementTypeOther[@name=\"نظام مصرفي متوافق مع أحكام الشريعة الإسلامية\"])[2]"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.xpath(
							"(//XCUIElementTypeOther[@name=\"نظام مصرفي متوافق مع أحكام الشريعة الإسلامية\"])[2]")))
							.click();

				} else {
					System.out.println("Rakbank conv product");
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نظام مصرفي تقليدي\"])[2]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نظام مصرفي تقليدي\"])[2]")))
							.click();
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}
	}

	@Given("^Arabic Pick an Account Islamic Saving Self Employed Page$")
	public void pick_an_account_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			System.out.println("Pick an Account Islamic Saving Self Employed Page");
			
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Pick an Account page <br>");
			try {

				String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
				String sTestCaseid = "";
				String AccountType = getColumnNumber(Spath, "AccountType", sTestCaseid);
				
				if (AccountType.equals("Savings")) {

					sleep(3000);
					System.out.println("Savings acccount selected");
					
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[contains(@name,\"حساب التوفير\")])[last()]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[contains(@name,\"حساب التوفير\")])[last()]")))
							.click();

				} else {
					sleep(3000);
					System.out.println("Current acccount selected");
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[contains(@name,\"حساب جاري\")])[last()]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[contains(@name,\"حساب جاري\")])[last()]")))
							.click();

				}
				// Savings Account Debit Card with 24/7global access via MasterCard ATMs Monthly
				// quarterly or bi-annual statements Transfer funds between accounts easily and
				// securely Open a Savings Account
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Account Option Islamic Saving Self Employed Page$")
	public void account_option_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Account Option page <br>");
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String AccountType = getColumnNumber(Spath, "AccountType", sTestCaseid);
			String PurposeofAccount = getColumnNumber(Spath, "PurposeofAccount", sTestCaseid);
			String Others = getColumnNumber(Spath, "Others", sTestCaseid);
			String DoYouRequireaChequeBook = getColumnNumber(Spath, "DoYouRequireaChequeBook", sTestCaseid);
			String DoYouWantDebitCard = getColumnNumber(Spath, "DoYouWantDebitCard", sTestCaseid);
			String DoesTheFollowingApplyToYou = getColumnNumber(Spath, "DoesTheFollowingApplyToYou", sTestCaseid);
			
			System.out.println("Account Option page");
			
			// String sheetName = "Registration";

			// String PurposeofAccount = reader.getCellData(sheetName, 2, 2);
			// String DoYouRequireaChequeBook = reader.getCellData(sheetName, 3, 2);
			// String DoYouWantDebitCard = reader.getCellData(sheetName, 4, 2);

			try {
				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("غرض الحساب value")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("غرض الحساب value"))).click();
				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId(PurposeofAccount)))).isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId(PurposeofAccount))).click();

				if (PurposeofAccount.equals("Others (please specify) option")) {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("آحرون field")))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("آحرون field")))
							.sendKeys(new CharSequence[] { Others + Keys.ENTER });

				}

				if (AccountType.equals("Current")) {
					if (DoYouRequireaChequeBook.equals("Yes")) {

						System.out.println("DoYouRequireaChequeBook yes");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]")))
								.click();
					} else {
						System.out.println("DoYouRequireaChequeBook no");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]")))
								.click();

					}

					if (DoYouWantDebitCard.equals("Yes")) {
						System.out.println("DoYouWantDebitCard yes");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[4]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[4]")))
								.click();
						
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.AccessibilityId ("ادخل الاسم الذي تريده على بطاقتك field"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("ادخل الاسم الذي تريده على بطاقتك field")))
								.sendKeys(new CharSequence[] { "TestCardName" + Keys.ENTER });
						
						
					} else {

						System.out.println("DoYouWantDebitCard no");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]")))
								.click();
					}

					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[6]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[6]"))).click();

				} else {

					if (DoYouWantDebitCard.equals("Yes")) {
						System.out.println("DoYouWantDebitCard yes");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]")))
								.click();
						
						
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.AccessibilityId ("ادخل الاسم الذي تريده على بطاقتك field"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("ادخل الاسم الذي تريده على بطاقتك field")))
								.sendKeys(new CharSequence[] { "TestCardName" + Keys.ENTER });
						
					} else {

						System.out.println("DoYouWantDebitCard no");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]")))
								.click();
					}

					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]"))).click();

				}

				BaseClass.swipe("up", "لنواصل button");

				((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(
								MobileBy.xpath("(//XCUIElementTypeOther[@name=\"انقر للفتح والقراءة\"])[1]"))))
						.isDisplayed();

				((MobileElement) driver
						.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"انقر للفتح والقراءة\"])[1]")))
						.click();

				sleep(2000);
				new TouchAction(driver).press(PointOption.point(194, 612))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
						.moveTo(PointOption.point(185, 142)).release().perform();

				new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("أوافق على ما قرأته")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("أوافق على ما قرأته"))).click();

				new WebDriverWait((WebDriver) driver, 30L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("التالي button")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("التالي button"))).click();

				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// WebDriverWait wait = new WebDriverWait(driver, 30);

				try {
					if (((WebElement) new WebDriverWait((WebDriver) driver, 10L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("أنا متأكد button")))).isDisplayed()) {

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("أنا متأكد button"))).click();

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
				//	e.printStackTrace();
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic PDF  Islamic Saving Self Employed Page$")
	public void pdf_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {
			Runner.status = false;
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to PDF page <br>");
			try {
				System.out.println("pdf_saving_salaride_page");
				sleep(3000);
				
				for(int i =0; i < 2; i++)
				new TouchAction(driver).press(PointOption.point(190, 621))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
						.moveTo(PointOption.point(190, 254)).release().perform();

				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until(
						(Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("أوافق"))))
						.isDisplayed();
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("أوافق"))).click();
				sleep(2000);

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Email Address Islamic Saving Self Employed Page$")
	public void email_address_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String EmailAddress = getColumnNumber(Spath, "EmailAddress", sTestCaseid);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			System.out.println("email_address_saving_salaride_page");
			
			// String sheetName = "Registration";

			// String EmailAddress = reader.getCellData(sheetName, 5, 2);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Email Address page <br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("عنوان بريد الكتروني")));
				// ((WebElement)new WebDriverWait((WebDriver)driver,
				// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Email
				// Address")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("عنوان بريد الكتروني")))
						.sendKeys(new CharSequence[] { EmailAddress + Keys.ENTER });

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("أرسل button")));
				// ((WebElement)new WebDriverWait((WebDriver)driver,
				// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send
				// document")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("أرسل button"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Scan Emirates ID and Passport Page$")
	public void saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			System.out.println("Scan Emirates ID and Passport Page");
			// String sheetName = "Registration";

			// String EmailAddress = reader.getCellData(sheetName, 5, 2);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Scan Emirates ID and Passport Page <br>");

			try {

				wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("يرجى مسح أصل كل من")));

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Come Back Joureny Page$")
	public void Come_Back_Joureny_Page() throws Throwable {

		sleep(30000);
		BaseClass.driver.closeApp();
		System.out.println("Come_Back_Joureny_Page");
		
		BaseClass.setup();
		driver = BaseClass.driver;
		String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		String sTestCaseid = "";
		String SelectProducts = getColumnNumber(Spath, "SelectProducts", sTestCaseid);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
				.presenceOfElementLocated(MobileBy.AccessibilityId("New Customer button")))).isDisplayed();
		driver.findElement(By.id("New Customer button")).click();
		((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until(
				(Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("English language"))))
				.isDisplayed();
		((MobileElement) driver.findElement(MobileBy.AccessibilityId("English language"))).click();
		sleep(1000);
		driver.findElement(By.id("Next")).click();

		((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
				.presenceOfElementLocated(MobileBy.name("Money management Open a Bank account")))).isDisplayed();
		driver.findElement(By.name("Money management Open a Bank account")).click();

		((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until(
				(Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("RAKBANK Mission"))))
				.isDisplayed();
		((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
				.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Next"))))
				.isDisplayed();
		driver.findElement(By.id("Next")).click();
		((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until(
				(Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("undefined field"))))
				.isDisplayed();
		((MobileElement) driver.findElement(MobileBy.AccessibilityId("undefined field")))
				.sendKeys(new CharSequence[] { "55888786" + Keys.ENTER });
		// driver.findElement(By.id("undefined field")).sendKeys(MobileNumber);
		((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
				.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Send OTP"))))
				.isDisplayed();
		driver.findElement(By.id("Send OTP")).click();

		wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("Verification Code field")));
		// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
		// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Verification
		// Code field")))).isDisplayed();
		((MobileElement) driver.findElement(MobileBy.AccessibilityId("Verification Code field")))
				.sendKeys(new CharSequence[] { "123456" + Keys.ENTER });

		wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id("Simply Resume button")));
		driver.findElement(By.id("Simply Resume button")).click();

		Runner.status = true;

	}

	@Given("^Arabic Review your personal details Islamic Saving Self Employed Page$")
	public void review_your_personal_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String Mothermaidenname = getColumnNumber(Spath, "Mothermaidenname", sTestCaseid);
			String Countryofbirth = getColumnNumber(Spath, "Countryofbirth", sTestCaseid);
			String DoYouHaveDualNationality = getColumnNumber(Spath, "DoYouHaveDualNationality", sTestCaseid);
			String DualNationalityCountry = getColumnNumber(Spath, "DualNationalityCountry", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("review_your_personal_details_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Review your personal details page <br>");

			try {
				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("إسم الأم field"))))
						.isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("إسم الأم field")))
						.sendKeys(new CharSequence[] { Mothermaidenname + Keys.ENTER });
				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("بلد المنشأ value")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("بلد المنشأ value"))).click();

				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				for (int iCount = 1; iCount <= 100; iCount++) {
					try {

						((MobileElement) driver.findElement(MobileBy.AccessibilityId(Countryofbirth))).click();
						break;
					} catch (Exception e) {

						BaseClass.swipe("up", Countryofbirth);

					}

				}

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				if (DoYouHaveDualNationality.equals("Yes")) {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))).click();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("يختار... value"))).click();

					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {

							((MobileElement) driver.findElement(MobileBy.AccessibilityId(DualNationalityCountry)))
									.click();
							break;
						} catch (Exception e) {

							BaseClass.swipe("up", DualNationalityCountry);

						}

					}

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				} else {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))).click();

				}

				if (AreYouPoliticallyExposedPerson.equals("Yes")) {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[4]"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[4]"))).click();
				} else {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]"))).click();

				}

				sleep(1000);
				new TouchAction(driver).press(PointOption.point(194, 612))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500L)))
						.moveTo(PointOption.point(185, 142)).release().perform();

				((WebElement) new WebDriverWait((WebDriver) driver, 90L)
						.until((Function) ExpectedConditions.presenceOfElementLocated(
								MobileBy.xpath("//XCUIElementTypeOther[@name=\"لنواصل button\"]"))))
						.isDisplayed();

				((MobileElement) driver
						.findElement(MobileBy.xpath("//XCUIElementTypeOther[@name=\"لنواصل button\"]"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic About your PEP Status Islamic Saving Self Employed Page$")
	public void about_your_pep_status_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YouareaPEPby = getColumnNumber(Spath, "YouareaPEPby", sTestCaseid);
			String PoliticalDesignation = getColumnNumber(Spath, "PoliticalDesignation", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("about_your_pep_status_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to About your PEP Status page <br>");
			try {
				if (AreYouPoliticallyExposedPerson.equals("Yes")) {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId(YouareaPEPby)))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId(YouareaPEPby))).click();
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("منصبك السابق field"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("منصبك السابق field")))
							.sendKeys(new CharSequence[] { PoliticalDesignation + Keys.ENTER });
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				e.printStackTrace();
				sErrorLog = e.toString();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic PEP Status by association Islamic Saving Self Employed Page$")
	public void pep_status_by_association_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;

			// Xls_Reader reader = new
			// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourRelationship = getColumnNumber(Spath, "YourRelationship", sTestCaseid);
			String NameOfThePEP = getColumnNumber(Spath, "NameOfThePEP", sTestCaseid);
			String CountryWhereThePEPHoldsTheStatus = getColumnNumber(Spath, "CountryWhereThePEPHoldsTheStatus",
					sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			String YouareaPEPby = getColumnNumber(Spath, "YouareaPEPby", sTestCaseid);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to PEP Status by association page <br>");
			System.out.println("pep_status_by_association_saving_salaride_page");
			
			try {
				if (AreYouPoliticallyExposedPerson.equals("Yes")) {

					if (YouareaPEPby.equals("Association radio")) {
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("صلة القرابة value"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("صلة القرابة value")))
								.click();
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId(YourRelationship)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(YourRelationship))).click();
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("اسم الشخصية السياسية field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم الشخصية السياسية field")))
								.sendKeys(new CharSequence[] { NameOfThePEP + Keys.ENTER });

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("دولة إقامة الشخصية السياسية value")));
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("دولة إقامة الشخصية السياسية value"))).click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(CountryWhereThePEPHoldsTheStatus)))
										.click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", CountryWhereThePEPHoldsTheStatus);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("لنواصل button")));

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();
					}
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status = true) {
				Framework.CreateResults(true, "Step Passed");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Your employment type Islamic Saving Self Employed Page$")
	public void your_employment_type_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your employment type
			// page"+"<br>"+"Expected Result:Your employment type"+"</br>");
			System.out.println("your_employment_type_saving_salaride_page");
			
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Your employment type page <br>");
			try {

				if (YourEmploymentType.equals("Salaried")) {

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("دوام براتب شهري")))).isDisplayed();
					System.out.println("Salaried Selected");
					try {
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("دوام براتب شهري"))).click();
					} catch (Exception e) {

					}
				} else {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("عمل خاص")))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("عمل خاص"))).click();
					System.out.println("=== Self- employed Selected ===");
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Self employed Details Islamic Saving Self Employed Page$")
	public void self_employed_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {
			System.out.println("self_employed_details_saving_salaride_page");

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			System.out.println(YourEmploymentType);
			String TotalMonthlySalarySelfEmployment = getColumnNumber(Spath, "TotalMonthlySalarySelfEmployment",
					sTestCaseid);
			System.out.println(TotalMonthlySalarySelfEmployment);
			String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,
					"NumberofCompaniesyouhavetieswithvalue", sTestCaseid);
			System.out.println("self_employed_details_saving_salaride_page");

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Self employed Details
			// page"+"<br>"+"Expected Result:Self employed Details"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Self employed Details page <br>");

			try {
				if (YourEmploymentType.equals("Self-employed")) {

					System.out.println("Self-employed type");
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("إجمالي دخلك الشهري field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("إجمالي دخلك الشهري field")))
							.sendKeys(new CharSequence[] { TotalMonthlySalarySelfEmployment + Keys.ENTER });
					sleep(1000);

					TouchAction action = new TouchAction(driver);

					action.tap(PointOption.point(190, 515)).release().perform();

					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
									"(//XCUIElementTypeOther[@name=\"ما هو عدد الشركات التي ترتبط بها؟\"])[1]"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.xpath(
							"(//XCUIElementTypeOther[@name=\"ما هو عدد الشركات التي ترتبط بها؟\"])[1]")))
							.click();
					sleep(1000);

					if (NumberofCompaniesyouhavetieswithvalue.equals("1")) {
						System.out.println("111111111");

						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("//XCUIElementTypePickerWheel[@value=\"One\"]"))))
								.isDisplayed();

						sleep(1000);

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Done link"))).click();

					}

					if (NumberofCompaniesyouhavetieswithvalue.equals("2")) {
						System.out.println("22222222");
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
					}

					if (NumberofCompaniesyouhavetieswithvalue.equals("3")) {
						System.out.println("333333");
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
					}

					if (NumberofCompaniesyouhavetieswithvalue.equals("4")) {
						System.out.println("4444444");
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(197, 769))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(193, 717)).release().perform();
						sleep(1000);

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("Done link"))).click();
					}

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}

	}

	@Given("^Arabic First Company Details Islamic Saving Self Employed Page$")
	public void first_company_details_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String CompanyName1 = getColumnNumber(Spath, "CompanyName1", sTestCaseid);
			String OtherCompanyName1 = getColumnNumber(Spath, "OtherCompanyName1", sTestCaseid);
			String Designation1 = getColumnNumber(Spath, "Designation1", sTestCaseid);
			String IndustryCategoryValue1 = getColumnNumber(Spath, "IndustryCategoryValue1", sTestCaseid);
			String IndustryValue1 = getColumnNumber(Spath, "IndustryValue1", sTestCaseid);
			String ShareholdingPercentage1 = getColumnNumber(Spath, "ShareholdingPercentage1", sTestCaseid);
			String ListCountrywithWhichBusinessConducted1 = getColumnNumber(Spath,
					"ListCountrywithWhichBusinessConducted1", sTestCaseid);
			String CountryOfIncorporationValue1 = getColumnNumber(Spath, "CountryOfIncorporationValue1", sTestCaseid);
			String AnnualTurnover1 = getColumnNumber(Spath, "AnnualTurnover1", sTestCaseid);
			String AnnualProfit1 = getColumnNumber(Spath, "AnnualProfit1", sTestCaseid);

			System.out.println("first_company_details_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:First Company Details
			// page"+"<br>"+"Expected Result:First Company Details"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to First Company Details page <br>");
			try {
				if (YourEmploymentType.equals("Self-employed")) {
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("اسم الشركة field")))).isDisplayed();
					if (CompanyName1.equals("OTHERS")) {
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName1)))).isDisplayed();
						// new WebDriverWait((WebDriver)driver,
						// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName1))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("رجاء حدد field"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("رجاء حدد field")))
								.sendKeys(new CharSequence[] { OtherCompanyName1 + Keys.ENTER });

					} else {
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم الشركة field")))
								.sendKeys(new CharSequence[] { CompanyName1 + Keys.ENTER });
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName1)))).isDisplayed();
						sleep(2000);
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName1))).click();
					}

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("المنصب field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
							.sendKeys(new CharSequence[] { Designation1 + Keys.ENTER });

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("مجال عملك value")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("مجال عملك value"))).click();

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue1)))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue1))).click();
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("القطاع value")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("القطاع value"))).click();

					System.out.println(IndustryValue1);

					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {

							((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryValue1))).click();
							break;
						} catch (Exception e) {

							BaseClass.swipe("up", IndustryValue1);

						}

					}

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					// BaseClass.swipe("up", IndustryValue1);
					// ((WebElement)new WebDriverWait((WebDriver)driver,
					// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue1+"\"])[2]")))).isDisplayed();
					// ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue1+"\"])[2]"))).click();

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("الحصة التي تمتلكها field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("الحصة التي تمتلكها field")))
							.sendKeys(new CharSequence[] { ShareholdingPercentage1 + Keys.ENTER });
					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow"))).click();

					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {

							((MobileElement) driver
									.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted1)))
									.click();
							break;
						} catch (Exception e) {

							BaseClass.swipe("up", ListCountrywithWhichBusinessConducted1);

						}

					}

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					((WebElement) new WebDriverWait((WebDriver) driver, 90L)
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))))
							.isDisplayed();
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))
							.click();

					BaseClass.swipe("up", "لنواصل button");

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("دولة تأسيس الشركة value"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("دولة تأسيس الشركة value")))
							.click();

					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {

							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue1)))
									.click();
							break;
						} catch (Exception e) {

							BaseClass.swipe("up", CountryOfIncorporationValue1);

						}

					}  

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					sleep(1000);
					new TouchAction(driver).press(PointOption.point(171, 671))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(176, 250)).release().perform();
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("سنة التأسيس value"))))
							.isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("سنة التأسيس value")))
							.click();

					sleep(1000);
					new TouchAction(driver).press(PointOption.point(198, 770))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
							.moveTo(PointOption.point(196, 717)).release().perform();
					new TouchAction(driver).press(PointOption.point(198, 770))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
							.moveTo(PointOption.point(196, 717)).release().perform();
					sleep(1000);
					driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Done link']")).click();

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("حجم الأعمال السنوي field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("حجم الأعمال السنوي field")))
							.sendKeys(new CharSequence[] { AnnualTurnover1 + Keys.ENTER });
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("الأرباح السنوية field")));
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("الأرباح السنوية field")))
							.sendKeys(new CharSequence[] { AnnualProfit1 + Keys.ENTER });

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				}
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Second Company Details Islamic Saving Self Employed Page$")
	public void second_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,
					"NumberofCompaniesyouhavetieswithvalue", sTestCaseid);

			int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
			String CompanyName2 = getColumnNumber(Spath, "CompanyName2", sTestCaseid);
			String OtherCompanyName2 = getColumnNumber(Spath, "CompanyName2", sTestCaseid);
			String Designation2 = getColumnNumber(Spath, "Designation2", sTestCaseid);
			String IndustryCategoryValue2 = getColumnNumber(Spath, "IndustryCategoryValue2", sTestCaseid);
			String IndustryValue2 = getColumnNumber(Spath, "IndustryValue2", sTestCaseid);
			String ShareholdingPercentage2 = getColumnNumber(Spath, "ShareholdingPercentage2", sTestCaseid);
			String ListCountrywithWhichBusinessConducted2 = getColumnNumber(Spath,
					"ListCountrywithWhichBusinessConducted2", sTestCaseid);
			String CountryOfIncorporationValue2 = getColumnNumber(Spath, "CountryOfIncorporationValue2", sTestCaseid);
			String AnnualTurnover2 = getColumnNumber(Spath, "AnnualTurnover2", sTestCaseid);
			String AnnualProfit2 = getColumnNumber(Spath, "AnnualProfit2", sTestCaseid);
			System.out.println("Second_company_details_saving_salaride_page");
	
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Second Company Details
			// page"+"<br>"+"Expected Result:Second Company Details successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Second Company Details page <br>");
			try {
				if (YourEmploymentType.equals("Self-employed")) {
					if (number >= 2) {

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("اسم الشركة field"))))
								.isDisplayed();
						if (CompanyName2.equals("OTHERS")) {
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName2)))).isDisplayed();
							// new WebDriverWait((WebDriver)driver,
							// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName2))).click();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("رجاء حدد field"))))
									.isDisplayed();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("رجاء حدد field")))
									.sendKeys(new CharSequence[] { OtherCompanyName2 + Keys.ENTER });

						} else {
							((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم الشركة field")))
									.sendKeys(new CharSequence[] { CompanyName2 + Keys.ENTER });

							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName2)))).isDisplayed();
							sleep(2000);
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName2))).click();
						}

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("المنصب field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
								.sendKeys(new CharSequence[] { Designation2 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("مجال عملك value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("مجال عملك value"))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue2))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue2))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("القطاع value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("القطاع value"))).click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryValue2))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", IndustryValue2);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						// BaseClass.swipe("up", IndustryValue2);
						// ((WebElement)new WebDriverWait((WebDriver)driver,
						// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue2)))).isDisplayed();
						// ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue2+"\"])[2]"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الحصة التي تمتلكها field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الحصة التي تمتلكها field")))
								.sendKeys(new CharSequence[] { ShareholdingPercentage2 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted2)))
										.click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", ListCountrywithWhichBusinessConducted2);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))
								.click();
						BaseClass.swipe("up", "لنواصل button");

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("دولة تأسيس الشركة value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("دولة تأسيس الشركة value")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue2))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", CountryOfIncorporationValue2);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(171, 671))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(176, 250)).release().perform();

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("سنة التأسيس value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("سنة التأسيس value")))
								.click();

						sleep(1000);
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						sleep(1000);
						TouchAction action = new TouchAction(driver);
						driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Done link']")).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("حجم الأعمال السنوي field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("حجم الأعمال السنوي field")))
								.sendKeys(new CharSequence[] { AnnualTurnover2 + Keys.ENTER });
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الأرباح السنوية field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الأرباح السنوية field")))
								.sendKeys(new CharSequence[] { AnnualProfit2 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					}
				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Third Company Details Islamic Saving Self Employed Page$")
	public void third_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,
					"NumberofCompaniesyouhavetieswithvalue", sTestCaseid);
			int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
			String CompanyName3 = getColumnNumber(Spath, "CompanyName3", sTestCaseid);
			String OtherCompanyName3 = getColumnNumber(Spath, "OtherCompanyName3", sTestCaseid);
			String Designation3 = getColumnNumber(Spath, "Designation3", sTestCaseid);
			String IndustryCategoryValue3 = getColumnNumber(Spath, "IndustryCategoryValue3", sTestCaseid);
			String IndustryValue3 = getColumnNumber(Spath, "IndustryValue3", sTestCaseid);
			String ShareholdingPercentage3 = getColumnNumber(Spath, "ShareholdingPercentage3", sTestCaseid);
			String ListCountrywithWhichBusinessConducted3 = getColumnNumber(Spath,
					"ListCountrywithWhichBusinessConducted3", sTestCaseid);
			String CountryOfIncorporationValue3 = getColumnNumber(Spath, "CountryOfIncorporationValue3", sTestCaseid);
			String AnnualTurnover3 = getColumnNumber(Spath, "AnnualTurnover3", sTestCaseid);
			String AnnualProfit3 = getColumnNumber(Spath, "AnnualProfit3", sTestCaseid);

			System.out.println("third_company_details_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Third Company Details
			// page"+"<br>"+"Expected Result:Third Company Details "+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Third Company Details page <br>");

			try {

				if (YourEmploymentType.equals("Self-employed")) {
					if (number >= 3) {
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("اسم الشركة field"))))
								.isDisplayed();
						if (CompanyName3.equals("OTHERS")) {
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("Search ...")))).isDisplayed();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName3)))).isDisplayed();
							// new WebDriverWait((WebDriver)driver,
							// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName3))).click();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("رجاء حدد field"))))
									.isDisplayed();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("رجاء حدد field")))
									.sendKeys(new CharSequence[] { OtherCompanyName3 + Keys.ENTER });

						} else {
							((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم الشركة field")))
									.sendKeys(new CharSequence[] { CompanyName3 + Keys.ENTER });

							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName3)))).isDisplayed();
							sleep(2000);
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName3))).click();
						}

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("المنصب field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
								.sendKeys(new CharSequence[] { Designation3 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("مجال عملك value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("مجال عملك value"))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue3))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue3))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("القطاع value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("القطاع value"))).click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryValue3))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", IndustryValue3);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						// BaseClass.swipe("up", IndustryValue3);
						// ((WebElement)new WebDriverWait((WebDriver)driver,
						// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue3)))).isDisplayed();
						// ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\""+IndustryValue3+"\"])[2]"))).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الحصة التي تمتلكها field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الحصة التي تمتلكها field")))
								.sendKeys(new CharSequence[] { ShareholdingPercentage3 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted3)))
										.click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", ListCountrywithWhichBusinessConducted3);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))
								.click();
						BaseClass.swipe("up", "لنواصل button");

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("دولة تأسيس الشركة value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("دولة تأسيس الشركة value")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue3))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", CountryOfIncorporationValue3);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						sleep(1000);
						new TouchAction(driver).press(PointOption.point(171, 671))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(176, 250)).release().perform();

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("سنة التأسيس value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("سنة التأسيس value")))
								.click();

						sleep(1000);
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						sleep(1000);
						driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Done link']")).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("حجم الأعمال السنوي field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("حجم الأعمال السنوي field")))
								.sendKeys(new CharSequence[] { AnnualTurnover3 + Keys.ENTER });
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الأرباح السنوية field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الأرباح السنوية field")))
								.sendKeys(new CharSequence[] { AnnualProfit3 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					}
				}
				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}

	}

	@Given("^Arabic Fourth Company Details Islamic Saving Self Employed Page$")
	public void fourth_company_details_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String NumberofCompaniesyouhavetieswithvalue = getColumnNumber(Spath,
					"NumberofCompaniesyouhavetieswithvalue", sTestCaseid);
			int number = Integer.parseInt(NumberofCompaniesyouhavetieswithvalue);
			String CompanyName4 = getColumnNumber(Spath, "CompanyName4", sTestCaseid);
			String OtherCompanyName4 = getColumnNumber(Spath, "OtherCompanyName4", sTestCaseid);
			String Designation4 = getColumnNumber(Spath, "Designation4", sTestCaseid);
			String IndustryCategoryValue4 = getColumnNumber(Spath, "IndustryCategoryValue4", sTestCaseid);
			String IndustryValue4 = getColumnNumber(Spath, "IndustryValue4", sTestCaseid);
			String ShareholdingPercentage4 = getColumnNumber(Spath, "ShareholdingPercentage4", sTestCaseid);
			String ListCountrywithWhichBusinessConducted4 = getColumnNumber(Spath,
					"ListCountrywithWhichBusinessConducted4", sTestCaseid);
			String CountryOfIncorporationValue4 = getColumnNumber(Spath, "CountryOfIncorporationValue4", sTestCaseid);
			String AnnualTurnover4 = getColumnNumber(Spath, "AnnualTurnover4", sTestCaseid);
			String AnnualProfit4 = getColumnNumber(Spath, "AnnualProfit4", sTestCaseid);
			
			System.out.println("fourth_company_details_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Fourth Company Details
			// page"+"<br>"+"Expected Result:Fourth Company Details"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Fourth Company Details page <br>");
			try {

				try {
					if (YourEmploymentType.equals("Self-employed")) {

						if (number >= 4) {
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("اسم الشركة field"))))
									.isDisplayed();
							if (CompanyName4.equals("OTHERS")) {
								((WebElement) new WebDriverWait((WebDriver) driver, 90L)
										.until((Function) ExpectedConditions
												.presenceOfElementLocated(MobileBy.AccessibilityId("Search ..."))))
										.isDisplayed();
								((WebElement) new WebDriverWait((WebDriver) driver, 90L)
										.until((Function) ExpectedConditions
												.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName4))))
										.isDisplayed();
								// new WebDriverWait((WebDriver)driver,
								// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
								((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName4))).click();
								((WebElement) new WebDriverWait((WebDriver) driver, 90L)
										.until((Function) ExpectedConditions.presenceOfElementLocated(
												MobileBy.AccessibilityId("رجاء حدد field"))))
										.isDisplayed();

								((MobileElement) driver.findElement(MobileBy.AccessibilityId("رجاء حدد field")))
										.sendKeys(new CharSequence[] { OtherCompanyName4 + Keys.ENTER });

							} else
								((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم الشركة field")))
										.sendKeys(new CharSequence[] { CompanyName4 + Keys.ENTER });

							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName4)))).isDisplayed();
							sleep(2000);
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName4))).click();
						}
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("المنصب field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
								.sendKeys(new CharSequence[] { Designation4 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("مجال عملك value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("مجال عملك value"))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryCategoryValue4))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryCategoryValue4))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("القطاع value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("القطاع value"))).click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver.findElement(MobileBy.AccessibilityId(IndustryValue4))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", IndustryValue4);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						// ((WebElement)new WebDriverWait((WebDriver)driver,
						// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(IndustryValue4)))).isDisplayed();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الحصة التي تمتلكها field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الحصة التي تمتلكها field")))
								.sendKeys(new CharSequence[] { ShareholdingPercentage4 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.AccessibilityId("الدول التي تعمل معها الشركة arrow")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(ListCountrywithWhichBusinessConducted4)))
										.click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", ListCountrywithWhichBusinessConducted4);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						((WebElement) new WebDriverWait((WebDriver) driver, 90L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Close Button\"])[2]")))
								.click();
						BaseClass.swipe("up", "Submit button");

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("دولة تأسيس الشركة value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("دولة تأسيس الشركة value")))
								.click();

						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						for (int iCount = 1; iCount <= 100; iCount++) {
							try {

								((MobileElement) driver
										.findElement(MobileBy.AccessibilityId(CountryOfIncorporationValue4))).click();
								break;
							} catch (Exception e) {

								BaseClass.swipe("up", CountryOfIncorporationValue4);

							}

						}

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						sleep(1000);
						new TouchAction(driver).press(PointOption.point(171, 671))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(176, 250)).release().perform();

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("سنة التأسيس value"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("سنة التأسيس value")))
								.click();

						sleep(1000);
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						new TouchAction(driver).press(PointOption.point(198, 770))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
								.moveTo(PointOption.point(196, 717)).release().perform();
						sleep(1000);
						driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Done link']")).click();

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("حجم الأعمال السنوي field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("حجم الأعمال السنوي field")))
								.sendKeys(new CharSequence[] { AnnualTurnover4 + Keys.ENTER });
						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("الأرباح السنوية field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("الأرباح السنوية field")))
								.sendKeys(new CharSequence[] { AnnualProfit4 + Keys.ENTER });

						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					}

				} catch (Exception e) {

				}
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Salaried Details Islamic Saving Self Employed Page$")
	public void salaried_details_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String TotalMonthlySalary = getColumnNumber(Spath, "TotalMonthlySalary", sTestCaseid);
			String CompanyName = getColumnNumber(Spath, "CompanyName", sTestCaseid);
			String CompanyNameOther = getColumnNumber(Spath, "CompanyNameOther", sTestCaseid);
			String Designation = getColumnNumber(Spath, "Designation", sTestCaseid);
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String SalariedIndustryCategoryvalue = getColumnNumber(Spath, "SalariedIndustryCategoryvalue", sTestCaseid);
			String SalariedIndustryvalue = getColumnNumber(Spath, "SalariedIndustryvalue", sTestCaseid);

			System.out.println("salaried_details_saving_salaride_page");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Salaried Details page <br>");
			try {

				try {
					if (YourEmploymentType.equals("Salaried")) {

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("إجمالي دخلك الشهري field")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("إجمالي دخلك الشهري field")))
								.sendKeys(new CharSequence[] { TotalMonthlySalary + Keys.ENTER });
						sleep(1000);

						TouchAction action = new TouchAction(driver);

						((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("ما هو اسم جهة عملك field"))))
								.isDisplayed();

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("ما هو اسم جهة عملك field"))).click();

						if (CompanyName.equals("OTHERS")) {
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId(CompanyName)))).isDisplayed();
							// new WebDriverWait((WebDriver)driver,
							// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName))).click();
							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("رجاء حدد field"))))
									.isDisplayed();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("رجاء حدد field")))
									.sendKeys(new CharSequence[] { CompanyNameOther + Keys.ENTER });

						} else {

							((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
									.presenceOfElementLocated(MobileBy.AccessibilityId("Search bar")))).isDisplayed();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("Search bar")))
									.sendKeys(new CharSequence[] { CompanyName + Keys.ENTER });
							new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
									.elementToBeClickable(MobileBy.AccessibilityId(CompanyName)));
							sleep(2000);
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(CompanyName))).click();
						}
						sleep(2000);
						BaseClass.swipe("up", "لنواصل button");
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("المنصب field")))).isDisplayed();
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
								.sendKeys(new CharSequence[] { Designation + Keys.ENTER });

						sleep(2000);

						System.out.println(SalariedIndustryCategoryvalue);

						sleep(2000);

						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("لنواصل button")));

						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					}

				} catch (Exception e) {

				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Previous Employment Details Previous Page$")
	public void Past_Employment_Details_Previous_Page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String IWasNotInEmploymentEarlier = getColumnNumber(Spath, "IWasNotInEmploymentEarlier", sTestCaseid);
			String NewToUAE = getColumnNumber(Spath, "NewToUAE", sTestCaseid);
			String PreviousEmployerName = getColumnNumber(Spath, "PreviousEmployerName", sTestCaseid);
			String PositionHeld = getColumnNumber(Spath, "PositionHeld", sTestCaseid);
			String PastEmploymentCountryValue = getColumnNumber(Spath, "PastEmploymentCountryValue", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("Previous Employment Details Previous Page");
			

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details
			// page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Previous Employment Details Previous Page<br>");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				try {

					if (YourEmploymentType.equals("Salaried")) {
						if (IWasNotInEmploymentEarlier.equals("Yes")) {
							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.id("لم تكن لدي وظيفة سابقة")));

							driver.findElement(By.id("لم تكن لدي وظيفة سابقة")).click();

							
							if(NewToUAE.equalsIgnoreCase("Yes radio"))
							driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))
									.click();
							else
								driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))
								.click();
							sleep(2000);
							BaseClass.swipe("up", "لنواصل button");

							driver.findElement(By.id("لنواصل button")).click();
						} else {

							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.id("ما هو اسم جهة عملك field")));

							driver.findElement(By.id("ما هو اسم جهة عملك field")).click();
							
							((MobileElement) driver.findElement(MobileBy.AccessibilityId("Search bar")))
									.sendKeys(new CharSequence[] { PreviousEmployerName + Keys.ENTER });
							Thread.sleep(2000);
							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.id(PreviousEmployerName)));
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(PreviousEmployerName)))
									.click();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
									.sendKeys(new CharSequence[] { PositionHeld + Keys.ENTER });
							((MobileElement) driver.findElement(MobileBy.AccessibilityId("الدولة value"))).click();
							
					//	wait.until((Function) ExpectedConditions
					//				.presenceOfElementLocated(By.id(PastEmploymentCountryValue)));
					//		((MobileElement) driver.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue)))
					//				.click();
							
							for (int iCount = 1; iCount <= 100; iCount++) {
								try {

									((MobileElement) driver
											.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue)))
											.click();
									break;
								} catch (Exception e) {

									BaseClass.swipe("up", PastEmploymentCountryValue);
								}
							}
							
							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.id("عام التحاقك value")));
							driver.findElement(By.id("عام التحاقك value")).click();
						
							sleep(1000);
							new TouchAction(driver).press(PointOption.point(198, 770))
									.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
									.moveTo(PointOption.point(196, 717)).release().perform();
							new TouchAction(driver).press(PointOption.point(198, 770))
									.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
									.moveTo(PointOption.point(196, 717)).release().perform();
							sleep(1000);
							// TouchAction action = new TouchAction(driver);
							// action.tap(PointOption.point(355, 604)).release().perform();

							driver.findElement(By.id("Done link")).click();

							if(NewToUAE.equalsIgnoreCase("Yes radio"))
								driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))
										.click();
								else
									driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))
									.click();
								sleep(2000);
								BaseClass.swipe("up", "لنواصل button");

								driver.findElement(By.id("لنواصل button")).click();

						}
					}

				}

				catch (Exception e) {
					Runner.status = false;
					sErrorLog = e.toString();
					System.out.println("Past_Employment_Details_Previous_Page not present");
				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}
	}

	@Given("^Arabic Past Employment Details Page$")
	public void Past_Employment_Details_Last_Page() throws Throwable {

		if (Runner.status == true) {
			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String PastIWasNotInEmploymentEarlier1 = getColumnNumber(Spath, "PastIWasNotInEmploymentEarlier1",
					sTestCaseid);

			String PastEmployerName = getColumnNumber(Spath, "PastEmployerName", sTestCaseid);
			String PastPositionHeld = getColumnNumber(Spath, "PastPositionHeld", sTestCaseid);
			String PastEmploymentCountryValue1 = getColumnNumber(Spath, "PastEmploymentCountryValue1", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("Past_Employment_Details_Last_Page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Salaried Details
			// page"+"<br>"+"Expected Result: Salaried Details"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Past Employment Details Page <br>");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				try {

					if (YourEmploymentType.equals("Salaried")) {
						if (PastIWasNotInEmploymentEarlier1.equals("Yes")) {
							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.xpath("//XCUIElementTypeOther[@name=\"لم تكن لدي وظيفة سابقة\"]")));

							driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"لم تكن لدي وظيفة سابقة\"]")).click();

							BaseClass.swipe("up", "لنواصل button");

							driver.findElement(By.id("لنواصل button")).click();
						} else {

							wait.until((Function) ExpectedConditions
									.presenceOfElementLocated(By.id("ما هو اسم جهة عملك field")));

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("ما هو اسم جهة عملك field")))
									.sendKeys(new CharSequence[] { PastEmployerName + Keys.ENTER });
							wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(PastEmployerName)));
							((MobileElement) driver.findElement(MobileBy.AccessibilityId(PastEmployerName))).click();

							((MobileElement) driver.findElement(MobileBy.AccessibilityId("المنصب field")))
									.sendKeys(new CharSequence[] { PastPositionHeld + Keys.ENTER });
							((MobileElement) driver.findElement(MobileBy.AccessibilityId("الدولة value"))).click();
							
					//		wait.until((Function) ExpectedConditions
					//				.presenceOfElementLocated(By.id(PastEmploymentCountryValue1)));
					//		((MobileElement) driver.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue1)))
					//				.click();
							
							
							for (int iCount = 1; iCount <= 100; iCount++) {
								try {

									((MobileElement) driver
											.findElement(MobileBy.AccessibilityId(PastEmploymentCountryValue1)))
											.click();
									break;
								} catch (Exception e) {

									BaseClass.swipe("up", PastEmploymentCountryValue1);
								}
							}
							
							
							
							
							
							driver.findElement(By.id("عام التحاقك value")).click();

							sleep(1000);
							new TouchAction(driver).press(PointOption.point(198, 770))
									.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
									.moveTo(PointOption.point(196, 717)).release().perform();
							new TouchAction(driver).press(PointOption.point(198, 770))
									.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
									.moveTo(PointOption.point(196, 717)).release().perform();
							sleep(1000);
							// TouchAction action = new TouchAction(driver);
							// action.tap(PointOption.point(355, 604)).release().perform();

							driver.findElement(By.id("Done link")).click();

							BaseClass.swipe("up", "لنواصل button");

							driver.findElement(By.id("لنواصل button")).click();

						}
					}
				}

				catch (Exception e) {

					System.out.println("Past_Employment_Details_Last_Page not present");
				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}
	}

	@Given("^Arabic Declare Your Investments Page$")
	public void Declare_Your_Investments_Page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";

			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String CryptoNFTs = getColumnNumber(Spath, "CryptoNFTs", sTestCaseid);
			String RealEstate = getColumnNumber(Spath, "RealEstate", sTestCaseid);
			String Inheritance = getColumnNumber(Spath, "Inheritance", sTestCaseid);
			String Othersource = getColumnNumber(Spath, "Othersource", sTestCaseid);
			String CryptoTotalMonthlyIncome = getColumnNumber(Spath, "CryptoTotalMonthlyIncome", sTestCaseid);
			String RealEstateTotalMonthlyIncome = getColumnNumber(Spath, "RealEstateTotalMonthlyIncome", sTestCaseid);
			String InheritanceTotalMonthlyIncome = getColumnNumber(Spath, "InheritanceTotalMonthlyIncome", sTestCaseid);
			String OtherSourceTotalMonthlyIncome = getColumnNumber(Spath, "OtherSourceTotalMonthlyIncome", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("Declare_Your_Investments_Page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income
			// page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Declare Your Investments Page <br>");

			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);

				try {

					// wait.until((Function)ExpectedConditions.presenceOfElementLocated(By.id("Declare
					// your investments title")));

					if (CryptoNFTs.equals("Yes")) {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]")).click();

						driver.findElement(
								By.xpath("(//XCUIElementTypeTextField[@name=\"إجمالي الدخل الشهري field\"])[1]"))
								.sendKeys(new CharSequence[] { CryptoTotalMonthlyIncome + Keys.ENTER });

					} else {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]")).click();

					}

					if (RealEstate.equals("Yes")) {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[4]")).click();
						driver.findElement(
								By.xpath("(//XCUIElementTypeTextField[@name=\"إجمالي الدخل الشهري field\"])[2]"))
								.sendKeys(new CharSequence[] { RealEstateTotalMonthlyIncome + Keys.ENTER });
					} else {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[4]")).click();

					}

					BaseClass.swipe("up", "لنواصل button");

					if (Inheritance.equals("Yes")) {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[6]")).click();
						driver.findElement(
								By.xpath("(//XCUIElementTypeTextField[@name=\"إجمالي الدخل الشهري field\"])[3]"))
								.sendKeys(new CharSequence[] { InheritanceTotalMonthlyIncome + Keys.ENTER });
					} else {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[6]")).click();

					}

					if (Othersource.equals("Yes")) {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[8]")).click();
						driver.findElement(By.id("رجاء حدد field"))
								.sendKeys(new CharSequence[] { "abc" + Keys.ENTER });
						sleep(1000);
						driver.findElement(
								By.xpath("(//XCUIElementTypeOther[@name='رجاء حدد field'])[8]"))
								.sendKeys(new CharSequence[] { OtherSourceTotalMonthlyIncome + Keys.ENTER });

					} else {
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[8]")).click();

					}

					BaseClass.swipe("up", "لنواصل button");

					driver.findElement(By.id("لنواصل button")).click();

				} catch (Exception e) {
					e.printStackTrace();
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				System.out.println("Declare_Your_Investments_Page not present");
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Products Services Page$")
	public void Products_Services_Page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String NewToUAE = getColumnNumber(Spath, "NewToUAE", sTestCaseid);
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			String ProductsDescription = getColumnNumber(Spath, "ProductsDescription", sTestCaseid);
			String AreYouPoliticallyExposedPerson = getColumnNumber(Spath, "AreYouPoliticallyExposedPerson",
					sTestCaseid);
			System.out.println("Products_Services_Page");
			// Framework.test=Framework.extent.createTest("Test case
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income
			// page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Products Services Page <br>");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);

				try {

					if (YourEmploymentType.equals("Self-employed")) {
						wait.until((Function) ExpectedConditions.presenceOfElementLocated(By.xpath(
								"//XCUIElementTypeTextView[@name=\"يرجى توضيح أنواع المنتجات أو الخدمات التي تقدمها شركتك field\"]")));

						((MobileElement) driver.findElement(MobileBy.xpath(
								"//XCUIElementTypeTextView[@name=\"يرجى توضيح أنواع المنتجات أو الخدمات التي تقدمها شركتك field\"]")))
								.sendKeys(new CharSequence[] { ProductsDescription + Keys.ENTER });

						sleep(2000);
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]")).click();
						sleep(2000);
						driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]")).click();

						
						driver.findElement(By.id("التالي button")).click();
					}

				}

				catch (Exception e) {
					e.printStackTrace();
				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Please verify your income Islamic Saving Self Employed Page$")
	public void please_verify_your_income_islamic_saving_self_employed_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Please verify your income
			// page"+"<br>"+"Expected Result:Please verify your income"+"</br>");
			System.out.println("Please verify your income page");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Please verify your income page <br>");
			try {
				// ((WebElement)new WebDriverWait((WebDriver)driver,
				// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Please
				// verify your income")))).isDisplayed();
				((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("لنبدأ button")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنبدأ button"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Upload your documents Salaried Page$")
	public void Upload_documents_Islamic_Saving_Salaried_Page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;

			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String FileName = getColumnNumber(Spath, "FileName", sTestCaseid);
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Upload your income documents Page <br>");
			
			
			System.out.println("Upload_documents_Islamic_Saving_Salaried_Page");
			
			try {

				if (YourEmploymentType.equals("Salaried")) {

					try {
						System.out.println("Salaried doc upload");
						((WebElement) new WebDriverWait((WebDriver) driver, 30L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
										"//XCUIElementTypeStaticText[contains(@name,'Personal bank statement')]"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy
								.xpath("//XCUIElementTypeStaticText[contains(@name,'Personal bank statement')]")))
								.click();

						new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("اختر الملفات")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اختر الملفات"))).click();

						new WebDriverWait((WebDriver) driver, 30L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();
						sleep(4000);
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

						((WebElement) new WebDriverWait((WebDriver) driver, 30L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Salary certificate\"]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Salary certificate\"]")))
								.click();
						
						new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("اختر الملفات")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اختر الملفات"))).click();


						new WebDriverWait((WebDriver) driver, 30L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();
						sleep(4000);
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					} catch (Exception e) {

						
					}		
					sleep(4000);
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Upload your documents Self Employed Page$")
	public void Upload_your_documents_Islamic_Saving_Self_Employed_Page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("Upload_your_documents_Islamic_Saving_Self_Employed_Page");
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String FileName = getColumnNumber(Spath, "FileName", sTestCaseid);
			String YourEmploymentType = getColumnNumber(Spath, "YourEmploymentType", sTestCaseid);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Upload your documents Self Employed Page <br>");
			try {

				if (YourEmploymentType.equals("Self-employed")) {
					// ((WebElement)new WebDriverWait((WebDriver)driver,
					// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload
					// your documents title")))).isDisplayed();
					try {
						((WebElement) new WebDriverWait((WebDriver) driver, 30L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(
										"//XCUIElementTypeStaticText[contains(@name,\"tatement\")]"))))
								.isDisplayed();
						((MobileElement) driver.findElement(MobileBy
								.xpath("//XCUIElementTypeStaticText[contains(@name,\"tatement\")]")))
								.click();
						
						new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("اختر الملفات")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اختر الملفات"))).click();

						new WebDriverWait((WebDriver) driver, 30L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();
						sleep(4000);
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

						((WebElement) new WebDriverWait((WebDriver) driver, 30L)
								.until((Function) ExpectedConditions.presenceOfElementLocated(
										MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]"))))
								.isDisplayed();
						((MobileElement) driver
								.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Trade License\"])[4]")))
								.click();
						
						new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
								.elementToBeClickable(MobileBy.AccessibilityId("اختر الملفات")));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("اختر الملفات"))).click();


						new WebDriverWait((WebDriver) driver, 30L).until(
								(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(FileName)));
						((MobileElement) driver.findElement(MobileBy.AccessibilityId(FileName))).click();
						((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
								.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button"))))
								.isDisplayed();
						sleep(4000);
						((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					} catch (Exception e) {

					}

					sleep(3000);
					// ((WebElement)new WebDriverWait((WebDriver)driver,
					// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Upload
					// your documents title")))).isDisplayed();
					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();
				}

				Runner.status = true;
			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Your Residential Address Islamic Saving Self Employed Page$")
	public void your_residential_address_saving_salaride_page() throws Throwable {
		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String VillaFlatNumber = getColumnNumber(Spath, "VillaFlatNumber", sTestCaseid);
			String BuildingVillaName = getColumnNumber(Spath, "BuildingVillaName", sTestCaseid);
			String StreetLocation = getColumnNumber(Spath, "StreetLocation", sTestCaseid);
			String POBox = getColumnNumber(Spath, "POBox", sTestCaseid);
			String EmirateCity = getColumnNumber(Spath, "EmirateCity", sTestCaseid);
			System.out.println("your_residential_address_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Your Residential Address
			// page"+"<br>"+"Expected Result:Your Residential Address"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Your Residential Address page <br>");

			try {
				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("رقم الشقة أو الفيلا field")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("رقم الشقة أو الفيلا field")))
						.sendKeys(new CharSequence[] { VillaFlatNumber + Keys.ENTER });
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("اسم البناية أو الفيلا field")))
						.sendKeys(new CharSequence[] { BuildingVillaName + Keys.ENTER });
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("الشارع / الموقع field")))
						.sendKeys(new CharSequence[] { StreetLocation + Keys.ENTER });
				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("الإمارة / المدينة value")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("الإمارة / المدينة value"))).click();
				new WebDriverWait((WebDriver) driver, 60L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(EmirateCity)));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId(EmirateCity))).click();
				BaseClass.swipe("up", "لنواصل button");
			
				new WebDriverWait((WebDriver) driver, 60L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("الرقم البريدي field")));
			
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("الرقم البريدي field")))
						.sendKeys(new CharSequence[] { POBox + Keys.ENTER });
	
				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("لنواصل button")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}
	}

	@Given("^Arabic Does the Following apply to you Islamic Saving Self Employed page$")
	public void does_the_following_apply_to_you_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String DoesTheFollowingApplyToYou = getColumnNumber(Spath, "DoesTheFollowingApplyToYou", sTestCaseid);
			String PayTaxInUAE = getColumnNumber(Spath, "PayTaxInUAE", sTestCaseid);
			String TaxCountry = getColumnNumber(Spath, "TaxCountry", sTestCaseid);
			String TINNumber = getColumnNumber(Spath, "TINNumber", sTestCaseid);
			String Reasonifunknown = getColumnNumber(Spath, "Reasonifunknown", sTestCaseid);
			String Pleasespecify = getColumnNumber(Spath, "Pleasespecify", sTestCaseid);
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test
					.createNode("Navigate to Does the Following apply to you page <br>");
			System.out.println("does_the_following_apply_to_you_saving_salaride_page");
			try {

				if (PayTaxInUAE.equals("Yes")) {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم radio\"])[2]"))).click();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();

					// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
					// ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Countries
					// you paid for tax during the previous calendar
					// year?\"])[1]")))).isDisplayed();
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("//XCUIElementTypeOther[@name=\"اختر الدول التي تقوم فيها بتسديد الضرائب arrow\"]"))))
							.isDisplayed();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					((MobileElement) driver.findElement(MobileBy.xpath(
							"//XCUIElementTypeOther[@name=\"اختر الدول التي تقوم فيها بتسديد الضرائب arrow\"]")))
							.click();
					Thread.sleep(2000);
					driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
					for (int iCount = 1; iCount <= 100; iCount++) {
						try {

							((MobileElement) driver.findElement(MobileBy.AccessibilityId(TaxCountry))).click();
							break;
						} catch (Exception e) {

							BaseClass.swipe("up", TaxCountry);

						}

					}

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("Close Button")))).isDisplayed();
					((MobileElement) driver.findElement(MobileBy.AccessibilityId("Close Button"))).click();

					((WebElement) new WebDriverWait((WebDriver) driver, 90L).until((Function) ExpectedConditions
							.presenceOfElementLocated(MobileBy.AccessibilityId("رقم التعريف الضريبي (إذا كان معروفاً) field"))))
							.isDisplayed();

					((MobileElement) driver.findElement(MobileBy.AccessibilityId("رقم التعريف الضريبي (إذا كان معروفاً) field")))
							.sendKeys(new CharSequence[] { TINNumber + Keys.ENTER });

					// ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Reason (if
					// unknown) value"))).click();
					// ((WebElement)new WebDriverWait((WebDriver)driver,
					// 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(Reasonifunknown)))).isDisplayed();
					// ((MobileElement)driver.findElement(MobileBy.AccessibilityId(Reasonifunknown))).click();

					/*
					 * if(Reasonifunknown.equals("REASON B UNABLE TO GET TIN option")){
					 * ((WebElement)new WebDriverWait((WebDriver)driver,
					 * 90L).until((Function)ExpectedConditions.presenceOfElementLocated(MobileBy.
					 * AccessibilityId("Please specify field")))).isDisplayed();
					 * 
					 * ((MobileElement)driver.findElement(MobileBy.
					 * AccessibilityId("Please specify field"))).sendKeys(new CharSequence[] {
					 * Pleasespecify + Keys.ENTER });
					 * 
					 * }
					 */

				} else {
					((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
							.until((Function) ExpectedConditions.presenceOfElementLocated(
									MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))))
							.isDisplayed();

					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا radio\"])[2]"))).click();

				}

				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("لنواصل button")))).isDisplayed();
				// new WebDriverWait((WebDriver)TestRak.driver,
				// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Submit
				// button")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("لنواصل button"))).click();
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Communication preferences Islamic Saving Self Employed Page$")
	public void communication_preferences_saving_salaride_page() throws Throwable {

		// Xls_Reader reader = new
		// Xls_Reader("/Users/digital2.0/Desktop/timesheet/TestData.xlsx");

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String AdvicesCommunication = getColumnNumber(Spath, "AdvicesCommunication", sTestCaseid);
			String MarketingPromotionalOffers = getColumnNumber(Spath, "MarketingPromotionalOffers", sTestCaseid);
			String MarketingPromotionalOffersOption = getColumnNumber(Spath, "MarketingPromotionalOffersOption",
					sTestCaseid);
			String ThirdPartyPlatform = getColumnNumber(Spath, "ThirdPartyPlatform", sTestCaseid);
			System.out.println("communication_preferences_saving_salaride_page");
			// String sheetName = "Registration";
			// String AdvicesCommunication = reader.getCellData(sheetName, 30, 2);
			// String MarketingPromotionalOffers = reader.getCellData(sheetName, 31, 2);
			// String MarketingPromotionalOffersOption = reader.getCellData(sheetName, 32,
			// 2);
			// String ThirdPartyPlatform = reader.getCellData(sheetName, 33, 2);

			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Communication preferences page <br>");

			try {

				if (AdvicesCommunication.equals("Yes")) {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]")));
					((MobileElement) driver.findElement(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"[object Object] radio\"])[2]"))).click();
				} else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، أُفضّل البريد radio\"])[2]")));
					((MobileElement) driver.findElement(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، أُفضّل البريد radio\"])[2]")))
							.click();

				}

				if (MarketingPromotionalOffers.equals("Yes")) {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم، أرغب radio\"])[2]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم، أرغب radio\"])[2]")))
							.click();

					new TouchAction(driver).press(PointOption.point(171, 671))
							.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
							.moveTo(PointOption.point(176, 250)).release().perform();

					if (MarketingPromotionalOffersOption.equals("Email radio")) {

						sleep(3000);
						/*
						 * TouchAction action = new TouchAction(driver); sleep(3000);
						 * action.tap(PointOption.point(98, 756)).release().perform();
						 */

						((MobileElement) driver.findElement(MobileBy.id("البريد الإلكتروني"))).click();

						// ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Email
						// radio\"])[4]"))).click();
					}
					if (MarketingPromotionalOffersOption.equals("Phone Call radio")) {
						/*
						 * TouchAction action = new TouchAction(driver); sleep(3000);
						 * action.tap(PointOption.point(93, 814)).release().perform();
						 */
						sleep(3000);
						((MobileElement) driver.findElement(MobileBy.id("اتصال هاتفي"))).click();
						// ((MobileElement)driver.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Phone
						// Call radio\"])[2]"))).click();
					}

					if (MarketingPromotionalOffersOption.equals("SMS radio")) {

						/*
						 * TouchAction action = new TouchAction(driver); sleep(3000);
						 * action.tap(PointOption.point(102, 700)).release().perform();
						 */
						sleep(3000);
						((MobileElement) driver.findElement(MobileBy.id("الرسائل النصية"))).click();
					}

					// ((MobileElement)driver.findElement(MobileBy.AccessibilityId(MarketingPromotionalOffersOption))).click();

				} else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، شكراً radio\"])[2]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، شكراً radio\"])[2]")))
							.click();

				}

				/*
				 * sleep(2000); new TouchAction(driver).press(PointOption.point(174,
				 * 612)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				 * .moveTo(PointOption.point(191, 193)).release().perform();
				 */

				new TouchAction(driver).press(PointOption.point(171, 671))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
						.moveTo(PointOption.point(176, 250)).release().perform();

				if (ThirdPartyPlatform.equals("Yes")) {

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم، أرغب radio\"])[4]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"نعم، أرغب radio\"])[4]")))
							.click();
				}

				else {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions.elementToBeClickable(
							MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، شكراً radio\"])[4]")));
					((MobileElement) driver
							.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"لا، شكراً radio\"])[4]")))
							.click();
				}

				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"لنواصل\"]")));
				((MobileElement) driver
						.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"لنواصل\"]"))).click();

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Terms Conditions Islamic Saving Self Employed Page$")
	public void terms_conditions_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("terms_conditions_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Application landing
			// page"+"<br>"+"Expected Result:Application launch successfully"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Terms Conditions page <br>");
			try {
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L))
						.until((Function) ExpectedConditions.presenceOfElementLocated(
								MobileBy.xpath("(//XCUIElementTypeOther[@name=\"انقر للفتح والقراءة\"])[2]"))))
						.isDisplayed();
				// new WebDriverWait((WebDriver)driver,
				// 60L).until((Function)ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"Tap
				// to open and read\"])[2]")));

				((MobileElement) driver
						.findElement(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"انقر للفتح والقراءة\"])[2]")))
						.click();
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}
			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Consents Declarations Islamic Saving Self Employed Page$")
	public void consents_declarations_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			String Spath = "/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
			String sTestCaseid = "";
			String SelectProducts = getColumnNumber(Spath, "SelectProducts", sTestCaseid);
			sleep(2000);
			System.out.println("consents_declarations_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Consents Declarations
			// page"+"<br>"+"Expected Result:Consents Declarations "+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Consents Declarationsg page <br>");

			try {

				if (SelectProducts.equals("Rakislamic")) {
					for (int i = 0; i <= 5; i++) {

						new TouchAction(driver).press(PointOption.point(194, 612))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(185, 142)).release().perform();

					}
				} else {
					for (int i = 0; i <= 8; i++) {

						new TouchAction(driver).press(PointOption.point(194, 612))
								.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100L)))
								.moveTo(PointOption.point(185, 142)).release().perform();
					}

				}

				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("أوافق على ما قرأته")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("أوافق على ما قرأته"))).click();

				new WebDriverWait((WebDriver) driver, 60L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("التالي button")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("التالي button"))).click();
				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}

		}

	}

	@Given("^Arabic Will be in touch Islamic Saving Self Employed Page$")
	public void will_be_in_touch_saving_salaride_page() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			System.out.println("will_be_in_touch_saving_salaride_page");
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Will be in touch
			// page"+"<br>"+"Expected Result:Will be in touch"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Will be in touch page <br>");
			try {

				WebDriverWait wait = new WebDriverWait(driver, 60);
				((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function) ExpectedConditions
						.presenceOfElementLocated(MobileBy.AccessibilityId("انقر للفتح والقراءة")))).isDisplayed();

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("انقر للفتح والقراءة"))).click();

				new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
						.elementToBeClickable(MobileBy.AccessibilityId("أوافق على ما قرأته")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("أوافق على ما قرأته"))).click();

				new WebDriverWait((WebDriver) driver, 60L).until(
						(Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("التالي button")));

				((MobileElement) driver.findElement(MobileBy.AccessibilityId("التالي button"))).click();

				new WebDriverWait((WebDriver) driver, 30L)
						.until((Function) ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("تقديم")));
				((MobileElement) driver.findElement(MobileBy.AccessibilityId("تقديم"))).click();

				try {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("اغلاق button")));
					driver.findElement(By.id("اغلاق button")).click();
				} catch (Exception e) {

		

					new WebDriverWait((WebDriver) driver, 30L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));


					try {
						String AccountNo = driver.findElement(By.xpath(
								"(//XCUIElementTypeStaticText[@name=\"Your account is all set\"]/following-sibling::XCUIElementTypeOther)[2]"))
								.getText();

						// Account No: 8392970185901

						System.out.println("AccountNo" + AccountNo);

						WirteAccountNo(AccountNo);
					} catch (Exception e1) {

				

						String AccountNo = driver.findElement(By.xpath(
								"(//XCUIElementTypeStaticText[@name=\"Your account is all set\"]/following-sibling::XCUIElementTypeOther)"))
								.getText();
						System.out.println("AccountNo" + AccountNo);
						WirteAccountNo(AccountNo);
					}

				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

	@Given("^Arabic Will be in touch Islamic Saving Page$")
	public void will_be_in_touch_saving_salaride_page1() throws Throwable {

		if (Runner.status == true) {

			Runner.status = false;
			// Framework.test=Framework.extent.createTest("Test case
			// ID:"+Runner.sTestcase+"<br>"+"Test case Description:Will be in touch
			// page"+"<br>"+"Expected Result:Will be in touch"+"</br>");
			Framework.WriteExtentReport = Framework.test.createNode("Navigate to Will be in touch page <br>");
			try {

				WebDriverWait wait = new WebDriverWait(driver, 30);

				// Welcome to your
				// new account!
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Thanks!
				// we")))).isDisplayed();
				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("have
				// your application")))).isDisplayed();

				// ((MobileElement)driver.findElement(MobileBy.AccessibilityId("Continue"))).click();

				// ((WebElement) (new WebDriverWait((WebDriver) driver, 90L)).until((Function)
				// ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Close
				// button")))).isDisplayed();

				try {
					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("اغلاق button")));
					driver.findElement(By.id("اغلاق button")).click();

				} catch (Exception e) {

					new WebDriverWait((WebDriver) driver, 60L).until((Function) ExpectedConditions
							.elementToBeClickable(MobileBy.AccessibilityId("Keep going button")));
					driver.findElement(By.id("Keep going button")).click();

				}

				Runner.status = true;

			} catch (Exception e) {
				Runner.status = false;
				sErrorLog = e.toString();
				e.printStackTrace();
			}

			if (Runner.status == true) {
				Framework.CreateResults(true, "Step Pass");
			} else {
				Framework.CreateResults(false, sErrorLog);
			}
		}

	}

}
