package com.java.excelhandling;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
public class HubAndNode {
	public static void main(String args[]) throws MalformedURLException {
		String URL = "https://www.google.com/";
		WebDriver driver;
		DesiredCapabilities cap=null;
		String browser = "chrome";
		
		if (browser.contains("chrome")) {
			System.out.println(" Executing on chrome");
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
		}
		else {
			System.out.println(" Executing on chrome");
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
		}
		String hub = "http://192.168.1.14:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(hub), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Launch website
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		// Click on Math Calculators
		driver.findElement(By.name("q")).sendKeys("Testing Calculator");
		//driver.quit();
	}
}