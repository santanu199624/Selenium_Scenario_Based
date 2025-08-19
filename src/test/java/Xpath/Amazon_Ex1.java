package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon_Ex1 {
	
	@Test
	void paraXpath(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone&crid=31CW8BJIPV130&sprefix=iphone%2Caps%2C396&ref=nb_sb_noss_2");
		
		int index = 1;
		String name = "Apple iPhone 13 (128GB) - Starlight";
		String xpath = "(//span[contains(text(),'"+name+"')])["+index+"]";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
