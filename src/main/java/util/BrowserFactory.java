package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		return driver;
		
		
	}
	
	//Static makes tearDown a part of the BrowserFactory class and therefore, makes it easier to call
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
