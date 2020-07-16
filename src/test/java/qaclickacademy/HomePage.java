package qaclickacademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class HomePage  extends driverProvider {

	
	@Test
	
	public void basePageNavigation() throws IOException {
		
		driver = Initialization();
	/*	log.debug("Opening QA Click Server");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");*/
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//a[@class='gb_je gb_4 gb_3c']")).click();
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("alejames4");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
				
	}
}


