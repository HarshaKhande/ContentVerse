package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// scrool to view 
		
		WebElement privacy = driver.findElement(By.xpath("/html/body/div/div[3]/a[2]"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(privacy);
		
		privacy.click();
		
		
		
		
		
		
		// vertical scroll  down scroll = + no and x is always 0
		
	/*	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		
		// up scroll
		
		js.executeScript("window.scrollBy(0,-200)", "");
		
		// horizonatal scrolling  - right scroll
		
		
		js.executeScript("window.scrollBy(400,0)", "");
		
		// horizonatal scrolling  - left scroll
		
		
		js.executeScript("window.scrollBy(-400,0)", ""); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
