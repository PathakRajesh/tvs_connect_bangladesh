package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class MyProfile extends AndroidActions {

	public MyProfile(WebDriver driver) {
		super(driver);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"My Profile\"]")
	private WebElement myProfileBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.tvsm.connect.bangladesh:id/tv_menu\" and @text=\"Edit Profile\"]")
	private WebElement editProfile;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/edt_fullname")
	private WebElement editprofiletxtfield;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/edtcity")
	private WebElement citytxtfield;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	private WebElement Savebtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private WebElement okbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.tvsm.connect.bangladesh:id/tv_menu\" and @text=\"Emergency Contacts\"]")
	private WebElement Emergency_Contact;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/tv_spinner_bg_txt")
	private WebElement Add_Blood_Grp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.tvsm.connect.bangladesh:id/tv_spinner_row_txt\" and @text=\"AB+\"]")
	private WebElement Choose_Blood_Grp;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/edt_alergic")
	private WebElement Add_allergic_Content;

	@AndroidFindBy(id = "com.tvsm.connect.bangladesh:id/tvSubmit")
	private WebElement Submitbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete account']")
	private WebElement DeleteAccount;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Other']")
	private WebElement deletereasonradiobtn;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Add Message']")
	private WebElement AddMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.tvsm.connect.bangladesh:id/deleteAccount']")
	private WebElement deleteaccountbtn;

	
	

	
	
	

	// Actions

	public void myProfileBtn() {
		myProfileBtn.click();
		editProfile.click();
	}


	public void editFullName(String editnamefield) {
		editprofiletxtfield.sendKeys(editnamefield);
	}

	public void editCityField(String editcity) {
		citytxtfield.sendKeys(editcity);
		Savebtn.click();
		okbtn.click();
	}

	public void emergencyContact(String Field) {
		Emergency_Contact.click();
		Add_Blood_Grp.click();
		Choose_Blood_Grp.click();
		Add_allergic_Content.sendKeys(Field);
		Submitbtn.click();

	}

	public void deleteAccount(String Text) {
		DeleteAccount.click();
		
		List<WebElement> deleteaccount= driver.findElements(By.id("com.tvsm.connect.bangladesh:id/radioDeleteReason"));
	    
	    for(int i=0; i<5;i++)
	    {
	     deleteaccount.get(i).click();
	    }
	
	    	
	 //	deletereasonradiobtn.click();
		AddMessage.sendKeys(Text);
		// driver.hideKeyboard();
		deleteaccountbtn.click();
		BackIcon();
		BackIcon();
		BackIcon();
	}
}



