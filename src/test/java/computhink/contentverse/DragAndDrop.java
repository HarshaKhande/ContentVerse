package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='column-a']"));

		WebElement Dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Dest).perform();
		
		Thread.sleep(1000);
		

	}

}
