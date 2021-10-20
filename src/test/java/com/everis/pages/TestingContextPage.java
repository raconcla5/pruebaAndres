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

public class TestingContextPage {
    
	private By AddUri = By.id("I_000001");
	private By valueUri = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[4]/div/ul/li[5]/div/div[2]/input");
	private By SelectFrontEndContext = By.id("I_000001");
	private By GoBack = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By SelectFrontEndContext1 = By.id("I_000001");
	private By AddUri1 = By.id("I_000001");
	private By ValueUri = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[4]/div/ul/li[5]/div/div[2]/input");
	private By GoBack6 = By.xpath("//i[contains(text(),'arrow_upward')]");
    
	private By AddBoxExecuteContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxExecuteContext = By.xpath("//*[@id=\"/C/L/jD\"]");
	private By AddBoxFrontEndContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndContext = By.xpath("//*[@id=\"/C/L/WJ\"]");
	private By AddBoxExecuteContext_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxExecuteContext1 = By.xpath("//*[@id=\"/C/L/jD\"]");
	private By AddBoxFrontEndContext_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndContext1 = By.xpath("//*[@id=\"/C/L/WJ\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public TestingContextPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public TestingContextPage AddUri() throws Exception {
        	dependencies.driver.findElement(valueUri).clear();
            dependencies.driver.findElement(valueUri).sendKeys("https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F");
            Report.reportLog(dependencies, "Typed " + "https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F in valueUri", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(AddUri));
            Report.reportLog(dependencies, "Condition AddUri isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(AddUri).click();
            Report.reportLog(dependencies, "Clicked AddUri", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingContextPage SelectFrontEndContext() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SelectFrontEndContext));
            Report.reportLog(dependencies, "Condition SelectFrontEndContext isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SelectFrontEndContext).click();
            Report.reportLog(dependencies, "Clicked SelectFrontEndContext", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingContextPage GoBack() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack));
            Report.reportLog(dependencies, "Condition GoBack isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack).click();
            Report.reportLog(dependencies, "Clicked GoBack", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingContextPage SelectFrontEndContext1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SelectFrontEndContext1));
            Report.reportLog(dependencies, "Condition SelectFrontEndContext1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SelectFrontEndContext1).click();
            Report.reportLog(dependencies, "Clicked SelectFrontEndContext1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingContextPage AddUri1() throws Exception {
        	dependencies.driver.findElement(ValueUri).clear();
            dependencies.driver.findElement(ValueUri).sendKeys("https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F");
            Report.reportLog(dependencies, "Typed " + "https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F in ValueUri", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(AddUri1));
            Report.reportLog(dependencies, "Condition AddUri1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(AddUri1).click();
            Report.reportLog(dependencies, "Clicked AddUri1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingContextPage GoBack6() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack6));
            Report.reportLog(dependencies, "Condition GoBack6 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack6).click();
            Report.reportLog(dependencies, "Clicked GoBack6", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public TestingContextPage AddBoxExecuteContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxExecuteContext), dependencies.driver.findElement(AddBoxExecuteContext_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxExecuteContext to AddBoxExecuteContext_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxExecuteContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingContextPage AddBoxFrontEndContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndContext), dependencies.driver.findElement(AddBoxFrontEndContext_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndContext to AddBoxFrontEndContext_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingContextPage AddBoxExecuteContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxExecuteContext1), dependencies.driver.findElement(AddBoxExecuteContext_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxExecuteContext1 to AddBoxExecuteContext_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxExecuteContext1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingContextPage AddBoxFrontEndContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndContext1), dependencies.driver.findElement(AddBoxFrontEndContext_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndContext1 to AddBoxFrontEndContext_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndContext1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}