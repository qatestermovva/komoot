/**
 * 
 */
package com.komoot.Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.komoot.pages.SignIn;
import com.komoot.pages.SignUpPage;

/**
 * @author Admin
 *
 */
public class VerifyKomootSignUp {
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\sel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.komoot.com/");
		
		SignUpPage signup = new SignUpPage(driver);
		Thread.sleep(1000);
		signup.clickSignUp();
		Thread.sleep(1000);
		signup.typeEmailAddress("qatesting@gmail.com");
		Thread.sleep(1000);
		signup.credentials();
		driver.quit();
	}

}
