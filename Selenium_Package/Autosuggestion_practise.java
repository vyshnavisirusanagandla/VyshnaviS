package Selenium_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_practise {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("states and capitals");
		Thread.sleep(2000);
		List<WebElement> e2	= driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		e2.get(3).click();
		//driver.quit();

	}

}
