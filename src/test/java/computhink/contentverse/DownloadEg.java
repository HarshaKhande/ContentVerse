package computhink.contentverse;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadEg {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement lambdatest = driver.findElement(By.xpath("//a[contains(text(),'LambdaTest.txt')]"));
		
		lambdatest.click();
		
		File f = new File ("C://Users//Harsha Patil//Downloads//LambdaTest.txt");
		
		if (f.exists()) {
			
			System.out.println("File exists in the folder");
		} else {
			
			System.out.println("File do not exist in the folder");
		}
		
		
		
		
		
		


	}

}
