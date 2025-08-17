package WindowHanlde;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {
	
	@Test
	public void handleWindow() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		String window = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> itr = allwindows.iterator();
		itr.next(); // first window
		String childWindow = itr.next();  // second window
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(window);
		Thread.sleep(3000);
		driver.close();
	}

}
