package com.everis.sUITESITA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.everis.ContainerManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Throwables;
import com.everis.utils.Utils;
import com.everis.utils.DriverInit;
import com.everis.utils.Constant;
import com.everis.report.ExtentHtml;
import com.everis.report.Report;
import com.everis.Launcher;

import com.aventstack.extentreports.Status;


import com.everis.actions.RealizaTodoAction;
import com.everis.request.RealizaPOST;

public class Test_TestCaseModel {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "SUITESITA";
    public static String caseName = Test_TestCaseModel.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult;
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static SUITESITABeforeEach sUITESITABeforeEach;
	private static RealizaTodoAction realizaTodoAction;
	private static RealizaPOST realizaPOST;
    
    
	@BeforeAll
    public static void checkDocker() throws IOException {
        try {
            Runtime.getRuntime().exec("docker --version");
        } catch (IOException e) {
            constant.logger.severe("Cannot run program \"docker\": CreateProcess error=2, System can not find docker installed.");
            throw new IOException(e);
        }
    }

    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	sUITESITABeforeEach.doBeforeEach();
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			finalResult = "BQ";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
		}
    }

    public void before() throws Exception {
        try {
            
            HashMap<String, String> beforeVariable = new HashMap<String, String>();
			beforeVariable.put("name", "Raul Contreras");
			beforeVariable.put("job", "NodeJS Programmer");
			
			
            Report.reportLog(reflectiveClass, "Before of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			constant.isBackend = true;
            constant.apiResponse = realizaPOST.RealizaPOSTPOST();
    		Report.reportLog(reflectiveClass, "The field RealizaPOST completed", "INFO", 0, Status.PASS, false, "BackendInvoke RealizaPOSTPOST <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + realizaPOST.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("name").equals(beforeVariable.get("name")),
            "Error assertion CompruebaName check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + beforeVariable.get("name"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaName check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + beforeVariable.get("name"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaName check the Body <br><strong>return</strong> name: "  + constant.apiResponse.jsonPath().getString("name")
            + ",</br> <strong> expected </strong> " + "equals " + beforeVariable.get("name"), "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").equals(beforeVariable.get("job")),
            "Error assertion CompruebaJob check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + beforeVariable.get("job"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaJob check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + beforeVariable.get("job"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaJob check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> " + "equals " + beforeVariable.get("job"), "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"BackendVerdictStepsAction returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in BackendVerdictStepsAction returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in BackendVerdictStepsAction <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            
			realizaTodoAction.doRealizaTodoAction();
            Report.reportLog(reflectiveClass, "Action RealizaTodoAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_TestCaseModel")
	public void test() throws Exception {
        try {
            before();
            
            HashMap<String, String> executeVariable = new HashMap<String, String>();
			executeVariable.put("name", "Raul Contreras");
			executeVariable.put("job", "NodeJS Programmer");
			
			
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			constant.isBackend = true;
            constant.apiResponse = realizaPOST.RealizaPOSTPOST1();
    		Report.reportLog(reflectiveClass, "The field RealizaPOST1 completed", "INFO", 0, Status.PASS, false, "BackendInvoke RealizaPOSTPOST1 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + realizaPOST.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("name").equals(executeVariable.get("name")),
            "Error assertion CompruebaName1 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + executeVariable.get("name"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaName1 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + executeVariable.get("name"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaName1 check the Body <br><strong>return</strong> name: "  + constant.apiResponse.jsonPath().getString("name")
            + ",</br> <strong> expected </strong> " + "equals " + executeVariable.get("name"), "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").equals(executeVariable.get("job")),
            "Error assertion CompruebaJob1 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + executeVariable.get("job"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaJob1 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + executeVariable.get("job"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaJob1 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> " + "equals " + executeVariable.get("job"), "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"BackendVerdictStepsAction1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in BackendVerdictStepsAction1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in BackendVerdictStepsAction1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            
			realizaTodoAction.doRealizaTodoAction();
            Report.reportLog(reflectiveClass, "Action RealizaTodoAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://es.wikipedia.org/wiki/Wikipedia:Portada", "INFO", 0, Status.PASS, true, "", "", null);
			
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
            if (finalResult != "BQ") {
				finalResult = "KO";
			}
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
        }
    }

    public void after() {
        constant.isAfter = true;
        constant.isBackend = false;
        try {
            
            HashMap<String, String> afterVariable = new HashMap<String, String>();
			afterVariable.put("name", "Raul Contreras");
			afterVariable.put("job", "NodeJS Programmer");
			
			
            Report.reportLog(reflectiveClass, "After of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			constant.isBackend = true;
            constant.apiResponse = realizaPOST.RealizaPOSTPOST2();
    		Report.reportLog(reflectiveClass, "The field RealizaPOST2 completed", "INFO", 0, Status.PASS, false, "BackendInvoke RealizaPOSTPOST2 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + realizaPOST.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("name").equals(afterVariable.get("name")),
            "Error assertion CompruebaName2 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + afterVariable.get("name"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaName2 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + afterVariable.get("name"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaName2 check the Body <br><strong>return</strong> name: "  + constant.apiResponse.jsonPath().getString("name")
            + ",</br> <strong> expected </strong> " + "equals " + afterVariable.get("name"), "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").equals(afterVariable.get("job")),
            "Error assertion CompruebaJob2 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + afterVariable.get("job"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaJob2 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + afterVariable.get("job"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaJob2 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> " + "equals " + afterVariable.get("job"), "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"BackendVerdictStepsAction2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in BackendVerdictStepsAction2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in BackendVerdictStepsAction2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            
			realizaTodoAction.doRealizaTodoAction();
            Report.reportLog(reflectiveClass, "Action RealizaTodoAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			constant.captureLog = "KO";
			constant.afterResult = "not succesfully";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.WARNING, true, "isCatch", "", Throwables.getStackTraceAsString(e));
        }
    }

    @AfterEach
    public void afterEach()  {
        boolean screenShot = true;
        after();
        
        if (finalResult == "OK") {
            Report.reportLog(reflectiveClass, "Result on Test_TestCaseModel: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_TestCaseModel: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_TestCaseModel: " + finalResult);
		constant.logger.info("After execution finished: " + constant.afterResult);
        Utils.tearDown(reflectiveClass);
		Utils.finalReports(reflectiveClass, screenShot);
		constant.initialize.flush();
		ContainerManager.stopContainer(finalResult, caseName);
    }
    
    
	public static void setUp() throws Exception{
        try{
            finalResult = "OK";
            constant.defaultValues();
            constant.folderTestSuite = new File(constant.folderLogs + constant.fileSystem.getSeparator() + suiteName);
            constant.folderTestSuite.mkdirs();
            folderTestCase = new File(constant.folderTestSuite + constant.fileSystem.getSeparator() + caseName);
            folderTestCase.mkdirs();
            folderDownloads = new File(folderTestCase + constant.fileSystem.getSeparator() + "files");
            folderDownloads.mkdirs();
            prop = Utils.getConfigProperties();
            level = prop.getProperty("LOG_LEVEL");
        } catch (Exception e) {
            e.printStackTrace();
            Report.reportErrors(e.getMessage());
            throw new Exception(e);
        }
    }

    public static WebDriver setUpEnvironment(File folderDownloads, Properties prop,
        String nameDriver, Map<String, WebDriver> contextsDriver) throws Exception {
        driver = driverInit.initDockerDriver(folderDownloads, prop, nameDriver, contextsDriver, folderTestCase);
            handler = driver.getWindowHandle();
        reflectiveClass = Utils.getReflective(Test_TestCaseModel.class.getCanonicalName());
			sUITESITABeforeEach = new SUITESITABeforeEach(reflectiveClass);
		realizaTodoAction = new RealizaTodoAction(reflectiveClass);
		realizaPOST = new RealizaPOST();
        return driver;
    }
}