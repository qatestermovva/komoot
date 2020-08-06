package com.komoot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sparkassejobs {
	WebDriver driver;
	

	By jobTitle = By.name("what");
	By ort = By.name("where");
	By search = By.cssSelector("div > div > .css-1bbhqd4 > .css-194ac8e > .css-vfbjgt");
	By stelleAngebot = By.xpath("/html[1]/body[1]/main[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/a[1]/div[1]");
	
	public sparkassejobs(WebDriver driver) {
		this.driver = driver;
	}
	
	public void jobOffer() throws InterruptedException
	{
		driver.findElement(jobTitle).sendKeys("Sparkassen-Finanzportal");
		driver.findElement(ort).sendKeys("Berlin");
		Thread.sleep(1000);
		driver.findElement(search).click();
		Thread.sleep(1000);
		driver.findElement(stelleAngebot).click();
	}
}
