package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AndroidActions {

	public WebDriver driver;

	public AndroidActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void allowAppPermission() {
		while (driver.findElements(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
				.size() > 0) {
			driver.findElement(By.xpath(
					"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
					.click();
		}

	}

	public void BackIcon() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/imgBack")).click();
	}

	public void HamburgerMenu() {
		driver.findElement(
				By.xpath("//android.widget.ImageView[@resource-id=\"com.tvsm.connect.bangladesh:id/imgBack\"]"))
				.click();
	}

	public void EditField(String text) {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/edtmobilenmber")).sendKeys(text);
	}

	public void Addnewbike() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/menu_add_new_bike")).click();
	}

	public void addVehicle() {
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"ADD VEHICLE\"]")).click();
	}

	public void ApacheBackbtn() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/u449_back_button")).click();
	}

	public void overspeedalert() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/iv_over_speed")).click();
	}

	public void OK() {
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	}

	public void donotdisturb() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/iv_do_not_disturb")).click();
	}

	public void autoreplysms() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/iv_auto_reply_sms")).click();
	}

	public void savebtn() {
		driver.findElement(By.xpath("//android.widget.Button[@text='Save']")).click();
	}

	public void heremappermissionclk() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/button_grant")).click();
	}

	public void tips() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Tips']")).click();
	}

	public void specification() {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Specifications']")).click();
	}

	public void ApacheVoiceAssist() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/iv_voice_assist")).click();
	}

	public void ApacheVoiceFeedback() {
		driver.findElement(By.id("com.tvsm.connect.bangladesh:id/iv_voice_feedback")).click();
	}

	public void longPress(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void ScrollDown() {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		} while (canScrollMore);
	}

	public void ScrollToText(String Text) {
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + Text + "\"));"));
	}

	public void SwipeAction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));
	}

	public void dragndrop(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "endX", 656, "endY", 1184));
	

	    }
}
