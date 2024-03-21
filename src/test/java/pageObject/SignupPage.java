package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.AndroidActions;

public class SignupPage extends AndroidActions {

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	@AndroidFindBy(id="com.tvsm.connect.bangladesh:id/edt_fullname")
	private WebElement setFullName;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/edtcity")
    private WebElement setcityName;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/cb_pickndrop")
    private WebElement firstChkBox;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/cb_country")
    private WebElement secondChkBox;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/btn_submit")
    private WebElement submitBtn;
    
    @AndroidFindBy(id="com.tvsm.connect.bangladesh:id/edtmobilenmber")
	private WebElement setmobileNo;
    
    
    //Actions
    
    public void setFullName(String name)
    {
    	setFullName.sendKeys(name);
    }
    public void setMobileNumber(String mobilenumber)
    {
    	setmobileNo.sendKeys(mobilenumber);
    }
    public void setCity(String city)
    {
    	setcityName.sendKeys(city);
    }
    public void checkBox()
    {
    	firstChkBox.click();
    	secondChkBox.click();
    	submitBtn.click();
    }
}

	
	


