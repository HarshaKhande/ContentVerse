package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutliselectEg {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		
		driver.navigate().to("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		Select sel = new Select(driver.findElement(By.id("multiple-select-example")));
		
		Thread.sleep(1000);
		
		// select by visible text  option1
		
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(1000);
		sel.selectByValue("orange");
		
		
		sel.selectByIndex(2);
		
		Thread.sleep(1000);
		
		
		sel.deselectAll();
		
		
		
		

		
		
		
		

	}

}
