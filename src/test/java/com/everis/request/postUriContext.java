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
 
public class postUriContext {
    private static String contentType = "application/json";
    public static FileSystem fileSystem = FileSystems.getDefault();
    private static String separator = fileSystem.getSeparator();
    public String jsonBody = "";

    private static String URL = Utils.prop.getProperty("BACKEND_ENDPOINT") + "/api/users";

    private static String postUriContext = System.getProperty("user.dir") + separator + "resources"
            + separator + "request" + separator + "postUriContext.json";
	
    
    public Response postUriContextPOST() throws Exception {
        try{
			jsonBody = Utils.generateJSONBody(postUriContext); 
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