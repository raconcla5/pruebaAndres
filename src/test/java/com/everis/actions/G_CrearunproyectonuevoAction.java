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

public class G_CrearunproyectonuevoAction {
    
	private By AsyncCondition = By.xpath("div[@class='loader-bg']");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private ProjectsPage projectsPage;
 	
    
    public G_CrearunproyectonuevoAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        projectsPage = new ProjectsPage(dependencies);

        
    }
    



	public G_CrearunproyectonuevoAction AsyncCondition() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.invisibilityOfElementLocated(AsyncCondition));
            Report.reportLog(dependencies, "Condition AsyncCondition isNotVisible finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }


    public void doG_CrearunproyectonuevoAction() throws Exception {

		projectsPage.NewProject();
		Thread.sleep(1000);

		projectsPage.CreateNew();
		Thread.sleep(1000);

		projectsPage.CreateNewProject();
		Thread.sleep(8000);

		AsyncCondition();

		projectsPage.CreateSeed();
    }
}