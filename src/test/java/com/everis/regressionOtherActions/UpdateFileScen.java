package com.everis.regressionOtherActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import com.google.common.base.Throwables;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import com.everis.SharedDependencies;
import com.everis.report.Report;
import com.everis.actions.*;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class UpdateFileScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionOtherActions";
    private SharedDependencies dependencies;
    
	private static By waitTesting1 = By.xpath("//*[@id=\"myCards\"]/div[2]/div/div/div/div[1]/a/div/div[1]");

    private G_CrearproyectollamadoupAction g_CrearproyectollamadoupAction;
    private A_AccederalmodulodeTestAction1 a_AccederalmodulodeTestAction1;
    private W_SubirunficheroycomproAction w_SubirunficheroycomproAction;
    private T_EliminarproyectollamadoAction t_EliminarproyectollamadoAction;
    

    public UpdateFileScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "UpdateFileScen";
    }

    public void initActions() throws Exception {
        g_CrearproyectollamadoupAction = new G_CrearproyectollamadoupAction(dependencies);
            a_AccederalmodulodeTestAction1 = new A_AccederalmodulodeTestAction1(dependencies);
            w_SubirunficheroycomproAction = new W_SubirunficheroycomproAction(dependencies);
            t_EliminarproyectollamadoAction = new T_EliminarproyectollamadoAction(dependencies);
            
    }

    @Before("@UpdateFileScen")
    public void before()  {
        try {
            dependencies.setUp(FeatureName);
			dependencies.setUpEnvironment("MAIN_CONTEXT");
            initActions();
        } catch (Exception e) {
            Report.reportErrors(e.getMessage());
        }
    }

    @Given("^Crear proyecto llamado uploadproject$")
    public void Given4() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>GIVEN</b> Crear proyecto llamado uploadproject");
            Report.reportLog(dependencies, "Crear proyecto llamado uploadproject testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            g_CrearproyectollamadoupAction.doG_CrearproyectollamadoupAction();
            Report.reportLog(dependencies, "Crear proyecto llamado uploadproject action completed", "INFO", 0, Status.PASS, false, "", "", null);

            new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(waitTesting1));
            Report.reportLog(dependencies, "Condition waitTesting1 isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);

        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.reportLog(dependencies, te.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(te));
            throw new Exception(te.getMessage());
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            Report.reportErrors(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

	@And("^Acceder al modulo de Testing1$")
    public void And12() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Acceder al modulo de Testing1");
            Report.reportLog(dependencies, "Acceder al modulo de Testing1 testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AccederalmodulodeTestAction1.doA_AccederalmodulodeTestAction1();
            Report.reportLog(dependencies, "Acceder al modulo de Testing1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.reportLog(dependencies, te.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(te));
            throw new Exception(te.getMessage());
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            Report.reportErrors(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

	@When("^Subir un fichero y comprobar la correcta subida$")
    public void When7() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>WHEN</b> Subir un fichero y comprobar la correcta subida");
            Report.reportLog(dependencies, "Subir un fichero y comprobar la correcta subida testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            w_SubirunficheroycomproAction.doW_SubirunficheroycomproAction();
            Report.reportLog(dependencies, "Subir un fichero y comprobar la correcta subida action completed", "INFO", 0, Status.PASS, false, "", "", null);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.reportLog(dependencies, te.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(te));
            throw new Exception(te.getMessage());
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            Report.reportErrors(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

	
    @After("@UpdateFileScen")
    public void after() {
        dependencies.isAfter = true;
        dependencies.isBackend = false;
        String afterResult = "succesfully";
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AFTER</b> UpdateFileScen");
            
			t_EliminarproyectollamadoAction.doT_EliminarproyectollamadoAction();

        } catch (AssertionError e) {
            Report.reportErrors(e.getMessage());
            dependencies.captureLog ="KO";
            afterResult = "not succesfully";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.WARNING, true, "isCatch", "", Throwables.getStackTraceAsString(e));
        } catch (Exception e) {
            Report.reportErrors(e.getMessage());
            dependencies.captureLog ="KO";
            afterResult = "not succesfully";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.WARNING, true, "isCatch", "", Throwables.getStackTraceAsString(e));
        }
        
        dependencies.isAfter = false;
        dependencies.logger.info("Result on UpdateFileScen" + ":" + dependencies.finalResult);
        dependencies.logger.info("After execution finished" + ":" + afterResult);
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.initialize.flush();
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
