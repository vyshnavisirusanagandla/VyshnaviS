package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Selectinganyone {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("bangloor");
         Thread.sleep(2000);
         List<WebElement> e2= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li "));
          int count =e2.size();
          System.out.println(count);
        e2.get(6).click(); 
         
	}

}