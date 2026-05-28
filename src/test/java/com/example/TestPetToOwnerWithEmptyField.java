package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestPetToOwnerWithEmptyField extends BaseTest {


    @Test
    public void TestPetToOwnerWithEmptyFieldM() {

        String lastName = "Black";

        driver.findElement(By.cssSelector("[title='find owners']")).click();

        driver.findElement(By.id("lastName")).sendKeys(lastName);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        driver.findElement(By.linkText("Add New Pet")).click();

        driver.findElement(By.cssSelector("[type='submit']")).click();

        try {

            Thread.sleep(1000);

            assertEquals(2, driver.findElements(By.className("help-inline")).size());

        } catch (Exception e) {

            fail("New Pet Add empty field control could not found!: " + e.getMessage());

        }
    }

}
