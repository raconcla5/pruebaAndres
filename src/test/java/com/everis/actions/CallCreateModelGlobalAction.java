package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.ProjectsPage;
import com.everis.pages.ExecuteCasePage;


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

public class CallCreateModelGlobalAction {
    
	private By loaderNotVisible = By.xpath("div[@class='loader-bg']");
	
	private By waitTesting2 = By.xpath("//*[@id=\"myCards\"]/div[2]/div/div/div/div[1]/a/div/div[1]");
	
	private By IsClickCreateNew = By.xpath("//button[contains(text(),'Create new...')]");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    private CreateModelGlobalAction createModelGlobalAction;
	
    private ProjectsPage projectsPage;
 	private ExecuteCasePage executeCasePage;
 	
    
    public CallCreateModelGlobalAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
        createModelGlobalAction = new CreateModelGlobalAction(dependencies);
	 
        projectsPage = new ProjectsPage(dependencies);
executeCasePage = new ExecuteCasePage(dependencies);

        
    }
    

	public CallCreateModelGlobalAction IsClickCreateNew() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickCreateNew));
            Report.reportLog(dependencies, "Condition IsClickCreateNew isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }


	public CallCreateModelGlobalAction loaderNotVisible() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(loaderNotVisible));
            Report.reportLog(dependencies, "Condition loaderNotVisible isNotVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public CallCreateModelGlobalAction waitTesting2() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(waitTesting2));
            Report.reportLog(dependencies, "Condition waitTesting2 isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }



    public void doCallCreateModelGlobalAction() throws Exception {

		projectsPage.NewProject2();
		Thread.sleep(1000);

		IsClickCreateNew();

		projectsPage.CreateNew2();
		Thread.sleep(1000);

		projectsPage.CreateNewProject2();
		Thread.sleep(1000);

		loaderNotVisible();

		projectsPage.CreateSeed2();

		waitTesting2();

		createModelGlobalAction.doCreateModelGlobalAction();
		Thread.sleep(5000);

		executeCasePage.GoTesting();
    }
}