package CommonUtility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;

public class TestUtil extends TestBase{

	public static String destDir;
	public static DateFormat dateFormat;
	public static String destFile;
	
	public static void  takeScreenShot() throws IOException {
		Date d = new Date();
		String screenshotFile=d.toString().replace(":","_").replace(" ", "_")+".jpg";
		
		String filePath =System.getProperty("user.dir")+"/test-output/Screenshots/"+screenshotFile;
		//Store screenshots in that file
        File dest = new File(filePath);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcFile,dest);

		//Reporter.addScreenCaptureFromPath(filePath);
	}
}
