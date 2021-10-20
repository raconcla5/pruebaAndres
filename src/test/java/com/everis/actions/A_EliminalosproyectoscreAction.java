package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;

import com.everis.customActions.DeleteProyect;
	
import com.everis.pages.DeleteProyectPage;
import com.everis.pages.LogoutPage;


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

public class A_EliminalosproyectoscreAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    private DeleteProyect deleteProyect;
	
    
    private DeleteProyectPage deleteProyectPage;
 	private LogoutPage logoutPage;
 	
    
    public A_EliminalosproyectoscreAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        deleteProyectPage = new DeleteProyectPage(dependencies);
logoutPage = new LogoutPage(dependencies);

        deleteProyect = new DeleteProyect(dependencies);
	
    }
    


	public A_EliminalosproyectoscreAction IndexProfile () {
        dependencies.driver.get(dependencies.prop.getProperty("WEB_URL") + "/profile/home");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("WEB_URL") + "/profile/home", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }


public A_EliminalosproyectoscreAction DeleteProyect() throws Exception {
          deleteProyect.doDeleteProyect();
          Report.reportLog(dependencies, "DeleteProyect action completed", "INFO", 1000, Status.PASS, false, "", "", null);
          return this;
        }
        
        


    public void doA_EliminalosproyectoscreAction() throws Exception {

		IndexProfile();
		Thread.sleep(1000);

		deleteProyectPage.MenuProyects();
		Thread.sleep(1000);

		DeleteProyect();
		Thread.sleep(1000);

		logoutPage.GoToProfile();
		Thread.sleep(1000);

		logoutPage.SignOut();
    }
}