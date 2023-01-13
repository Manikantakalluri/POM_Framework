package com.POM_Framework;

import org.openqa.selenium.By;

import com.framework.testbase.TestBase;

public class AutomationPractice extends TestBase{
	
	public void loginTest() throws InterruptedException {
		init();
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password123");
		driver.findElement(By.name("SubmitLogin")).click();
		Thread.sleep(4000);
		driver.close();
		
		
	}
}
