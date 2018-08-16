package com.revature.webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svp_overview {
	static WebDriver wd = null;

	public static void main(String[] args) {
		launchApplication();
		login();
		cycleFilters();
		cycleAllBatches();
		exportCSV();
		logout();
	}

	private static void logout() {
		// TODO Auto-generated method stub
		
	}

	private static void exportCSV() {
		// TODO Auto-generated method stub
		
	}

	private static void cycleAllBatches() {
		// TODO Auto-generated method stub
		
	}

	private static void cycleFilters() {
		// TODO Auto-generated method stub
		
	}

	private static void login() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		wd.findElement(By.name("email")).sendKeys("svp@revature.com");
		wd.findElement(By.name("password")).sendKeys("p@$$w0rd");
		wd.findElement(By.name("submit")).click();

	}

	private static void launchApplication() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://assignforce-client.cfapps.io");		
	}

}
