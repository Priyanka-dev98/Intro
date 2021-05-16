package com.nt.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//arrival and destination
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		//parent xpath and xpath of element
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//driver.findElement(By.cssSelector("view_fulldate_id_1")).click();
		  
		//diabling the calender for destination using unique attribute style whcih changes
		   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	       
		   //selecting round trip and checking whether it is enables or not
		   driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	        {
	        	System.out.println("its enabled");
	        	Assert.assertTrue(true);
	        }
	        else {
	        	Assert.assertTrue(false); 
	        }

	        //checkbox
			System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
			
			driver.findElement(By.id("divpaxinfo")).click();//id of pass dropdown
			Thread.sleep(2000L);
			
			/*int i=1;
			while(i<5)
			{
			   driver.findElement(By.id("hrefIncAdt")).click();//id of adult+
			   i++;
			}*/
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			for(int i=1;i<5;i++)
			{
				 driver.findElement(By.id("hrefIncAdt")).click();//id of adult+
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();//id of done

			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(3);
			
			//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
			driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
