package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTng {
	ChromeDriver driver;
	@BeforeSuite
	public void openbrow() {
	
	System.setProperty("webdriver.chrome.driver","H:\\javapractise\\firstapp\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
}
	@AfterSuite
	public void closebrowser() throws InterruptedException {
		
		Thread.sleep(9000);
		driver.quit();
	}
	
	@Test
	public void Perform() throws InterruptedException {
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

	}
}
