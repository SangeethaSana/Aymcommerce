package com.pg.clubpampers.eurbu.android.uat.steps;

import java.io.IOException;
import java.util.Random;
import org.junit.Assert;
import com.pg.clubpampers.eurbu.android.uat.controller.EngineController;
import com.pg.clubpampers.eurbu.android.uat.driverextension.DriverHelpers;
import com.pg.clubpampers.eurbu.android.uat.extensions.ExcelReader;
import com.pg.clubpampers.eurbu.android.uat.extensions.ReportConfig;
import com.pg.clubpampers.eurbu.android.uat.pages.Basepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationStepdefinition extends DriverHelpers {

	@Given("user is on pamper app home page SC01")
	public void user_is_on_pamper_app_home_page_SC01() throws Throwable {

		EngineController.reportInstance.createStep("Given", "user is on pamper app home page SC01");
		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			if (getElement("ijoin", RegistrationXpath).isEnabled()) {
				System.out.println("enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on home page successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on home screen",s); 
			}
		}			
		catch (Exception e) {
			System.out.println(e);
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@When("user clicks i will join button SC01")

	public void user_clicks_i_will_join_button_SC01() throws Throwable {
		EngineController.reportInstance.createStep("When", "user clicks i will join button SC01");
		try {
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			if (getElement("firstname", RegistrationXpath).isDisplayed()) {
				System.out.println("enabled");
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on registration page successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on registration screen",s); 
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@Then("check accept and reject CTA is disabled SC01")
	public void check_accept_and_reject_CTA_is_disabled_SC01() throws ClassNotFoundException, IOException, Throwable {
		EngineController.reportInstance.createStep("Then", "check accept and reject CTA is disabled SC01");
		try {
			scrollAndClick("Or, Accept and:");
			waitForElement("accept", RegistrationXpath);
			if (!getElement("Acceptandcontinue", RegistrationXpath).isEnabled()) {
				System.out.println("button is not enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("button is disabled without entering the fields",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("button is enabled without entering the fields",s);
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}

	@Given("user is on pamper app registration page SC02")
	public void user_is_on_pamper_app_registration_page_SC02() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user is on pamper app registration page SC02");
		try {

			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			if (getElement("firstname", RegistrationXpath).isDisplayed()) {
				System.out.println("enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on registration page successfully",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on registration screen",s); 
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user feeds credentials at registration SC02")

	public void user_feeds_credentials_at_registration_SC02() throws Throwable {
		EngineController.reportInstance.createStep("When", "user feeds credentials at registration SC02");
		try {
			
			waitForElement("firstname", RegistrationXpath);
			sendKeystoElement("firstname", RegistrationXpath, ExcelReader.readData(1, 0, "register"));

			if (getElementText("firstnamefield", RegistrationXpath).contains("Grace")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid first name",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s); 
			}

			Random rand = new Random();
			waitForElement("email", RegistrationXpath);
			sendKeystoElement("email",RegistrationXpath, "test_aym_fr_android" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");

			if (getElementText("emailfield", RegistrationXpath).startsWith("test_aym_fr_android")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters email",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}

			waitForElement("password", RegistrationXpath);
			sendKeystoElement("password", RegistrationXpath, ExcelReader.readData(1, 2, "register"));
			clickElement("eye", RegistrationXpath);

			if (getElementText("passwordfield", RegistrationXpath).contains("Gracetest2021")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);

			} else

			{
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			scrollAndClick("Or, Accept and:");
		} 
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@Then("Accept and continue CTA should be enabled SC02")
	public void Accept_and_continue_CTA_should_be_enabled_SC02() throws Throwable {
		EngineController.reportInstance.createStep("Then", "Accept and continue CTA should be enabled SC02");
		try {
			waitForElement("Acceptandcontinue", RegistrationXpath);
			if (getElement("Acceptandcontinue", RegistrationXpath).isEnabled()) {
				System.out.println("button is enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("button is enabled after entering the fields",s);

			} else {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("button is disabled",s); 
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
		closeDriver();
		}

	@Given("user submits valid credentials on registration screen SC01")

	public void user_submits_valid_credentials_on_registration_screen_SC01() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user submits valid credentials on registration screen SC01");
		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			sendKeystoElement("firstname",  RegistrationXpath,ExcelReader.readData(1, 0, "register"));

			if (getElementText("firstnamefield", RegistrationXpath).contains("Grace")) {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid first name",s);

			} else {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s);
			}

			Random rand = new Random();

			waitForElement("email",RegistrationXpath);
			sendKeystoElement("email", RegistrationXpath,"test_aym_fr_android" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");

			if (getElementText("emailfield", RegistrationXpath).startsWith("test_aym_fr_android")) {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters email",s);

			} else {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}

			waitForElement("password",RegistrationXpath);
			sendKeystoElement("password", RegistrationXpath, ExcelReader.readData(1, 2, "register"));
			clickElement("eye", RegistrationXpath);

			if (getElementText("passwordfield", RegistrationXpath).contains("Gracetest2021")) {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);

			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}
			scrollAndClick("Or, Accept and:");
			waitForElement("Acceptandcontinue",RegistrationXpath);
			clickElement("Acceptandcontinue", RegistrationXpath);
			waitForElement("emailoptinyes", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("manageapp", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("allow", RegistrationXpath);
			waitForElement("allow", RegistrationXpath);
			clickElement("allow", RegistrationXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			System.out.println(e);
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user should redirect to add baby dob screen SC01")
	public void user_should_redirect_to_add_baby_dob_screen_SC01() throws Throwable {
		EngineController.reportInstance.createStep("When", "user should redirect to add baby dob screen SC01");
		try {
			waitForElement("adddate", RegistrationXpath);
			waitForElement("adddate", RegistrationXpath);
			clickElement("adddate", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			clickElement("dobok", RegistrationXpath);
			waitForElement("continue", RegistrationXpath);
			waitForElement("continue", RegistrationXpath);
			if (getElement("continue", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on add baby  screen successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to login",s); 
			}
			clickElement("continue", RegistrationXpath);

		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@Then("user should redirect to dashboard screen successfully SC01")
	public void user_should_redirect_to_dashboard_screen_successfully_SC01() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should redirect to dashboard screen successfully SC01");
		try {
			waitForElement("profileicon", RegistrationXpath);
			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on dashboard screen successfully",s);
			} else {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to register",s); 
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

	@Given("user is on pamper app registration page SC04")
	public void user_is_on_pamper_app_registration_page_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user is on pamper app registration page SC04");
		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			if (getElement("firstname", RegistrationXpath).isDisplayed()) {
				System.out.println("enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on registration page successfully",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on registration screen",s); 
			}
		}catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should view valid error message for invalid or empty fields SC04")
	public void user_should_view_valid_error_message_for_invalid_or_empty_fields_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should view valid error message for invalid or empty fields SC04");
		try {
			waitForElement("firstname",RegistrationXpath);
			sendKeystoElement("firstname",RegistrationXpath,"aym@yopmail");
			waitForElement("firstnameError", RegistrationXpath);
			if (getElementText("firstnameError", RegistrationXpath).contains("Cannot contain numbers or special characters")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for invalid Firstname data",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for invalid Firstname data",s); 
			}
			getElement("firstnamefield", RegistrationXpath).clear();
			clickElement("firstnamefield", RegistrationXpath);
			clickElement("email", RegistrationXpath);
			waitForElement("FirtnameEmpty", RegistrationXpath);
			if (getElementText("FirtnameEmpty", RegistrationXpath).contains("Required")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for empty Firstname field",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for Firstname field",s); 
			}
			Random rand = new Random();
			waitForElement("email", RegistrationXpath);
			sendKeystoElement("email", RegistrationXpath, "test_aym_fr_android");
			waitForElement("emailError", RegistrationXpath);
			if (getElementText("emailError", RegistrationXpath).equals("Enter a valid email format")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for invalid Email data",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for invalid Email data",s); 

			}
			waitForElement("emailfield", RegistrationXpath);
			getElement("emailfield", RegistrationXpath).clear();
			waitForElement("emailfield", RegistrationXpath);
			clickElement("emailfield", RegistrationXpath);
			hideCloudDeviceKeyboard();
			waitForElement("password", RegistrationXpath);
			clickElement("password", RegistrationXpath);
            hideCloudDeviceKeyboard();
			waitForElement("emailEmpty", RegistrationXpath);
			if (getElementText("emailEmpty", RegistrationXpath).equals("*Required")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for empty Email field",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for empty Email field",s);
			}
			waitForElement("password",RegistrationXpath);
			sendKeystoElement("password",RegistrationXpath,"Testing@");
			waitForElement("eye",RegistrationXpath);
			clickElement("eye", RegistrationXpath);
			waitForElement("passwordError", RegistrationXpath);
			waitForElement("passwordError", RegistrationXpath);
			if (getElementText("passwordError", RegistrationXpath).startsWith("8+ characters")) {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for invalid password data",s);
			} else
			{
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for invalid password data",s); 
			}
			getElement("passwordfield", RegistrationXpath).clear();
			clickElement("passwordfield", RegistrationXpath);
			hideCloudDeviceKeyboard();
			clickElement("email", RegistrationXpath);
			hideCloudDeviceKeyboard();
			clickElement("eye", RegistrationXpath);
			waitForElement("passwordEmpty", RegistrationXpath);
			waitForElement("passwordEmpty", RegistrationXpath);
			if (getElement("passwordEmpty", RegistrationXpath).isDisplayed()) {
				String s=				captureScreenshot();
				EngineController.reportInstance.reportStepPass("user view valid error message for empty field",s);
			} else
			{
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view valid error message for empty field",s); 
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			System.out.println(e);
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
	  	closeDriver();
	}
	@Given("user is on registration page and sign up with already registered email")
	public void user_is_on_registration_page_and_sign_up_with_already_registered_email() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user is on registration page and sign up with already registered email");
		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
         	sendKeystoElement("firstname",RegistrationXpath,ExcelReader.readData(1, 0, "register"));

			if (getElementText("firstnamefield", RegistrationXpath).contains("Grace")) {
				String s =	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid first name",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s); 
			}
			Random rand = new Random();
			waitForElement("email", RegistrationXpath);
			sendKeystoElement("email", RegistrationXpath,"Ana12@yopmail.com");

			if (getElementText("emailfield", RegistrationXpath).startsWith("Ana12@yopmail.com")) {
				String s 	=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters email",s);

			} else {
				String s =	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}
			waitForElement("password",RegistrationXpath);
			sendKeystoElement("password",RegistrationXpath,ExcelReader.readData(1, 2, "register"));
			clickElement("eye", RegistrationXpath);

			if (getElementText("passwordfield", RegistrationXpath).contains("Gracetest2021")) {
				String s =		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else
			{
				String s =captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}

			scrollAndClick("Or, Accept and:");
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("user should get pop up message")
	public void user_should_get_pop_up_message() throws Throwable {
		EngineController.reportInstance.createStep("And", "user should get pop up message");
		try {
			waitForElement("Acceptandcontinue", RegistrationXpath);
			clickElement("Acceptandcontinue", RegistrationXpath);
			waitForElement("emailpopup", RegistrationXpath);

			if (getElement("emailpopup", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user get pop up successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to get pop up message",s); 
			}

			clickElement("emailpopup", RegistrationXpath);
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@Then("user should login through pop up message")
	public void user_should_login_through_pop_up_message() throws Throwable {

		EngineController.reportInstance.createStep("Then", "user should login through pop up message");
		try {

			waitForElement("loginpass", RegistrationXpath);
			clickElement("loginpass", RegistrationXpath);
			hideCloudDeviceKeyboard();
			sendKeystoElement("loginpass",  RegistrationXpath,"Testing123");
			waitForElement("logincontinue", RegistrationXpath);
			clickElement("logincontinue", RegistrationXpath);
			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on dashboard successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on dashboard",s); 
			}

		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
		EngineController.reportInstance.reportCooldown();
	 	closeDriver();
	}



	@Given("user is on pamper app login page SC06")
	public void user_is_on_pamper_app_login_page_SC06() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user is on pamper app login page SC06");
		try {
			androidDriverInstance1();
			pageload("imamMember", RegistrationXpath);
			waitForElement("imamMember", RegistrationXpath);
			clickElement("imamMember", RegistrationXpath);
			waitForElement("loginmail", RegistrationXpath);
			if (getElement("loginmail", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on login page",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s); 
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should view valid error message for invalid or empty fields SC06")
	public void user_should_view_valid_error_message_for_invalid_or_empty_fields_SC06() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should view valid error message for invalid or empty fields SC06");
		try {

			clickElement("loginmail", RegistrationXpath);
			hideCloudDeviceKeyboard();
			clickElement("loginpass", RegistrationXpath);
             hideCloudDeviceKeyboard();
			if (getElementText("loginemailempty", RegistrationXpath).contains("*Required")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views email alert message",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view email alert message",s); 
			}
			clickElement("loginmail", RegistrationXpath);
			hideCloudDeviceKeyboard();
			if (getElementText("loginpassempty", RegistrationXpath).contains("*Required")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views password alert message",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view password alert message",s); 
			}		}

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

	@Given("user submits valid credentials on registration screen SC07")
	public void user_submits_valid_credentials_on_registration_screen_SC07() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user submits valid credentials on registration screen SC07");
		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			sendKeystoElement("firstname",RegistrationXpath, ExcelReader.readData(1, 0, "register") );

			if (getElementText("firstnamefield", RegistrationXpath).contains("Grace")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid first name",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s); 
			}

			Random rand = new Random();
			waitForElement("email",RegistrationXpath);
			sendKeystoElement("email",RegistrationXpath, "test_aym_fr_android" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");
			if (getElementText("emailfield", RegistrationXpath).startsWith("test_aym_fr_android")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters email",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}

			waitForElement("password", RegistrationXpath);
			sendKeystoElement("password", RegistrationXpath, ExcelReader.readData(1, 2, "register"));
			clickElement("eye", RegistrationXpath);

			if (getElementText("passwordfield", RegistrationXpath).contains("Gracetest2021")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else
			{
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}
			scrollAndClick("Or, Accept and:");
			waitForElement("Acceptandcontinue", RegistrationXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@When("user adds dob of already born baby SC07")
	public void user_adds_dob_of_already_born_baby_SC07() throws Throwable {
		EngineController.reportInstance.createStep("When", "user adds dob of already born baby SC07");
		try {
			waitForElement("Acceptandcontinue", RegistrationXpath);
			clickElement("Acceptandcontinue", RegistrationXpath);
			waitForElement("emailoptinyes", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("manageapp", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("allow", RegistrationXpath);
			clickElement("allow", RegistrationXpath);
			waitForElement("adddate", RegistrationXpath);
			waitForElement("adddate", RegistrationXpath);
			clickElement("adddate", RegistrationXpath);
			waitForElement("date", RegistrationXpath);
			clickElement("date", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			clickElement("dobok", RegistrationXpath);
			waitForElement("continue", RegistrationXpath);
			if (getElement("continue", RegistrationXpath).isDisplayed()) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user adds dob of already born baby successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to add dob",s); 
			}
			clickElement("continue", RegistrationXpath);
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@Then("user should redirect to dashboard screen successfully SC07")
	public void user_should_redirect_to_dashboard_screen_successfully_SC07() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should redirect to dashboard screen successfully SC07");
		try {

			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=			captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on add dashboard screen successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to register",s); 
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


	@Given("user lands on registration page SC09")
	public void user_lands_on_registration_page_SC09() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user lands on registration page SC09");

		try {
		//	fbLaunch();
		//	frlocalLaunch();
			clickElement("ijoin", RegistrationXpath);
			if (getElement("firstname", RegistrationXpath).isEnabled()) {
				System.out.println("enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on registration page successfully",s);
				scrollAndClick("Or, Accept and:");
				waitForElement("Acceptandcontinue", RegistrationXpath);

				clickElement("continuewithfacebook", RegistrationXpath);
			}

			else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on registration screen",s);
			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user register with already registered facebook credentials SC09")
	public void user_register_with_already_registered_facebook_credentials_SC09() throws Throwable {
		EngineController.reportInstance.createStep("When", "user register with already registered facebook credentials SC09");
		try {

			waitForElement("facebookemail", RegistrationXpath);
			sendKeystoElement("facebookemail", ExcelReader.readData(1, 2, "Facebook credentials"), RegistrationXpath);
			if (getElementText("facebookemail", RegistrationXpath).endsWith("@tfbnw.net")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("facebookpassword", RegistrationXpath);

			sendKeystoElement("facebookpassword", ExcelReader.readData(1, 3, "Facebook credentials"),
					RegistrationXpath);
			if (getElementText("facebookpassword", RegistrationXpath).contains("••••••••••••")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}
			waitForElement("facebooklogin", RegistrationXpath);
			clickElement("eyeicon", RegistrationXpath);
			clickElement("facebooklogin", RegistrationXpath);
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should lands on dashboard screen SC09")
	public void user_should_lands_on_dashboard_screen_SC09() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should lands on dashboard screen SC09");
		try {
			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on dashboard screen",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("failed to land on dashboard screen",s);
			}

		}catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Given("user lands on login page SC10")
	public void user_lands_on_login_page_SC10() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user lands on login page SC10");

		try {
		//	fbLaunch();
			//frlocalLaunch();
			clickElement("imamMember", RegistrationXpath);
			if (getElement("continuewithfacebook", RegistrationXpath).isEnabled()) {
				System.out.println("enabled");
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on login page successfully",s);
				waitForElement("continuewithfacebook", RegistrationXpath);
				clickElement("continuewithfacebook", RegistrationXpath);
			}

			else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on login screen",s); 
			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user login with already registered facebook credentials SC10")
	public void user_login_with_already_registered_facebook_credentials_SC10() throws Throwable {
		EngineController.reportInstance.createStep("When", "user login with already registered facebook credentials SC10");
		try {

			waitForElement("facebookemail", RegistrationXpath);
			sendKeystoElement("facebookemail", ExcelReader.readData(1, 2, "Facebook credentials"), RegistrationXpath);
			if (getElementText("facebookemail", RegistrationXpath).endsWith("@tfbnw.net")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}
			waitForElement("facebookpassword", RegistrationXpath);

			sendKeystoElement("facebookpassword", ExcelReader.readData(1, 3, "Facebook credentials"),
					RegistrationXpath);
			if (getElementText("facebookpassword", RegistrationXpath).contains("••••••••••••")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}
			waitForElement("facebooklogin", RegistrationXpath);
			clickElement("eyeicon", RegistrationXpath);
			clickElement("facebooklogin", RegistrationXpath);
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should lands on dashboard screen SC10")
	public void user_should_lands_on_dashboard_screen_SC10() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should lands on dashboard screen SC10");
		try {
			waitForElement("fbyesandcontinue", RegistrationXpath);
			clickElement("fbyesandcontinue", RegistrationXpath);

			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on dashboard screen",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("failed to land on dashboard screen",s); 
			}

		}catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Given("user lands on registration page SC11")
	public void user_lands_on_registration_page_SC11() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user lands on registration page SC11");

		try {
		//	fbLaunch();
		//	frlocalLaunch();
			clickElement("ijoin", RegistrationXpath);
			if (getElement("firstname", RegistrationXpath).isEnabled()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on registration page successfully",s);
				System.out.println("enabled");
				scrollAndClick("Or, Accept and:");
				waitForElement("Acceptandcontinue", RegistrationXpath);

				clickElement("continuewithfacebook", RegistrationXpath);
			}

			else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on registration screen",s);

			}
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user register with valid facebook credentials SC11")
	public void user_register_with_valid_facebook_credentials_SC11() throws Throwable {
		EngineController.reportInstance.createStep("When", "user register with valid facebook credentials SC11");
		try {

			waitForElement("facebookemail", RegistrationXpath);
			sendKeystoElement("facebookemail", ExcelReader.readData(1, 0, "Facebook credentials"), RegistrationXpath);
			if (getElementText("facebookemail", RegistrationXpath).endsWith("@tfbnw.net")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}
			waitForElement("facebookpassword", RegistrationXpath);

			sendKeystoElement("facebookpassword", ExcelReader.readData(1, 1, "Facebook credentials"),
					RegistrationXpath);
			if (getElementText("facebookpassword", RegistrationXpath).contains("••••••••••••")) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}
			waitForElement("facebooklogin", RegistrationXpath);
			clickElement("eyeicon", RegistrationXpath);
			clickElement("facebooklogin", RegistrationXpath);
		} catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should lands on continue with fb screen SC11")
	public void user_should_lands_on_continue_with_fb_screen_SC11() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should lands on continue with fb screen SC11");
		try {

			waitForElement("cancel", RegistrationXpath);
			//		clickElement("continueas", RegistrationXpath);

			if (getElement("cancel", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on continue  screen",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("failed to land on continue screen",s); 
			}

		}catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Given("user register with valid credentials SC12")
	public void user_register_with_valid_credentials_SC12() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user register with valid credentials SC12");

		try {
			androidDriverInstance1();
			pageload("ijoin", RegistrationXpath);
			waitForElement("ijoin", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("next", RegistrationXpath);
			clickElement("ijoin", RegistrationXpath);
			waitForElement("firstname", RegistrationXpath);
			sendKeystoElement("firstname", RegistrationXpath, ExcelReader.readData(1, 0, "register"));

			if (getElementText("firstnamefield", RegistrationXpath).contains("Grace")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid first name",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid first name",s);
			}
			Random rand = new Random();
			waitForElement("email",RegistrationXpath);
			sendKeystoElement("email",RegistrationXpath, "test_aym_fr_android" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");
			if (getElementText("emailfield", RegistrationXpath).startsWith("test_aym_fr_android")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters email",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s); 
			}
			waitForElement("password", RegistrationXpath);
			sendKeystoElement("password", RegistrationXpath ,ExcelReader.readData(1, 2, "register"));
			clickElement("eye", RegistrationXpath);

			if (getElementText("passwordfield", RegistrationXpath).contains("Gracetest2021")) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=	   captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s); 
			}
			scrollAndClick("Or, Accept and:");
			waitForElement("Acceptandcontinue", RegistrationXpath);
			clickElement("Acceptandcontinue", RegistrationXpath);
			waitForElement("emailoptinyes", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("manageapp", RegistrationXpath);
			clickElement("emailoptinyes", RegistrationXpath);
			waitForElement("allow", RegistrationXpath);
			clickElement("allow", RegistrationXpath);
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@When("user submits future dob at baby dob page SC12")
	public void user_submits_future_dob_at_baby_dob_page_SC12() throws Throwable {
		EngineController.reportInstance.createStep("When", "user submits future dob at baby dob page SC12");
		try {
			waitForElement("adddate", RegistrationXpath);
			waitForElement("adddate", RegistrationXpath);
			clickElement("adddate", RegistrationXpath);
			waitForElement("futuredob", RegistrationXpath);
			clickElement("futuredob", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			clickElement("dobok", RegistrationXpath);
			waitForElement("continue", RegistrationXpath);
			if (getElement("continue", RegistrationXpath).isDisplayed()) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user adds a baby due date successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to add a future date",s); 
			}
			clickElement("continue", RegistrationXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should lands on dashboard page SC12")
	public void user_should_land_on_dashboard_page_SC12() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should lands on dashboard page SC12");
		try {

			waitForElement("profileicon", RegistrationXpath);
			if (getElement("profileicon", RegistrationXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on dashboard screen successfully",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to register",s); 
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
	}

