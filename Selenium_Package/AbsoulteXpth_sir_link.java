package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoulteXpth_sir_link {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	//	driver.get("file:///C:/Users/vymsh/AppData/Local/Microsoft/Windows/INetCache/IE/ILZWJGI8/learningHTML1[1] .");
driver.get("file:///C:/Users/vymsh/AppData/Local/Microsoft/Windows/INetCache/IE/ILZWJGI8/learningHTML1[1].html");
 WebElement usrn=driver.findElement(By.xpath("(/html/body/input)[1]"));
usrn.sendKeys("vyshnavi");
WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
hint.sendKeys("hint");
WebElement pswd=driver.findElement(By.xpath("(/html/body/input)[3]"));
pswd.sendKeys("1234");
WebElement fname=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
fname.sendKeys("vyshu");
//WebElement lname=driver.findElement(By.xpath("(/html/body/form/input)[2]"));
//lname.sendKeys("s");
WebElement submitb=driver.findElement(By.xpath("(/html/body/form/input)[3]"));
submitb.click();
WebElement boy=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
boy.click();





	}

}
