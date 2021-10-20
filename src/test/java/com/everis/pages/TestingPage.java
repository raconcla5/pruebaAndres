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

public class TestingPage {
    
	private By ExportModel = By.xpath("//span[contains(text(),'Export project')]");
	private By CloseExportModel = By.xpath("//button[contains(text(),'×')]");
	private By EverisCADProject = By.xpath("//*[@id=\"composition\"]/div/ul/li/span/span[2]");
	private By GetInTestingContext = By.id("I_000000");
	private By GetInTestSuiteModel = By.id("I_000001");
	private By ShowResults = By.xpath("//a[contains(text(),'Show results...')]");
	private By RunGenerate = By.xpath("//button[contains(text(),'Run...')]");
	private By EjecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By ExportModelJAR = By.xpath("//a[contains(text(),'Export Test Model to JAR')]");
	private By EjecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By DowloadProyect = By.xpath("//span[contains(text(),'at this URL')]");
	private By GetInTestingContext1 = By.id("I_000000");
	private By GetInTestSuiteModel1 = By.id("I_000001");
	private By ShowResults1 = By.xpath("//a[contains(text(),'Show results...')]");
	private By ExecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By GenerateAndPush = By.xpath("//a[contains(text(),'Test - Export Test Model Generate and Push')]");
	private By RunGenerateAndPush = By.xpath("//button[contains(text(),'Run...')]");
	private By ExecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
    
