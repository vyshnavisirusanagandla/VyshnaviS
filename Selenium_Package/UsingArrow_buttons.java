package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingArrow_buttons {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	WebElement e1=	driver.findElement(By.id("APjFqb"));
			e1.sendKeys(" india");
			Thread.sleep(2000);
			e1.sendKeys(Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER);
			//e1.sendKeys(Keys.ARROW_DOWN);
		
			//e1.sendKeys(Keys.ENTER);
                      
	}

34}
