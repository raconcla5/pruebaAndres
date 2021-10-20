package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.ProjectsPage;


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

public class G_CrearproyectollamadoupAction {
    
	private By AsyncCondition1 = By.xpath("div[@class='loader-bg']");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    private LoginGlobalAction loginGlobalAction;
	
    private ProjectsPage projectsPage;
 	
    
    public G_CrearproyectollamadoupAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
        loginGlobalAction = new LoginGlobalAction(dependencies);
	 
        projectsPage = new ProjectsPage(dependencies);

        
    }
    




	public G_CrearproyectollamadoupAction AsyncCondition1() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(AsyncCondition1));
            Report.reportLog(dependencies, "Condition AsyncCondition1 isNotVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }


    public void doG_CrearproyectollamadoupAction() throws Exception {

		loginGlobalAction.doLoginGlobalAction();

		projectsPage.NewProject1();
		Thread.sleep(1000);

		projectsPage.CreateNew1();
		Thread.sleep(1000);

		projectsPage.CreateNewProject1();
		Thread.sleep(8000);

		AsyncCondition1();

		projectsPage.CreateSeed1();
    }
}