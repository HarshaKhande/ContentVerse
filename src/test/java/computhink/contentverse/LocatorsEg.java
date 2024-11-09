package computhink.contentverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// id 
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("hkhande");
		
		//name 
		
		WebElement email1 = driver.findElement(By.name("p"));
	
		email1.clear();
		
		email1.sendKeys("hkhande");
		
		// class
		
		WebElement logo = driver.findElement(By.className("fb_logo _8ilh img"));
		
		if(logo.isDisplayed()) {
			
			System.out.println("Logo is displayed ");
		}
		
		// link text  - this should be only  one occurence  on the page
		 
		WebElement login = driver.findElement(By.linkText("Log in"));
		
		login.click();
		
		// partial link text  - this should be only  one occurence  on the page
		
		WebElement login1 = driver.findElement(By.partialLinkText("Log"));
		
		login1.click();
		
		// css selector  if id present 
		

		WebElement email2 = driver.findElement(By.cssSelector("#email"));
		
		email2.sendKeys("hknade");
		
		// css selector  if id not present
		
		WebElement logo1 = driver.findElement(By.cssSelector("body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.gecko.win.x1.Locale_en_GB.cores-gte4._19_u:nth-child(2) div._li:nth-child(2) div.uiContextualLayerParent:nth-child(1) div.fb_content.clearfix:nth-child(1) div._8esj._95k9._8esf._8opv._8f3m._8ilg._8icx._8op_._95ka div._8esk div._8esl div._8ice > img.fb_logo._8ilh.img"));
		
		logo1.sendKeys("hknade");
		
		// tag name 
		

		WebElement email3 = driver.findElement(By.tagName("input"));
		
		email3.sendKeys("hknade");
		
		// xpath - relative xpath - single attribute 
		

		WebElement email4 = driver.findElement(By.xpath("//input[@id = 'email']"));
		
		email4.sendKeys("hknade");
		
		// xpath - relative xpath - mutliple  attribute 
		

		WebElement email5 = driver.findElement(By.xpath("//button[@name = 'login' and @type = 'submit']"));
				
		email5.sendKeys("hknade");
		
		// absolute xpath
		
		WebElement email6 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"));
		
		email6.sendKeys("hknade");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		




	}

}
