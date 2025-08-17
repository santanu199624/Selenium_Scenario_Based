package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.id("hbutton")).click();
		
		try {
		    driver.findElement(By.id("hbutton")).click();
		} catch (ElementNotInteractableException e) {
		    System.out.println("Button is hidden. Can't click it.");
		}
		
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//         js.executeScript("arguments[0].click();", HiddenButton);

	}

}
