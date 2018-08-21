package com.revature.testng;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSVPLogin {

	public static WebDriver wd = null;
	
	public static void openChrome() {
		File ff = new File("src/main/resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", ff.getAbsolutePath());
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		wd = new ChromeDriver(co);
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void clickTab(String tabId) { 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(wd);
		WebElement we = wd.findElement(By.id(tabId));
		we.click();
		System.out.println(we);
	}
	
	@Test
	public static void SVPlogin() {
		openChrome();
		wd.get("https://assignforce-client.cfapps.io/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement elEmail = wd.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div/div[1]/div/input"));
		WebElement elEmail = wd.findElement(By.name("email"));
		elEmail.click();
		WebElement elPass = wd.findElement(By.name("password"));
		WebElement elSubmit = wd.findElement(By.name("submit"));
		elEmail.sendKeys("svp@revature.com");
		elPass.sendKeys("p@$$w0rd");
		elSubmit.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String newUrl = wd.getCurrentUrl();
		Assert.assertEquals(newUrl, "https://assignforce-client.cfapps.io/overview");
	}
	
}
