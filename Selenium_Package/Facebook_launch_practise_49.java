package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_launch_practise_49 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement mail		=driver.findElement(By.id("email"));
		mail.sendKeys("vyshnavi@gmail.com");
		WebElement pswd	=driver.findElement(By.name("pass"));
		pswd.sendKeys("nopswd");
		WebElement login_button	=driver.findElement(By.name("login"));
		login_button.click();
		Thread.sleep(2000);
		//driver.quit();
		

	}

}
