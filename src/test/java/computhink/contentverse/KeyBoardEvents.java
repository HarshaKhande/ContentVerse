package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions act = new Actions(driver);
		
		Actions seriesofactions = act.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("hello");
		
		seriesofactions.build().perform();
		
		
		
		
		
		
		
		

	}

}
