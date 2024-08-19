package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Selenium {

	public static void main(String[] args)
	{
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.facebook.com");
		c.findElement(By.id("email")).sendKeys("VyshnaviSiru@gmail.com");
		c.findElement(By.name("pass")).sendKeys("12345");
		c.findElement(By.name("login")).click();
	

	}

}
