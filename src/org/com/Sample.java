//Fetching all links in particular webpage
package org.com;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\A\\\\Driver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		//finding the values of list
		int si = alllink.size();
		System.out.println(si);
		for (WebElement link : alllink) {
			String att = link.getAttribute("href");
			System.out.println(att);
		}
	}
	

}
