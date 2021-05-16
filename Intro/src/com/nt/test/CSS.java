package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("shanya@123");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
        
	}

}
