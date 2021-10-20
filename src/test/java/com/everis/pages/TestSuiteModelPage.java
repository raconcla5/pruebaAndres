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

public class TestSuiteModelPage {
    
	private By GetInTestCaseModel = By.id("I_000000");
	private By GetInBeforeEach = By.id("I_000001");
	private By Goback = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By GetInTestCaseModel1 = By.id("I_000000");
    
	private By AddBoxBeforeEach_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxBeforeEach = By.xpath("//*[@id=\"/C/L/BU\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public TestSuiteModelPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public TestSuiteModelPage GetInTestCaseModel() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestCaseModel));
            Report.reportLog(dependencies, "Condition GetInTestCaseModel isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestCaseModel)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestCaseModel", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestSuiteModelPage GetInBeforeEach() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInBeforeEach));
            Report.reportLog(dependencies, "Condition GetInBeforeEach isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInBeforeEach)).perform();
            Report.reportLog(dependencies, "Double clicked GetInBeforeEach", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestSuiteModelPage Goback() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(Goback));
            Report.reportLog(dependencies, "Condition Goback isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(Goback).click();
            Report.reportLog(dependencies, "Clicked Goback", "INFO", 3000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestSuiteModelPage GetInTestCaseModel1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestCaseModel1));
            Report.reportLog(dependencies, "Condition GetInTestCaseModel1 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestCaseModel1)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestCaseModel1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public TestSuiteModelPage AddBoxBeforeEach() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxBeforeEach), dependencies.driver.findElement(AddBoxBeforeEach_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxBeforeEach to AddBoxBeforeEach_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxBeforeEach action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    
}