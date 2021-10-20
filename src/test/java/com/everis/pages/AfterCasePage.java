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

public class AfterCasePage {
    
	private By CursorBoxStart2 = By.id("I_000001");
	private By GoBack3 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By GoBack4 = By.xpath("//i[contains(text(),'arrow_upward')]");
    
	private By AddFlow_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
        private By AddFlow2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
	private By AddBoxFrontEndNavigate_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndNavigate2 = By.xpath("//*[@id=\"/C/L/E\"]");
	private By MoveBoxFrontEndNavigate_Destination2 = By.xpath("");
        private By MoveBoxFrontEndNavigate2 = By.id("I_000000");
	private By AddBoxStart_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxStart2 = By.xpath("//*[@id=\"/C/L/g\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public AfterCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public AfterCasePage CursorBoxStart2() throws Exception {
        
            
            Actions action = new Actions(dependencies.driver);
            action.moveToElement(dependencies.driver.findElement(CursorBoxStart2)).perform();
            Report.reportLog(dependencies, "Moved to CursorBoxStart2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public AfterCasePage GoBack3() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack3));
            Report.reportLog(dependencies, "Condition GoBack3 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack3).click();
            Report.reportLog(dependencies, "Clicked GoBack3", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public AfterCasePage GoBack4() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack4));
            Report.reportLog(dependencies, "Condition GoBack4 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack4).click();
            Report.reportLog(dependencies, "Clicked GoBack4", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public AfterCasePage AddFlow2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow2), dependencies.driver.findElement(AddFlow_Destination2)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddFlow2 to AddFlow_Destination2", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddFlow2 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public AfterCasePage AddBoxFrontEndNavigate2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate2), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination2)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndNavigate2 to AddBoxFrontEndNavigate_Destination2", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndNavigate2 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public AfterCasePage MoveBoxFrontEndNavigate2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate2), 170, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxFrontEndNavigate2 to MoveBoxFrontEndNavigate_Destination2", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxFrontEndNavigate2 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public AfterCasePage AddBoxStart2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart2), dependencies.driver.findElement(AddBoxStart_Destination2)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxStart2 to AddBoxStart_Destination2", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxStart2 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}