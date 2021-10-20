package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.TestCaseModelPage;
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

public class W_AadimosunTestCaseAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private TestCaseModelPage testCaseModelPage;
 	private TestingPage testingPage;
 	
    
    public W_AadimosunTestCaseAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        testCaseModelPage = new TestCaseModelPage(dependencies);
testingPage = new TestingPage(dependencies);

        
    }
    




    public void doW_AadimosunTestCaseAction() throws Exception {
		Report.reportLog(dependencies, "", "INFO", 2000);
		Thread.sleep(2000);

		testingPage.GetInTestSuiteModel();
		Thread.sleep(2000);

		testCaseModelPage.AddBoxTestCaseModel();
		Thread.sleep(2000);

		testCaseModelPage.MoveTestCaseModel();
    }
}