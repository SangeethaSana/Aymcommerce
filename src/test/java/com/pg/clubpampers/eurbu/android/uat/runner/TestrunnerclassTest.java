package com.pg.clubpampers.eurbu.android.uat.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "Feature" }, glue = { "com\\pg\\clubpampers\\eurbu\\android\\uat\\steps",
		"com\\pg\\clubpampers\\eurbu\\android\\uat\\controller" }, monochrome = true, dryRun = false, plugin = {
				"summary", "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json" }, publish = true)

public class TestrunnerclassTest {

}
