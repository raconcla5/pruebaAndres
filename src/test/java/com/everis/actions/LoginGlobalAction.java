package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.LoginPage;


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

public class LoginGlobalAction {
    
	private By IsClickSingIn = By.id("login");
	
	private By VisibleNameProfile = By.xpath("//strong[contains(text(),'cadgitlab')]");
	
	private static By Nameprofile = By.xpath("//strong[contains(text(),'cadgitlab')]");
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private LoginPage loginPage;
 	
    
    public LoginGlobalAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        loginPage = new LoginPage(dependencies);

        
    }
    

	public LoginGlobalAction IsClickSingIn() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickSingIn));
            Report.reportLog(dependencies, "Condition IsClickSingIn isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public LoginGlobalAction IndexCAD () {
        dependencies.driver.get(dependencies.prop.getProperty("WEB_URL") + "");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("WEB_URL") + "", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	public LoginGlobalAction VisibleNameProfile() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.visibilityOfElementLocated(VisibleNameProfile));
            Report.reportLog(dependencies, "Condition VisibleNameProfile isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public LoginGlobalAction CheckProfile() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(Nameprofile));
            Report.reportLog(dependencies, "Condition Nameprofile isVisible finished", "ASYNCHRONOUS", 0);
			assertTrue("cadgitlab".equals(dependencies.driver.findElement(Nameprofile).getText()), "Field Nameprofile not found in assertion");
        	Report.reportLog(dependencies, "The field cadgitlab has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        Report.reportLog(dependencies, "CheckProfile action completed", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }

    
    public void doLoginGlobalAction() throws Exception {

		IndexCAD();
		Thread.sleep(1000);

		IsClickSingIn();

		loginPage.SingIn();
		Thread.sleep(1000);

		VisibleNameProfile();

		CheckProfile();
    }
}