package org.com;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\eclipse-workspace\\A\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	for (WebElement link : alllinks) {
		String at = link.getAttribute("href");
		if (at != null) {
			URL u = new URL(at);
			URLConnection url = u.openConnection();
			HttpsURLConnection hp = (HttpsURLConnection)url;
			int responseCode = hp.getResponseCode();
			if(responseCode>=400) {
				System.out.println(at+" "+responseCode);
			}
			
		}
	}
	
}
}
