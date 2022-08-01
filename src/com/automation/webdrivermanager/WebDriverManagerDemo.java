package com.automation.webdrivermanager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	//in selenium 4.0 veriosn its applicable
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	
	 
	
}
}
