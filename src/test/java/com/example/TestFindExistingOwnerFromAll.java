package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestFindExistingOwnerFromAll extends BaseTest {


    @Test
    public void TestFindExistingOwnerFromAllM() {
        String owner = "George Franklin";
        driver.findElement(By.cssSelector("[title='find owners']")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();
        driver.findElement(By.linkText("George Franklin")).click();
        // Check if the first item of the list has wanted lastname
        assertEquals(owner, driver.findElement(By.xpath("//b[contains(text(),'George Franklin')]")).getText());
    }

}
