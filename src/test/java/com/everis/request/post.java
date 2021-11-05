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
 
public class post {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";

    private static String URL = "https://reqres.in/api/users";

    private static String post = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post.json";
	private static String post1 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post1.json";
	private static String post2 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post2.json";
	private static String post3 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post3.json";
	private static String post4 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post4.json";
	private static String post5 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "post5.json";
	
    
    public Response postPOST() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postPOST1() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post1); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postPOST2() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post2); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postPOST3() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post3); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postPOST4() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post4); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
				.body(jsonBody)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response postPOST5() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(post5); 
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
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