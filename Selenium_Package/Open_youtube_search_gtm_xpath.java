package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_youtube_search_gtm_xpath {

	public static void main(String[] args) throws InterruptedException
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\'search\']")).sendKeys("grotechminds");
		//driver.findElement())
		}	

	}

