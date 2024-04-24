package Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Walmart_Test {
	
	@Test
	public void LaunchWalmart()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.walmart.com/");
		
		driver.quit();
		
	}
	

}
