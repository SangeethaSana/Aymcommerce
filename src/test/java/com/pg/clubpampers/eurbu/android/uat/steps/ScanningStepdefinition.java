package com.pg.clubpampers.eurbu.android.uat.steps;

import java.util.Random;
import org.junit.Assert;
import com.pg.clubpampers.eurbu.android.uat.controller.EngineController;
import com.pg.clubpampers.eurbu.android.uat.driverextension.DriverHelpers;
import com.pg.clubpampers.eurbu.android.uat.driverextension.DriverInstanceCreator;
import com.pg.clubpampers.eurbu.android.uat.extensions.ExcelReader;
import com.pg.clubpampers.eurbu.android.uat.extensions.ReportConfig;
import com.pg.clubpampers.eurbu.android.uat.pages.Basepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScanningStepdefinition extends DriverHelpers {

	@Given("user register with valid credentials SC01")
	public void user_register_with_valid_credentials_SC01() throws Throwable {

		EngineController.reportInstance.createStep("Given", " user_register_with_valid_credentials_SC01");
		try
		{
	      androidDriverInstance1();
			System.out.println("I am in");
			pageload("ijoin", ScanningXpath);
			clickElement("ijoin", ScanningXpath);
			waitForElement("next", ScanningXpath);
			clickElement("ijoin", ScanningXpath);
			waitForElement("firstname", ScanningXpath);
			waitForElement("firstname", ScanningXpath);
			sendKeystoElement("firstname", ScanningXpath, ExcelReader.readData(1, 0, "register"));
			if (getElementText("firstnamefield", ScanningXpath).contains("Grace")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid firstname",s);

			} else {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid Firstname", s);
			}
			Random rand = new Random();
			waitForElement("email",MybabyXpath);
			sendKeystoElement("email",ScanningXpath, "test_aym_fr_android" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");
			if (getElementText("emailfield", ScanningXpath).startsWith("test_aym_fr_android")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid Email", s);

			} else {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid email", s);
			}

			waitForElement("password", ScanningXpath);
			sendKeystoElement("password", ScanningXpath, ExcelReader.readData(1, 2, "register"));
			waitForElement("eye", ScanningXpath);
			clickElement("eye", ScanningXpath);

			if (getElementText("passwordfield", ScanningXpath).contains("Gracetest2021")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password", s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid password", s);
			}
			scrollAndClick("Or, Accept and:");
			waitForElement("Acceptandcontinue", ScanningXpath);
			clickElement("Acceptandcontinue", ScanningXpath);
			waitForElement("emailoptinyes", ScanningXpath);
			clickElement("emailoptinyes", ScanningXpath);
			waitForElement("manageapp", ScanningXpath);
			clickElement("emailoptinyes", ScanningXpath);
			waitForElement("allow", ScanningXpath);
			clickElement("allow", ScanningXpath);
			waitForElement("adddate", RegistrationXpath);
			clickElement("adddate", RegistrationXpath);
			waitForElement("dobok", RegistrationXpath);
			clickElement("dobok", RegistrationXpath);
			waitForElement("continue", RegistrationXpath);
			clickElement("continue", RegistrationXpath);
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("verify the user tapping on the scan button should ask for camera permission for the first time")
	public void verify_the_user_tapping_on_the_scan_button_should_ask_for_camera_permission_for_the_first_time() throws Throwable {
		EngineController.reportInstance.createStep("Then", "verify the user tapping on the scan button should ask for camera permission for the first time");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try {
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				if (getElement("camerapermission", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views camera permission screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view permission screen",s);
				}
				clickElement("camerapermission",ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				if (getElement("manualEntry", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user views camera permission screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user failed to view permission screen",s);
				}
				clickElement("manualEntry",ScanningXpath);

			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@And("user should view add scan code screen successfully")
	public void user_should_view_add_scan_code_screen_successfully() throws Throwable {
		EngineController.reportInstance.createStep("And", "user should view add scan code screen successfully");
		try {
			try {
				waitForElement("rathertypecode", ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}
			}		
			catch(Exception e) {
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}
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

	@Given("user login with valid credential SC02")
	public void user_login_with_valid_credential_SC02() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC02");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));
			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			System.out.println(e);
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC02")
	public void user_navigate_to_add_scan_code_screen_SC02() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC02");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try
			{
				waitForElement("camerapermission",ScanningXpath);
				waitForElement("camerapermission",ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("user should view points at top right corner of screen SC02")
	public void user_should_view_points_at_top_right_corner_of_screen_SC02() throws Throwable {
		EngineController.reportInstance.createStep("And", "user should view points at top right corner of screen SC02");
		try {
			waitForElement("pintextbox", ScanningXpath);
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "BYNRFY3KYJRFHJ3"); 
			getElementText("pintextbox",ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			clickElement("pingo", ScanningXpath);
			waitForElement("closebutton", ScanningXpath);
			waitForElement("closebutton", ScanningXpath);
			clickElement("closebutton", ScanningXpath);
			waitForElement("inbox", ScanningXpath);
			waitForElement("inbox", ScanningXpath);
			clickElement("inbox", ScanningXpath);
			waitForElement("coin", ScanningXpath);
			waitForElement("coin", ScanningXpath);
			if (getElement("coin", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should view points successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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

	
	@Given("user login with valid credential SC03")
	public void user_login_with_valid_credential_SC03() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC03");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC03")
	public void user_navigate_to_add_scan_code_screen_SC03() throws  Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC03");
		try {
			waitForElement("profileicon", ScanningXpath);
			waitForElement("inbox", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			try {
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}

			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@And("Verify user views stamps added by entering valid code SC03")
	public void verify_user_views_stamps_added_by_entering_valid_code_SC03() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify user views stamps added by entering valid code SC03");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "BCTF49R3KYHCTTR"); 
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			clickElement("pingo", ScanningXpath);
			waitForElement("stamp", ScanningXpath);
			waitForElement("stamp", ScanningXpath);
			if (getElement("stamp", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should view stamps added success screen after submitting valid scan code",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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

	@Given("user login with valid credentials SC04")
	public void user_login_with_valid_credentials_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credentials SC04");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to profile page SC04")
	public void user_navigate_to_profile_page_SC04() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to profile page SC04");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			try {
				waitForElement("profileicon", ScanningXpath);
				clickElement("profileicon", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("profileicon", ScanningXpath);
				clickElement("profileicon", ScanningXpath);
			}
			waitForElement("history", ScanningXpath);
			waitForElement("history", ScanningXpath);
			if (getElement("history", ScanningXpath).isDisplayed()) {
				String s=  captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on profile page",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to reach profile page",s);
			}
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user should view history of all scan codes SC04")
	public void user_should_view_history_of_all_scan_codes_SC04() throws Throwable {
		try {

			waitForElement("history", ScanningXpath);
			clickElement("history", ScanningXpath);
			waitForElement("historyscancode", ScanningXpath);
			waitForElement("historyscancode", ScanningXpath);
			if (getElement("historyscancode", ScanningXpath).isDisplayed()) {
				String s=  captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views history of scan codes successfully",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view scan code history",s);
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
	
	@Given("user login with valid credentialsSC05")
	public void user_login_with_valid_credentialsSC05() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credentials SC04");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC05")
	public void user_navigate_to_add_scan_code_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC05");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try {
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}
			}
			catch(Exception e){
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}
			}}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("user should view where is the code screen SC05")
	public void user_should_view_where_is_the_code_screen_SC05() throws Throwable {
		EngineController.reportInstance.createStep("And", "user navigate to add scan code screen SC05");
		try {
			waitForElement("whereiscode", ScanningXpath);
			waitForElement("whereiscode", ScanningXpath);
			clickElement("whereiscode", ScanningXpath);	
			waitForElement("wherecodecontent", ScanningXpath);
			waitForElement("wherecodecontent", ScanningXpath);
			if (getElement("wherecodecontent", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views where is the code screen content successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view where is code screen",s);
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


	@Given("user login with valid credential SC06")
	public void user_login_with_valid_credential_SC06() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC06");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@Then("user navigate to add scan code screen SC06")
	public void user_navigate_to_add_scan_code_screen_SC06() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC06");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}




	@And("Verify user scan valid code and alphanumeric code and get successfull message SC06")
	public void verify_user_scan_valid_code_and_alphanumeric_code_and_get_successfull_message_SC06() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify user scan valid code and alphanumeric code and get successfull message SC06");
		try {
			waitForElement("pintextbox", ScanningXpath);			
			sendKeystoElement("pintextbox", ScanningXpath, "BXC99RKKRCN3RJ4"); 
			getElementText("pintextbox",ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);	
			clickElement("pingo", ScanningXpath);
			waitForElement("stamp", ScanningXpath);	
			waitForElement("stamp", ScanningXpath);	
			if (getElement("stamp", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should view stamps added success screen when they enter alphanumeric and valid code",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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
	
	@Given("user login with valid credential SC07")
	public void user_login_with_valid_credential_SC07() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC07");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@Then("user navigate to add scan code screen SC07")
	public void user_navigate_to_add_scan_code_screen_SC07() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC07");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@And("verify the Text Field should not accepts invalid code and should throw an error popup SC07")
	public void verify_the_Text_Field_should_not_accepts_invalid_code_and_should_throw_an_error_popup_SC07() throws Throwable {
		EngineController.reportInstance.createStep("And", "verify the Text Field should not accepts invalid code and should throw an error popup SC07");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "DFGHJUIKLMNSDFG");   
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			clickElement("pingo", ScanningXpath);
			waitForElement("invalidcodemessage", ScanningXpath);
			waitForElement("invalidcodemessage", ScanningXpath);
			if (getElement("invalidcodemessage", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views invalid code error message successfully",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view error message",s);
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
	
	@Given("user login with valid credential SC08")
	public void user_login_with_valid_credential_SC08() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC08");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@Then("user navigate to add scan code screen SC08")
	public void user_navigate_to_add_scan_code_screen_SC08() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC08");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);
			}
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("verify user allows to feed specials symbols in scan code screen SC08")
	public void verify_user_allows_to_feed_specials_symbols_in_scan_code_screen_SC08() throws Throwable   {
		EngineController.reportInstance.createStep("And", "verify user allows to feed specials symbols in scan code screen SC08");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "DFFGHIJM @$%@&");   
			waitForElement("pintextbox", ScanningXpath);
			waitForElement("pintextbox", ScanningXpath);
			if (getElementText("pintextbox", ScanningXpath).isEmpty()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should not allow to enter special characters, empty spaces",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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
	
	@Given("user login with valid credential SC09")
	public void user_login_with_valid_credential_SC09() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC09");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC09")
	public void user_navigate_to_add_scan_code_screen_SC09() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC09");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC09")
	public void verify_the_Submit_CTA_Should_enable_only_when_user_enters_fifteen_characters_in_the_textfield_SC09() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC09");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "DFGIHJKIOL");   
			waitForElement("pintextbox", ScanningXpath);
			waitForElement("pintextbox", ScanningXpath);
			if (!getElement("pingo", ScanningXpath).isEnabled()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should not allow to enter less than 15 characters, empty spaces",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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
	
	@Given("user login with valid credential SC10")
	public void user_login_with_valid_credential_SC10() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC10");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC10")
	public void user_navigate_to_add_scan_code_screen_SC10() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC10");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}	
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC10")
	public void verify_the_Submit_CTA_Should_enable_only_when_user_enters_fifteen_characters_in_the_textfield_SC10() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC10");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "DFGIKLJKIUHJGFD");   
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			if (getElement("pingo", ScanningXpath).isEnabled()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should allow to enter 15 characters only, empty spaces",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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

	@Given("user login with valid credential SC11")
	public void user_login_with_valid_credential_SC11() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC11");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC11")
	public void user_navigate_to_add_scan_code_screen_SC11() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC11");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);	
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}


	@And("Verify user receives stamp successfully when they enter valid code SC11")
	public void verify_user_receives_stamp_successfully_when_they_enter_valid_code_SC11() throws Throwable {

		EngineController.reportInstance.createStep("And", "Verify user receives stamp successfully when they enter valid code SC11");
		try {
			waitForElement("pintextbox", ScanningXpath);
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, "BTHRF94CJCJJ4JN"); 
			getElementText("pintextbox",ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			clickElement("pingo", ScanningXpath);
			waitForElement("stamp", ScanningXpath);
			waitForElement("stamp", ScanningXpath);
			if (getElement("stamp", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should view stamps added success when they feed valid code",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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
	
	@Given("user login with valid credential SC12")
	public void user_login_with_valid_credential_SC12() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credential SC12");
		try {
			androidDriverInstance1();
			pageload("imamMember", ScanningXpath);
			clickElement("imamMember", ScanningXpath);
			waitForElement("loginemail",ScanningXpath);
			sendKeystoElement("loginemail", ScanningXpath, ExcelReader.readData(1, 0, "Login"));

			if (getElementText("loginemail", ScanningXpath).contains("ana12@yopmail.com")) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid email",s);
			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid email",s);
			}
			waitForElement("loginpass", ScanningXpath);
			sendKeystoElement("loginpass", ScanningXpath, ExcelReader.readData(1, 1, "Login"));
			if (getElementText("loginpass", ScanningXpath).contains("Testing123")) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user enters valid password",s);
			} else

			{
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user enters invalid password",s);
			}

			waitForElement("logincontinue", ScanningXpath);
			clickElement("logincontinue", ScanningXpath);

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user navigate to add scan code screen SC12")
	public void user_navigate_to_add_scan_code_screen_SC12() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user navigate to add scan code screen SC12");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("profileicon", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			try {
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}
			catch(Exception e)
			{
				waitForElement("scanbutton", ScanningXpath);
				clickElement("scanbutton", ScanningXpath);	
			}	
			try
			{
				waitForElement("camerapermission", ScanningXpath);
				waitForElement("camerapermission", ScanningXpath);
				clickElement("camerapermission",ScanningXpath);
				waitForElement("rathertypecode", ScanningXpath);
				clickElement("rathertypecode", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}}
			catch(Exception e) {
				waitForElement("manualEntry", ScanningXpath);
				waitForElement("manualEntry", ScanningXpath);
				clickElement("manualEntry", ScanningXpath);		
				waitForElement("pintextbox", ScanningXpath);
				waitForElement("pintextbox", ScanningXpath);
				if (getElement("pintextbox", ScanningXpath).isDisplayed()) {
					String s= 	captureScreenshot();
					EngineController.reportInstance.reportStepPass("user views add scan code screen successfully",s);
				} else {
					String s=	captureScreenshot();
					EngineController.reportInstance.reportStepFail("user failed to view scan code screen",s);
				}

			}
		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@And("Verify user receives invalid error pop up for already used code SC12")
	public void verify_user_receives_invalid_error_pop_up_for_already_used_code_SC12() throws Throwable {
		EngineController.reportInstance.createStep("And", "Verify user receives invalid error pop up for already used code SC12");
		try {
			waitForElement("pintextbox", ScanningXpath);
			sendKeystoElement("pintextbox", ScanningXpath, ExcelReader.readData(1, 1, "scanning")); 
			getElementText("pintextbox",ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			waitForElement("pingo", ScanningXpath);
			clickElement("pingo", ScanningXpath);
			waitForElement("alreadyused", ScanningXpath);
			waitForElement("alreadyused", ScanningXpath);
			if (getElement("alreadyused", ScanningXpath).isDisplayed()) {
				String s= 	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should view invalid error pop up on scanning already used code",s);
			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to enter valid code",s);
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

}

