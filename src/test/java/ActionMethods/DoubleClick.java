package ActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).build().perform();

	}

}
