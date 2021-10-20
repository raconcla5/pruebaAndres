package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.TestingContextPage;
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

public class A_AadimoslaconfiguracionAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private TestingContextPage testingContextPage;
 	private TestingPage testingPage;
 	
    
    public A_AadimoslaconfiguracionAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        testingContextPage = new TestingContextPage(dependencies);
testingPage = new TestingPage(dependencies);

        
    }
    







    public void doA_AadimoslaconfiguracionAction() throws Exception {

		testingPage.GetInTestingContext();
		Thread.sleep(5000);

		testingContextPage.AddBoxExecuteContext();

		testingContextPage.AddBoxFrontEndContext();

		testingContextPage.SelectFrontEndContext();

		testingContextPage.AddUri();

		testingContextPage.GoBack();
    }
}