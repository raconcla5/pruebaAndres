package com.dedalow.sUITESITA;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;

import com.dedalow.actions.RealizaTodoAction;



import com.dedalow.request.RealizaPOST;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.google.common.base.Throwables;
import io.restassured.response.Response;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class SUITESITABeforeEach{

    private Class reflectiveClass;
    private Constant constant;
    private WebDriver driver;
    private String handler;
    private JavascriptExecutor js;
    private Properties prop;
    private File folderDownloads;
    private HashMap<String, String> excelSheet;
    private String finalResult;
    public ExtentTest test;
    public String level;
    public String caseName;
    
    
	private static RealizaTodoAction realizaTodoAction;
    
    
    
    
	private static RealizaPOST realizaPOST;

    public SUITESITABeforeEach(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareBeforeEach();
        js = (JavascriptExecutor)driver;
        
		realizaPOST = new RealizaPOST();
        
        
		realizaTodoAction = new RealizaTodoAction(reflectiveClass); 
        
    }

    public void getPrepareBeforeEach() throws Exception {
      this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
      this.constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
      this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
      this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
      this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
      this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
      this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
      this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
      this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
    }
    
    public void doBeforeEach() throws Exception {
HashMap<String, String> BeforeEachVariable = new HashMap<String, String>();
			BeforeEachVariable.put("name", "Raul Contreras");
			BeforeEachVariable.put("job", "NodeJS Programmer");
			
			
            Report.reportLog(reflectiveClass, "BeforeEach BeforeEach of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			constant.isBackend = true;
            constant.apiResponse = realizaPOST.RealizaPOSTPOST7(BeforeEachVariable);
    		Report.reportLog(reflectiveClass, "The field RealizaPOST7 completed", "INFO", 0, Status.PASS, false, "BackendInvoke RealizaPOSTPOST7 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + "https://reqres.in/api/users" + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + realizaPOST.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("name").equals(BeforeEachVariable.get("name")),
            "Error assertion CompruebaName5 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + BeforeEachVariable.get("name"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaName5 check the Body return name: "
            + constant.apiResponse.jsonPath().getString("name") + ", expected " + "equals " + BeforeEachVariable.get("name"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaName5 check the Body <br><strong>return</strong> name: "  + constant.apiResponse.jsonPath().getString("name")
            + ",</br> <strong> expected </strong> " + "equals " + BeforeEachVariable.get("name"), "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").equals(BeforeEachVariable.get("job")),
            "Error assertion CompruebaJob5 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + BeforeEachVariable.get("job"));
            Report.reportLog(reflectiveClass, "Correct assertion CompruebaJob5 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected " + "equals " + BeforeEachVariable.get("job"), "INFO", 0, Status.PASS, false, "Correct assertion CompruebaJob5 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> " + "equals " + BeforeEachVariable.get("job"), "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"BackendVerdictStepsAction3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in BackendVerdictStepsAction3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in BackendVerdictStepsAction3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            
			realizaTodoAction.doRealizaTodoAction();
            Report.reportLog(reflectiveClass, "Action RealizaTodoAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
	}
}