package firstapp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adpcount {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","H:\\javapractise\\firstapp\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.get("https://www.adp.com");
	
	int adpCount=0;
	List<WebElement>listElements=driver.findElements(By.xpath("//*"));
	for(WebElement  webElement: listElements)
	{
		String txt = webElement.getText();
		if(txt.contains("ADP")||txt.contains("adp"))
		{
          adpCount++;
	}
}
	System.out.println("Total no of adp|ADP count is:"+adpCount);
}
}
