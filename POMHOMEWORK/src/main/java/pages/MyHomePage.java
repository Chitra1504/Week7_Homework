package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public ChromeDriver driver;
	public MyHomePage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public MyAccountPage cilckonAccounts() {
		WebElement accounts=driver.findElement(By.linkText("Accounts"));
		accounts.click();
		return new MyAccountPage(driver);
	}
}
