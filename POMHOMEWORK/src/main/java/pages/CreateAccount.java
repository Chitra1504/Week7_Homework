package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateAccount extends ProjectSpecificMethods {
	public ChromeDriver driver;

	public CreateAccount(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public CreateAccount enterDetails(String name, String des, String emp, String site) {
		driver.findElement(By.id("accountName")).sendKeys(name);
		driver.findElement(By.name("description")).sendKeys(des);
		driver.findElement(By.id("numberEmployees")).sendKeys(emp);
		driver.findElement(By.id("officeSiteName")).sendKeys(site);
		driver.findElement(By.className("smallSubmit")).click();
		return this;
	}

	public ViewAccount viewAccountpage() {
		return new ViewAccount(driver);
	}
}