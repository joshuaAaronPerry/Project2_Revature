package com.revature.svp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	static WebDriver d = null;

	public static void main(String[] args) {
		launchApp();
		loginSVP();
		closeApp();
		
	}
	
	public static void launchApp() {
		// TODO Auto-generated method stub
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",  chrome.getAbsolutePath());
		d = new ChromeDriver();
		d.get("https://assignforce-client.cfapps.io");
	}
	
	public static void loginSVP() {
		d.findElement(By.name("email")).sendKeys("svp@revature.com");
		d.findElement(By.name("password")).sendKeys("p@$$w0rd");
		d.findElement(By.name("submit")).click();
		
		d.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div/div[1]/div/input")).sendKeys("svp@revature.com");
	}
	
	public static void closeApp() {
		d.quit();
	}
}
