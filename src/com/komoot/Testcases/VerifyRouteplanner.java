package com.komoot.Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.komoot.pages.RoutePlanner;

public class VerifyRouteplanner {
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\sel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.komoot.com/");
		
		RoutePlanner Rplanner = new RoutePlanner(driver);
		Thread.sleep(1000);
		Rplanner.clickSignUp();
		Thread.sleep(1000);
		Rplanner.typeEmailAddress();
		Thread.sleep(1000);
		Rplanner.typePwd();
		Thread.sleep(1000);
		Rplanner.routePlanner();
	}
}
