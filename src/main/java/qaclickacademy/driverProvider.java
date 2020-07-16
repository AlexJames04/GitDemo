package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverProvider {
	
	public WebDriver driver;
	
	public WebDriver Initialization () throws IOException {
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream("C:\\Users\\Diana\\Mavenjava\\base.properties");
		
		prop.load(fis);
	String browserName = prop.getProperty("browser");

		
	 if (browserName.equals("chrome")) {
		 
		 System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		  driver = new ChromeDriver();
		 
	 }
	 else if (browserName.equals("ie")) {
		 System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	 }
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 return driver;
	 
	 
			}
}
