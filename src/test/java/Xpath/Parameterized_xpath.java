package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterized_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		// dynamic xpath
		//String xpath = "(//a[text()='" +name+ "')])["+index+"]";
		////a[text()='Sell']
		// (//a[text()='Bestsellers'])[1]
//		int index = 2;
//		String name = "Bestsellers";
//		String xpath = "(//a[text()='" +name+ "'])["+index+"]";
//		driver.findElement(By.xpath(xpath)).click();
		
		int index = 1;
		String name = "Bestsellers";
		String xpath = "(//a[text()='"+name+"'])["+index+"]";
		driver.findElement(By.xpath(xpath)).click();

	}

}
