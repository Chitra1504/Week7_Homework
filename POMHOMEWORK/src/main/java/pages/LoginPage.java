package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public ChromeDriver driver;
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage userName() {
	driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
	return this;
	}
	public LoginPage password() {
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	return this;
	}
	public WelcomePage login() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
	}	
}
