package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindNotExistingOwner extends BaseTest {


	@Test
	public void TestFindNotExistingOwnerM() throws InterruptedException {
		String lastName = "Rossi";
		driver.findElement(By.cssSelector("[title='find owners']")).click();
		Thread.sleep(UI_WAIT_MS);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(UI_WAIT_MS);

		// The search form should display the "has not been found" message when no owner matches the last name.
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test.
	}

}
