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

public class LogoutPage {
    
	private By GoToProfile = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
	private By SignOut = By.xpath("//button[contains(text(),'Sign Out')]");
	private By GoToProfile1 = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
	private By SignOut1 = By.xpath("//button[contains(text(),'Sign Out')]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public LogoutPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public LogoutPage GoToProfile() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoToProfile));
            Report.reportLog(dependencies, "Condition GoToProfile isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoToProfile).click();
            Report.reportLog(dependencies, "Clicked GoToProfile", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public LogoutPage SignOut() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SignOut));
            Report.reportLog(dependencies, "Condition SignOut isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SignOut).click();
            Report.reportLog(dependencies, "Clicked SignOut", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }

	public LogoutPage GoToProfile1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(GoToProfile1));
            Report.reportLog(dependencies, "Condition GoToProfile1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(GoToProfile1).click();
            Report.reportLog(dependencies, "Clicked GoToProfile1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public LogoutPage SignOut1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(SignOut1));
            Report.reportLog(dependencies, "Condition SignOut1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(SignOut1).click();
            Report.reportLog(dependencies, "Clicked SignOut1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }
    
}