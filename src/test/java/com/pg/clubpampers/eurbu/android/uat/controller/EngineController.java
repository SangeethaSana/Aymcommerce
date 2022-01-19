package com.pg.clubpampers.eurbu.android.uat.controller;

import java.net.MalformedURLException;

import com.aymcommerce.pg.clubpampers.config.mapper.ConfigurationMapper;
import com.pg.clubpampers.eurbu.android.uat.bdd.report.listener.ReportRuntimeListener;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class EngineController {

	public String feature, scenario;
	public static ReportRuntimeListener reportInstance;
	public static ConfigurationMapper configInstance;
	public static String mFeature="";

	@Before
	public void beforeEngine(Scenario initConfig) throws MalformedURLException {
		configInstance = new ConfigurationMapper().getConfigInstance();
		reportInstance = new ReportRuntimeListener().getReportInstance();
		if(!mFeature.equals(initConfig.getName().toString().split("-")[0]))
				{
			 reportInstance.reportCreateFeature(initConfig.getName().toString().split("-")[0]);
		mFeature=initConfig.getName().toString().split("-")[0];
				}
		reportInstance.reportCreateScenario(initConfig.getName().toString().split("-")[1]);
	}

}
