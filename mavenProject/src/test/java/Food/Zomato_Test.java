package Food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zomato_Test {
	@Test
	public void LaunchZomato()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		driver.quit();
		
	}
	

}
