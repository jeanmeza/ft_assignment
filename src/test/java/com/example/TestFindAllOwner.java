package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFindAllOwner extends BaseTest {


	@Test
	public void TestFindAllOwnerM() throws InterruptedException {

		driver.findElement(By.cssSelector("[title='find owners']")).click();
		Thread.sleep(UI_WAIT_MS);

		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(UI_WAIT_MS);

		// Check if there is a table for owners or not
		driver.findElement(By.id("owners"));

		// The owners search result page should contain the owners table with id "owners".
		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test.

	}

}
