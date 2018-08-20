package com.revature.svp;

import java.io.File;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.xml.LaunchSuite;

public class Driver {

	static WebDriver d = null;

	public static void main(String[] args) {

			
//		launchScript();
		
//		launchApp();
//		loginSVP();
//		moveToLocationTab();
//		clickLocationBar();
//		expandFirstLocation();
//		collapseFirstLocation();
//
//		
//		addLocation();
//		
//		expandFirstLocation();
//		addBuilding();
//		addRoom();

//		closeApp();
//		launchApp();		
//		loginTrainer();
//		moveToCircula();
//		expandFocusBar();
//		collapseFocusBar();
//		addFocus();
//		closeApp();

//		launchResults();

	}
	
	public static void launchScript() {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("JavaScript");
		try {
			engine.eval("console.log('Hello World')");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean launchApp() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d = new ChromeDriver();
//		d.get("https://assignforce-client.cfapps.io/login");

		return true;
	}
	
	public static boolean goToAssignForce() {
		try{
			d.get("https://assignforce-client.cfapps.io/login");
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean loginSVP() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				
				Thread.sleep(500);
				d.findElement(By.name("email")).sendKeys("svp@revature.com");
				d.findElement(By.name("password")).sendKeys("p@$$w0rd");
				d.findElement(By.name("submit")).click();
				System.out.println("Finally Log in!");
				expand = false;

				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}
		return false;

	}

	public static boolean loginTrainer() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.name("email")).sendKeys("test.trainer@revature.com");
				d.findElement(By.name("password")).sendKeys("p@$$w0rd");
				d.findElement(By.name("submit")).click();
				System.out.println("Finally Log in!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}

		}

		return false;
	}

	public static boolean moveToLocationTab() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {

			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-2")).click();
				System.out.println("Finally moved!");
				expand = false;
				return true;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;
			}
		}
		return false;

	}

	public static boolean addLocation() {

		boolean expand = true;
		int i = 0;

		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(
						By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-description/mat-icon"))
						.click();
				d.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("FarAWAY");
				d.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("New Reston");
				d.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Virgina");
				d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-location-add-dialog/div[2]/button[1]")).click();
				System.out.println("Finally Clicked Add Location");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;

	}

	public static boolean addBuilding() {

		boolean expand = true;
		int i = 0;

		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(
						By.xpath("//*[@id=\"mat-expansion-panel-header-2\"]/span[1]/mat-panel-description/mat-icon[1]"))
						.click();
				d.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("New HQ");
				d.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-location-add-dialog/div[2]/button[1]")).click();
				System.out.println("Finally Added Building");
				expand = false;
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				i++;
			}
		}

		return false;
	}

	public static boolean addRoom() {
		boolean expand = true;
		int i = 0;

		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By
						.xpath("//*[@id=\"mat-expansion-panel-header-10\"]/span[1]/mat-panel-description/mat-icon[1]"))
						.click();
				d.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("555");
				d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-location-add-dialog/div[2]/button[1]")).click();
				System.out.println("Finally Added Room");
				expand = false;
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				i++;
			}
		}

		return false;
	}

	public static boolean clickLocationBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {

			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally collapse");
				expand = false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		int j = 0;
		while (!expand && j < 10) {

			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-1")).click();
				System.out.println("Finally expand");
				expand = true;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				j++;
			} catch (Exception e) {
				System.out.println("Naw");
				j++;


			}
		}
		return false;

	}

	public static boolean expandFirstLocation() {

		boolean expand = true;

		int i = 0;
		while (i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-2")).click();
				System.out.println("Finally Expanded First Location!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		return false;
	}

	public static boolean collapseFirstLocation() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-2")).click();
				System.out.println("Finally Collapse First location!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		return false;

	}

	public static boolean expandFirstBuilding() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-10")).click();
				System.out.println("Finally Expand First Building!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		return false;
	}

	public static boolean moveToCircula() {
		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-tab-label-0-3")).click();
				System.out.println("Finally moved!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		return false;
	}

	public static boolean addFocus() {
		try {
			d.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-17\"]/span[1]/mat-panel-description/button"))
					.click();

//		if(!(i < 10)) {
//			Assert.fail();
//		}

//		d.findElement(By.id("mat-input-2")).sendKeys("Troubleshoot");
//		d.findElement(By.id("mat-select-2")).click();
//		d.findElement(By.id("mat-option-111")).click();
//		d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-add-focus/div[2]/button[2]")).click();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public static boolean expandFocusBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-35")).click();
				System.out.println("Finally Expanded Focus Bar!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;
			}
		}

		return false;

	}

	public static boolean collapseFocusBar() {

		boolean expand = true;

		int i = 0;
		while (expand && i < 10) {
			try {
				Thread.sleep(500);
				d.findElement(By.id("mat-expansion-panel-header-35")).click();
				System.out.println("Finally Collapsed Focus Bar!");
				expand = false;
				return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Nope");
				i++;
			} catch (Exception e) {
				System.out.println("Naw");
				i++;

			}
		}

		return false;

	}

	public static boolean closeApp() {
		try {
			Thread.sleep(2000);
			d.quit();
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean launchResults() {
		try {
			File chrome = new File("src/main/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
			d = new ChromeDriver();
			d.get("C:\\Users\\LiL'Birdman\\Documents\\Project2_Revature\\proj2\\test-output\\Default suite\\Default test.html");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
