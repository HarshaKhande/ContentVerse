package computhink.contentverse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandlingEg {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// navigate to the url
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		
		WebElement clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		String pareentwindowhandle = driver.getWindowHandle();
		
		System.out.println(pareentwindowhandle);
		
		clickhere.click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		
		while(iterator.hasNext()) {
			
			
			String childwindow = iterator.next();
			
			if(!pareentwindowhandle.equalsIgnoreCase(childwindow)) {
			
			driver.switchTo().window(childwindow);
			
			WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
			
			String elementtext = text.getText();
			
			System.out.println(elementtext);
			
			driver.switchTo().window(pareentwindowhandle);
			
			driver.findElement(By.xpath("//div[@class='large-4 large-centered columns']//div[1]")).isDisplayed();
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		



	}

	}
	
}
