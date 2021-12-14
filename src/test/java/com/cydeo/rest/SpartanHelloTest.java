package com.cydeo.rest;

import io.restassured.RestAssured;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.restassured.RestAssured.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class SpartanHelloTest {
    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI = "http://54.236.150.168:8000";
        RestAssured.basePath = "/api";

    }
    @AfterAll
    public static void teardown(){
        RestAssured.reset();
    }
    @Test
    public void testHello(){
        given()
                .log().all().
        when()
                .get("/hello").
        then()
                .log().all()
                .statusCode(200);

    }

}
