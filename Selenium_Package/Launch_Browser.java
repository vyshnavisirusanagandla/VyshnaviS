package Selenium_Package;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver d1=new ChromeDriver();
		 d1.get("https://www.google.com");
		 Thread.sleep(4000);
		 d1.manage().window().maximize();
		
	}

}
