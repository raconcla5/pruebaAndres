package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.BeforeEachPage;
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

public class A_AadirlosStepsAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private BeforeEachPage beforeEachPage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public A_AadirlosStepsAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        beforeEachPage = new BeforeEachPage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    








    public void doA_AadirlosStepsAction() throws Exception {
		Report.reportLog(dependencies, "", "INFO", 2000);
		Thread.sleep(2000);

		testSuiteModelPage.GetInBeforeEach();
		Thread.sleep(2000);

		beforeEachPage.AddBoxFrontEndNavigate3();
		Thread.sleep(2000);

		beforeEachPage.MoveBoxFrontEndNavigate3();
		Thread.sleep(2000);

		beforeEachPage.AddBoxStart3();
		Thread.sleep(2000);

		beforeEachPage.CursorBoxStart3();
		Thread.sleep(2000);

		beforeEachPage.AddFlow3();
		Thread.sleep(1000);

		beforeEachPage.GoBack5();
    }
}