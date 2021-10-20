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

public class ExecuteCasePage {
    
	private By CursorBoxStart1 = By.id("I_000001");
	private By GoBack2 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By CursorBoxStart4 = By.id("I_000001");
	private By GoTesting = By.xpath("//a[@id='Testing']");
    
	private By AddBoxFrontEndNavigate_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndNavigate1 = By.xpath("//*[@id=\"/C/L/E\"]");
	private By AddFlow_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
        private By AddFlow1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
	private By MoveBoxFrontEndNavigate_Destination1 = By.xpath("");
        private By MoveBoxFrontEndNavigate1 = By.id("I_000000");
	private By AddBoxStart_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxStart1 = By.xpath("//*[@id=\"/C/L/g\"]");
	private By AddFlow_Destination4 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
        private By AddFlow4 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
	private By AddBoxFrontEndNavigate_Destination4 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxFrontEndNavigate4 = By.xpath("//*[@id=\"/C/L/E\"]");
	private By MoveBoxFrontEndNavigate_Destination4 = By.xpath("");
        private By MoveBoxFrontEndNavigate4 = By.id("I_000000");
	private By AddBoxStart_Destination4 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxStart4 = By.xpath("//*[@id=\"/C/L/g\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public ExecuteCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public ExecuteCasePage CursorBoxStart1() throws Exception {
        
            
            Actions action = new Actions(dependencies.driver);
            action.moveToElement(dependencies.driver.findElement(CursorBoxStart1)).perform();
            Report.reportLog(dependencies, "Moved to CursorBoxStart1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ExecuteCasePage GoBack2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack2));
            Report.reportLog(dependencies, "Condition GoBack2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoBack2).click();
            Report.reportLog(dependencies, "Clicked GoBack2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ExecuteCasePage CursorBoxStart4() throws Exception {
        
            
            Actions action = new Actions(dependencies.driver);
            action.moveToElement(dependencies.driver.findElement(CursorBoxStart4)).perform();
            Report.reportLog(dependencies, "Moved to CursorBoxStart4", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ExecuteCasePage GoTesting() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoTesting));
            Report.reportLog(dependencies, "Condition GoTesting isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoTesting).click();
            Report.reportLog(dependencies, "Clicked GoTesting", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }
    public ExecuteCasePage AddBoxFrontEndNavigate1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate1), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndNavigate1 to AddBoxFrontEndNavigate_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndNavigate1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage AddFlow1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow1), dependencies.driver.findElement(AddFlow_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddFlow1 to AddFlow_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddFlow1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage MoveBoxFrontEndNavigate1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate1), 170, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxFrontEndNavigate1 to MoveBoxFrontEndNavigate_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxFrontEndNavigate1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage AddBoxStart1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart1), dependencies.driver.findElement(AddBoxStart_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxStart1 to AddBoxStart_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxStart1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage AddFlow4() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow4), dependencies.driver.findElement(AddFlow_Destination4)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddFlow4 to AddFlow_Destination4", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddFlow4 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage AddBoxFrontEndNavigate4() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate4), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination4)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxFrontEndNavigate4 to AddBoxFrontEndNavigate_Destination4", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxFrontEndNavigate4 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage MoveBoxFrontEndNavigate4() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate4), 170, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxFrontEndNavigate4 to MoveBoxFrontEndNavigate_Destination4", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxFrontEndNavigate4 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public ExecuteCasePage AddBoxStart4() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart4), dependencies.driver.findElement(AddBoxStart_Destination4)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxStart4 to AddBoxStart_Destination4", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxStart4 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}