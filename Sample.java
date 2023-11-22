package com.org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/Browser/Chromedriver116/chromedriver-win32/Chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.close();
		
		driver.quit();
		
		Thread.sleep(5000);
		driver.quit();

		
	}
}
