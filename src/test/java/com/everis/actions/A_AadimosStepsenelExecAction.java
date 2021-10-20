package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.ExecuteCasePage;
import com.everis.pages.TestCaseModelPage;


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

public class A_AadimosStepsenelExecAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private ExecuteCasePage executeCasePage;
 	private TestCaseModelPage testCaseModelPage;
 	
    
    public A_AadimosStepsenelExecAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        executeCasePage = new ExecuteCasePage(dependencies);
testCaseModelPage = new TestCaseModelPage(dependencies);

        
    }
    








    public void doA_AadimosStepsenelExecAction() throws Exception {

		testCaseModelPage.GetInExecute();
		Thread.sleep(1000);

		executeCasePage.AddBoxFrontEndNavigate1();
		Thread.sleep(1000);

		executeCasePage.MoveBoxFrontEndNavigate1();
		Thread.sleep(1000);

		executeCasePage.AddBoxStart1();
		Thread.sleep(1000);

		executeCasePage.CursorBoxStart1();
		Thread.sleep(1000);

		executeCasePage.AddFlow1();
		Thread.sleep(1000);

		executeCasePage.GoBack2();
    }
}