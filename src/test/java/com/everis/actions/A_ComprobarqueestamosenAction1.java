package com.everis.actions;

import com.everis.utils.Utils;
import com.everis.report.Report;
import com.everis.SharedDependencies;




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

public class A_ComprobarqueestamosenAction1 {
    
    private String finalResult;
    private SharedDependencies dependencies;
    public Response apiResponse;
    
    
    
    
    
    public A_ComprobarqueestamosenAction1(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        
         
        
        
    }
    

	public A_ComprobarqueestamosenAction1 CheckPageHtmInitial() {
        
			assertTrue(dependencies.driver.getCurrentUrl().equals("https://html.com/attributes/a-target/"), "Field CheckPageHtmInitial not found in assertion");
        	Report.reportLog(dependencies, "The field https://html.com/attributes/a-target/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        Report.reportLog(dependencies, "CheckPageHtmInitial action completed", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }

    
    public void doA_ComprobarqueestamosenAction1() throws Exception {

		CheckPageHtmInitial();
    }
}