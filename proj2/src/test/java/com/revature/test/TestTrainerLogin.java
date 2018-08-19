package com.revature.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrainerLogin {

	@Test
	public static void trainerLogin() {
		TestSVPLogin.openChrome();
		TestSVPLogin.wd.get("https://assignforce-client.cfapps.io/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement elEmail = TestSVPLogin.wd.findElement(By.name("email"));
		elEmail.click();
		WebElement elPass = TestSVPLogin.wd.findElement(By.name("password"));
		WebElement elSubmit = TestSVPLogin.wd.findElement(By.name("submit"));
		elEmail.sendKeys("test.trainer@revature.com");
		elPass.sendKeys("p@$$w0rd");
		elSubmit.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String newUrl = TestSVPLogin.wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/overview");
	}
}
