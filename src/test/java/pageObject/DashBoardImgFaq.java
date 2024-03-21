package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class DashBoardImgFaq extends AndroidActions{

	public DashBoardImgFaq(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/imgFAQ")
	private WebElement imgfaq;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/viewFaqs")
	private WebElement viewfaqs;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NTORQ']")
	private WebElement ntorq;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='APACHE']")
	private WebElement apache;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/feedback")
	private WebElement grievance;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/btn_high")
	private WebElement btnhigh;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/btn_medium")
	private WebElement btnmedium;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/btn_low")
	private WebElement btnlow;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/edtmsg")
	private WebElement editmsg;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SEND']")
	private WebElement sendbtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='OK']")
	private WebElement btnok;
	
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/close")
	private WebElement closebtn;
	
	//Actions
	
	public void faqfeedback(String text)
	{
		imgfaq.click();
		viewfaqs.click();
		ntorq.click();
		apache.click();
		BackIcon();
		imgfaq.click();
		grievance.click();
		btnhigh.click();
		btnmedium.click();
		btnlow.click();
		editmsg.sendKeys(text);
		sendbtn.click();
		btnok.click();
		imgfaq.click();
		closebtn.click();
		
	}

}
