package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg {

	public static void main(String[] args) {
		
		
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
		// frame as xpath
		
		//WebElement framename = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		
		//driver.switchTo().frame(framename);
		
		// frame as index 
		
		driver.switchTo().frame(0);
		
		// frame name
		
		driver.switchTo().frame("framenameid");
		
		WebElement radio = driver.findElement(By.xpath("//label[normalize-space()='New York']"));
		
		radio.click();
		
		
		
		
		
		
		


	}

}
