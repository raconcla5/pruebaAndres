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

public class TesstingPage {
    
	private By CloseGenerate = By.xpath("//a[contains(text(),'Close')]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    private WebDriver driver;
    private Properties prop;
    private File folderDownloads;
    
    public TesstingPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        this.prop = dependencies.prop;
        this.folderDownloads = dependencies.folderDownloads;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    

	public TesstingPage CloseGenerate() throws Exception {
        
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CloseGenerate));
            Report.reportLog(dependencies, "Condition CloseGenerate isClickable finished", "ASYNCHRONOUS", 0);
            dependencies.driver.findElement(CloseGenerate).click();
            Report.reportLog(dependencies, "Clicked CloseGenerate", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
    }
    
}