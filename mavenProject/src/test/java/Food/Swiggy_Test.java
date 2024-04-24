package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swiggy_Test {
	
	@Test
	public void LaunchSwiggy()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		driver.quit();
		
	}

}
