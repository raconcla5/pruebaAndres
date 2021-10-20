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

public class ProjectsPage {
    
	private By CreateNew = By.xpath("//button[contains(text(),'Create new...')]");
	private By CreateNewProject = By.xpath("//button[contains(text(),'+ Create new project')]");
	private By NameProject = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
	private By NewProject = By.xpath("/html/body/div[10]/div/div[1]/div/a");
	private By CreateSeed = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");
	private By CreateNew1 = By.xpath("//button[contains(text(),'Create new...')]");
	private By CreateNewProject1 = By.xpath("//button[contains(text(),'+ Create new project')]");
	private By NameProject1 = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
	private By NewProject1 = By.xpath("/html/body/div[10]/div/div[1]/div/a");
	private By CreateSeed1 = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");
	private By CreateNewProject2 = By.xpath("//button[contains(text(),'+ Create new project')]");
	private By NameProject3 = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
	private By CreateNew2 = By.xpath("//button[contains(text(),'Create new...')]");
	private By CreateSeed2 = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");
	private By NewProject2 = By.xpath("/html/body/div[10]/div/div[1]/div/a");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public ProjectsPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public ProjectsPage CreateNew() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNew));
            Report.reportLog(dependencies, "Condition CreateNew isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNew).click();
            Report.reportLog(dependencies, "Clicked CreateNew", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateNewProject() throws Exception {
        	dependencies.driver.findElement(NameProject).clear();
            dependencies.driver.findElement(NameProject).sendKeys("createmodel");
            Report.reportLog(dependencies, "Typed " + "createmodel in NameProject", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNewProject));
            Report.reportLog(dependencies, "Condition CreateNewProject isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNewProject).click();
            Report.reportLog(dependencies, "Clicked CreateNewProject", "INFO", 8000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage NewProject() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(NewProject));
            Report.reportLog(dependencies, "Condition NewProject isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(NewProject).click();
            Report.reportLog(dependencies, "Clicked NewProject", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateSeed() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateSeed));
            Report.reportLog(dependencies, "Condition CreateSeed isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateSeed).click();
            Report.reportLog(dependencies, "Clicked CreateSeed", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateNew1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNew1));
            Report.reportLog(dependencies, "Condition CreateNew1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNew1).click();
            Report.reportLog(dependencies, "Clicked CreateNew1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateNewProject1() throws Exception {
        	dependencies.driver.findElement(NameProject1).clear();
            dependencies.driver.findElement(NameProject1).sendKeys("updatefile");
            Report.reportLog(dependencies, "Typed " + "updatefile in NameProject1", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNewProject1));
            Report.reportLog(dependencies, "Condition CreateNewProject1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNewProject1).click();
            Report.reportLog(dependencies, "Clicked CreateNewProject1", "INFO", 8000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage NewProject1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(NewProject1));
            Report.reportLog(dependencies, "Condition NewProject1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(NewProject1).click();
            Report.reportLog(dependencies, "Clicked NewProject1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateSeed1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateSeed1));
            Report.reportLog(dependencies, "Condition CreateSeed1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateSeed1).click();
            Report.reportLog(dependencies, "Clicked CreateSeed1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateNewProject2() throws Exception {
        	dependencies.driver.findElement(NameProject3).clear();
            dependencies.driver.findElement(NameProject3).sendKeys("createglobal");
            Report.reportLog(dependencies, "Typed " + "createglobal in NameProject3", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNewProject2));
            Report.reportLog(dependencies, "Condition CreateNewProject2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNewProject2).click();
            Report.reportLog(dependencies, "Clicked CreateNewProject2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateNew2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNew2));
            Report.reportLog(dependencies, "Condition CreateNew2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateNew2).click();
            Report.reportLog(dependencies, "Clicked CreateNew2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage CreateSeed2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CreateSeed2));
            Report.reportLog(dependencies, "Condition CreateSeed2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CreateSeed2).click();
            Report.reportLog(dependencies, "Clicked CreateSeed2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProjectsPage NewProject2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(NewProject2));
            Report.reportLog(dependencies, "Condition NewProject2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(NewProject2).click();
            Report.reportLog(dependencies, "Clicked NewProject2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    
}