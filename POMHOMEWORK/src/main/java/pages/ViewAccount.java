package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewAccount extends ProjectSpecificMethods {
	public ChromeDriver driver;
	public ViewAccount(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void checkAccountCreated() {
		String title = driver.getTitle();
		if (title.equals("Account Details | opentaps CRM"))
			System.out.println("Account Created Successfully");
		else
			System.out.println("Account Creation is failing");
	}

}
