package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch_typing_india {

	public static void main(String[] args) throws  InterruptedException
	{
		 
		driver.get("https://www.google.com");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement
		driver.manage().window().minimize();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("india");
		//Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click() ;
		//unable to get the india in search bar

		
		//driver.quit();
	//	driver.close();

	}

}
