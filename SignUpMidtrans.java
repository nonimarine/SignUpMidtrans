package org.seleniumhq.selenium.selenium_java;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.Assert;

public class SignUpMidtrans {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver;
			WebDriverWait wait;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nonimarine\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);
			
			driver.get("https://demo.midtrans.com/");
			
			 By clickSignUp = By.xpath("//a[contains(text(),'SIGN UP  →')]");
			 By inputBusinessName = By.xpath("//input[@id='user_merchant_name']");
			 By inputFullName = By.xpath("//input[@id='user_full_name']");
			 By inputEmail = By.xpath("//input[@id='user_email']");
			 By inputPhone = By.xpath("//input[@id='user_phone'])");
			 By inputPassword = By.xpath("//input[@id='user_password']");
			 By inputConfPassword = By.xpath("//input[@id='user_password_confirmation']");
			 By clickbtnSignUp = By.xpath("//button[@id='signup_btn']");
			
			 
			 driver.findElement(clickSignUp).click();
			 driver.findElement(inputBusinessName).sendKeys("Naomori Shop");
			 driver.findElement(inputFullName).sendKeys("Noni");
			 driver.findElement(inputEmail).sendKeys("naomorishop@mailinator.com");
			 driver.findElement(inputPhone).sendKeys("81000000110");
			 driver.findElement(inputPassword).sendKeys("test123456");
			 driver.findElement(inputConfPassword).sendKeys("test123456");
			 driver.findElement(clickbtnSignUp).click();
		}
}
