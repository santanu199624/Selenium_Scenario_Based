package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Carrosel {
	
	@Test
	public void method1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		//div[@class='AdBannerSliderDesktop_bannerSlide__ZQQOZ']
		List<WebElement> slides = driver.findElements(By.xpath("//div[@class='AdBannerSliderDesktop_bannerSlide__ZQQOZ']"));
		System.out.println(slides.size());
		WebElement nextBtn = driver.findElement(By.xpath("//div[@class='swiper-button-circle-right AdBannerSliderDesktop_swiper-button-circle-right__YuMou']"));
		for(int i=0; i<slides.size(); i++) {
			WebElement activeSlide = driver.findElement(By.xpath(""));
			System.out.println(activeSlide.getText());
		}
	}

}
