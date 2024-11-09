package computhink.contentverse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		// check box single select 
		
		WebElement chkbox = driver.findElement(By.id("checkBoxOption1"));
		
		chkbox.isDisplayed();
		
		chkbox.isEnabled();
		
		chkbox.isSelected();
		
		chkbox.click();
		
		// for loop for multi select 
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		int size = chkboxes.size();
		
		System.out.println(size);
		
		for (int i = 1 ; i < size ; i++ ) {
			
			
			chkboxes.get(i).click();
			
			Thread.sleep(1000);
			
			
		}
		
		// radio buuton 
		
		// check box single select 
		
				WebElement radiobutton = driver.findElement(By.xpath("(//input[@class='radioButton'])[2]"));
				
				radiobutton.isDisplayed();
				
				radiobutton.isEnabled();
				
				radiobutton.isSelected();
			
				radiobutton.click();
				
				
				
		
		
		
		
		
		
		
		
		


	}

}
