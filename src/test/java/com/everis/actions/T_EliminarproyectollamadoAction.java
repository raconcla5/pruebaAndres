package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;

import com.everis.customActions.DeleteProyect1;
	
import com.everis.pages.LogoutPage;
import com.everis.pages.DeleteProyectPage;


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

public class T_EliminarproyectollamadoAction {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    private DeleteProyect1 deleteProyect1;
	
    
    private LogoutPage logoutPage;
 	private DeleteProyectPage deleteProyectPage;
 	
    
    public T_EliminarproyectollamadoAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        logoutPage = new LogoutPage(dependencies);
deleteProyectPage = new DeleteProyectPage(dependencies);

        deleteProyect1 = new DeleteProyect1(dependencies);
	
    }
    


	public T_EliminarproyectollamadoAction IndexProfile1 () {
        dependencies.driver.get(dependencies.prop.getProperty("WEB_URL") + "/profile/home");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("WEB_URL") + "/profile/home", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }


public T_EliminarproyectollamadoAction DeleteProyect1() throws Exception {
          deleteProyect1.doDeleteProyect1();
          Report.reportLog(dependencies, "DeleteProyect1 action completed", "INFO", 1000, Status.PASS, false, "", "", null);
          return this;
        }
        
        


    public void doT_EliminarproyectollamadoAction() throws Exception {

		IndexProfile1();
		Thread.sleep(1000);

		deleteProyectPage.MenuProyects1();
		Thread.sleep(1000);

		DeleteProyect1();
		Thread.sleep(1000);

		logoutPage.GoToProfile1();
		Thread.sleep(1000);

		logoutPage.SignOut1();
    }
}