package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public ChromeDriver driver;
	public WelcomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public MyHomePage crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public LoginPage logOut() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
