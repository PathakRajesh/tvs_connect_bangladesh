package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
			FileReader file=new FileReader(".//src/test/resources/config.properties");
			p=new Properties();
			p.load(file);
		
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
		
		
	/*	@AfterClass
		public void Teardown()
		{
			driver.close();
			driver.quit();
		} */
		
		
	

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
		
		public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;
	}
	}



