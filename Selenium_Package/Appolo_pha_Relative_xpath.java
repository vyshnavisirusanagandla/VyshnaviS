package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appolo_pha_Relative_xpath {

	public static void main(String[] args) throws InterruptedException{ 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.apollopharmacy.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\'searchProduct\']")).sendKeys("pcm");
//ri.findElement(By.xpath("//input[@id=\'searchProduct\']")).sendKeys("tablets");
	Thread.sleep(2000);
	driver.quit();
	

	}

}
