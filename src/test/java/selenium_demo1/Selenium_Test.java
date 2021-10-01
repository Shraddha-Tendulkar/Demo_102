package selenium_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Test {
	
	private ChromeDriver driver;
	@Test
	public void seleniumtest1() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle());
		
		WebElement createbutton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createbutton.click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Shraddha");
		
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("Tendulkar");
		
		WebElement mobilenum= driver.findElement(By.name("reg_email__"));
		mobilenum.sendKeys("shraddhat13@gmail.com");
		
		Select mon = new Select(driver.findElement(By.id("month")));
		mon.selectByVisibleText("Feb");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(7);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2015");
		
	}
	
	@AfterClass
	public void  testdone() {
		
		//driver.close();
	}
	

}
