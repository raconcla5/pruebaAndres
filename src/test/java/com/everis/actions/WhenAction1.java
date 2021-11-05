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

public class WhenAction1{

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
    
      
	private By UseExcel1 = By.name("name");
	private By City = By.name("city");
	private By Address = By.name("address");
	private By ZipCode = By.name("zipcode");
	private By StateSelect = By.name("state");
    
    public WhenAction1(Class reflectiveClass) throws Exception {
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

    
      
	public WhenAction1 UseExcel1() throws Exception {
        	driver.findElement(City).clear();
            driver.findElement(City).sendKeys(excelSheet.get("City:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("City:MultipleParameter") + " in City", "INFO", 0, Status.PASS, true, "", "", null);			driver.findElement(Address).clear();
            driver.findElement(Address).sendKeys(excelSheet.get("Address:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Address:MultipleParameter") + " in Address", "INFO", 0, Status.PASS, true, "", "", null);			driver.findElement(ZipCode).clear();
            driver.findElement(ZipCode).sendKeys(excelSheet.get("ZipCode:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("ZipCode:MultipleParameter") + " in ZipCode", "INFO", 0, Status.PASS, true, "", "", null);		
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UseExcel1));
            Report.reportLog(reflectiveClass, "Condition UseExcel1 isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(UseExcel1).click();
            Report.reportLog(reflectiveClass, "Clicked UseExcel1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public WhenAction1 StateSelect() throws Exception {
        
            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StateSelect));
            Report.reportLog(reflectiveClass, "Condition StateSelect isClickable finished", "ASYNCHRONOUS", 0);
            driver.findElement(StateSelect).click();
            Report.reportLog(reflectiveClass, "Clicked StateSelect", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doWhenAction1() throws Exception {
    
    
		UseExcel1();
    
		StateSelect();
    
		
    }
}