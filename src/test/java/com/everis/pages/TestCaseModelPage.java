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

public class TestCaseModelPage {
    
	private By GetInBefore = By.id("I_000001");
	private By GetInExecute = By.id("I_000002");
	private By GetInAfter = By.id("I_000000");
	private By GetInExecute1 = By.id("I_000002");
    
	private By AddBoxTestCaseModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestCaseModel = By.xpath("//*[@id=\"/C/L/c\"]");
	private By MoveTestCaseModel_Destination = By.xpath("");
        private By MoveTestCaseModel = By.id("I_000000");
	private By AddBoxTestCaseModel_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestCaseModel1 = By.xpath("//*[@id=\"/C/L/c\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public TestCaseModelPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public TestCaseModelPage GetInBefore() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInBefore));
            Report.reportLog(dependencies, "Condition GetInBefore isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInBefore)).perform();
            Report.reportLog(dependencies, "Double clicked GetInBefore", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestCaseModelPage GetInExecute() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInExecute));
            Report.reportLog(dependencies, "Condition GetInExecute isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInExecute)).perform();
            Report.reportLog(dependencies, "Double clicked GetInExecute", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestCaseModelPage GetInAfter() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInAfter));
            Report.reportLog(dependencies, "Condition GetInAfter isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInAfter)).perform();
            Report.reportLog(dependencies, "Double clicked GetInAfter", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestCaseModelPage GetInExecute1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInExecute1));
            Report.reportLog(dependencies, "Condition GetInExecute1 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInExecute1)).perform();
            Report.reportLog(dependencies, "Double clicked GetInExecute1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public TestCaseModelPage AddBoxTestCaseModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestCaseModel), dependencies.driver.findElement(AddBoxTestCaseModel_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestCaseModel to AddBoxTestCaseModel_Destination", "INFO", 2000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestCaseModel action completed", "INFO", 2000, Status.PASS, true, "", "", null);
        return this;
    }
    public TestCaseModelPage MoveTestCaseModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveTestCaseModel), 0, 170).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveTestCaseModel to MoveTestCaseModel_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveTestCaseModel action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestCaseModelPage AddBoxTestCaseModel1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestCaseModel1), dependencies.driver.findElement(AddBoxTestCaseModel_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestCaseModel1 to AddBoxTestCaseModel_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestCaseModel1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}