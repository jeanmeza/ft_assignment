package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestFindNotExistingOwner extends BaseTest {


    @Test
    public void TestFindNotExistingOwnerM() {
        String lastName = "Rossi";
        driver.findElement(By.cssSelector("[title='find owners']")).click();
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        assertEquals("has not been found",
                driver.findElement(
                        By.xpath("html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/span[1]/div[1]/p[1]"))
                        .getText());
    }

}
