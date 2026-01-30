package com.example.demo.env;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class TestEnvVar extends FacadeIT {
  @Value("${orange.api.url}")
  private String orangeApiUrl;

  final String getVolaApiUrl = System.getenv("ORANGE_API_URL");

  @Value("${VOLA_API_KEY}")
  private String apiKey;

  @Test
  void test_api_url() {
    var value = "azertyuiop/123456789/test-value";
    assertEquals(value, orangeApiUrl);
  }

  @Test
  void test_get_api_url() {
    var value = "azertyuiop/123456789/test-value";
    assertEquals(value, getVolaApiUrl);
  }

  @Test
  void test_api_key() {
    var value = "vola/api/key/123456789";
    assertEquals(value, apiKey);
  }
}
