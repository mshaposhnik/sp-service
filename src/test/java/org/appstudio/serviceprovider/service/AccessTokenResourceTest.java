package org.appstudio.serviceprovider.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class AccessTokenResourceTest {

  @Test
  public void testHelloEndpoint() {
    given().when().get("api/v1/token").then().statusCode(200);
  }
}
