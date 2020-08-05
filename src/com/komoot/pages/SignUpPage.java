package com.komoot.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Admin
 *
 */
public class SignUpPage {
	WebDriver driver;
	
	By creatButton = By.cssSelector(".u-hide-ios > .css-13wy194 > .css-1v4j5c2 > .tw-inline-flex > span");
	By email = By.id("email");
	By continueButton = By.name(".css-n2o8q8");
	By username = By.id("display_name");
	By password = By.id("password");
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignUp()
	{
		driver.findElement(creatButton).click();
	}
}
