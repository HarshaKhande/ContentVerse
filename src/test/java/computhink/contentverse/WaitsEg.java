package computhink.contentverse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsEg {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		// implicit wait  - global wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// explicit wait specific elements 
		
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(2) );
		
		wt.until(ExpectedConditions.visibilityOfElementLocated
		(By.xpath("(//span[@class = 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")));
		
		WebElement errmsg = driver.findElement(By.xpath("(//span[@class = 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]"));
		
		// fluent waits  - regular interval of times checking is done whether the element is loaded
		
		 Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(2))
			            .pollingEvery(Duration.ofMillis(300))
			            .ignoring(ElementNotInteractableException.class);

			    wait.until(
			        d -> {
			        	errmsg.sendKeys("Displayed");
			          return true;
			        });
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
