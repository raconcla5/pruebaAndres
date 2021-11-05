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
 
public class get {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";

    private static String URL = "https://reqres.in/api/users";

    
    
    public Response getGET() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response getGET1() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response getGET2() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response getGET3() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response getGET4() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }
public Response getGET5() throws Exception {
        try{
			String queryParam = "page/2";
            Response response = given()
                .contentType(contentType)
				.header("Accept-Charset", "UTF-8")
                .when()
                .get(URL + queryParam);
            return response;
        } catch (Exception e) {
            String message = e.getMessage() != null ? e.getMessage() : "Found a bad request error to this url: " + URL;
            throw new Exception (message);
        }
    }

}