package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMsgValidation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement errMsg = driver.findElement(By.xpath("(//span[@class = 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]"));
		
		String errmsg = errMsg.getText();
		
		System.out.println(errmsg);
		
		if (errmsg.equals("Required")) {
			
			System.out.println("Error message is displayed");
		}else {
			
			
			System.out.println("Error message is not displayed");
		}
		
		



	}

}
