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

public class DeleteProyectPage {
    
	private By MenuProyects = By.xpath("/html/body/div/div/aside/section/ul/li[4]/a");
	private By MenuProyects1 = By.xpath("/html/body/div/div/aside/section/ul/li[4]/a");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public DeleteProyectPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public DeleteProyectPage MenuProyects() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(MenuProyects));
            Report.reportLog(dependencies, "Condition MenuProyects isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(MenuProyects).click();
            Report.reportLog(dependencies, "Clicked MenuProyects", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }

	public DeleteProyectPage MenuProyects1() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(MenuProyects1));
            Report.reportLog(dependencies, "Condition MenuProyects1 isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(MenuProyects1).click();
            Report.reportLog(dependencies, "Clicked MenuProyects1", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
    }
    
}