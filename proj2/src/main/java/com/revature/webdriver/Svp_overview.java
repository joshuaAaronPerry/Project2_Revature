package com.revature.webdriver;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svp_overview {
	static WebDriver wd = null;

	public static void main(String[] args) {
		launchApplication();
		login();
		//cycleSorts();
		//cycleAllBatches();
		//exportCSV();
		logout();
	}

	private static void logout() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.id("logoutBTN")).click();
		wd.quit();
	}

//	private static void exportCSV() {
//		// TODO Auto-generated method stub
//		
//	}
//
	private static void cycleAllBatches() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> elements = wd.findElements(By.className("mat-icon.material-icons"));
		System.out.println(elements.size());
	}

	private static void cycleSorts() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//wd.findElement(By.xpath("//div[@aria-label='Change sorting for name']")).click();
		//wd.findElement(By.name("Change sorting for name")).click();
		//System.out.println(wd.findElement(By.cssSelector(".mat-sort-header-button")).getText());
		List<WebElement> elements = wd.findElements(By.cssSelector(".mat-sort-header-button"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Name Sorting
		System.out.println(elements.get(0).getText());
		elements.get(0).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(0).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(0).click();
		
		//Curriculum sorting
		System.out.println(elements.get(1).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(1).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(1).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(1).click();
		
		//Trainer/Co-Trainer sorting
		System.out.println(elements.get(2).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(2).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(2).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(2).click();
		
		//Location sorting
		System.out.println(elements.get(3).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(3).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(3).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(3).click();
		
		//Building sorting
		System.out.println(elements.get(4).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(4).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(4).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(4).click();
		
		//Room sorting
		System.out.println(elements.get(5).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(5).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(5).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(5).click();
		//Start Date sorting
		System.out.println(elements.get(6).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(6).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(6).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(6).click();
		//End Date sorting
		System.out.println(elements.get(7).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(7).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(7).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(7).click();
		//Progress sorting
		System.out.println(elements.get(8).getText());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(8).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(8).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elements.get(8).click();
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
