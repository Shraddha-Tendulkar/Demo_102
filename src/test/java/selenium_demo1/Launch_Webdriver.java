package selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Webdriver {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		WebElement createbutton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createbutton.click();
		
		WebElement firstname= driver.findElement(By.xpath("//*[@id=\"u_2_b_6g\"]"));
		firstname.sendKeys("Shraddha");
		
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("Tendulkar");
		
		WebElement mobilenum= driver.findElement(By.id("u_10_g_Iz"));
		mobilenum.sendKeys("412-333-456");
	}

}
