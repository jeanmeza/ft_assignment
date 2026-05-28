package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestEditOwnerEmptyField extends BaseTest {


    @Test
    public void TestEditOwnerEmptyFieldM() {

        String lastName = "Black";

        driver.findElement(By.cssSelector("[title='find owners']")).click();

        driver.findElement(By.id("lastName")).sendKeys(lastName);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        driver.findElement(By.linkText("Edit Owner")).click();

        driver.findElement(By.id("city")).clear();

        driver.findElement(By.cssSelector("[type='submit']")).click();

        try {

            assertEquals("must not be empty", driver.findElement(By.className("help-inline")).getText());

        } catch (Exception e) {

            fail("City must not be empty error message could not found !: " + e.getMessage());
        }
    }

}
