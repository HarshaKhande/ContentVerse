package computhink.contentverse;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleUpload {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		driver.navigate().to("");
		driver.manage().window().maximize();
		WebElement multiFileInput = driver.findElement(By.id("fileToUpload"));
	      List<String> filePaths = new ArrayList<>();
	      for (String path : filePaths) {
	          multiFileInput.sendKeys(path);
	      }


	}

}
