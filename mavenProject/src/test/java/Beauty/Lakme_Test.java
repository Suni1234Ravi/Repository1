package Beauty;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lakme_Test {
@Test

public void Lakme()
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//driver.get("https://www.lakmeindia.com/");
	
	String url = System.getProperty("url");
	
	driver.get(url);
	
	driver.quit();

}
}
