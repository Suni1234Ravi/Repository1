package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class McDonalds_Test {
	
	@Test
	public void LaunchMcDonalds()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mcdonalds.com/");
		
		driver.quit();
		
	}

}
