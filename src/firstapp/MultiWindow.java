package firstapp;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","H:\\javapractise\\firstapp\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.get("https://www.rameshsoft.com");
	
	driver.findElement(By.xpath("//a[text()='Videos']")).click();
	Thread.sleep(3000);
	
	String curWin = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	
	for(String str:windows)
	{
		if (str.equalsIgnoreCase(curWin)) {
			System.out.println("Already focusing the window");
		}
		else {
			driver.switchTo().window(str);
			String secWin = driver.getWindowHandle();
			System.out.println(curWin);
			System.out.println(secWin);
		}
	}
	driver.findElement(By.xpath("//div[@id='search-input']/input")).sendKeys("RAMESHSOFT");
	
	Thread.sleep(9000);
	driver.quit();
}
}
