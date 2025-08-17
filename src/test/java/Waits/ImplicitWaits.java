package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaits {
	@Test
	public void method(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdownBtn = driver.findElement(By.xpath("//div[@class='dropdown']/child::button[text()='Dropdown']"));
		dropdownBtn.click();
		WebElement flipkart = driver.findElement(By.xpath("//div[@id='myDropdown']/child::a[text()='Flipkart']"));
		flipkart.click();
	}

}
