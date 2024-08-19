package Selenium_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookSearch_Relative_Xpath {
	public static void main(String[] args) throws  InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vyshnavi@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pswd");
driver.findElement(By.xpath("//button[@name='login']")).click();
Thread.sleep(2000);
	}

}
