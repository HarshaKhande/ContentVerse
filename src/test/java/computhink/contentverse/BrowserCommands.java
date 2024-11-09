package computhink.contentverse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
			
		// get title of the page 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// page source - soucre code / html code 
		
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		// get current url 
		
		String currurl = driver.getCurrentUrl();
		
		System.out.println(currurl);
		
		// close  - close the current tab of the brwoser which is opened via autoamtion
		
		driver.close();
		
		// quit
		
	//	driver.quit();
	
		
		


	}

}
