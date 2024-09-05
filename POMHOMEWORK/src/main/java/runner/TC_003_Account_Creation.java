package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_003_Account_Creation extends ProjectSpecificMethods{
	@BeforeTest
	public void set() {
		filePath="Account";
	}

	@Test(dataProvider="getData")
	public void runners(String name, String des,String emp,String site) {
		LoginPage lp=new LoginPage(driver);
		lp.userName().password().login().crmsfa().cilckonAccounts().clickCA().enterDetails(name,des,emp,site).viewAccountpage().checkAccountCreated();
	}
}
