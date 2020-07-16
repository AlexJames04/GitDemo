package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage extends driverProvider {

	public WebDriver driver;
	
	By signin= By.id("gb_70");
	By username=By.name("identifier");
	By next= By.xpath("//div[@id='identifierNext']/div/span/span");
	
	By password=By.name("password");
	By pNext=By.xpath("//div[@id='passwordNext']/div/span/span");
	
	By searchBox=By.name("gb_sf");
	
		public LandingPage(WebDriver driver) {
			this.driver =driver;
			
		}
public WebElement getsignin() {
	return driver.findElement(signin);
	
}
public WebElement getUsername() {
return driver.findElement(username);
}

public WebElement getNext() {
return driver.findElement(next);
}
public WebElement getPassword() {
return driver.findElement(password);
}
public WebElement getpNext() {
return driver.findElement(pNext);
}
public WebElement getsearchBox() {
return driver.findElement(searchBox);
}
}