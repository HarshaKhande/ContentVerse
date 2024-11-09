package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement seller = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
		
		Actions act = new Actions(driver);
		
		// double click
		
		act.doubleClick(seller).perform();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().back();
		
		// context click
		
		WebElement MX  = driver.findElement(By.xpath("//a[contains(text(),'MX Player')]"));
		
		act.contextClick(MX).perform();
		
		// click and hold 
		
		WebElement Prime  = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
		
		act.clickAndHold(Prime).perform();
		
		Thread.sleep(1000);
		
		// Move to element
		
		WebElement joinPrime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		
		act.moveToElement(joinPrime).perform();
		
		act.click(joinPrime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
