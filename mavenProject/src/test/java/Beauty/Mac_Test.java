package Beauty;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Mac_Test  {
	@Test
	
	public void Mac()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.maccosmetics.com/");
		
		driver.quit();

	}
		
	

	
	

}
