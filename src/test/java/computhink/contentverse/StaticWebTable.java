package computhink.contentverse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		
		
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// navigate to the url
		
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		
		// find the no of rows
		
		
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id = 'table1']//tr"));
		
		int rowcount = rowno.size();
		
		System.out.println(rowcount);
		
		// find the no of columns 
		
		
		List<WebElement> colno = driver.findElements(By.xpath("//table[@id = 'table1']//tr[1]//td"));
		
		int colcount = colno.size();
		
		System.out.println(colcount);
		
		// fetch cell data 
		
		WebElement celldata = driver.findElement(By.xpath("//table[@id = 'table1']//tr[1]//td[5]"));
		
		String celltext = celldata.getText();
		
		System.out.println(celltext);
		
		
		
		
		
		
		
		
		


	}

}
