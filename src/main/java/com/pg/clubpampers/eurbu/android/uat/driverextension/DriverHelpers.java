package com.pg.clubpampers.eurbu.android.uat.driverextension;

import static io.appium.java_client.touch.offset.PointOption.point;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;

public class DriverHelpers {

	public static AndroidDriver<WebElement> driver /* = User Driver */;
	//	public Properties element = ConfigurationMapper.element;
	static DesiredCapabilities dc = new DesiredCapabilities();

	public static String MybabyXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\MybabyPageLocators.properties";
	public static String RedemptionXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\RedemptionPageLocators.properties";
	public static String RegistrationXpath =System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\RegistrationPageLocators.properties";
	public static String ScanningXpath =System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\ScanningPageLocators.properties";
	

	public static WebElement getElement(String ID, String locatorfile) throws Throwable {
		String EleType, Value;
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);		
		EleType = Prop.getProperty(ID).split(" ")[0];
		Value = Prop.getProperty(ID).split(" ", 2)[1];
		switch (EleType) {
		case "id":
			return driver.findElement(By.id(Value));
		case "xpath":
			return driver.findElement(By.xpath(Value));
		default:
			return driver.findElement(By.xpath(Value));

		}
	}

	public static By getElementBy(String ID,String locatorfile) throws IOException  {
		String EleType, Value;
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		EleType = Prop.getProperty(ID).split(" ")[0];
		Value = Prop.getProperty(ID).split(" ", 2)[1];

		switch (EleType) {
		case "id":
			return By.id(Value);
		case "xpath":
			return By.xpath(Value);
		default:
			return By.xpath(Value);
		}
	}

	public List<WebElement> getElements(String ID,String locatorfile) throws IOException {
		String EleType, Value;
		Properties Prop = new Properties();
		File Location = new File(locatorfile);
		FileReader File = new FileReader(Location);
		Prop.load(File);
		EleType = Prop.getProperty(ID).split(" ")[0];
		Value = Prop.getProperty(ID).split(" ", 2)[1];

		return driver.findElements(By.xpath(Value));
	}

	public void waitForElement(String ID,String locatorfile) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getElement(ID,locatorfile)));
	}

	public void sleep() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void scrollAndClick(String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
		.click();  
	}

	public void sleep(int Time) {
		try {
			Thread.sleep(Time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void sendKeystoElement(String ID, String locatorfile,String Value) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		getElement(ID, locatorfile).clear();
		getElement(ID, locatorfile).sendKeys(Value);
	}

	public static void clickElement(String ID,String locatorfile) throws Throwable {
		getElement(ID, locatorfile).click();

	}

	public void tapElement(String ID,String locatorfile) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));

		getElement(ID, locatorfile).submit();
	}

	public void movetoelementoffset(int x, int y) {
		new TouchAction(driver).tap(point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(0))).perform();

	}

	public void tapByCoordinates(int x, int y) {
		new TouchAction(driver).tap(point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
	}

	public boolean buttonisenable(String ID,String locatorfile) throws Throwable {
		return getElement(ID, locatorfile).isEnabled();
	}

	public void clearkeys(String ID,String locatorfile) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(250, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		getElement(ID, locatorfile).clear();
	}



	public void sendKeystoElementiOS(String ID, String Value,String locatorfile) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		getElement(ID, locatorfile).clear();
		driver.getKeyboard().sendKeys(Value);
	}

	public String getElementText(String ID,String locatorfile ) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		return getElement(ID, locatorfile).getText();
	}

	public String getElementsText(String ID,String locatorfile) throws IOException {
		String out = null;
		List<WebElement> elements = getElements(ID,locatorfile);
		for (WebElement ele : elements) {
			out = out + " " + ele.getText();
		}
		return out;
	}

	public void quitCurrentDriver() {
		driver.quit();
		sleep(10000);
	}

	public void closeCurrentDriver() {
		driver.close();
		sleep(10000);
	}

	public void printContext() {
		try {
			Set<String> contexts = driver.getContextHandles();
			for (String string : contexts) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void allowPermissions() throws Throwable {
		getElement("permissions.allow", null).click();
	}

	public void hideCloudDeviceKeyboard() {
		driver.navigate().back();
	}

	public void closeDatePicker() {
		driver.findElement(By.id("button2")).click();
	}

	public void closeDriver() {
		driver.quit();
	}
	public static String captureScreenshot() throws IOException {

		File srcFiler = driver.getScreenshotAs(OutputType.FILE);
		byte[] encoded;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(srcFiler));
			String s = new String(encoded, StandardCharsets.US_ASCII);
			return s;

		} catch (IOException e) {
			e.printStackTrace();

		}
		return MybabyXpath;

	}
	public void scroll(String visibleText) {
     driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
                        + visibleText + "\").instance(0))");
    }
	
	public void pageload(String ID, String locatorfile) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(250, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		
	}
	public static AndroidDriver androidDriverInstance1() throws MalformedURLException {
		dc.setCapability("testName", "Quick Start Android Native Demo");
		dc.setCapability("accessKey", "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1NzcwMjAsInhwLnAiOjk0NDg1LCJ4cC5tIjoxNjIzMjE2MTIzMjE4LCJleHAiOjE5Mzg1ODgxNzQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.qcDoo8vMxuqoPajRwdkTQR3t2cE3nnnia6jSoPgltCg");
		dc.setCapability("deviceQuery", "@os='android' and @category='PHONE' and @version='10'");
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,	"com.aymcommerce.pgapp.pgapplication.ui.SplashActivity");
	     driver = new AndroidDriver<WebElement>(new URL("https://pg.experitest.com/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Opening application");
		return driver;
	}

}
