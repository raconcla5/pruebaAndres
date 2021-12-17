package com.dedalow.request;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.HashMap;
import com.aventstack.extentreports.Status;
import java.io.IOException;
import com.dedalow.utils.Utils;
import com.dedalow.report.Report;
 
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
	private static String RealizaPOST6 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST6.json";
	private static String RealizaPOST7 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST7.json";
	private static String RealizaPOST8 = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "RealizaPOST8.json";
	
    public String jsonVariable (String jsonBody, HashMap<String, String> Variables) {
                int position = jsonBody.indexOf("${");
                while (position != -1) {
                        String nameVariable = jsonBody.substring(position+2, jsonBody.indexOf("}"));
                        String variable = jsonBody.substring(position, jsonBody.indexOf("}")+1);
                        jsonBody = jsonBody.replace(variable, '"' + Variables.get(nameVariable) + '"');
                    position = jsonBody.indexOf("${");
                }
                return jsonBody;
            }

    public Response RealizaPOSTPOST(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST1(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST1); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST2(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST2); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST3(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST3); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST4(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST4); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST5(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST5); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST6(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST6); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST7(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST7); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response RealizaPOSTPOST8(HashMap<String, String> Variables) throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(RealizaPOST8); 
String jsonBodyVariable = jsonVariable(jsonBody, Variables);
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8", "Content-Type", "application/json")
				.body(jsonBodyVariable)
                .when()
                .post(URL);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

}