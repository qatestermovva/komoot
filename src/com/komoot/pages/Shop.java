package com.komoot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Shop {
WebDriver driver;
	
	By creatButton = By.cssSelector(".u-hide-ios > .css-13wy194 > .css-1v4j5c2 > .tw-inline-flex > span");
	By email = By.id("email");
	By continueButton = By.cssSelector(".css-1x5xc8x > .css-3gbbd7 > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By username = By.id("display_name");
	By password = By.id("password");
	By Accountbutton = By.cssSelector(".css-i0aiv2 > .css-10klw3m > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By shop = By.cssSelector(".tw-flex > .tw-flex-none > .tw-hidden > .tw-inline-flex > span");
	By discoverPremium = By.cssSelector(".lg\\3Atw-w-1\\/2 > .tw-bg-white > .tw-flex-none > .tw-inline-flex > span");
	By multiDayTourPlanner = By.cssSelector("#multiday_planner >div > div > .tw-inline-flex > span");
	By allPreimiumbenefits = By.cssSelector(".tw-p-3 > .tw-py-6 > .tw-mx-auto > .tw-overflow-hidden > .null:nth-child(2)");
	By explorePersonalCollections = By.cssSelector("#personal_collections > .md\\3Atw-w-1\\/2 > div > .tw-inline-flex > span");
	By weatherReport = By.cssSelector("#weather > .md\\3Atw-w-1\\/2 > div > .tw-inline-flex > span");
	By sportspecificmpas = By.cssSelector("#sport_specific_maps > .md\\3Atw-w-1\\/2 > div > .tw-inline-flex > span");
	By moreAboutSportspecificmaps = By.cssSelector("#sport_specific_maps > .md\\3Atw-w-1\\/2 > div > .tw-inline-flex > span");
	By browswBenifits = By.cssSelector(".tw-mx-auto > #discounts > .md\\3Atw-w-1\\/2 > div > .tw-inline-flex");
	
	public Shop(WebDriver driver) {
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
	
	public void shop() throws InterruptedException
	{
		driver.findElement(shop).click();
		Thread.sleep(1000);
		driver.findElement(discoverPremium).click();
		Thread.sleep(10000);
		driver.findElement(multiDayTourPlanner).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
		Thread.sleep(1000);
		driver.findElement(explorePersonalCollections).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
		Thread.sleep(1000);
		driver.findElement(weatherReport).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
		Thread.sleep(1000);
		driver.findElement(sportspecificmpas).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
		Thread.sleep(1000);
		driver.findElement(moreAboutSportspecificmaps).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
		Thread.sleep(1000);
		driver.findElement(browswBenifits).click();
		Thread.sleep(1000);
		driver.findElement(allPreimiumbenefits).click();
	}
	
	
}
