package ICEICO;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\Geek\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://imperialhr.sqftinfra.com/admin/login");  ///login page
		Thread.sleep(2000);
		driver.manage().window().maximize(); ///maximize the page
		Thread.sleep(2000);
		 
		WebElement email=driver.findElement(By.xpath("//input[@type='email']")); ///giving input email
		email.sendKeys("admin@gmail.com");
		
		driver.navigate().forward();
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']")); //give password
		password.sendKeys("admin@gmail.com");
		
		driver.navigate().forward();
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']")); //click for signin
		signin.click();
		
		driver.navigate().forward();
		
		driver.manage().window().minimize(); //to minimize the webpage
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); //to maximize the page
		Thread.sleep(2000);
		
        Dimension d=new Dimension(500,300); //object of dimension
		driver.manage().window().setSize(d); // set size of the browser
		
		Thread.sleep(2000);
		
		Point p=new Point(500,200); //object
		driver.manage().window().setPosition(p); //set position of the browser
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor Js=(JavascriptExecutor)driver;
	    Js.executeScript("window.scrollBy(0,2000)");  //vertically down
		Thread.sleep(3000);
		
		Js.executeScript("window.scrollBy(0,-2000)");  //vertically up
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Total Applications")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Staffing Inquiries")).click();   ///clicking staffing Inquiries
		driver.navigate().back();
		 		
}
}