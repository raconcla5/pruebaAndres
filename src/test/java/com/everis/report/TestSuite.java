package com.everis.report;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import com.everis.utils.Utils;

public class TestSuite {
	public static Properties prop;
	public String name;
	public String testSuiteTL;
	public Map<String, TestCase> testCases = new HashMap();
	private static Logger logger = Utils.logger();

	public TestSuite(String name) {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			Report.reportErrors(e.getMessage());
		}
		this.name = name;
		this.testSuiteTL = prop.getProperty("Testlink.feature." + this.name);
	}
}