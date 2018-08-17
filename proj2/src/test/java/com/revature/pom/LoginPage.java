package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private static WebElement element;
	
	public static WebElement user(WebDriver wd) {
		element = wd.findElement(By.name("email"));
		return element;
	}
	public static WebElement pass(WebDriver wd) {
		element = wd.findElement(By.name("password"));
		return element;
	}
	public static WebElement submit(WebDriver wd) {
		element = wd.findElement(By.name("submit"));
		return element;
	}
}
