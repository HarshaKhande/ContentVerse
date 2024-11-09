package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		
		WebElement fromdate = driver.findElement(By.id("datetimepicker1"));
		
		fromdate.click();
		
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.xpath("(//span[@aria-label='November 7, 2024'][normalize-space()='7'])[1]"));
		
		date.click();
		
		
		
		
		
		



	}

}
