package com.everis.release55;

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

public class ForderGlobalScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "Release55";
    private SharedDependencies dependencies;
    

    private G_CrearproyectoymodeladoAction g_CrearproyectoymodeladoAction;
    private W_SerealizaunasubidaalAction w_SerealizaunasubidaalAction;
    private DeleteCreateGlobalAction deleteCreateGlobalAction;
    

    public ForderGlobalScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "ForderGlobalScen";
    }

    public void initActions() throws Exception {
        g_CrearproyectoymodeladoAction = new G_CrearproyectoymodeladoAction(dependencies);
            w_SerealizaunasubidaalAction = new W_SerealizaunasubidaalAction(dependencies);
            deleteCreateGlobalAction = new DeleteCreateGlobalAction(dependencies);
            
    }

    @Before("@ForderGlobalScen")
    public void before()  {
        try {
            dependencies.setUp(FeatureName);
			dependencies.setUpEnvironment("MAIN_CONTEXT");
            initActions();
        } catch (Exception e) {
            Report.reportErrors(e.getMessage());
        }
    }

    @Given("^Crear proyecto y modelado$")
    public void Given() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>GIVEN</b> Crear proyecto y modelado");
            Report.reportLog(dependencies, "Crear proyecto y modelado testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            g_CrearproyectoymodeladoAction.doG_CrearproyectoymodeladoAction();
            Report.reportLog(dependencies, "Crear proyecto y modelado action completed", "INFO", 0, Status.PASS, false, "", "", null);
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

	@When("^Se realiza una subida al repositorio de Gogs$")
    public void When() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>WHEN</b> Se realiza una subida al repositorio de Gogs");
            Report.reportLog(dependencies, "Se realiza una subida al repositorio de Gogs testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            w_SerealizaunasubidaalAction.doW_SerealizaunasubidaalAction();
            Report.reportLog(dependencies, "Se realiza una subida al repositorio de Gogs action completed", "INFO", 0, Status.PASS, false, "", "", null);
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

	
    @After("@ForderGlobalScen")
    public void after() {
        dependencies.isAfter = true;
        dependencies.isBackend = false;
        String afterResult = "succesfully";
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AFTER</b> ForderGlobalScen");
            
			deleteCreateGlobalAction.doDeleteCreateGlobalAction();

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
        dependencies.logger.info("Result on ForderGlobalScen" + ":" + dependencies.finalResult);
        dependencies.logger.info("After execution finished" + ":" + afterResult);
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.initialize.flush();
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
