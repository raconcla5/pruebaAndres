package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.AfterCasePage;
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

public class A_AadimosStepsenelAfteAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private AfterCasePage afterCasePage;
 	private TestCaseModelPage testCaseModelPage;
 	
    
    public A_AadimosStepsenelAfteAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        afterCasePage = new AfterCasePage(dependencies);
testCaseModelPage = new TestCaseModelPage(dependencies);

        
    }
    









    public void doA_AadimosStepsenelAfteAction() throws Exception {

		testCaseModelPage.GetInAfter();
		Thread.sleep(1000);

		afterCasePage.AddBoxFrontEndNavigate2();
		Thread.sleep(1000);

		afterCasePage.MoveBoxFrontEndNavigate2();
		Thread.sleep(1000);

		afterCasePage.AddBoxStart2();
		Thread.sleep(1000);

		afterCasePage.CursorBoxStart2();
		Thread.sleep(1000);

		afterCasePage.AddFlow2();
		Thread.sleep(1000);

		afterCasePage.GoBack4();
		Thread.sleep(1000);

		afterCasePage.GoBack3();
    }
}