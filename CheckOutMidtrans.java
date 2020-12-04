package org.seleniumhq.selenium.selenium_java;

	import static org.testng.Assert.assertEquals;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import junit.framework.Assert;

	public class CheckOutMidtrans {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriver driver;
				WebDriverWait wait;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\nonimarine\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				wait = new WebDriverWait(driver, 10);
				
				driver.get("https://demo.midtrans.com/");
				
				 By clickBuyNow = By.xpath("//a[contains(text(),'BUY NOW')]");
				 By clickSetting = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[2]/div[2]/div[2]/img[1]");
				 By selectCustom = By.xpath("//input[@id='main_setting_custom']");
				 By selectRedirect = By.xpath("//input[@id='is_snap_pop_up:false']");
				 By clickStart = By.xpath("//a[contains(text(),'Start')]");
				
				 
				 driver.findElement(clickBuyNow).click();
				 driver.findElement(clickSetting).click();
				 driver.findElement(selectCustom).click();
				 driver.findElement(selectRedirect).click();
				 driver.findElement(clickStart).click();
			}
	}
