package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.syntax.class25.WebDriver;

public class Task1 {
public static WebDriver driver;
	
public static void main(String[] args) throws IOException {
		
////		1. Store configuration in property file to create an Amazon account:
////			browser
////			url
////			name
////			email
////			password
		
		
				String filePath="/Users/elvirasamakova/eclipse-workspace/MyJavaBasics/configs/task1.properties";
				
				FileInputStream fileInput=new FileInputStream(filePath);
				
				Properties prop=new Properties();
				prop.load(fileInput);
				String browser=prop.getProperty("browser");
				String url=prop.getProperty("url");
				String name=prop.getProperty("name");
				String email=prop.getProperty("email");
				String password=prop.getProperty("password");
				
				System.out.println(browser+" "+url+" "+name+" "+email+" "+password);
				
				switch (browser.toLowerCase()) {
				case "chrome":
					System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
				driver=new ChromeDriver();
				break;
				
				case "firefox":
					System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
					driver =new FirefoxDriver();
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
