package com.nt.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle()); // to validate if your page title is correct
	     System.out.println(driver.getCurrentUrl());// validate if you are landed on correct url
		//System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		driver.quit();
	}

}
