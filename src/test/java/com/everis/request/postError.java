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
 
public class postError {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";

    private static String URL = "https://reqres.in";

    private static String postError = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError.json";
	private static String postError1 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError1.json";
	private static String postError2 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError2.json";
	private static String postError3 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError3.json";
	private static String postError4 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError4.json";
	private static String postError5 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postError5.json";
	
    
    public Response postErrorPOST() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postErrorPOST1() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError1); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postErrorPOST2() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError2); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postErrorPOST3() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError3); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postErrorPOST4() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError4); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postErrorPOST5() throws Exception {
        try{
			String queryParam = "/api/users";
			jsonBody = Utils.generateJSONBody(postError5); 
            Response response = given()
                .contentType(contentType)
				.body(jsonBody)
                .when()
                .post(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

}