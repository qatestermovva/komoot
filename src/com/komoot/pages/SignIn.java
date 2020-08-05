package com.komoot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SignIn {
WebDriver driver;
	
	By creatButton = By.cssSelector(".u-hide-ios > .css-13wy194 > .css-1v4j5c2 > .tw-inline-flex > span");
	By email = By.id("email");
	By continueButton = By.cssSelector(".css-1x5xc8x > .css-3gbbd7 > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By username = By.id("display_name");
	By password = By.id("password");
	By Accountbutton = By.cssSelector(".css-i0aiv2 > .css-10klw3m > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By SearchBox =By.xpath(".//input[@placeholder='Where to?']");
	By searchButton = By.xpath(".//span[contains(text(),'Search')]");
	By pickDestination = By.xpath(".//h3[contains(text(),'Mauerweg am Wasser Loop from Karl-Bon')]");
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignUp()
	{
		driver.findElement(creatButton).click();
	}
	
	public void typeEmailAddress()
	{
		driver.findElement(email).sendKeys("qatester.movva@gmail.com");
		driver.findElement(continueButton).click();
	}
	
	public void typePwd()
	{
		driver.findElement(password).sendKeys("cistdk02");
		driver.findElement(Accountbutton).click();
	}
	
	public void search() throws InterruptedException
	{
		driver.findElement(SearchBox).clear();
		Thread.sleep(1000);
		driver.findElement(SearchBox).sendKeys("Potsdam");
		Thread.sleep(1000);
		driver.findElement(searchButton).click();
	}
	
	public void pickRecommendation()
	{
		driver.findElement(pickDestination).click();
	}

}
