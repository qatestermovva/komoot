package com.komoot.Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.komoot.pages.SignIn;


public class VerifykomootSignIn {

	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\sel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.komoot.com/");
		
		SignIn signin = new SignIn(driver);
		Thread.sleep(1000);
		signin.clickSignUp();
		Thread.sleep(1000);
		signin.typeEmailAddress();
		Thread.sleep(1000);
		signin.typePwd();
	}
}
