package com.revature.testng;

import java.io.File;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrainerOverview {
static WebDriver wd = null;
	private static void logout() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.id("logoutBTN")).click();
		wd.quit();
	}
  
  private static void exportCSV() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\'mat-expansion-panel-header-0\']/span/mat-panel-description/mat-icon[1]")).click();
	}
  
  	private static void cycleAllBatches() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id='mat-expansion-panel-header-0']/span/mat-panel-description/mat-icon[2]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\'cdk-overlay-0\']/div/div/button[2]")).click();
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id='mat-expansion-panel-header-0']/span/mat-panel-description/mat-icon[2]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\'cdk-overlay-0\']/div/div/button[3]")).click();
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id='mat-expansion-panel-header-0']/span/mat-panel-description/mat-icon[2]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wd.findElement(By.xpath("//*[@id=\'cdk-overlay-0\']/div/div/button[1]")).click();	
	}
  
  private static void cycleSorts() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> elements = wd.findElements(By.cssSelector(".mat-sort-header-button"));
		for (int i = 0;i<elements.size();i++) {
				System.out.println("i = "+i);
				try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				elements.get(i).click();
				try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
	}
  
  private static void loginTrainer() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		wd.findElement(By.name("email")).sendKeys("test.trainer@revature.com");
		wd.findElement(By.name("password")).sendKeys("p@$$w0rd");
		wd.findElement(By.name("submit")).click();

	}

  
  private static void launchApplication() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://assignforce-client.cfapps.io");		
	}
  
  @Test (priority=0)
	public void testAppLaunch() {
		launchApplication();
	}
	
	@Test (dependsOnMethods="testAppLaunch")
	public void testLoginTrainer(){
		loginTrainer();
	}
	
	@Test (dependsOnMethods="testLoginTrainer")
	public void testCycleSorts() {
		cycleSorts();
	}
	
	@Test (dependsOnMethods="testCycleSorts")
	public void testCycleBatches() {
		cycleAllBatches();
	}
	
	@Test (dependsOnMethods="testCycleBatches")
	public void testExportCSV() {
		exportCSV();
	}
	
	@Test (priority=6)
	public void testLogout() {
		logout();
	}
  
}
