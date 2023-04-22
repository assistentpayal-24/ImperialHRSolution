package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.POM.ImperialPOM;

public class ImperialTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geek\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://imperialhr.sqftinfra.com/admin/login");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		ImperialPOM login=new ImperialPOM();   //created object
		
		login.enterUsername();
		login.enterPassword();
		login.ClickonSignIn();
		
	}
}
