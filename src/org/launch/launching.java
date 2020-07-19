package org.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class launching {
public static void main(String[] args) throws AWTException, InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ragavboom\\eclipse-workspace\\launch\\div-2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

	
	driver.manage().window().maximize();
	int count=0;
	List<WebElement> alllink = driver.findElements(By.tagName("a"));
	
	for(WebElement X:alllink) {
		String name = X.getAttribute("href");
		
		URL u=new URL(name);
		
		URLConnection uc = u.openConnection();
		
		HttpsURLConnection hp=(HttpsURLConnection)uc;
		int get = hp.getResponseCode();
		if(get!=200) {
			System.out.println(name);
			count++;
		}
		
		
	}
	System.out.println("count:"+count);
	
	
	
	
	
	
	
	
	
	
	
		}
        }
	


	  	

    	
    	
 
    
    
    
    
    
    
    
    
    
    
     
     
	


	

