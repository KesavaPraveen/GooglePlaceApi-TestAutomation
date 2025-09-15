package com.api.testing.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static io.restassured.RestAssured.given;

public class ApiClient {
    private static  RequestSpecification requestSpecification;
    private static  ResponseSpecification responseSpecification;

    public static RequestSpecification requestSpecification()
    {
        if(requestSpecification==null) {
            PrintStream printStream = null;
            try {
                printStream = new PrintStream(new FileOutputStream("logging.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            requestSpecification =
                    new RequestSpecBuilder().setBaseUri(ConfigManager.getBaseURI())
                            .setContentType(ContentType.JSON)
                            .addQueryParam("key", " qaclick123")
                            .addFilter(RequestLoggingFilter.logRequestTo(printStream))
                            .addFilter(ResponseLoggingFilter.logResponseTo(printStream))
                            .build();
        }
        return requestSpecification;
    }
    public static ResponseSpecification responseSpecification()
    {
        responseSpecification=new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
        return responseSpecification;
    }

    public static Response post(String endpoint, Object body) {
        return given()
                .spec(requestSpecification())
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .spec(responseSpecification())
                .extract()
                .response();
    }
    public static Response get(String endpoint) {
        RequestSpecification spec = given().spec(requestSpecification());
        return spec
                .when()
                .get(endpoint)
                .then()
                .spec(responseSpecification())
                .extract()
                .response();
    }
    public static Response delete(String endpoint, Object body) {
        RequestSpecification spec = given().spec(requestSpecification());
        if (body != null) {
            spec = spec.body(body);
        }
        return spec
                .when()
                .delete(endpoint)
                .then()
                .spec(responseSpecification())
                .extract()
                .response();
    }
    public static Response put(String endpoint, Object body) {
        return given()
                .spec(requestSpecification())
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .spec(responseSpecification())
                .extract()
                .response();
    }
}
