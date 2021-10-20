package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;


import com.everis.pages.ProfilePage;


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

public class DeleteCreateGlobalAction {
    
	private By IsClickDeleteProject = By.id("cadgitlab+createglobal");
	
	private By IsClickMenuProyects = By.xpath("//span[contains(text(),'Projects')]");
	
	private By IsClickDeleteProject1 = By.xpath("//button[contains(text(),'Delete Project ...')]");
	
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    private ProfilePage profilePage;
 	
    
    public DeleteCreateGlobalAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        profilePage = new ProfilePage(dependencies);

        
    }
    

	public DeleteCreateGlobalAction IsClickMenuProyects() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickMenuProyects));
            Report.reportLog(dependencies, "Condition IsClickMenuProyects isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public DeleteCreateGlobalAction IndexProfile2 () {
        dependencies.driver.get(dependencies.prop.getProperty("WEB_URL") + "/profile/home");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("WEB_URL") + "/profile/home", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }


	public DeleteCreateGlobalAction IsClickDeleteProject1() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickDeleteProject1));
            Report.reportLog(dependencies, "Condition IsClickDeleteProject1 isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }

	public DeleteCreateGlobalAction IsClickDeleteProject() {
        	new WebDriverWait(dependencies.driver, 60).until(ExpectedConditions.elementToBeClickable(IsClickDeleteProject));
            Report.reportLog(dependencies, "Condition IsClickDeleteProject isClickable finished", "INFO", 60, Status.PASS, true, "", "", null);
        	return this;
        }




    public void doDeleteCreateGlobalAction() throws Exception {

		IndexProfile2();
		Thread.sleep(1000);

		IsClickMenuProyects();

		profilePage.MenuProyects2();
		Thread.sleep(1000);

		profilePage.SelectCreateGlobal();
		Thread.sleep(1000);

		IsClickDeleteProject1();

		profilePage.DeleteProject();
		Thread.sleep(1000);

		IsClickDeleteProject();

		profilePage.DeleteProjectOK();
		Thread.sleep(5000);

		profilePage.GoToProfile2();
		Thread.sleep(1000);

		profilePage.SignOut2();
    }
}