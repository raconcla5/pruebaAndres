package com.everis.request;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.HashMap;
import com.aventstack.extentreports.Status;
import java.io.IOException;
import com.everis.utils.Utils;
        import com.everis.report.Report;
 
public class RealizaPOST {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";

    private static String URL = "https://reqres.in/api/users";

    private static String RealizaPOST = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST.json";
	private static String RealizaPOST1 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST1.json";
	private static String RealizaPOST2 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST2.json";
	private static String RealizaPOST3 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST3.json";
	private static String RealizaPOST4 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST4.json";
	private static String RealizaPOST5 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST5.json";
	
    public Response RealizaPOSTPOST() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    public Response RealizaPOSTPOST1() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST1); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    public Response RealizaPOSTPOST2() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST2); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    public Response RealizaPOSTPOST3() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST3); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    public Response RealizaPOSTPOST4() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST4); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    public Response RealizaPOSTPOST5() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST5); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

    
}