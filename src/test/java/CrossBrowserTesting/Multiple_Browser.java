package CrossBrowserTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		File file = new File("config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		WebDriver driver = null;;

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Provide a valid browser!");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
//		driver.quit();

	}

}
