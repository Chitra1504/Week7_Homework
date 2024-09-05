package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods {
	public ChromeDriver driver;
	public MyAccountPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public CreateAccount clickCA() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccount(driver);
	}

}
