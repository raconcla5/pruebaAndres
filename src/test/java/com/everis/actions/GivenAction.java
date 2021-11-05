package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.utils.Constant;
import com.everis.report.Report;
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

public class GivenAction{

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
    
      
    
    public GivenAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
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

    public GivenAction HomePage () {
        driver.get(prop.getProperty("WEB_URL") + "");
        Report.reportLog(reflectiveClass, "HomePage action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public GivenAction NewBrowserWIKIPEDIA() throws Exception {
        this.driver = (WebDriver) reflectiveClass.getMethod("setUpEnvironment", File.class, Properties.class, String.class, Map.class)
        .invoke(reflectiveClass, folderDownloads, prop, "WIKIPEDIA", constant.contextsDriver);
        Report.reportLog(reflectiveClass, "NewBrowserWIKIPEDIA action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	public GivenAction WIKIPEDIA () {
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        Report.reportLog(reflectiveClass, "WIKIPEDIA action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
    public void doGivenAction() throws Exception {
    
    
		HomePage();
    
		NewBrowserWIKIPEDIA();
    	Thread.sleep(1000);

		WIKIPEDIA();
    
		
    }
}