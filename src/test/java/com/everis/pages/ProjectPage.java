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

public class ProjectPage {
    
	private By TestingModule = By.xpath("//span[contains(@title,'everiscad.test.TestModel')]");
	private By TestingModule1 = By.xpath("//span[contains(@title,'everiscad.test.TestModel')]");
	private By TestingModule2 = By.xpath("//span[contains(@title,'everiscad.test.TestModel')]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public ProjectPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public ProjectPage TestingModule() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModule));
            Report.reportLog(dependencies, "Condition TestingModule isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(TestingModule)).perform();
            Report.reportLog(dependencies, "Double clicked TestingModule", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectPage TestingModule1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModule1));
            Report.reportLog(dependencies, "Condition TestingModule1 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(TestingModule1)).perform();
            Report.reportLog(dependencies, "Double clicked TestingModule1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectPage TestingModule2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModule2));
            Report.reportLog(dependencies, "Condition TestingModule2 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(TestingModule2)).perform();
            Report.reportLog(dependencies, "Double clicked TestingModule2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    
}