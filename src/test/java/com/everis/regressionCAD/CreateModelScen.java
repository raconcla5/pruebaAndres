package com.everis.regressionCAD;

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

public class CreateModelScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionCAD";
    private SharedDependencies dependencies;
    
	private static By waitTesting = By.xpath("//*[@id=\"myCards\"]/div[2]/div/div/div/div[1]/a/div/div[1]");

    private G_CrearunproyectonuevoAction g_CrearunproyectonuevoAction;
    private A_AccederalmodulodeTestAction a_AccederalmodulodeTestAction;
    private W_AadirlacajaTestingConAction w_AadirlacajaTestingConAction;
    private A_AadimoslaconfiguracionAction a_AadimoslaconfiguracionAction;
    private T_AadimosunaSuiteAction t_AadimosunaSuiteAction;
    private W_AadimosunTestCaseAction w_AadimosunTestCaseAction;
    private A_AadimosStepsenelBefoAction a_AadimosStepsenelBefoAction;
    private A_AadimosStepsenelExecAction a_AadimosStepsenelExecAction;
    private A_AadimosStepsenelAfteAction a_AadimosStepsenelAfteAction;
    private W_AadimosunBeforeEachAction w_AadimosunBeforeEachAction;
    private A_AadirlosStepsAction a_AadirlosStepsAction;
    private T_GenerarelproyectoconMAction t_GenerarelproyectoconMAction;
    private A_EliminalosproyectoscreAction a_EliminalosproyectoscreAction;
    

    public CreateModelScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "CreateModelScen";
    }

    public void initActions() throws Exception {
        g_CrearunproyectonuevoAction = new G_CrearunproyectonuevoAction(dependencies);
            a_AccederalmodulodeTestAction = new A_AccederalmodulodeTestAction(dependencies);
            w_AadirlacajaTestingConAction = new W_AadirlacajaTestingConAction(dependencies);
            a_AadimoslaconfiguracionAction = new A_AadimoslaconfiguracionAction(dependencies);
            t_AadimosunaSuiteAction = new T_AadimosunaSuiteAction(dependencies);
            w_AadimosunTestCaseAction = new W_AadimosunTestCaseAction(dependencies);
            a_AadimosStepsenelBefoAction = new A_AadimosStepsenelBefoAction(dependencies);
            a_AadimosStepsenelExecAction = new A_AadimosStepsenelExecAction(dependencies);
            a_AadimosStepsenelAfteAction = new A_AadimosStepsenelAfteAction(dependencies);
            w_AadimosunBeforeEachAction = new W_AadimosunBeforeEachAction(dependencies);
            a_AadirlosStepsAction = new A_AadirlosStepsAction(dependencies);
            t_GenerarelproyectoconMAction = new T_GenerarelproyectoconMAction(dependencies);
            a_EliminalosproyectoscreAction = new A_EliminalosproyectoscreAction(dependencies);
            
    }

    @Before("@CreateModelScen")
    public void before()  {
        try {
            dependencies.setUp(FeatureName);
			dependencies.setUpEnvironment("MAIN_CONTEXT");
            initActions();
        } catch (Exception e) {
            Report.reportErrors(e.getMessage());
        }
    }

    @Given("^Crear un proyecto nuevo.$")
    public void Given2() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>GIVEN</b> Crear un proyecto nuevo.");
            Report.reportLog(dependencies, "Crear un proyecto nuevo. testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            g_CrearunproyectonuevoAction.doG_CrearunproyectonuevoAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Crear un proyecto nuevo. action completed", "INFO", 5000, Status.PASS, false, "", "", null);

            new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(waitTesting));
            Report.reportLog(dependencies, "Condition waitTesting isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);

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

	@And("^Acceder al modulo de Testing$")
    public void And1() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Acceder al modulo de Testing");
            Report.reportLog(dependencies, "Acceder al modulo de Testing testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AccederalmodulodeTestAction.doA_AccederalmodulodeTestAction();
            Report.reportLog(dependencies, "Acceder al modulo de Testing action completed", "INFO", 0, Status.PASS, false, "", "", null);
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

	@When("^Añadir la caja TestingContext$")
    public void When2() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>WHEN</b> Añadir la caja TestingContext");
            Report.reportLog(dependencies, "Añadir la caja TestingContext testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            w_AadirlacajaTestingConAction.doW_AadirlacajaTestingConAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadir la caja TestingContext action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@And("^Añadimos la configuracion$")
    public void And3() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Añadimos la configuracion");
            Report.reportLog(dependencies, "Añadimos la configuracion testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AadimoslaconfiguracionAction.doA_AadimoslaconfiguracionAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos la configuracion action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@Then("^Añadimos una Suite$")
    public void Then2() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>THEN</b> Añadimos una Suite");
            Report.reportLog(dependencies, "Añadimos una Suite testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            t_AadimosunaSuiteAction.doT_AadimosunaSuiteAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos una Suite action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@When("^Añadimos un TestCase$")
    public void When4() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>WHEN</b> Añadimos un TestCase");
            Report.reportLog(dependencies, "Añadimos un TestCase testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            w_AadimosunTestCaseAction.doW_AadimosunTestCaseAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos un TestCase action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@And("^Añadimos Steps en el Before$")
    public void And2() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Añadimos Steps en el Before");
            Report.reportLog(dependencies, "Añadimos Steps en el Before testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AadimosStepsenelBefoAction.doA_AadimosStepsenelBefoAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos Steps en el Before action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@And("^Añadimos Steps en el Execute$")
    public void And5() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Añadimos Steps en el Execute");
            Report.reportLog(dependencies, "Añadimos Steps en el Execute testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AadimosStepsenelExecAction.doA_AadimosStepsenelExecAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos Steps en el Execute action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@And("^Añadimos Steps en el After$")
    public void And6() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Añadimos Steps en el After");
            Report.reportLog(dependencies, "Añadimos Steps en el After testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AadimosStepsenelAfteAction.doA_AadimosStepsenelAfteAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos Steps en el After action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@When("^Añadimos un BeforeEach$")
    public void When3() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>WHEN</b> Añadimos un BeforeEach");
            Report.reportLog(dependencies, "Añadimos un BeforeEach testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            w_AadimosunBeforeEachAction.doW_AadimosunBeforeEachAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadimos un BeforeEach action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@And("^Añadir los Steps$")
    public void And4() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AND</b> Añadir los Steps");
            Report.reportLog(dependencies, "Añadir los Steps testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            a_AadirlosStepsAction.doA_AadirlosStepsAction();
			Thread.sleep(5000);
            Report.reportLog(dependencies, "Añadir los Steps action completed", "INFO", 5000, Status.PASS, false, "", "", null);
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

	@Then("^Generar el proyecto con Main$")
    public void Then1() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>THEN</b> Generar el proyecto con Main");
            Report.reportLog(dependencies, "Generar el proyecto con Main testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            t_GenerarelproyectoconMAction.doT_GenerarelproyectoconMAction();
            Report.reportLog(dependencies, "Generar el proyecto con Main action completed", "INFO", 0, Status.PASS, false, "", "", null);
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

	
    @After("@CreateModelScen")
    public void after() {
        dependencies.isAfter = true;
        dependencies.isBackend = false;
        String afterResult = "succesfully";
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>AFTER</b> CreateModelScen");
            
			a_EliminalosproyectoscreAction.doA_EliminalosproyectoscreAction();

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
        dependencies.logger.info("Result on CreateModelScen" + ":" + dependencies.finalResult);
        dependencies.logger.info("After execution finished" + ":" + afterResult);
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.initialize.flush();
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
