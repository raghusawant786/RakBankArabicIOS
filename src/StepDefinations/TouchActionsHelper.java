package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TouchActionsHelper {
	public void swipe(AppiumDriver appiumDriver, int startx, int starty, int endx, int endy, Duration duration) {
		TouchAction touchAction = new TouchAction(appiumDriver);
		System.out.println(String.valueOf(startx) + " " + starty);
		System.out.println("Entering swipe");

		System.out.println("Swipe from " + startx + " " + starty + "to" + endx + " " + endy);

		touchAction.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(duration)).moveTo(PointOption.point(endx, endy))
				.release().perform();
	}

	public void tap(AppiumDriver appiumDriver, int x, int y) {
		TouchAction Action = new TouchAction(appiumDriver);
		Action.tap(PointOption.point(x, y)).release().perform();
	}

	public void longClick(AppiumDriver appiumDriver, String element) {
		WebElement webElement = appiumDriver.findElement(By.xpath(element));

		TouchAction Action = new TouchAction(appiumDriver);
		Action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(webElement))).release().perform();
	}

	public void drag(AppiumDriver appiumDriver, String element, int xOffset, int yOffset) {
		WebElement webElement = appiumDriver.findElement(By.xpath(element));
		TouchAction drag = new TouchAction(appiumDriver);

		int startX = webElement.getLocation().getX();
		int startY = webElement.getLocation().getY();

		System.out.println("startX: " + startX + " startY: " + startY);
		drag.press(PointOption.point(xOffset, yOffset)).moveTo(PointOption.point(xOffset, yOffset)).release().perform();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			//logger.error(e);
		}
	}
	

	public static void swipeVerticallyUntill_found(AppiumDriver driver, String xpath, int intervalInMillis, int retryNumber) {
		int count = 1;
		while (count <= retryNumber) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
			} catch (Exception e) {
				Dimension d = driver.manage().window().getSize();

				int x1 = (int) (d.getWidth() * 0.5D);
				int y1 = (int) (d.getHeight() * 0.8D);

				int x2 = (int) (d.getWidth() * 0.5D);
				int y2 = (int) (d.getHeight() * 0.2D);

				new TouchAction(driver).press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(x2, y2)).release().perform();

				count++;
			}
		}
	}

	public static void swipeVerticallyUntill_foundBy(AppiumDriver driver, By by, int intervalInMillis, int retryNumber) {
		int count = 1;
		while (count <= retryNumber) {
			try {
				driver.findElement(by).isDisplayed();
			} catch (Exception e) {
				Dimension d = driver.manage().window().getSize();

				int x1 = (int) (d.getWidth() * 0.5D);
				int y1 = (int) (d.getHeight() * 0.7D);

				int x2 = (int) (d.getWidth() * 0.5D);
				int y2 = (int) (d.getHeight() * 0.2D);

				new TouchAction(driver).press(PointOption.point(x1, y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(x2, y2)).release().perform();

				count++;
			}
		}
	}

	public static void swipeVerticallyUntill_foundCount(AppiumDriver driver, int retryNumber) {
		int count = 1;
		while (count <= retryNumber) {
			Dimension d = driver.manage().window().getSize();

			int x1 = (int) (d.getWidth() * 0.5D);
			int y1 = (int) (d.getHeight() * 0.7D);

			int x2 = (int) (d.getWidth() * 0.5D);
			int y2 = (int) (d.getHeight() * 0.2D);
			new TouchAction(driver).press(PointOption.point(x1, y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
					.moveTo(PointOption.point(x2, y2)).release().perform();
			count++;
		}
	}

	public static void swipeVerticallyUpLeft(AppiumDriver driver, int intervalInMillis) {
		Dimension d = driver.manage().window().getSize();

		int x1 = (int) (d.getWidth() * 0.2D);
		int y1 = (int) (d.getHeight() * 0.6D);

		int x2 = (int) (d.getWidth() * 0.2D);
		int y2 = (int) (d.getHeight() * 0.2D);

		new TouchAction(driver).press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(intervalInMillis)))
				.moveTo(PointOption.point(x2, y2)).release().perform();
	}

	public static void swipeVerticallyUpDown(AppiumDriver driver, int intervalInMillis) {
		Dimension d = driver.manage().window().getSize();

		int x1 = (int) (d.getWidth() * 0.2D);
		int y1 = (int) (d.getHeight() * 0.6D);

		int x2 = (int) (d.getWidth() * 0.2D);
		int y2 = (int) (d.getHeight() * 0.2D);

		new TouchAction(driver).press(PointOption.point(x2, y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(intervalInMillis)))
				.moveTo(PointOption.point(x1, y1)).release().perform();
	}

	public static void swipeVerticallyUntill_found(AppiumDriver driver, By by, int intervalInMillis, int retryNumber) {
		int count = 1;
		while (count <= retryNumber) {
			try {
				driver.findElement(by).isDisplayed();
			} catch (Exception e) {
				Dimension d = driver.manage().window().getSize();

				int x1 = (int) (d.getWidth() * 0.5D);
				int y1 = (int) (d.getHeight() * 0.8D);

				int x2 = (int) (d.getWidth() * 0.5D);
				int y2 = (int) (d.getHeight() * 0.2D);

				new TouchAction(driver).press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
						.moveTo(PointOption.point(x2, y2)).release().perform();

				count++;
			}
		}
	}

	public static void swipeVerticallyUp(AppiumDriver driver, int intervalInMillis, int retryNumber) {
		Dimension d = driver.manage().window().getSize();

		int x1 = (int) (d.getWidth() * 0.5D);
		int y1 = (int) (d.getHeight() * 0.6D);

		int x2 = (int) (d.getWidth() * 0.5D);
		int y2 = (int) (d.getHeight() * 0.2D);

		new TouchAction(driver).press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L)))
				.moveTo(PointOption.point(x2, y2)).release().perform();
	}
}