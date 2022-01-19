package com.pg.clubpampers.eurbu.android.uat.extensions;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportConfig {
	public static ExtentTest feature;
	public static ExtentTest scenario;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;

	public static ExtentTest node;
	public String TestDetail;

	public static String Author, DeviceName, DeviceVersion;

	public static ExtentReports Reports() {
		File OutputFolder = new File("./test-output");
		if (!OutputFolder.exists()) {
			if (OutputFolder.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create Directory");
			}
		} else {
			System.out.println("Directory already exists");
		}

		extent = new ExtentReports();
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "//test-output//AYMReport.html");
		extent.attachReporter(reporter);
		return extent;
	}

	public static void ReportCooldown() {
		extent.flush();
	}

	public static void ReportCreateFeatureTest(String Title) throws ClassNotFoundException {
		feature = extent.createTest(new GherkinKeyword("Feature"), Title);
	}

	public static void ReportCreateScenarioTest(String Title) throws ClassNotFoundException {
		scenario = feature.createNode(new GherkinKeyword("Scenario"), Title);
	}

	public static void Givenlogpass(String givendetails, String passdetails, String imgpath)
			throws ClassNotFoundException, IOException {

		scenario.createNode(new GherkinKeyword("Given"), givendetails).pass(passdetails)
		.addScreenCaptureFromPath(imgpath);

	}

	public static void Whenlogpass(String whendetails, String passdetails, String imgpath)
			throws ClassNotFoundException, IOException {
		scenario.createNode(new GherkinKeyword("When"), whendetails).pass(passdetails)
		.addScreenCaptureFromPath(imgpath);

	}

	public static void Thenlogpass(String thendetails, String passdetails, String imgpath)
			throws ClassNotFoundException, IOException {
		scenario.createNode(new GherkinKeyword("Then"), thendetails).pass(passdetails)
		.addScreenCaptureFromPath(imgpath);

	}

	public static void Andlogpass(String anddetails, String passdetails, String imgpath)
			throws ClassNotFoundException, IOException {

		scenario.createNode(new GherkinKeyword("And"), anddetails).pass(passdetails).addScreenCaptureFromPath(imgpath);

	}

	public static void Givenlogfail(String givendetails, String faildetails, String imgpath)
			throws ClassNotFoundException, IOException {

		scenario.createNode(new GherkinKeyword("Given"), givendetails).fail(faildetails)
		.addScreenCaptureFromPath(imgpath);
	}

	public static void Whenlogfail(String whendetails, String faildetails, String imgpath)
			throws ClassNotFoundException, IOException {
		scenario.createNode(new GherkinKeyword("When"), whendetails).fail(faildetails)
		.addScreenCaptureFromPath(imgpath);

	}

	public static void Thenlogfail(String thendetails, String faildetails, String imgpath)
			throws ClassNotFoundException, IOException {
		scenario.createNode(new GherkinKeyword("Then"), thendetails).fail(faildetails)
		.addScreenCaptureFromPath(imgpath);

	}

	public static void Andlogfail(String anddetails, String faildetails, String imgpath)
			throws ClassNotFoundException, IOException {

		scenario.createNode(new GherkinKeyword("And"), anddetails).fail(faildetails).addScreenCaptureFromPath(imgpath);

	}

}
