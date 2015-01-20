
package com.tesco.dropwizard.swagger;

import com.jayway.restassured.RestAssured;
import org.eclipse.jetty.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

public abstract class DropwizardTest {

    private final int port;
    private final String path;

    protected DropwizardTest(int port, String path) {
        this.port = port;
        this.path = path;
    }

    @Before
    public void setPort() {
        RestAssured.port = port;
    }

    @Test
    public void resourceIsAvailable() throws Exception {
        if (path.equals("/")) {
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get("/test.json");
        } else {
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get(path + "/test.json");
        }
    }

    @Test
    public void swaggerIsAvailable() throws Exception {
        if (path.equals("/")) {
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get("/api-docs");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get("/api-docs/test");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get("/swagger");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get("/swagger/");
        } else {
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get(path + "/api-docs");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get(path + "/api-docs/test");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get(path + "/swagger");
            RestAssured.expect().statusCode(HttpStatus.OK_200).when().get(path + "/swagger/");
        }
    }
}
