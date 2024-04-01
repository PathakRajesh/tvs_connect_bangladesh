package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager  {
	
	 static ExtentReports extent;
		
		public static ExtentReports getReporterObject()
		{
			
			//ExtendReports , ExtendSparkreporter
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("TVS Connect IB-Bangladesh");
			reporter.config().setDocumentTitle("Test Result");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Rajesh Pathak");
			return extent;
}
}
	
	
