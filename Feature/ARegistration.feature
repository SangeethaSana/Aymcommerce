

Feature: Verify Registration functionality for pampers app
 

 Scenario: Registration-Verify the Accept and continue CTA is disable state or not before enter credentials in Registration Screen
    Given user is on pamper app home page SC01
    When user clicks i will join button SC01
    Then check accept and reject CTA is disabled SC01

  Scenario: Registration-Verify the Accept and continue CTA is in enable state or not after enter credentials in Registration screen
    Given user is on pamper app registration page SC02
    When user feeds credentials at registration SC02
    Then Accept and continue CTA should be enabled SC02

  Scenario: Registration-User_Register_A_Account_With_Having_A_Baby
    Given user submits valid credentials on registration screen SC01
    When user should redirect to add baby dob screen SC01
    Then user should redirect to dashboard screen successfully SC01

  Scenario: Registration-Verify the Error text should be displayed below the text fields  in registration screen when we enter Invalid credentials or left empty
    Given user is on pamper app registration page SC04
    Then user should view valid error message for invalid or empty fields SC04

  Scenario: Registration-User_Register_With_Already_Registered_Email_Address
    Given user is on registration page and sign up with already registered email
    And user should get pop up message
    Then user should login through pop up message

  Scenario: Registration-User Leaves Email and Password Field Empty
    Given user is on pamper app login page SC06
    Then user should view valid error message for invalid or empty fields SC06

  Scenario: Registration-User_Who_Is_Having_A_Baby_Leaves_Date_Of_Birth_Empty
    Given user submits valid credentials on registration screen SC07
    When user adds dob of already born baby SC07
    Then user should redirect to dashboard screen successfully SC07

  Scenario: Registration-User_Register_With_A_Future_DOB_Who_Is_Expecting_A_Baby
    Given user register with valid credentials SC12
    When user submits future dob at baby dob page SC12
    Then user should lands on dashboard page SC12


 
