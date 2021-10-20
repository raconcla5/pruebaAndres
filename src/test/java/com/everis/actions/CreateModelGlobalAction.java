package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.TestingPage;
import com.everis.pages.TestCaseModelPage;
import com.everis.pages.ExecuteCasePage;
import com.everis.pages.ProjectPage;
import com.everis.pages.TestingContextPage;
import com.everis.pages.TestSuiteModelPage;


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

public class CreateModelGlobalAction {
    
	private By IsClickTestingContext = By.xpath("//*[@id=\"/C/L/f\"]");
	
	private By isClickExecuteContext = By.xpath("//*[@id=\"/C/L/jD\"]");
	
	private By IsClickTestSuiteModel = By.xpath("//*[@id=\"/C/L/F\"]");
	
	private By IsClickTestCaseModel = By.xpath("//*[@id=\"/C/L/c\"]");
	
	private By IsClickGetInExecute = By.id("I_000002");
	
	private By IsClickFrontEndNavigate = By.xpath("//*[@id=\"/C/L/E\"]");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private TestingPage testingPage;
 	private TestCaseModelPage testCaseModelPage;
 	private ExecuteCasePage executeCasePage;
 	private ProjectPage projectPage;
 	private TestingContextPage testingContextPage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public CreateModelGlobalAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        testingPage = new TestingPage(dependencies);
testCaseModelPage = new TestCaseModelPage(dependencies);
executeCasePage = new ExecuteCasePage(dependencies);
projectPage = new ProjectPage(dependencies);
testingContextPage = new TestingContextPage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    

	public CreateModelGlobalAction IsClickTestingContext() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickTestingContext));
            Report.reportLog(dependencies, "Condition IsClickTestingContext isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }



	public CreateModelGlobalAction isClickExecuteContext() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(isClickExecuteContext));
            Report.reportLog(dependencies, "Condition isClickExecuteContext isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }





	public CreateModelGlobalAction IsClickTestSuiteModel() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickTestSuiteModel));
            Report.reportLog(dependencies, "Condition IsClickTestSuiteModel isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }


	public CreateModelGlobalAction IsClickTestCaseModel() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickTestCaseModel));
            Report.reportLog(dependencies, "Condition IsClickTestCaseModel isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }


	public CreateModelGlobalAction IsClickGetInExecute() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickGetInExecute));
            Report.reportLog(dependencies, "Condition IsClickGetInExecute isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public CreateModelGlobalAction IsClickFrontEndNavigate() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickFrontEndNavigate));
            Report.reportLog(dependencies, "Condition IsClickFrontEndNavigate isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }






    public void doCreateModelGlobalAction() throws Exception {
		Report.reportLog(dependencies, "", "INFO", 5000);
		Thread.sleep(5000);

		projectPage.TestingModule2();
		Thread.sleep(1000);

		IsClickTestingContext();

		testingPage.AddBoxTestingContext1();
		Thread.sleep(1000);

		testingPage.MoveBoxTestingContext1();
		Thread.sleep(1000);

		testingPage.GetInTestingContext1();
		Thread.sleep(1000);

		isClickExecuteContext();

		testingContextPage.AddBoxExecuteContext1();
		Thread.sleep(1000);

		testingContextPage.AddBoxFrontEndContext1();
		Thread.sleep(1000);

		testingContextPage.SelectFrontEndContext1();
		Thread.sleep(1000);

		testingContextPage.AddUri1();
		Thread.sleep(1000);

		testingContextPage.GoBack6();
		Thread.sleep(1000);

		IsClickTestSuiteModel();

		testingPage.AddBoxTestSuiteModel1();
		Thread.sleep(1000);

		testingPage.GetInTestSuiteModel1();
		Thread.sleep(1000);

		IsClickTestCaseModel();

		testCaseModelPage.AddBoxTestCaseModel1();
		Thread.sleep(1000);

		testSuiteModelPage.GetInTestCaseModel1();
		Thread.sleep(1000);

		IsClickGetInExecute();

		testCaseModelPage.GetInExecute1();
		Thread.sleep(1000);

		IsClickFrontEndNavigate();

		executeCasePage.AddBoxFrontEndNavigate4();
		Thread.sleep(1000);

		executeCasePage.MoveBoxFrontEndNavigate4();
		Thread.sleep(1000);

		executeCasePage.AddBoxStart4();
		Thread.sleep(1000);

		executeCasePage.CursorBoxStart4();
		Thread.sleep(1000);

		executeCasePage.AddFlow4();
    }
}