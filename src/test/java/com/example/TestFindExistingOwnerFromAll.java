package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestFindExistingOwnerFromAll extends BaseTest {


	@Test
	public void TestFindExistingOwnerFromAllM() throws InterruptedException {
		String owner = "George Franklin";
		driver.findElement(By.cssSelector("[title='find owners']")).click();
		Thread.sleep(UI_WAIT_MS);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(UI_WAIT_MS);
		driver.findElement(By.linkText("George Franklin")).click();
		Thread.sleep(UI_WAIT_MS);

		// Insert here a JUnit 5 assertion that correctly reflects the purpose of the test.
	}

}
