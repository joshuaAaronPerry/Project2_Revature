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
		launchApp();
		loginTrainer();
		closeApp();

	}

	public static void launchApp() {
		// TODO Auto-generated method stub
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d = new ChromeDriver();
		d.get("https://assignforce-client.cfapps.io/login");
	}

	public static void loginSVP() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.findElement(By.name("email")).sendKeys("svp@revature.com");
		d.findElement(By.name("password")).sendKeys("p@$$w0rd");
		d.findElement(By.name("submit")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("before");
		d.findElement(By.id("mat-tab-label-0-1")).click();
		System.out.println("after");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void loginTrainer() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.findElement(By.name("email")).sendKeys("test.trainer@revature.com");
		d.findElement(By.name("password")).sendKeys("p@$$w0rd");
		d.findElement(By.name("submit")).click();

		
	}

	public static void closeApp() {
		d.quit();
	}
}