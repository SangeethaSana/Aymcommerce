package com.pg.clubpampers.eurbu.android.uat.driverextension;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverInstanceCreator {
	public static IOSDriver<IOSElement> iOSDriver;
	public static AndroidDriver<WebElement> androidDriver;
	static DesiredCapabilities dc = new DesiredCapabilities();

	public IOSDriver iOSDriverInstance() throws MalformedURLException {
		dc.setCapability("testName", "Automation Sandbox Test");
		dc.setCapability("accessKey", "");
		dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
		dc.setCapability(MobileCapabilityType.APP, ConfigurationMapper.mConfig.getProperty("APP"));
		dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, ConfigurationMapper.mConfig.getProperty("BUNDLE_ID"));
		return iOSDriver = new IOSDriver<>(new URL("https://pg.experitest.com/wd/hub"), dc);
	}
	public static AndroidDriver androidDriverInstance() throws MalformedURLException { 
		dc.setCapability("testName", "Quick Start Android Native Demo");
		dc.setCapability("accessKey", "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1NzcwMjAsInhwLnAiOjk0NDg1LCJ4cC5tIjoxNjIzMjE2MTIzMjE4LCJleHAiOjE5Mzg1ODgxNzQsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.qcDoo8vMxuqoPajRwdkTQR3t2cE3nnnia6jSoPgltCg");
		dc.setCapability("deviceQuery", "@os='android' and @category='PHONE' and @version='10'");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,	"com.aymcommerce.pgapp.pgapplication.ui.SplashActivity");
		androidDriver = new AndroidDriver<WebElement>(new URL("https://pg.experitest.com/wd/hub"), dc);
		androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Opening application");
		return androidDriver;
	}
	public static AndroidDriver<WebElement> localLaunch() throws MalformedURLException {

		System.out.println("---- Setting Up Local Device ----");
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.UDID, "9f9c90e1");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pg.clubpampers.eurbu.android.fr.uat");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,	"com.aymcommerce.pgapp.pgapplication.ui.SplashActivity");
		androidDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    	androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("---- Successfully Connected To Local Device ----");
		return androidDriver;
	}
	
}
