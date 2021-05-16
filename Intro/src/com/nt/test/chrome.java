package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my 1st code ");
        driver.findElement(By.name("pass")).sendKeys("123");
       // driver.findElement(By.linkText("Forgotten password?")).click();
     //  driver.findElement(By.xpath("//*[@id=\'u_0_d_WI\']")).click();
       System.out.println(driver.findElement(By.cssSelector("div#error_box")).getText());
		//driver.findElement(By.cssSelector("#email")).sendKeys("email address");
	//	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123");
	//	driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		
}
}
