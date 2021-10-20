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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Throwables;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import com.everis.RunnerTest;
import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;
import com.aventstack.extentreports.Status;

import com.everis.actions.G_AccederalaHomePageyrAction;

public class Background_Release5 {
    private ArrayList<String> results = new ArrayList<String>();
    private String finalResult = "OK";
    private SharedDependencies dependencies;
    
	private G_AccederalaHomePageyrAction g_AccederalaHomePageyrAction;

    public Background_Release5(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        initActions();
    }

    public void initActions() {
        try {
            
			g_AccederalaHomePageyrAction = new G_AccederalaHomePageyrAction(dependencies);
        } catch (Exception e) {
            Report.reportErrors(e.getMessage());
        }
    }

    @Given("^Acceder a la HomePage y realizar el login$")
    public void Given() throws Exception {
        try {
            dependencies.parentTest = dependencies.test.createNode("<b>GIVEN</b> Acceder a la HomePage y realizar el login");
            Report.reportLog(dependencies, "Acceder a la HomePage y realizar el login testAction is going to start", "INFO", 0, Status.PASS, false, "", "", null);
            g_AccederalaHomePageyrAction.doG_AccederalaHomePageyrAction();
            Report.reportLog(dependencies, "Acceder a la HomePage y realizar el login action completed", "INFO", 0, Status.PASS, false, "", "", null);
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.reportLog(dependencies, e.getMessage(), dependencies.level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            Report.reportErrors(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

	

}