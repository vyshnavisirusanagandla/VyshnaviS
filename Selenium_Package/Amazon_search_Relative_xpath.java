package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_Relative_xpath {
	public static void main(String[] args) throws InterruptedException{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("shoes");
		

	}

}
