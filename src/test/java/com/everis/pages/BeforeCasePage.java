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

public class BeforeCasePage {
    
	private By GoBack1 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By CursorBoxStart = By.id("I_000001");
    
	private By AddFlow_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
        private By AddFlow = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
	private By AddBoxFrontEndNavigate_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndNavigate = By.xpath("//*[@id=\"/C/L/E\"]");
	private By MoveBoxFrontEndNavigate_Destination = By.xpath("");
        private By MoveBoxFrontEndNavigate = By.id("I_000000");
	private By AddBoxStart_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxStart = By.xpath("//*[@id=\"/C/L/g\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public BeforeCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public BeforeCasePage GoBack1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack1));
            Report.reportLog(dependencies, "Condition GoBack1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack1).click();
            Report.reportLog(dependencies, "Clicked GoBack1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public BeforeCasePage CursorBoxStart() throws Exception {
        
            
            Actions action = new Actions(dependencies.driver);
            action.moveToElement(dependencies.driver.findElement(CursorBoxStart)).perform();
            Report.reportLog(dependencies, "Moved to CursorBoxStart", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public BeforeCasePage AddFlow() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow), dependencies.driver.findElement(AddFlow_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddFlow to AddFlow_Destination", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddFlow action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeCasePage AddBoxFrontEndNavigate() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndNavigate to AddBoxFrontEndNavigate_Destination", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndNavigate action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeCasePage MoveBoxFrontEndNavigate() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate), 170, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxFrontEndNavigate to MoveBoxFrontEndNavigate_Destination", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxFrontEndNavigate action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeCasePage AddBoxStart() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart), dependencies.driver.findElement(AddBoxStart_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxStart to AddBoxStart_Destination", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxStart action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}