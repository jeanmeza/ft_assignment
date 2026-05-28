package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestEditOwnerWithLongTelephone extends BaseTest {


    @Test
    public void TestEditOwnerWithLongTelephoneM() {

        String telephone = "1234567898765";
        String lastName = "Black";

        driver.findElement(By.cssSelector("[title='find owners']")).click();

        driver.findElement(By.id("lastName")).sendKeys(lastName);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        driver.findElement(By.linkText("Edit Owner")).click();

        driver.findElement(By.id("telephone")).clear();
        driver.findElement(By.id("telephone")).sendKeys(telephone);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        try {

            assertEquals("numeric value out of bounds (<10 digits>.<0 digits> expected)",
                    driver.findElement(By.className("help-inline")).getText());

        } catch (Exception e) {

            fail("Telephone control does not work !: " + e.getMessage());
        }
    }

}
