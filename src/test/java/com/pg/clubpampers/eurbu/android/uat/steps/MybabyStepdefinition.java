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

public class MybabyStepdefinition extends DriverHelpers {
	
	
	@Given("user login with valid credentials")
	public void user_login_with_valid_credentials() throws Throwable {
		EngineController.reportInstance.createStep("Given", "user login with valid credentials");
		try {
			androidDriverInstance1();
			pageload("imamMember", MybabyXpath);
			waitForElement("imamMember", MybabyXpath);
			clickElement("imamMember", MybabyXpath);
			waitForElement("loginmail", MybabyXpath);
			sendKeystoElement("loginmail", MybabyXpath, "Ana12@yopmail.com");
			waitForElement("loginpass", MybabyXpath);
			sendKeystoElement("loginpass", MybabyXpath, "Testing123");
			waitForElement("eye", MybabyXpath);
			clickElement("eye", MybabyXpath);
			waitForElement("logincontinue", MybabyXpath);
			clickElement("logincontinue", MybabyXpath);
			waitForElement("inbox", MybabyXpath);
			waitForElement("scanbutton", MybabyXpath);
			waitForElement("profileicon", MybabyXpath);
			waitForElement("profileicon", MybabyXpath);
           if (getElement("profileicon", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on login page",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to logged",s); 
			}
			
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	
	@When("user views my baby screen")
	public void user_views_my_baby_screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "user views my baby screen");
		try {
			waitForElement("inbox", ScanningXpath);
			waitForElement("scanbutton", ScanningXpath);
			waitForElement("profileicon", MybabyXpath);
			clickElement("profileicon", MybabyXpath);
			waitForElement("mybaby", MybabyXpath);
			clickElement("mybaby", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
           if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on my baby screen",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on my baby screen",s); 
			}
			
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@Then("User Views Babys Name As My Baby")
	public void User_Views_Babys_Name_As_My_Baby() throws Throwable {
		EngineController.reportInstance.createStep("Then", "User Views Babys Name As My Baby");
		try {
			waitForElement("babyname", MybabyXpath);
			waitForElement("babyname", MybabyXpath);
           if (getElement("babyname", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views baby name as my baby",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view baby name",s); 
			}
			
		}
		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}
	@Then("User View Babys Current Date")
	public void User_View_Babys_Current_Date() throws Throwable {
		EngineController.reportInstance.createStep("Then", "User View Babys Current Date");
		try {
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
           if (getElement("babydob", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views baby current date successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view baby current date",s); 
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
	
	@When("user lands on my baby screen")
	public void user_lands_on_my_baby_screen() throws Throwable {
		EngineController.reportInstance.createStep("When", "user lands on my baby screen");
		try {
		DriverHelpers.driver= DriverInstanceCreator.androidDriverInstance();
		pageload("inbox", ScanningXpath);
		waitForElement("scanbutton", ScanningXpath);
			waitForElement("profileicon", MybabyXpath);
			waitForElement("profileicon", MybabyXpath);
			try {
			waitForElement("profileicon", MybabyXpath);
			clickElement("profileicon", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("profileicon", MybabyXpath);
				clickElement("profileicon", MybabyXpath);
			}
			waitForElement("mybaby", MybabyXpath);
			waitForElement("mybaby", MybabyXpath);
			clickElement("mybaby", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
           if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user lands on my baby screen successfully",s);
			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to land on my baby screen",s); 
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}
	
	}
	
	@Then("user views add baby name option")
	public void user_can_also_add_an_another_baby_through_due_date_option_SC03() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user views add baby name option");
		try {
			waitForElement("Babycard", MybabyXpath);
			waitForElement("addbabyname", MybabyXpath);
			if (getElement("addbabyname", MybabyXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views add baby name button successfully",s);

			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to view add baby name button",s);
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
	
	@Then("user should view edit and remove option on mybaby page")
	public void user_should_view_edit_and_remove_option_on_mybaby_page() throws Throwable {
		EngineController.reportInstance.createStep("Then","user should view edit and remove option on mybaby page");
		try {
			waitForElement("Babycard", MybabyXpath);
			waitForElement("hamburgermenu", MybabyXpath);
			clickElement("hamburgermenu", MybabyXpath);
			waitForElement("editoption", MybabyXpath);
			waitForElement("editoption", MybabyXpath);
			if (getElement("editoption", MybabyXpath).isDisplayed()&& getElement("deleteoption", MybabyXpath).isDisplayed()) {
				String s= captureScreenshot();
				EngineController.reportInstance.reportStepPass("user views edit and delete options successfully",s);

			} else {
				String s= captureScreenshot();
				EngineController.reportInstance.reportStepFail("user failed to view edit and delete option",s);
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

	
	@Then("verify user cant able to add baby without baby birthdate")
	public void verify_user_can_t_able_to_add_baby_without_baby_birthdate() throws Throwable {
		EngineController.reportInstance.createStep("Then", "verify user cant able to add baby without baby birthdate");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			waitForElement("babyfirstname", MybabyXpath);
			sendKeystoElement("babyfirstname",MybabyXpath, ExcelReader.readData(1, 2, "Login"));
			waitForElement("babygender", MybabyXpath);
			clickElement("babygender", MybabyXpath);
			clickElement("boy", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("doberror", MybabyXpath);
			if (getElement("doberror", MybabyXpath).isDisplayed()) {
				String s= 	  captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should see dob alert message",s);

			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to see dob alert message",s);
			}	}

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

	

	@Then("user add a baby with baby birthdate and gender")
	public void user_add_a_baby_with_baby_birthdate_and_gender() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user add a baby with baby birthdate and gender");
		try {
			waitForElement("Babycard", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			clickElement("addbabybutton", MybabyXpath);
			waitForElement("babyfirstname", MybabyXpath);
			waitForElement("babyfirstname", MybabyXpath);
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("babygender", MybabyXpath);
			clickElement("boy", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			if (getElement("secbaby", MybabyXpath).isDisplayed()) {
				String s= captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should add baby with dob and gender",s);

			} else {
				String s=  captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to add baby",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			
			
		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("user add a baby with birthdate alone")
	public void user_add_a_baby_with_birthdate_alone() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user add a baby with birthdate alone");
		try {
			waitForElement("addbabybutton", MybabyXpath);  
			waitForElement("addbabybutton", MybabyXpath);  
			try {
				waitForElement("addbabybutton", MybabyXpath); 
				clickElement("addbabybutton", MybabyXpath);}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath); 
				clickElement("addbabybutton", MybabyXpath);}
			waitForElement("babyfirstname", MybabyXpath);
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should add baby with dob alone",s);

			} else {
				String s=	  captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to add baby",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
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
	
	@Then("user add a baby with entering baby name")
	public void user_add_a_baby_with_entering_baby_name() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user add a baby with entering baby name");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			waitForElement("babyfirstname", MybabyXpath);
			sendKeystoElement("babyfirstname",MybabyXpath, "ana");
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should add baby with baby name",s);

			} else {
				String s=  captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to add baby",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
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
	
	@Then("user add a baby with entering baby name gender and dob")
	public void user_add_a_baby_with_entering_baby_name_gender_and_dob() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user add a baby with entering baby name gender and dob");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			waitForElement("babyfirstname", MybabyXpath);
			sendKeystoElement("babyfirstname",MybabyXpath, "ana");
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("babygender", MybabyXpath);
			clickElement("boy", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should add baby with baby name,gender,dob",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to add baby",s);
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

	
	@Then("user removes a baby info sucessfully")
	public void user_removes_a_baby_info_sucessfully() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user removes a baby info sucessfully");
		try {
           waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should see removed baby list",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't remove baby info",s);
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
	
	@Then("user should cancel baby info deletion by tapping no keep it option")
	public void user_should_cancel_baby_info_deletion_by_tapping_no_keep_it_option() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should cancel baby info deletion by tapping no keep it option");
		try {
			waitForElement("hamburgermenu", MybabyXpath);
			clickElement("hamburgermenu", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("nokeepit", MybabyXpath);
			waitForElement("nokeepit", MybabyXpath);
			if (getElement("nokeepit", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should skip deletion",s);

			} else {
				String s=	  captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to click keep it button",s);
			}
			clickElement("nokeepit", MybabyXpath);

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


	@Then("user edits baby name")
	public void user_edits_baby_name() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user edits baby name");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			waitForElement("babyfirstname", MybabyXpath);
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("editoption", MybabyXpath);
			clickElement("editoption", MybabyXpath);
			waitForElement("firstnameedit", MybabyXpath);
			sendKeystoElement("firstnameedit", MybabyXpath, "ana");
			waitForElement("editsavebutton", MybabyXpath);
			clickElement("editsavebutton", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepPass("user edits baby name successfully",s);

			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to edit baby name",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);

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
	
	@Then("user should add a future due date of the baby")
	public void user_should_add_a_future_due_date_of_the_baby() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should add a future due date of the baby");
		try {
			waitForElement("addduedate", MybabyXpath);
			waitForElement("addduedate", MybabyXpath);
			try {
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);
			}
			clickElement("futuredob", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s= captureScreenshot();
				EngineController.reportInstance.reportStepPass("user add future due date successfully",s);

			} else {
				String s=	  captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to register",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);

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
	

	@Then("user should add a past due date of the baby")
	public void user_should_add_a_past_due_date_of_the_baby() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user should add a past due date of the baby");

		try {
			waitForElement("addduedate", MybabyXpath);
			try {
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);

			}
			clickElement("pastdob", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if (getElement("Babycard", MybabyXpath).isDisplayed()) {

				String s=	  captureScreenshot();
				EngineController.reportInstance.reportStepPass("user add past due date successfully",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user is unable to register",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
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

	
	@Then("user adds a baby name successfully")
	public void user_adds_a_baby_name_successfully() throws Throwable {
		EngineController.reportInstance.createStep("Then", "user adds a baby name successfully");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			clickElement("birthdate", MybabyXpath);
			clickElement("okbutton", MybabyXpath);
			clickElement("babygender", MybabyXpath);
			clickElement("boy", MybabyXpath);
			clickElement("letsgo", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("secbabyname", MybabyXpath);
			clickElement("secbabyname", MybabyXpath);
			waitForElement("babyfirstname", MybabyXpath);
			sendKeystoElement("babyfirstname", MybabyXpath,"ana");
			clickElement("letsgo", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			waitForElement("Babycard", MybabyXpath);
			if(getElement("Babycard", MybabyXpath).isDisplayed()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user adds a baby name successfully",s);

			} else {
				String s=		captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can't able to add baby",s);
			}
			waitForElement("babydob", MybabyXpath);
			waitForElement("secbaby", MybabyXpath);
			clickElement("secbaby", MybabyXpath);
			waitForElement("deleteoption", MybabyXpath);
			clickElement("deleteoption", MybabyXpath);
			waitForElement("removebutton", MybabyXpath);
			clickElement("removebutton", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			waitForElement("babydob", MybabyXpath);
			
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
	
	@Then("Verify the user cannot able to future date when user tap on I have another baby to add CTA")
	public void Verify_the_user_cannot_able_to_future_date_when_user_tap_on_I_have_another_baby_to_add_CTA()throws Throwable {
		EngineController.reportInstance.createStep("Then", "Verify the user cannot able to future date when user tap on I have another baby to add CTA");
		try {
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			waitForElement("birthdate", MybabyXpath);
			clickElement("birthdate", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			if (!getElement("futuredob", MybabyXpath).isEnabled()) {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should not add future date",s);

			} else {
				String s=	 captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can add future dob",s);
			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("Verify user cannot able to select more than one year from the current date when user tap on lets add the due date for my next baby link")
	public void Verify_user_cannot_able_to_select_more_than_one_year_from_the_current_date_when_user_tap_on_lets_add_the_due_date_for_my_next_baby_link() throws Throwable {
		EngineController.reportInstance.createStep("Then", "Verify user cannot able to select more than one year from the current date when user tap on lets add the due date for my next baby link");
		try {
			clickElement("dobcancel", MybabyXpath);
			clickElement("close", MybabyXpath);
			waitForElement("addduedate", MybabyXpath);
			try {
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addduedate", MybabyXpath);
				clickElement("addduedate", MybabyXpath);
			}
			waitForElement("year", MybabyXpath);
			clickElement("year", MybabyXpath);
			clickElement("futureyear", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			if (!getElement("futuredob", MybabyXpath).isEnabled()) {
				String s =captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should not allow to add more than one year dob",s);

			} else {
				String s=	captureScreenshot();
				EngineController.reportInstance.reportStepFail("user allows to add more than one year date",s);

			}

		}

		catch (Exception e) {
			System.out.println("I am out");
			String s=captureScreenshot();
			EngineController.reportInstance.reportStepFail("failure", s);
			closeCurrentDriver();
			Assert.fail("Failure");
			}}

	@Then("Verify user cannot able to select more than past four year from the current date when user tap on I have another baby to add CTA")
	public void verify_user_cannot_able_to_select_more_than_past_four_year_from_the_current_date_when_user_tap_on_I_have_another_baby_to_add_CTA()throws Throwable {
		EngineController.reportInstance.createStep("Then", "Verify user cannot able to select more than past four year from the current date when user tap on I have another baby to add CTA");
		try {
			clickElement("dobcancel", MybabyXpath);
			waitForElement("addbabybutton", MybabyXpath);
			try {
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			catch(Exception e)
			{
				waitForElement("addbabybutton", MybabyXpath);
				clickElement("addbabybutton", MybabyXpath);
			}
			clickElement("birthdate", MybabyXpath);
			clickElement("year", MybabyXpath);
			clickElement("pastfouryear", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			waitForElement("okbutton", MybabyXpath);
			if (getElement("pastdob", MybabyXpath).isDisplayed()) {
				String s= captureScreenshot();
				EngineController.reportInstance.reportStepPass("user should not allow to add past 4 year dob",s);

			} else {
				String s=captureScreenshot();
				EngineController.reportInstance.reportStepFail("user can add past 4 year dob",s);
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
