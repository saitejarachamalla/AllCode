package firstapp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","H:\\javapractise\\firstapp\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.sredupublications.com");
	
	WebElement publish = driver.findElement(By.linkText("Publish A Book Chapter"));
	publish.click();
	 
	Thread.sleep(2000);
	
	WebElement chapter = driver.findElement(By.linkText("Advanced Research in Crop Diseases and their Management"));
	chapter.click();
	
	Thread.sleep(2000);
	
	WebElement home = driver.findElement(By.id("comp-jbz8ykrv0label"));
	home.click();
	
	Thread.sleep(2000);

	WebElement book = driver.findElement(By.linkText("Publish Your Own Book"));
	book.click();
	
	Thread.sleep(15000);
	driver.close();
	driver.close();
		
}
}
