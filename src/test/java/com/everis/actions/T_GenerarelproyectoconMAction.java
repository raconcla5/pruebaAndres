package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.TestingPage;
import com.everis.pages.TesstingPage;
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

public class T_GenerarelproyectoconMAction {
    
	private By CheckExportJARVisible = By.xpath("//span[contains(text(),'Export Test Model to JAR finished with success! (c')]");
	
	private By CheckRunExists = By.xpath("//button[contains(text(),'Run...')]");
	
	private By CheckRunClickable = By.xpath("//button[contains(text(),'Run...')]");
	
	private By CheckRunVisible = By.xpath("//button[contains(text(),'Run...')]");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    private ExportModelAction exportModelAction;
	
    private TestingPage testingPage;
 	private TesstingPage tesstingPage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public T_GenerarelproyectoconMAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
        exportModelAction = new ExportModelAction(dependencies);
	 
        testingPage = new TestingPage(dependencies);
tesstingPage = new TesstingPage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    




	public T_GenerarelproyectoconMAction CheckRunExists() {
        	new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.presenceOfElementLocated(CheckRunExists));
            Report.reportLog(dependencies, "Condition CheckRunExists Exists finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
        }

	public T_GenerarelproyectoconMAction CheckRunClickable() {
        	new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CheckRunClickable));
            Report.reportLog(dependencies, "Condition CheckRunClickable isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
        }

	public T_GenerarelproyectoconMAction CheckRunVisible() {
        	new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(CheckRunVisible));
            Report.reportLog(dependencies, "Condition CheckRunVisible isVisible finished", "INFO", 20, Status.PASS, true, "", "", null);
        	return this;
        }

	public T_GenerarelproyectoconMAction CheckExportJARVisible() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.visibilityOfElementLocated(CheckExportJARVisible));
            Report.reportLog(dependencies, "Condition CheckExportJARVisible isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }





    public void doT_GenerarelproyectoconMAction() throws Exception {

		testSuiteModelPage.Goback();
		Thread.sleep(3000);

		exportModelAction.doExportModelAction();
		Thread.sleep(5000);

		testingPage.EjecutePlugIn();
		Thread.sleep(1000);

		testingPage.ExportModelJAR();
		Thread.sleep(1000);

		CheckRunExists();

		CheckRunClickable();

		CheckRunVisible();

		testingPage.RunGenerate();
		Thread.sleep(2000);

		CheckExportJARVisible();

		testingPage.EjecutePlugIn1();
		Thread.sleep(1000);

		testingPage.ShowResults();
		Thread.sleep(1000);

		testingPage.DowloadProyect();
		Thread.sleep(10000);

		tesstingPage.CloseGenerate();
    }
}