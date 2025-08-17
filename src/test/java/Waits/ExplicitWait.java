package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdownBtn = driver.findElement(By.xpath("//div[@class='dropdown']/child::button[text()='Dropdown']"));
		dropdownBtn.click();
		WebElement flipkart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myDropdown']/child::a[text()='Flipkart']")));
//		WebElement flipkart = driver.findElement(By.xpath("//div[@id='myDropdown']/child::a[text()='Flipkart']"));
		flipkart.click();

	}

}
