package testng_code_5thNov_2022;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingAssert {

	public static WebDriver driver;
	
	@Test
	public void logic1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//Use assertion or each WebElement
		//WebElement signinLink = driver.findElement(By.className("signin"));
			Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
			driver.findElement(By.className("signin")).click();
			
			String currentTitle = driver.getTitle();
			String currentUrl = driver.getCurrentUrl();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Assert.assertEquals(currentTitle, "Rediffmail");
			Assert.assertEquals(currentUrl,"https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.id("login1")).sendKeys("cengizs");
			Assert.assertTrue(true);
			
			WebElement password = driver.findElement(By.id("password"));
			Assert.assertTrue(password.isEnabled());
			password.sendKeys("123Dilek123$");
			
			Assert.assertTrue(driver.findElement(By.className("signinbtn")).isEnabled());
			driver.findElement(By.className("signinbtn")).click();
			
			Assert.assertTrue(driver.findElement(By.className("rd_logout")).isEnabled());
			driver.findElement(By.className("rd_logout")).click();
			
		/*
		 * Assert.assertTrue(false);
		 * Assert.assertEquals(false,null);
		 * Assert.assertNotEquals(null,null);
		 * Assert.assertFalse(false);
		 * assert.fail();
		 */
	}

}



