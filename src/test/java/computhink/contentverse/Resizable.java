package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		
		driver.navigate().to("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// frame as xpath
		
		WebElement framename = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
				
		driver.switchTo().frame(framename);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
		
		
		Actions act = new Actions(driver);

		act.clickAndHold(resize).moveByOffset(30, 40).release().build().perform();

		Thread.sleep(3000);
		
		
		// resizing of the whole window
		
	//	int width = 200;
		
	//	int height = 300;
		
	//	Dimension dim = new Dimension(width, height);
		
		
		
	//	driver.manage().window().setSize(dim);
		
		
		
		
		

		


	}

}
