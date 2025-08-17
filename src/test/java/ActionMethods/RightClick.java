package ActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textArea = driver.findElement(By.xpath("//*[@id='ta1']"));
		
		Actions action = new Actions(driver);
		action.contextClick(textArea).build().perform();
		System.out.println("Hellow");

	}

}
