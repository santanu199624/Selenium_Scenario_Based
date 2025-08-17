package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		try {
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			int frameCounts = driver.findElements(By.tagName("iframe")).size();
			System.out.println(frameCounts);
//			driver.switchTo().frame(0);
			WebElement srcEle = driver.findElement(By.id("draggable"));
			WebElement targetEle = driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			action.dragAndDrop(srcEle, targetEle).build().perform();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			Thread.sleep(3000);
			driver.quit();
		}

	}

}
