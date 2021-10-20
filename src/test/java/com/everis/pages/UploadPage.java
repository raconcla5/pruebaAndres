package com.everis.pages;

import com.aventstack.extentreports.Status;
import com.everis.SharedDependencies;
import com.everis.utils.Utils;
import com.everis.report.Report;
import java.io.File;
import java.util.Properties;
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

public class UploadPage {
    
	private By ExecutePlugin = By.id("executePlugin");
	private By ApiFirstPlugin = By.xpath("//a[contains(text(),'Import API-First')]");
	private By UploadFile = By.xpath("//input[@type='file']");
	private By LoadFile = By.xpath("//button[@data-click=\"load\"]");
	private By SelectAll = By.xpath("//button[contains(text(),'Select all results')]");
	private By Import = By.xpath("//button[contains(text(),'Import selected')]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public UploadPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public UploadPage ExecutePlugin() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ExecutePlugin));
            Report.reportLog(dependencies, "Condition ExecutePlugin isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ExecutePlugin).click();
            Report.reportLog(dependencies, "Clicked ExecutePlugin", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public UploadPage ApiFirstPlugin() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ApiFirstPlugin));
            Report.reportLog(dependencies, "Condition ApiFirstPlugin isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ApiFirstPlugin).click();
            Report.reportLog(dependencies, "Clicked ApiFirstPlugin", "INFO", 6000, Status.PASS, true, "", "", null);
            return this;
    }

	public UploadPage UploadFile() throws Exception {
        
            
            dependencies.driver.findElement(UploadFile).sendKeys("C:\\Users\\jperepei\\generated\\Swagger.json");
            Report.reportLog(dependencies, "UploadFile: C:\\Users\\jperepei\\generated\\Swagger.json uploaded", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public UploadPage LoadFile() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(LoadFile));
            Report.reportLog(dependencies, "Condition LoadFile isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(LoadFile).click();
            Report.reportLog(dependencies, "Clicked LoadFile", "INFO", 3000, Status.PASS, true, "", "", null);
            return this;
    }

	public UploadPage SelectAll() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SelectAll));
            Report.reportLog(dependencies, "Condition SelectAll isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SelectAll).click();
            Report.reportLog(dependencies, "Clicked SelectAll", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public UploadPage Import() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(Import));
            Report.reportLog(dependencies, "Condition Import isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(Import).click();
            Report.reportLog(dependencies, "Clicked Import", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }
    
}