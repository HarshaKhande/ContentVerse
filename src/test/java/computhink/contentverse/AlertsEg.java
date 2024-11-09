package computhink.contentverse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		
		simplealert.click();
		
		// simple alert containing ok button only.
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(2000);
		
		// confirmational alert
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		
		confirmalert.click();
		
		// confirm alert containing ok button and cancel button both
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.dismiss();
		
		Thread.sleep(2000);
		
		
		// prompt alerts 
		
		WebElement promptalert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		promptalert.click();
		
		// prompt  alert containing ok button and cancel button both
		
		Alert alt2 = driver.switchTo().alert();
		
		alt2.sendKeys("hello world");
		
		alt2.accept();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		



	}

}
