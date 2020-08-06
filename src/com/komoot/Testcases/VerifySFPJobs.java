package com.komoot.Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.komoot.pages.sparkassejobs;

public class VerifySFPJobs {
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\sel\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sparkasse.de/jobboerse.html");
	
	sparkassejobs jobSearch = new sparkassejobs(driver);
	jobSearch.jobOffer();
	
	// driver.quit();
	}
}
