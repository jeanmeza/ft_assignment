package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeEach
    void setUpBeforeClass() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }
}
