package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_checking {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("vyshnavis@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pswd");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("header_block")).sendKeys(Keys.ENTER);

	}

}
