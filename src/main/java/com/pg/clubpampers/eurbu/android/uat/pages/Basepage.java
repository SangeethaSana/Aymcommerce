package com.pg.clubpampers.eurbu.android.uat.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.pg.clubpampers.eurbu.android.uat.extensions.ReportConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.remote.MobileCapabilityType;

public class Basepage extends ReportConfig {
	public static AndroidDriver<WebElement> driver;
	public static String RegistrationXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\RegistrationPageLocators.properties";
	public static String MybabyXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\MybabyPageLocators.properties";
	public static String ScanningXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\ScanningPageLocators.properties";
	public static String RedemptionXpath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\pg\\clubpampers\\eurbu\\android\\uat\\pages\\RedemptionPageLocators.properties";

	static public String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1NzcwMjAsInhwLnAiOjk0NDg1LCJ4cC5tIjoxNjIzMjE2MTIzMjE4LCJleHAiOjE5Mzg1ODgxNzQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.qcDoo8vMxuqoPajRwdkTQR3t2cE3nnnia6jSoPgltCg";

	public static DesiredCapabilities dc = new DesiredCapabilities();



	public static void sendKeystoElement(String ID, String locatorfile,String Value) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		getElement(ID, locatorfile).clear();
		getElement(ID, locatorfile).sendKeys(Value);
	}

	public static void clickElement(String ID,String locatorfile) throws Throwable {
		Wait wait2 = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(TimeoutException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(getElementBy(ID, locatorfile)));
		getElement(ID, locatorfile).click();

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

	public void sleep(int Time) {
		try {
			Thread.sleep(Time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static AndroidDriver<WebElement> frlocalLaunch() throws MalformedURLException {

		System.out.println("---- Setting Up Local Device ----");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.UDID, "9f9c90e1");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.aymcommerce.pgapp.pgapplication.ui.SplashActivity");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/App/app-fr-uat .apk");
		dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		dc.setCapability("autoAcceptAlerts", true);
		dc.setCapability("automationName", "UiAutomator2");
		dc.setCapability("unicodeKeyboard", true);
		dc.setCapability("resetKeyboard", true);
		System.out.println("----| Full_Reset = true , No_Rest = false |------");
		//	dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		//	dc.setCapability(MobileCapabilityType.NO_RESET, false);
		driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("---- Successfully Connected To Local Device ----");
		return driver;
	}

	public static void frcloudLaunch() throws MalformedURLException {
		dc.setCapability("testName", "Quick Start Android Native Demo");
		dc.setCapability("accessKey", accessKey);
		dc.setCapability("deviceQuery", "@os='android' and @category='PHONE' and @version='8.1.0'");
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.aymcommerce.pgapp.pgapplication.ui.SplashActivity");
		// dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		driver = new AndroidDriver<WebElement>(new URL("https://pg.experitest.com/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Opening application");
	}

	public void scrollAndClick(String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
		.click();  
	}

	public void scroll(String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}


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

	public static By getElementBy(String ID,String locatorfile) throws IOException {
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
	public static String getElementvalue(String ID, String locatorfile) throws Throwable {
		WebElement elem = getElement(ID, locatorfile);
		Thread.sleep(2000);
		String attribute = elem.getText();
		System.out.println("Entered value:" + attribute);
		return attribute;

	}

	public static AndroidDriver<WebElement> fbLaunch() throws MalformedURLException {
		dc.setCapability(MobileCapabilityType.UDID, "9f9c90e1");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.facebook.katana");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/App/fb.apk");
		dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static AndroidDriver<WebElement> fbcloudLaunch() throws MalformedURLException {
		dc.setCapability("testName", "Quick Start Android Native Demo");
		dc.setCapability("accessKey", accessKey);
		dc.setCapability("deviceQuery", "@os='android' and @category='PHONE' and @version='8.1.0'");
		//		dc.setCapability(MobileCapabilityType.APP, "cloud:com.facebook.katana/.LoginActivity");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.facebook.katana");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		// dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		driver = new AndroidDriver<WebElement>(new URL("https://pg.experitest.com/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void clearkeys(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.clear();
	}

	public void wait(String ID,String locatorfile) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(getElement(ID,locatorfile)));
	}
	public void closeCurrentDriver() {
		driver.close();
		sleep(10000);
	}
	public void closeDriver() {
		driver.quit();
	}
}
