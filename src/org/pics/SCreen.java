package org.pics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCreen {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\TakeScreenShot\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)d;
	File img = ts.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\DELL\\eclipse-workspace\\photo\\Screenshots\\FBlogin.png");
	FileUtils.copyFile(img, f);
	
}
}
