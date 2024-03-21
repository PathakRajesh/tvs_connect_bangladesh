package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class ReKnowYourBike extends AndroidActions{

	public ReKnowYourBike(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//*[contains(@text,'Know')]")
	private WebElement KnowYourBike;
	

//Actions
    public String knowyourbike()
{
	KnowYourBike.click();
	tips();
	specification();
	BackIcon();
	return "Know Your Bike";
}
}


