package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.TestingPage;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
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
import com.aventstack.extentreports.Status;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.restassured.response.Response;

public class PushGogsGlobalAction {
    
	private By VisibleGeneratedCorrectly = By.xpath("/html/body/div[12]/div/div/div[2]/div/div[3]/div/div[2]");
	
	private static By GeneratedCorrectly = By.xpath("/html/body/div[12]/div/div/div[2]/div/div[3]/div/div[2]");
	private By IsClickGenerateAndPush = By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/ul/li[6]/a");
	
	private By IsClickRunGenerateAndPush = By.xpath("//button[contains(text(),'Run...')]");
	
	private By VisibleGenerateAndPush = By.xpath("//span[contains(text(),'Export Test Model Generate and Push finished with ')]");
	
	private By IsClickShowResults = By.xpath("//a[contains(text(),'Show results...')]");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private TestingPage testingPage;
 	
    
    public PushGogsGlobalAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        testingPage = new TestingPage(dependencies);

        
    }
    

	public PushGogsGlobalAction IsClickGenerateAndPush() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickGenerateAndPush));
            Report.reportLog(dependencies, "Condition IsClickGenerateAndPush isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public PushGogsGlobalAction IsClickRunGenerateAndPush() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickRunGenerateAndPush));
            Report.reportLog(dependencies, "Condition IsClickRunGenerateAndPush isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public PushGogsGlobalAction VisibleGenerateAndPush() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleGenerateAndPush));
            Report.reportLog(dependencies, "Condition VisibleGenerateAndPush isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public PushGogsGlobalAction IsClickShowResults() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickShowResults));
            Report.reportLog(dependencies, "Condition IsClickShowResults isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public PushGogsGlobalAction VisibleGeneratedCorrectly() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleGeneratedCorrectly));
            Report.reportLog(dependencies, "Condition VisibleGeneratedCorrectly isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public PushGogsGlobalAction GenerateAndPushGeneratedCorrectly() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(GeneratedCorrectly));
            Report.reportLog(dependencies, "Condition GeneratedCorrectly isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(dependencies.driver.findElement(GeneratedCorrectly).getText().contains("Generated correctly"), "Field GeneratedCorrectly not found in assertion");
        	Report.reportLog(dependencies, "The field Generated correctly has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        Report.reportLog(dependencies, "GenerateAndPushGeneratedCorrectly action completed", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }

    
    public void doPushGogsGlobalAction() throws Exception {

		testingPage.ExecutePlugIn();
		Thread.sleep(1000);

		IsClickGenerateAndPush();

		testingPage.GenerateAndPush();
		Thread.sleep(1000);

		IsClickRunGenerateAndPush();

		testingPage.RunGenerateAndPush();
		Thread.sleep(1000);

		VisibleGenerateAndPush();

		testingPage.ExecutePlugIn1();
		Thread.sleep(1000);

		IsClickShowResults();

		testingPage.ShowResults1();
		Thread.sleep(1000);

		VisibleGeneratedCorrectly();

		GenerateAndPushGeneratedCorrectly();
    }
}