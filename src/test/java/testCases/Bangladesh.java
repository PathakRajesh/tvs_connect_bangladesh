package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddApache1602vCarb;
import pageObject.AddApache1602vFI;
import pageObject.AddApacheRTR1604v;
import pageObject.Apache1602vFIVehicleDetails;
import pageObject.ApacheLocateVehicle;
import pageObject.ApacheRiding101;
import pageObject.ApacheSettings;
import pageObject.ApacheUserManual;
import pageObject.ApacheVehicleOverview;
import pageObject.DashBoardImgFaq;
import pageObject.Hamburger;
import pageObject.LoginPage;
import pageObject.MyProfile;
import pageObject.MyRides;
import pageObject.Notification;
import pageObject.RTR1604vKnowYourBike;
import pageObject.RTR1604vMyTour;
import pageObject.RTR1604vRideDetail;
import pageObject.RTR1604vSettings;
import pageObject.RTR1604vLastParkedLocation;
import pageObject.ReAddVehicle;
import pageObject.ReHowtoVideos;
import pageObject.ReKnowYourBike;
import pageObject.ReLastParkedLocation;
import pageObject.ReRideDetails;
import pageObject.ReSettings;
import pageObject.SignupPage;
import pageObject.VerifyOtp;
import testBase.BaseClass;
import utilities.DataProviders;

public class Bangladesh extends BaseClass {

	@Test(priority = 1)
	public void applicationLogin() {
		LoginPage login = new LoginPage(driver);
		login.flashScreens();
		login.appTermsPolicy();
		login.emailField(randomeString() + "@gmail.com");
		login.loginPage();

	}

	@Test(priority = 2)
	public void signupDetails() {
		SignupPage signupdetails = new SignupPage(driver);
		signupdetails.setFullName(randomeString().toUpperCase());
		signupdetails.setMobileNumber(randomeNumber());
		signupdetails.setCity(randomeString().toUpperCase());
		signupdetails.checkBox();

	}

	@Test(priority = 3)
	public void verifyOtp() {
		VerifyOtp verifyotp = new VerifyOtp(driver);
		verifyotp.verifyOtp();
	}

	@Test(priority = 4)
	public void rtr1604vaddvehicle() throws InterruptedException {
		AddApacheRTR1604v addvehicle = new AddApacheRTR1604v(driver);
		addvehicle.addvehicle();

	}

	@Test(priority = 5)
	public void notification() {
		Notification notification = new Notification(driver);
		notification.notification();
	}

	@Test(priority = 6, dataProvider = "profileData", dataProviderClass = DataProviders.class)
	public void myprofile(String name, String city, String allergy, String deletemessage) {
		MyProfile profile = new MyProfile(driver);
		profile.myProfileBtn();
		profile.editFullName(name);
		profile.editCityField(city);
		profile.emergencyContact(allergy);
		profile.deleteAccount(deletemessage);

	}

	@Test(priority = 7, dataProvider = "sendFeedback", dataProviderClass = DataProviders.class)
	public void hamburgerlist(String Feedback) {
		Hamburger hamburgerList = new Hamburger(driver);
		Assert.assertEquals(hamburgerList.hamburgertvslogo(), true);
		hamburgerList.emergencyinformation();
		Assert.assertEquals(hamburgerList.emergencyContactToastmessage(), "Record updated successfully");
		hamburgerList.BackIcon();
		hamburgerList.aboutus();
		hamburgerList.appexperiencesetting();
		hamburgerList.FAQ();
		hamburgerList.feedback(Feedback);
	}

	@Test(priority = 8)
	public void rtr1604vridedetails() {
		RTR1604vRideDetail ridedetails = new RTR1604vRideDetail(driver);
		String ridedetailstitle = ridedetails.rtrridedetails("GEAR SHIFT PATTERN");
		Assert.assertEquals(ridedetailstitle, "Ride Details");
		System.out.println(ridedetailstitle);
	}

	@Test(priority = 9)
	public void rtr1604vmyrideslist() {
		MyRides myrideobj = new MyRides(driver);
		String myridedlist = myrideobj.rtr1604vmyrides();
		Assert.assertEquals(myridedlist, "My Rides");
		System.out.println(myridedlist);
	}

	@Test(priority = 10)
	public void rtr1604vmytour() {
		RTR1604vMyTour mytour = new RTR1604vMyTour(driver);
		String mytourtitle = mytour.mytour();
		Assert.assertEquals(mytourtitle, "My Tours");
		System.out.println(mytourtitle);
	}

	@Test(priority = 11)
	public void rtr1604vknowyourbike() {

		RTR1604vKnowYourBike knowyourbike = new RTR1604vKnowYourBike(driver);
		String knowyourbiketitle = knowyourbike.knowyourbike();
		Assert.assertEquals(knowyourbiketitle, "Know Your Bike");
		System.out.println(knowyourbiketitle);
	}

