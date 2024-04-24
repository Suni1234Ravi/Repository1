package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maybeline_Test {
	
	@Test
	
	public void LaunchMaybelline()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.maybelline.com/");
		
		driver.quit();
		
	}


}
