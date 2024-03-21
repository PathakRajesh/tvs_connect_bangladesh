package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class Hamburger extends AndroidActions{

	public Hamburger(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Emergency Information\"]")
	private WebElement EmergencyInfo;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"KNOW MORE\"]")
	private WebElement KnowMore;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/tvSubmit")
	private WebElement Submitclk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"About us\"]")
	private WebElement AboutUsPage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Experience Settings\"]")
	private WebElement AppExperience;
	
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"FAQ\"]")
	private WebElement FAQpage;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc='APACHE']")
	private WebElement NTORQFAQ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Feedback\"]")
	private WebElement Feedbackpage;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/btn_medium")
	private WebElement FeedbackSeveritybtn;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/edtmsg")
	private WebElement FeedbackMessage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"SEND\"]")
	private WebElement SendClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"OK\"]")
	private WebElement OkClk;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/menu_profileimage1")
	private WebElement tvslogo;
	
	@AndroidFindBy(xpath=("(//android.widget.Toast)[1]"))
	private WebElement Emergencycontacttoastmsg;

//Actions 
	
	public boolean hamburgertvslogo()
	{
		BackIcon();
		boolean tvslogoimg=tvslogo.isDisplayed();
		return tvslogoimg;
	}
	
	public void emergencyinformation()
	{
		EmergencyInfo.click();
		KnowMore.click();
		BackIcon();
		Submitclk.click();
	}
		public String emergencyContactToastmessage()
		{
			String toastmsg = Emergencycontacttoastmsg.getAttribute("name");
			return toastmsg;
		}
		public void backmenupage()
		{
			BackIcon();
		}

	
	public void aboutus()
	{
		AboutUsPage.click();
		BackIcon();
		BackIcon();
	}
	
	public void appexperiencesetting()
	{
		AppExperience.click();
		BackIcon();
		BackIcon();
	}
	
	public void FAQ()
	{
		FAQpage.click();
		NTORQFAQ.click();
		BackIcon();
		BackIcon();
	}
	public void feedback(String Field)
	{
		Feedbackpage.click();
		FeedbackSeveritybtn.click();
		FeedbackMessage.sendKeys(Field);
		SendClk.click();
		OkClk.click();
	}
		  
}



