package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadEg {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		upload.sendKeys("C://Users//Harsha Patil//Documents//dev//image.png");
		
		Thread.sleep(1000);
		
		WebElement filesubmit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		
		filesubmit.click();
		
		WebElement fileuploadmsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
		
		fileuploadmsg.isDisplayed();
		
		
		

		
		
		
		
		
		
		

	}

}
