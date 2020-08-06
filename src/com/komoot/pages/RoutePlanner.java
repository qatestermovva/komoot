package com.komoot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoutePlanner {
WebDriver driver;
	
	By creatButton = By.cssSelector(".u-hide-ios > .css-13wy194 > .css-1v4j5c2 > .tw-inline-flex > span");
	By email = By.id("email");
	By continueButton = By.cssSelector(".css-1x5xc8x > .css-3gbbd7 > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By username = By.id("display_name");
	By password = By.id("password");
	By Accountbutton = By.cssSelector(".css-i0aiv2 > .css-10klw3m > .css-hga51k > .css-1fh9ug8 > .css-n2o8q8");
	By routePlanner = By.xpath("//a[@class='tw-font-bold tw-text-white-60 tw-no-underline hover:tw-text-white tw-flex tw-items-center tw-px-3 xl:tw-px-4 c-page-index__indicator--plan']");
	By searchPlace = By.xpath("//input[@placeholder='Search For Place Or Address']");
	By searchAfterClick = By.xpath("//input[@placeholder='Search For Place Or Address']");
	By selectPlace = By.cssSelector(".o-list-ui.o-list-ui--separator>li:nth-child(1)");
	
	public RoutePlanner(WebDriver driver) {
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
	
	public void routePlanner() throws InterruptedException
	{
		driver.findElement(routePlanner).click();
		Thread.sleep(10000);
		driver.findElement(searchPlace).click();
		Thread.sleep(10000);
		driver.findElement(searchAfterClick).sendKeys("Potsdam");
		Thread.sleep(10000);
		driver.findElement(selectPlace).click();
	}

}
