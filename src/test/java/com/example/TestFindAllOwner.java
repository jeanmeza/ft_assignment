package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestFindAllOwner extends BaseTest {


    @Test
    public void TestFindAllOwnerM() {

        driver.findElement(By.cssSelector("[title='find owners']")).click();

        driver.findElement(By.cssSelector("[type='submit']")).click();

        // Check if there is a table for owners or not
        driver.findElement(By.id("vets"));
        assertTrue(true);

    }

}
