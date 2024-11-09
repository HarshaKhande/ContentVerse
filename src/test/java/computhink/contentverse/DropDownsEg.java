package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsEg {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		Thread.sleep(1000);
		
		// select by visible text  option1
		
		sel.selectByVisibleText("Option1");
		
		Thread.sleep(1000);
		
		// select by index  option2 
		
		sel.selectByIndex(2);
		
		// select by value  option 3
		
		Thread.sleep(1000);
		
		sel.selectByValue("option3");
		
		
		Thread.sleep(1000);
		
		//  deselect
		
	
		
		
		
		
		
		
		

	}

}
