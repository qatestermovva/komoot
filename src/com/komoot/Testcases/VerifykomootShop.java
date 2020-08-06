package com.komoot.Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.komoot.pages.Shop;


public class VerifykomootShop {

	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\sel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.komoot.com/");
		
		Shop shop = new Shop(driver);
		Thread.sleep(1000);
		shop.clickSignUp();
		Thread.sleep(1000);
		shop.typeEmailAddress();
		Thread.sleep(1000);
		shop.typePwd();
		Thread.sleep(5000);
		shop.shop();
	}
}
