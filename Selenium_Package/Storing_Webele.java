package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Storing_Webele {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	WebElement usrn=driver.findElement(By.id("email"));
		usrn.sendKeys("vyshnavis@gmail.com");
		WebElement pass =driver.findElement(By.name("pass"));
		pass.sendKeys("pswd");
		WebElement l=driver.findElement(By.name("login"));
		l.sendKeys(Keys.ENTER);
		
		

	}

}
