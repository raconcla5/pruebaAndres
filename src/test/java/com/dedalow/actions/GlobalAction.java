package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.request.RealizaPOST;
import io.restassured.response.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GlobalAction{

    private Class reflectiveClass;
    private Constant constant;
    private WebDriver driver;
    private String handler;
    private JavascriptExecutor js;
    private Properties prop;
    private String level;
    private String caseName;
    private File folderTestCase;
    private File folderDownloads;
    private String finalResult;
    private HashMap<String, String> excelSheet;
    
	private static RealizaPOST realizaPOST;
      
    
    public GlobalAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		realizaPOST = new RealizaPOST();
    }

    public void getPrepareAction() throws Exception {
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        this.constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
        this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
        this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
        this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
        this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
        this.folderTestCase = (File) reflectiveClass.getField("folderTestCase").get(reflectiveClass);
        this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
        this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
        this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
    }

    public GlobalAction RealizaPOSTPOST8(HashMap<String, String> testActionVariable) throws Exception {
        constant.isBackend = true;
        constant.apiResponse = realizaPOST.RealizaPOSTPOST8(testActionVariable);
    		Report.reportLog(reflectiveClass, "The field RealizaPOST8 completed", "INFO", 0, Status.PASS, false, "BackendInvoke RealizaPOSTPOST8 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + realizaPOST.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "RealizaPOSTPOST8 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }
    
    public GlobalAction BackendVerdictStepsAction2(HashMap<String, String> testActionVariable) throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("name").equals(testActionVariable.get("name")),
            "Error assertion CompruebaName6 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + testActionVariable.get("name"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaName6 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + testActionVariable.get("name"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaName6 check the Body <br><strong>return</strong> name: "  + constant.apiResponse.jsonPath().getString("name")
            + ",</br> <strong> expected </strong> " + "equals " + testActionVariable.get("name"), "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").equals(testActionVariable.get("job")),
            "Error assertion CompruebaJob6 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + testActionVariable.get("job"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaJob6 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + testActionVariable.get("job"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaJob6 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> " + "equals " + testActionVariable.get("job"), "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"BackendVerdictStepsAction2 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in BackendVerdictStepsAction2 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in BackendVerdictStepsAction2 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "BackendVerdictStepsAction2 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    
    public void doGlobalAction() throws Exception {
    	HashMap<String, String> testActionVariable = new HashMap<String, String>();
		testActionVariable.put("Jordi-Hurtado", "Jordi Hurtado");
		testActionVariable.put("name", "Raul Contreras");
		testActionVariable.put("job", "NodeJS Programmer");
	
    
		RealizaPOSTPOST8(testActionVariable);
    
		BackendVerdictStepsAction2(testActionVariable);
    
		
    }
}