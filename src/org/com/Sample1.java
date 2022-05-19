//Fetching all images in particular webpage
package org.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\A\\\\Driver\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	List<WebElement> allimg = driver.findElements(By.tagName("img"));
	//finding the values of list
			int si = allimg.size();
			System.out.println(si);
			for (WebElement link : allimg) {
				String att = link.getAttribute("src");
				System.out.println(att);
}
}
}
