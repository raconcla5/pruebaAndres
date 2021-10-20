package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.UploadPage;


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

public class W_SubirunficheroycomproAction {
    
	private By AsyncCondition2 = By.xpath("//span[contains(text(),'finished with success')]");
	
	private static By checkPlugin = By.xpath("//span[contains(text(),'finished with success')]");
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private UploadPage uploadPage;
 	
    
    public W_SubirunficheroycomproAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        uploadPage = new UploadPage(dependencies);

        
    }
    






	public W_SubirunficheroycomproAction AsyncCondition2() {
        	new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(AsyncCondition2));
            Report.reportLog(dependencies, "Condition AsyncCondition2 isVisible finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
        }

	public W_SubirunficheroycomproAction checkPlugin() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkPlugin));
            Report.reportLog(dependencies, "Condition checkPlugin isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue(dependencies.driver.findElement(checkPlugin).getText().contains("everiscadImportApiFirstIntoTestModel "), "Field checkPlugin not found in assertion");
        	Report.reportLog(dependencies, "The field everiscadImportApiFirstIntoTestModel  has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        Report.reportLog(dependencies, "checkPlugin action completed", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }

    
    public void doW_SubirunficheroycomproAction() throws Exception {

		uploadPage.ExecutePlugin();

		uploadPage.ApiFirstPlugin();
		Thread.sleep(6000);

		uploadPage.UploadFile();

		uploadPage.LoadFile();
		Thread.sleep(3000);

		uploadPage.SelectAll();

		uploadPage.Import();

		AsyncCondition2();

		checkPlugin();
    }
}