	@Test(priority = 12)
	public void rtr1604vsettings() {
		RTR1604vSettings settings = new RTR1604vSettings(driver);
		String settingstitle = settings.settings();
		Assert.assertEquals(settingstitle, "Settings");
		System.out.println(settingstitle);
		settings.removeVehicle();
		Assert.assertEquals(settings.settingToastMessage(), "Settings updated");
	}

	@Test(priority = 13)
	public void rtr1604vlastparklocation() {
		RTR1604vLastParkedLocation lastparklocation = new RTR1604vLastParkedLocation(driver);
		String lastparkedlocationtitle = lastparklocation.lastparkLocation("ADD VEHICLE");
		Assert.assertEquals(lastparkedlocationtitle, "Last Parked Location");
		System.out.println(lastparkedlocationtitle);
	}

	@Test(priority = 14)
	public void addracingeditionvehicle() throws InterruptedException {
		ReAddVehicle addvehicle = new ReAddVehicle(driver);
		addvehicle.addvehicles();
	}

	@Test(priority = 15)
	public void reridedetails() {
		ReRideDetails dashboard = new ReRideDetails(driver);
		dashboard.ridedetail();

	}

	@Test(priority = 16)
	public void remyrides() {
		MyRides myrideobj = new MyRides(driver);
		myrideobj.myrides();

	}

	@Test(priority = 17)
	public void reknowyourbike() {
		ReKnowYourBike knowyourbike = new ReKnowYourBike(driver);
		knowyourbike.knowyourbike();

	}

	@Test(priority = 18)
	public void resettings() {
		ReSettings settings = new ReSettings(driver);
		settings.settings();

	}

	@Test(priority = 19)
	public void relastparkedlocation() {
		ReLastParkedLocation lastparklocation = new ReLastParkedLocation(driver);
		lastparklocation.lastparkLocation();

	}

	@Test(priority = 20)
	public void rehowtovideos() {
		ReHowtoVideos howtovideos = new ReHowtoVideos(driver);
		howtovideos.howtovideos("ADD VEHICLE");
	}

	@Test(priority = 21)
	public void addrtrapache1602vcarb() {
		AddApache1602vCarb selectapache = new AddApache1602vCarb(driver);
		selectapache.addnewvehicle("ADD VEHICLE");
	}

	@Test(priority = 22)
	public void apachevehicleoverview() {
		ApacheVehicleOverview vehicleoverview = new ApacheVehicleOverview(driver);
		Assert.assertEquals(vehicleoverview.vehicleoverview(), true);
		vehicleoverview.apachebackmenu();
	}

	@Test(priority = 23)
	public void apachesettings() {
		ApacheSettings apachesettings = new ApacheSettings(driver);
		Assert.assertEquals(apachesettings.vehicleinfo(), true);
		apachesettings.settinginfo();
	}

	@Test(priority = 24)
	public void apachelocatevehicle() {
		ApacheLocateVehicle locatevehicle = new ApacheLocateVehicle(driver);
		locatevehicle.locatevehicle();
	}

	@Test(priority = 25)
	public void apacheusermanual() {
		ApacheUserManual usermanual = new ApacheUserManual(driver);
		usermanual.usermanual();
	}

	@Test(priority = 26)
	public void apacheriding101() {
		ApacheRiding101 riding101 = new ApacheRiding101(driver);
		Assert.assertEquals(riding101.riding101(), true);
		riding101.backmenu();
	}

	@Test(priority = 27)
	public void addapache1602vfi() {
		AddApache1602vFI apache = new AddApache1602vFI(driver);
		apache.addnewapachebike("RTR 160 2V FI");
	}

	@Test(priority = 28)
	public void apache1602vfivehicleovgierview() {
		Apache1602vFIVehicleDetails vehicledetails = new Apache1602vFIVehicleDetails(driver);
		Assert.assertEquals(vehicledetails.vehicleoverview(), "Best 0-60");
		vehicledetails.ridingpattern();
	}

	@Test(priority = 29)
	public void rtr1602vfisettings() {
		ApacheSettings apachesettings = new ApacheSettings(driver);
		apachesettings.vehicleinfo();
		apachesettings.voiceassist();
		apachesettings.settinginfo();
	}

	@Test(priority = 30)
	public void rtr1602vfilocatevehicle() {
		apachelocatevehicle();
	}

	@Test(priority = 31)
	public void rtr1602vfiusermanual() {
		apacheusermanual();
	}

	@Test(priority = 32)
	public void rtr1602vfiriding101() {
		apacheriding101();
	}

	@Test(priority = 33, dataProvider = "sendFeedback", dataProviderClass = DataProviders.class)
	public void dashboardfaqfeedback(String message) {
		DashBoardImgFaq imgfaqfeedback = new DashBoardImgFaq(driver);
		imgfaqfeedback.faqfeedback(message);
	}
}
