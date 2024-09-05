package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_002_Logout extends ProjectSpecificMethods {
	@Test()
	public void runners() {
		LoginPage lp=new LoginPage(driver);
		lp.userName().password().login().logOut();
	}
}
