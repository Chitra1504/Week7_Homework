package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods {
	public String filePath;
	public ChromeDriver driver;
	public static Properties prop;

	@BeforeMethod
	public void preCondition() throws IOException {
		//FileInputStream fis=new FileInputStream("src/main/resources/French.properties");
		FileInputStream fis=new FileInputStream("src/main/resources/English.properties");
		prop=new Properties();
		prop.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider(name="getData",indices=0)
	public String[][] setData() throws IOException{
		String[][] readValue=utils.ReadExcel.readData(filePath); 
		return readValue;
		
	}
}
