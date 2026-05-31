package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestEditOwnerEmptyField extends BaseTest {


	@Test
	public void TestEditOwnerEmptyFieldM() throws InterruptedException {

		String lastName = "Black";

		driver.findElement(By.cssSelector("[title='find owners']")).click();
		Thread.sleep(UI_WAIT_MS);

		driver.findElement(By.id("lastName")).sendKeys(lastName);

		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(UI_WAIT_MS);

		driver.findElement(By.linkText("Edit Owner")).click();
		Thread.sleep(UI_WAIT_MS);

		driver.findElement(By.id("city")).clear();

		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(UI_WAIT_MS);

		try {

			// The city validation message should say "must not be blank" after clearing and submitting the city field.
			// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test.

		} catch (Exception e) {

			fail("City must not be empty error message could not found !: " + e.getMessage());
		}
	}

}
