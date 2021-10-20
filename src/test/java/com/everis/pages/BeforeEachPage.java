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

public class BeforeEachPage {
    
	private By CursorBoxStart3 = By.id("I_000001");
	private By GoBack5 = By.xpath("//i[contains(text(),'arrow_upward')]");
    
	private By AddBoxStart_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxStart3 = By.xpath("//*[@id=\"/C/L/g\"]");
	private By MoveBoxFrontEndNavigate_Destination3 = By.xpath("");
        private By MoveBoxFrontEndNavigate3 = By.id("I_000000");
	private By AddBoxFrontEndNavigate_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndNavigate3 = By.xpath("//*[@id=\"/C/L/E\"]");
	private By AddFlow_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
        private By AddFlow3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public BeforeEachPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public BeforeEachPage CursorBoxStart3() throws Exception {
        
            
            Actions action = new Actions(dependencies.driver);
            action.moveToElement(dependencies.driver.findElement(CursorBoxStart3)).perform();
            Report.reportLog(dependencies, "Moved to CursorBoxStart3", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
    }

	public BeforeEachPage GoBack5() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack5));
            Report.reportLog(dependencies, "Condition GoBack5 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack5).click();
            Report.reportLog(dependencies, "Clicked GoBack5", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }
    public BeforeEachPage AddBoxStart3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart3), dependencies.driver.findElement(AddBoxStart_Destination3)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxStart3 to AddBoxStart_Destination3", "INFO", 2000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxStart3 action completed", "INFO", 2000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeEachPage MoveBoxFrontEndNavigate3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate3), 170, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxFrontEndNavigate3 to MoveBoxFrontEndNavigate_Destination3", "INFO", 2000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxFrontEndNavigate3 action completed", "INFO", 2000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeEachPage AddBoxFrontEndNavigate3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate3), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination3)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndNavigate3 to AddBoxFrontEndNavigate_Destination3", "INFO", 2000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndNavigate3 action completed", "INFO", 2000, Status.PASS, true, "", "", null);
        return this;
    }
    public BeforeEachPage AddFlow3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow3), dependencies.driver.findElement(AddFlow_Destination3)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddFlow3 to AddFlow_Destination3", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddFlow3 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}