	private By AddBoxTestingContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestingContext = By.xpath("(//div[@title='TestingContext'])[1]");
	private By MoveBoxTestingContext_Destination = By.xpath("");
        private By MoveBoxTestingContext = By.id("I_000000");
	private By AddBoxTestSuiteModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestSuiteModel = By.xpath("//*[@id=\"/C/L/F\"]");
	private By MoveBoxTestingContext_Destination1 = By.xpath("");
        private By MoveBoxTestingContext1 = By.id("I_000000");
	private By AddBoxTestingContext_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestingContext1 = By.xpath("//*[@id=\"/C/L/f\"]");
	private By AddBoxTestSuiteModel_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
        private By AddBoxTestSuiteModel1 = By.xpath("//*[@id=\"/C/L/F\"]");
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public TestingPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public TestingPage ExportModel() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ExportModel));
            Report.reportLog(dependencies, "Condition ExportModel isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ExportModel).click();
            Report.reportLog(dependencies, "Clicked ExportModel", "INFO", 5000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage CloseExportModel() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CloseExportModel));
            Report.reportLog(dependencies, "Condition CloseExportModel isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CloseExportModel).click();
            Report.reportLog(dependencies, "Clicked CloseExportModel", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage EverisCADProject() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(EverisCADProject));
            Report.reportLog(dependencies, "Condition EverisCADProject isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.contextClick(dependencies.driver.findElement(EverisCADProject)).perform();
            Report.reportLog(dependencies, "RightClicked EverisCADProject", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage GetInTestingContext() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestingContext));
            Report.reportLog(dependencies, "Condition GetInTestingContext isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestingContext)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestingContext", "INFO", 5000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage GetInTestSuiteModel() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestSuiteModel));
            Report.reportLog(dependencies, "Condition GetInTestSuiteModel isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestSuiteModel)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestSuiteModel", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage ShowResults() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ShowResults));
            Report.reportLog(dependencies, "Condition ShowResults isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ShowResults).click();
            Report.reportLog(dependencies, "Clicked ShowResults", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage RunGenerate() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(RunGenerate));
            Report.reportLog(dependencies, "Condition RunGenerate isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(RunGenerate).click();
            Report.reportLog(dependencies, "Clicked RunGenerate", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage EjecutePlugIn() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(EjecutePlugIn));
            Report.reportLog(dependencies, "Condition EjecutePlugIn isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(EjecutePlugIn).click();
            Report.reportLog(dependencies, "Clicked EjecutePlugIn", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage ExportModelJAR() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ExportModelJAR));
            Report.reportLog(dependencies, "Condition ExportModelJAR isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ExportModelJAR).click();
            Report.reportLog(dependencies, "Clicked ExportModelJAR", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage EjecutePlugIn1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(EjecutePlugIn1));
            Report.reportLog(dependencies, "Condition EjecutePlugIn1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(EjecutePlugIn1).click();
            Report.reportLog(dependencies, "Clicked EjecutePlugIn1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage DowloadProyect() throws Exception {
        
            
            if (dependencies.driver.toString().contains("internet explorer")) {
            String linkLocation = dependencies.driver.findElement(DowloadProyect).getAttribute("href");
            String explorerDownloads = prop.getProperty("FOLDER_DOWNLOAD").equals("default")
                ? folderDownloads.getAbsolutePath() : prop.getProperty("FOLDER_DOWNLOAD");

            Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd " + explorerDownloads + " && " 
            + System.getProperty("user.dir") +"/resources/tool/wget.exe " + linkLocation  + "&& exit" );
        } else {
            dependencies.driver.findElement(DowloadProyect).click();
        }
            Report.reportLog(dependencies, "DowloadProyect downloaded", "INFO", 10000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage GetInTestingContext1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestingContext1));
            Report.reportLog(dependencies, "Condition GetInTestingContext1 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestingContext1)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestingContext1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage GetInTestSuiteModel1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestSuiteModel1));
            Report.reportLog(dependencies, "Condition GetInTestSuiteModel1 isClickable finished", "ASYNCHRONOUS", 0);
            Actions action = new Actions(dependencies.driver);
            action.doubleClick(dependencies.driver.findElement(GetInTestSuiteModel1)).perform();
            Report.reportLog(dependencies, "Double clicked GetInTestSuiteModel1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage ShowResults1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ShowResults1));
            Report.reportLog(dependencies, "Condition ShowResults1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ShowResults1).click();
            Report.reportLog(dependencies, "Clicked ShowResults1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage ExecutePlugIn() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ExecutePlugIn));
            Report.reportLog(dependencies, "Condition ExecutePlugIn isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ExecutePlugIn).click();
            Report.reportLog(dependencies, "Clicked ExecutePlugIn", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage GenerateAndPush() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GenerateAndPush));
            Report.reportLog(dependencies, "Condition GenerateAndPush isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GenerateAndPush).click();
            Report.reportLog(dependencies, "Clicked GenerateAndPush", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage RunGenerateAndPush() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(RunGenerateAndPush));
            Report.reportLog(dependencies, "Condition RunGenerateAndPush isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(RunGenerateAndPush).click();
            Report.reportLog(dependencies, "Clicked RunGenerateAndPush", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public TestingPage ExecutePlugIn1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(ExecutePlugIn1));
            Report.reportLog(dependencies, "Condition ExecutePlugIn1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(ExecutePlugIn1).click();
            Report.reportLog(dependencies, "Clicked ExecutePlugIn1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    public TestingPage AddBoxTestingContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestingContext), dependencies.driver.findElement(AddBoxTestingContext_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestingContext to AddBoxTestingContext_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestingContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingPage MoveBoxTestingContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxTestingContext), 200, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxTestingContext to MoveBoxTestingContext_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxTestingContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingPage AddBoxTestSuiteModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestSuiteModel), dependencies.driver.findElement(AddBoxTestSuiteModel_Destination)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestSuiteModel to AddBoxTestSuiteModel_Destination", "INFO", 0, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestSuiteModel action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingPage MoveBoxTestingContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxTestingContext1), 200, 0).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from MoveBoxTestingContext1 to MoveBoxTestingContext_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "MoveBoxTestingContext1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingPage AddBoxTestingContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestingContext1), dependencies.driver.findElement(AddBoxTestingContext_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestingContext1 to AddBoxTestingContext_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestingContext1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    public TestingPage AddBoxTestSuiteModel1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestSuiteModel1), dependencies.driver.findElement(AddBoxTestSuiteModel_Destination1)).release().build().perform();
        Report.reportLog(dependencies, "Drag and drop from AddBoxTestSuiteModel1 to AddBoxTestSuiteModel_Destination1", "INFO", 1000, Status.PASS, true, "", "", null);
        Report.reportLog(dependencies, "AddBoxTestSuiteModel1 action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }
    
}