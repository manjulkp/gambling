package CommonUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class CommonUtility {

	public static Properties prop = new Properties();
	public static int EXPLICIT_WAIT_TIME;
	public static String IMPLICIT_WAIT_TIME;
	public static int DEFAULT_WAIT_TIME;
	public static String BROWSER_NAME;
	public static String TESTURL;
	
	
	public static WebDriver driver;
	public static String platform;


	
	public static void loadUserConfigProp(String propertyFileName) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
		prop.load(fis);
		System.out.println("The user configuration is loaded ");
		TESTURL = prop.getProperty("testsiteurl");
		
		BROWSER_NAME = prop.getProperty("browser");
		
		IMPLICIT_WAIT_TIME = prop.getProperty("implicit.wait");
		
		
		
	}

}
