package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_partiallink {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement register=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		register.click();
		
		//driver.findElement(null)

	}

}
