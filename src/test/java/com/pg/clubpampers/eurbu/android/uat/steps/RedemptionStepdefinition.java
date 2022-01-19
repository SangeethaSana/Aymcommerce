package com.pg.clubpampers.eurbu.android.uat.steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import com.pg.clubpampers.eurbu.android.uat.controller.EngineController;
import com.pg.clubpampers.eurbu.android.uat.driverextension.DriverHelpers;
import com.pg.clubpampers.eurbu.android.uat.driverextension.DriverInstanceCreator;
import com.pg.clubpampers.eurbu.android.uat.extensions.ExcelReader;
import com.pg.clubpampers.eurbu.android.uat.pages.Basepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedemptionStepdefinition extends DriverHelpers {
	@Given("user login with valid credential SC01")
	public void user_login_with_valid_credential_SC01() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC01");
		try {
			androidDriverInstance1();
			pageload("imamMember", RedemptionXpath);
			clickElement("imamMember", RedemptionXpath);
			waitForElement("loginemail",RedemptionXpath);
			sendKeystoElement("loginemail", RedemptionXpath, "ana13@yopmail.com");

			if (getElementText("loginemail", RedemptionXpath).contains("ana13@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", RedemptionXpath);
			sendKeystoElement("loginpass", RedemptionXpath, "Testing123");
			if (getElementText("loginpass", RedemptionXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", RedemptionXpath);
			clickElement("logincontinue", RedemptionXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@Then("user clicks rewards page SC01")
	public void user_clicks_rewards_page_SC01() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user clicks rewards page SC01");
		try {
			waitForElement("inbox", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			try {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			if (getElement("productimage", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on rewards page successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on rewards page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify the page redirects to Product details screen when user tap on products SC01")
	public void verify_the_page_redirects_to_Product_details_screen_when_user_tap_on_products_SC01() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the page redirects to Product details screen when user tap on products SC01");
		try {
			waitForElement("productimage", RedemptionXpath);
			try {
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			waitForElement("productdetail", RedemptionXpath);
			waitForElement("productdetail", RedemptionXpath);
			if (getElement("productdetail", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views product image and details",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view product imaged and details",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}
	
	@Given("user lands rewards page SC02")
	public void user_lands_rewards_page_SC02() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user lands rewards page SC02");
		try {
			DriverHelpers.driver= DriverInstanceCreator.androidDriverInstance();
			/*waitForElement("imamMember", RedemptionXpath);
			clickElement("imamMember", RedemptionXpath);
			waitForElement("loginemail",RedemptionXpath);
			sendKeystoElement("loginemail", RedemptionXpath, "ana13@yopmail.com");
			waitForElement("loginpass", RedemptionXpath);
			sendKeystoElement("loginpass", RedemptionXpath, "Testing123");
			waitForElement("logincontinue", RedemptionXpath);
			clickElement("logincontinue", RedemptionXpath);*/
			pageload("inbox", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			try {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			catch(Exception e) {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			if (getElement("productimage", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on rewards page successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on rewards page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify the down arrow able to clickable or not in product detail screen SC02")
	public void verify_the_down_arrow_able_to_clickable_or_not_in_product_detail_screen_SC02() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the down arrow able to clickable or not in product detail screen SC02");
		try {
			waitForElement("productimage", RedemptionXpath);
			try {
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			catch(Exception e) {
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			waitForElement("soft", RedemptionXpath);
			waitForElement("soft", RedemptionXpath);
			scrollAndClick("Explore our Rewards");
			waitForElement("sizearrow", RedemptionXpath);
			waitForElement("sizearrow", RedemptionXpath);
			clickElement("sizearrow", RedemptionXpath);
			waitForElement("diapersize", RedemptionXpath);
			waitForElement("diapersize", RedemptionXpath);
			if (getElement("diapersize", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user verify that down arrow is clickable at size field",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to click sizing field",s);
			}}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	

	@Then("Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC02")
	public void verify_the_CTA_at_the_bottom_after_page_redirects_to_Product_details_screen_when_user_tap_on_products_SC02() throws Throwable {

		EngineController.reportInstance.createStep("Then", "Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC02");
		try {
			waitForElement("closebutton", RedemptionXpath);
			clickElement("closebutton", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			try {
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			waitForElement("letscanccode", RedemptionXpath);
			waitForElement("letscanccode", RedemptionXpath);
			if (getElement("letscanccode", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views lets scan code button ,if user has less points to redeem the product",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view lets scan code button",s);
			}
			clickElement("closebutton", RedemptionXpath);
			try {
				waitForElement("productimage", RedemptionXpath);
				waitForElement("productimage", RedemptionXpath);
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);
			}
			catch(Exception e){
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);
			}	
			waitForElement("redeemproduct", RedemptionXpath);
			waitForElement("redeemproduct", RedemptionXpath);
			clickElement("redeemproduct", RedemptionXpath);      
			waitForElement("redeemnow", RedemptionXpath);
			waitForElement("redeemnow", RedemptionXpath);
			if (getElement("redeemnow", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view redeem button ,if user has enough points to redeem the product",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view redeem now button",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}
	
	@Given("user lands rewards page SC03")
	public void user_lands_rewards_page_SC03() throws Throwable {
		EngineController.reportInstance.createStep("Given","user lands rewards page SC03");
		try {
			DriverHelpers.driver= DriverInstanceCreator.androidDriverInstance();
			/*waitForElement("imamMember", RedemptionXpath);
			clickElement("imamMember", RedemptionXpath);
			waitForElement("loginemail",RedemptionXpath);
			sendKeystoElement("loginemail", RedemptionXpath, "ana13@yopmail.com");
			waitForElement("loginpass", RedemptionXpath);
			sendKeystoElement("loginpass", RedemptionXpath,"Testing123");
			waitForElement("logincontinue", RedemptionXpath);
			clickElement("logincontinue", RedemptionXpath);*/
			pageload("inbox", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			try {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			if (getElement("productimage", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on rewards page successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on rewards page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC03")
	public void verify_the_CTA_at_the_bottom_after_page_redirects_to_Product_details_screen_when_user_tap_on_products_SC03() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC03");
		try {
			waitForElement("productimage", RedemptionXpath);
			try {
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("productimage", RedemptionXpath);
				clickElement("productimage", RedemptionXpath);
			}
			waitForElement("letscanccode", RedemptionXpath);
			waitForElement("letscanccode", RedemptionXpath);
			if (getElement("letscanccode", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views lets scan code button ,if user has less points to redeem the product",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view lets scan code button",s);
			}
			clickElement("closebutton", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			try {
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);
			}
			catch(Exception e){
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);}	
			waitForElement("redeemproduct", RedemptionXpath);
			clickElement("redeemproduct", RedemptionXpath);
			waitForElement("redeemnow", RedemptionXpath);
			waitForElement("redeemnow", RedemptionXpath);
			if (getElement("redeemnow", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view redeem button ,if user has enough points to redeem the product",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view redeem now button",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("Verify User views Description and Merchant Details SC03")
	public void verify_User_views_Description_and_Merchant_Details_SC03() throws Throwable {

		EngineController.reportInstance.createStep("Then", "Verify User views Description and Merchant Details SC03");
		try {
			waitForElement("redeemproduct", RedemptionXpath);
			waitForElement("redeemproduct", RedemptionXpath);
			scrollAndClick("Explore our Rewards");
			waitForElement("merchantdetails", RedemptionXpath);
			waitForElement("merchantdetails", RedemptionXpath);
			if (getElementText("merchantdetails", RedemptionXpath).endsWith("Promotion is limited to French territory.")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views product and merchant details successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view product and merchant details",s);
			}

		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}
	
	@Given("user lands on rewards page SC04")
	public void user_lands_on_rewards_page_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Given","user lands rewards page SC04");
		try {
			DriverHelpers.driver= DriverInstanceCreator.androidDriverInstance();
			/*waitForElement("imamMember", RedemptionXpath);
			clickElement("imamMember", RedemptionXpath);
			waitForElement("loginemail",RedemptionXpath);
			sendKeystoElement("loginemail", RedemptionXpath, ExcelReader.readData(1, 0, "redemption"));
			waitForElement("loginpass", RedemptionXpath);
			sendKeystoElement("loginpass", RedemptionXpath, ExcelReader.readData(1, 1, "redemption"));
			waitForElement("logincontinue", RedemptionXpath);
			clickElement("logincontinue", RedemptionXpath);*/
			pageload("inbox", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			try {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			if (getElement("productimage", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on rewards page successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on rewards page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@And("Verify user redirects to Shipping address screen or not after tap on redeem now in coupon detail screen SC04")
	public void verify_user_redirects_to_Shipping_address_screen_or_not_after_tap_on_redeem_now_in_coupon_detail_screen_SC04() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify user redirects to Shipping address screen or not after tap on redeem now in coupon detail screen SC04");
		try {
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			try {
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);
			}
			catch(Exception e){
				scrollAndClick("Pack size changes depending on selected diaper size.");
				waitForElement("redeemproduct", RedemptionXpath);
			}	
			waitForElement("redeemproduct", RedemptionXpath);
			clickElement("redeemproduct", RedemptionXpath);
			waitForElement("freeshipping", RedemptionXpath);
			waitForElement("freeshipping", RedemptionXpath);
			clickElement("redeemnow",RedemptionXpath);
			waitForElement("firstname", RedemptionXpath);
			waitForElement("firstname", RedemptionXpath);
			if (getElement("firstname", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on shipping screen successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on shipping screen",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("Verify user can submit the form with firstname and lastname fields empty SC04")
	public void verify_user_can_submit_the_form_with_firstname_and_lastname_fields_empty_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Then","Verify user can submit the form with firstname and lastname fields empty SC04");
		try {
			waitForElement("firstname", RedemptionXpath);
			getElement("firstname", RedemptionXpath).clear();
			waitForElement("firstname", RedemptionXpath);
			waitForElement("firstname", RedemptionXpath);
			if (!getElement("savebutton", RedemptionXpath).isEnabled()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user not allowed to submit firstname and lastname field empty",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to reach save button",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}
	
	@Given("user login with valid credntials SC05")
	public void user_login_with_valid_credntials_SC05() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credntials SC05");
		try {
			androidDriverInstance1();
			pageload("imamMember", RedemptionXpath);
			clickElement("imamMember", RedemptionXpath);
			waitForElement("loginemail",RedemptionXpath);
			sendKeystoElement("loginemail", RedemptionXpath, "ana12@yopmail.com");

			if (getElementText("loginemail", RedemptionXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", RedemptionXpath);
			sendKeystoElement("loginpass", RedemptionXpath, "Testing123");
			if (getElementText("loginpass", RedemptionXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", RedemptionXpath);
			clickElement("logincontinue", RedemptionXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@When("user scan code and got ten points SC05")
	public void user_scan_code_and_got_ten_points_SC05() throws Throwable {
		EngineController.reportInstance.createStep("When","user scan code and got ten points SC05");
		try {
			pageload("inbox", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			try {
				waitForElement("scanbutton", RedemptionXpath);
				clickElement("scanbutton", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", RedemptionXpath);
				clickElement("scanbutton", RedemptionXpath);	}
			try {
				waitForElement("camerapermission", RedemptionXpath);
				waitForElement("camerapermission", RedemptionXpath);
				clickElement("camerapermission", RedemptionXpath);
				waitForElement("rathertypecode", RedemptionXpath);
				clickElement("rathertypecode", RedemptionXpath);
				waitForElement("pintextbox", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("manualEntry", RedemptionXpath);
				waitForElement("manualEntry", RedemptionXpath);
				clickElement("manualEntry", RedemptionXpath);	
				waitForElement("pintextbox", RedemptionXpath);
			}
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, "BKTFTYX9FJ39HK9"); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			clickElement("scanagain", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, "BYNRFY3KYJRFHJ3"); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			clickElement("scanagain", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, "BCTF49R3KYHCTTR"); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			clickElement("scanagain", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, "BXC99RKKRCN3RJ4"); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			clickElement("scanagain", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, ""); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			waitForElement("scanagain", RedemptionXpath);
			clickElement("scanagain", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			waitForElement("pintextbox", RedemptionXpath);
			sendKeystoElement("pintextbox", RedemptionXpath, "BTHRF94CJCJJ4JN"); 
			waitForElement("pingo", RedemptionXpath);
			waitForElement("pingo", RedemptionXpath);
			clickElement("pingo", RedemptionXpath);
			waitForElement("getreward", RedemptionXpath);
			waitForElement("getreward", RedemptionXpath);
			try
			{
				pageload("close", RedemptionXpath);
				clickElement("close", RedemptionXpath);
				waitForElement("Rewards", RedemptionXpath);
			}
			catch(Exception e)
			{
				pageload("close", RedemptionXpath);
			clickElement("close", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			}
			waitForElement("Rewards", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			if (getElement("Rewards", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user got ten coins",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to get 10 coins",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("Verify the page redirects to rewards screen when tap on rewards icon at the bottom of the screen SC05")
	public void verify_the_page_redirects_to_rewards_screen_when_tap_on_rewards_icon_at_the_bottom_of_the_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("Then", "Verify the page redirects to rewards screen when tap on rewards icon at the bottom of the screen SC05");
		try {
			waitForElement("inbox", RedemptionXpath);
			waitForElement("scanbutton", RedemptionXpath);
			waitForElement("Rewards", RedemptionXpath);
			try {
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			catch(Exception e)
			{
				waitForElement("Rewards", RedemptionXpath);
				clickElement("Rewards", RedemptionXpath);
			}
			waitForElement("productimage", RedemptionXpath);
			waitForElement("productimage", RedemptionXpath);
			if (getElement("productimage", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on rewards page successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on rewards page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@Then("Verify the CTA should be Redeem now if user have enough points to redeem SC05")
	public void verify_the_CTA_should_be_Redeem_now_if_user_have_enough_points_to_redeem_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the CTA should be Redeem now if user have enough points to redeem SC05");
		try {
			waitForElement("productimage", RedemptionXpath);
			clickElement("productimage", RedemptionXpath);
			waitForElement("soft", RedemptionXpath);
			waitForElement("soft", RedemptionXpath);
			if (getElement("redeemnow", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views redeem now button enable",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view redeem now button",s);
			}

		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify user redirects to product detail size select screen when he tap on redeem now CTA from product detail screen SC05")
	public void verify_user_redirects_to_product_detail_size_select_screen_when_he_tap_on_redeem_now_CTA_from_product_detail_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify user redirects to product detail size select screen when he tap on redeem now CTA from product detail screen SC05");

		try {
			waitForElement("soft", RedemptionXpath);
			clickElement("redeemnow",RedemptionXpath);
			waitForElement("productsizebutton", RedemptionXpath);
			waitForElement("productsizebutton", RedemptionXpath);
			if (getElement("productsizebutton", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views product size screen , if user click redeem button",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view product size screen",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify user redirects to Shipping address screen or not SC05")
	public void verify_user_redirects_to_Shipping_address_screen_or_not_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify user redirects to Shipping address screen or not SC05");
		try {
			waitForElement("productsizebutton", RedemptionXpath);
			clickElement("productsizebutton",RedemptionXpath);
			waitForElement("firstname", RedemptionXpath);
			waitForElement("firstname", RedemptionXpath);
			if (getElement("firstname", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on shipping screen successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on shipping screen",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify Save my details CTA should enable after completed mandatory fields SC05")
	public void verify_Save_my_details_CTA_should_enable_after_completed_mandatory_fields_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify Save my details CTA should enable after completed mandatory fields SC05");
		try {
			waitForElement("lastname", RedemptionXpath);
			sendKeystoElement("lastname", RedemptionXpath, ExcelReader.readData(1, 2, "redemption"));
			waitForElement("postcode", RedemptionXpath);
			sendKeystoElement("postcode", RedemptionXpath, ExcelReader.readData(1, 3, "redemption"));
			waitForElement("streetname", RedemptionXpath);
			sendKeystoElement("streetname", RedemptionXpath, ExcelReader.readData(1, 4, "redemption"));
			waitForElement("Appartment", RedemptionXpath);
			sendKeystoElement("Appartment", RedemptionXpath, ExcelReader.readData(1, 5, "redemption"));
			waitForElement("additionaladdress", RedemptionXpath);
			sendKeystoElement("additionaladdress", RedemptionXpath, ExcelReader.readData(1, 6, "redemption"));
			waitForElement("city", RedemptionXpath);
			sendKeystoElement("city", RedemptionXpath, ExcelReader.readData(1, 7, "redemption"));
			waitForElement("savebutton", RedemptionXpath);
			waitForElement("savebutton", RedemptionXpath);
			if (getElement("savebutton", RedemptionXpath).isEnabled()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views save button is enabled",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to reach save button",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify user redirects to order summary screen after completed shipping details and Tap on Save my details CTA")
	public void verify_user_redirects_to_order_summary_screen_after_completed_shipping_details_and_Tap_on_Save_my_details_CTA() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify user redirects to order summary screen after completed shipping details and Tap on Save my details CTA");
		try {
			waitForElement("savebutton", RedemptionXpath);
			clickElement("savebutton", RedemptionXpath);
			waitForElement("ordersummary", RedemptionXpath);
			waitForElement("ordersummary", RedemptionXpath);
			if (getElement("ordersummary", RedemptionXpath).isEnabled()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views order summary screen",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to reach order summary screen",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify user entered details is displaying proper in order summary screen SC05")
	public void verify_user_entered_details_is_displaying_proper_in_order_summary_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify user entered details is displaying proper in order summary screen SC05");
		try {
			waitForElement("address", RedemptionXpath);
			if (getElementText("address", RedemptionXpath).endsWith("75008")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views correct address at order summary page",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view address at order summary page",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify the free shipping section is displaying for physical reward and non-physical reward SC05")
	public void verify_the_free_shipping_section_is_displaying_for_physical_reward_and_non_physical_reward_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify the free shipping section is displaying for physical reward and non-physical reward SC05");
		try {
			waitForElement("shipping", RedemptionXpath);
			if (getElement("shipping", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views free shipping section successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view free shipping section",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@And("Verify the user redirects to order confirmation screen when user tap on CTA in the summary screen SC05")
	public void verify_the_user_redirects_to_order_confirmation_screen_when_user_tap_on_CTA_in_the_summary_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And","Verify the user redirects to order confirmation screen when user tap on CTA in the summary screen SC05");
		try {
			clickElement("looksgood", RedemptionXpath);
			waitForElement("success", RedemptionXpath);
			if (getElement("success", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views order confirmation screen",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view order confirmation screen",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify the user redirects to home screen when user tap on CTA in the Order confirmation screen SC05")
	public void verify_the_user_redirects_to_home_screen_when_user_tap_on_CTA_in_the_Order_confirmation_screen_SC05() throws Throwable {

		EngineController.reportInstance.createStep("And","Verify the user redirects to home screen when user tap on CTA in the Order confirmation screen SC05");
		try {
			clickElement("okthanks", RedemptionXpath);
			waitForElement("home", RedemptionXpath);
			waitForElement("home", RedemptionXpath);
			if (getElement("home", RedemptionXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on home screen successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on home screen",s);
			}}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}
	
	@Given("report cooldown")
	public void report_cooldown() throws ClassNotFoundException {
		EngineController.reportInstance.reportCooldown();
	}


}
