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

public class ProfilePage {
    
	private By DeleteProjectOK = By.id("cadgitlab+createglobal");
	private By DeleteProject = By.xpath("//button[contains(text(),'Delete Project ...')]");
	private By MenuProyects2 = By.xpath("//span[contains(text(),'Projects')]");
	private By GoToProfile2 = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
	private By SignOut2 = By.xpath("//button[contains(text(),'Sign Out')]");
	private By SelectCreateGlobal = By.xpath("//span[contains(text(),'createglobal')]");
	private By NameProject2 = By.xpath("//body/div[@id='dedalow-profile']/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public ProfilePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public ProfilePage DeleteProjectOK() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(DeleteProjectOK));
            Report.reportLog(dependencies, "Condition DeleteProjectOK isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(DeleteProjectOK).click();
            Report.reportLog(dependencies, "Clicked DeleteProjectOK", "INFO", 5000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProfilePage DeleteProject() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(DeleteProject));
            Report.reportLog(dependencies, "Condition DeleteProject isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(DeleteProject).click();
            Report.reportLog(dependencies, "Clicked DeleteProject", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProfilePage MenuProyects2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(MenuProyects2));
            Report.reportLog(dependencies, "Condition MenuProyects2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(MenuProyects2).click();
            Report.reportLog(dependencies, "Clicked MenuProyects2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProfilePage GoToProfile2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoToProfile2));
            Report.reportLog(dependencies, "Condition GoToProfile2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoToProfile2).click();
            Report.reportLog(dependencies, "Clicked GoToProfile2", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public ProfilePage SignOut2() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SignOut2));
            Report.reportLog(dependencies, "Condition SignOut2 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SignOut2).click();
            Report.reportLog(dependencies, "Clicked SignOut2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public ProfilePage SelectCreateGlobal() throws Exception {
        	dependencies.driver.findElement(NameProject2).clear();
            dependencies.driver.findElement(NameProject2).sendKeys("createglobal");
            Report.reportLog(dependencies, "Typed " + "createglobal in NameProject2", "INFO", 0, Status.PASS, true, "", "", null);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SelectCreateGlobal));
            Report.reportLog(dependencies, "Condition SelectCreateGlobal isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SelectCreateGlobal).click();
            Report.reportLog(dependencies, "Clicked SelectCreateGlobal", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    
}