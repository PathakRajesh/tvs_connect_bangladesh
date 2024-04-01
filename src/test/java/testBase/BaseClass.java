package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	static public AndroidDriver driver;
	public Properties p;
	public AppiumDriverLocalService service;
		
		
		@BeforeClass
		public void configureappium() throws IOException
		
		{
			
			 //loading properties file
	//		FileReader file=new FileReader(".//src/test/resources/config.properties");
	//		p=new Properties();
	//		p.load(file);
		
			//code to start/run the server automatically
			service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\rajesh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			service.start();
			
			//Create capabilities
			UiAutomator2Options option = new UiAutomator2Options();
			option.setDeviceName("Moto g32");
			option.setApp("C:/Users/rajesh/Downloads/TVSConnect-2.14.1-bangladeshStage-debug.apk");
		
			
			//Create object for AndroidDriver
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
		}
		
		public String randomeString()
		{
			String generatedString=RandomStringUtils.randomAlphabetic(5);
			return generatedString;
		}
		
		public String randomeNumber()
		{
			String generatedString=RandomStringUtils.randomNumeric(10);
			return generatedString;
		}
		
		public String randomAlphaNumeric()
		{
			String str=RandomStringUtils.randomAlphabetic(3);
			String num=RandomStringUtils.randomNumeric(3);
			
			return (str+"@"+num);
		}
		
		
		public String getScreenshotspath(String TestCaseName,AppiumDriver driver) throws IOException
		{
			File source=driver.getScreenshotAs(OutputType.FILE);
			String destinationFile=System.getProperty("user.dir")+"//reports"+TestCaseName+".png";
			FileUtils.copyFile(source, new File(destinationFile));
			return destinationFile;
		}
}
		
/*		@AfterClass
		public void Teardown()
		{
			driver.close();
			driver.quit();
		} 
	} */



