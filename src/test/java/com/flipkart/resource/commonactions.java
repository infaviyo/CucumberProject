package com.flipkart.resource;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
  
  
public class commonactions {
	public static WebDriver driver;
	public void Lunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

public void windowHandeling() {
	String mi = driver.getWindowHandle();
	Set<String> mobile = driver.getWindowHandles();
	for(String x :mobile){
		if(!x.equals(mi)){
	driver.switchTo().window(x);
	System.out.println("Window");}}
}
	public void screenShot() throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
	     File b = tk.getScreenshotAs(OutputType.FILE);
	     File d=new File("C:\\Users\\vetrivel\\eclipse-workspace\\FW\\screenshot\\fk.png");
	     FileUtils.copyFile(b,d);
	}
	
		public void insertText(WebElement ele, String value) {

			ele.sendKeys(value,Keys.ENTER);

	}
}