package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	WebElement e1=	driver.findElement(By.xpath("(//input)[5]"));
	e1.sendKeys("shoes");
	e1.sendKeys(Keys.ARROW_DOWN);
	e1.sendKeys(Keys.ENTER);
	}

}
