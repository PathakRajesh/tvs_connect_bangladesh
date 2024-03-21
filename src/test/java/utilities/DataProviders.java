package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="loginData")
	public Object [][] getData()
	{
		return new Object[][] {{"deshbangla@yopmail.com"}};
		
	}
	@DataProvider(name="profileData")
	public Object[][] getData2()
	{
		return new Object[][] {{"Rajesh Pathak","Chattogram","Allergy","Tvs application"}};
		
	} 
	@DataProvider(name="sendFeedback")
	public Object[][] getData3()
	{
		return new Object[][] {{"TVS Connect Bangladesh Application"}};
	} 
	
}


