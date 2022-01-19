Feature: Verify Scanning functionality for pampers app

Scenario: Scanning-User Views Add Scan Code Screen
    Given user register with valid credentials SC01
    Then verify the user tapping on the scan button should ask for camera permission for the first time
    And user should view add scan code screen successfully

  Scenario: Scanning-New User Views The Number Of Stamps Earned SC02
    Given user login with valid credential SC02
    Then user navigate to add scan code screen SC02
    And user should view points at top right corner of screen SC02

  Scenario: Scanning-New User Enter A Scan Code and Views Stamps Added SC03
    Given user login with valid credential SC03
    Then user navigate to add scan code screen SC03
    And Verify user views stamps added by entering valid code SC03

  Scenario: Scanning-User views the history of all scan codes
    Given user login with valid credentials SC04
    Then user navigate to profile page SC04
    And user should view history of all scan codes SC04

  Scenario: Scanning-User Views Where Is Code In Add Scan Code Screen
    Given user login with valid credentialsSC05
    Then user navigate to add scan code screen SC05
    And user should view where is the code screen SC05

  Scenario: Scanning-User Enter No Codes In Add ScanCode Screen SC06
    Given user login with valid credential SC06
    Then user navigate to add scan code screen SC06
    And Verify user scan valid code and alphanumeric code and get successfull message SC06

  Scenario: Scanning-User Enter Invalid Code In Add Scan Code Screen SC07
    Given user login with valid credential SC07
    Then user navigate to add scan code screen SC07
    And verify the Text Field should not accepts invalid code and should throw an error popup SC07

  Scenario: Scanning-User Enter Symbols In Scan Code Field Under Add Scan Code Screen SC08
    Given user login with valid credential SC08
    Then user navigate to add scan code screen SC08
    And verify user allows to feed specials symbols in scan code screen SC08

  Scenario: Scanning-User Enter Only Ten Character In ScanCode Field Under Add Scan Code Screen SC09
    Given user login with valid credential SC09
    Then user navigate to add scan code screen SC09
    And Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC09

  Scenario: Scanning-User Enter fifteen Character In ScanCode Field Under Add Scan Code Screen SC10
    Given user login with valid credential SC10
    Then user navigate to add scan code screen SC10
    And Verify the Submit CTA  Should enable only when user enters fifteen characters in the textfield SC10

  Scenario: Scanning-User Enter Valid Code Under Add Scan Code Screen SC11
    Given user login with valid credential SC11
    Then user navigate to add scan code screen SC11
    And Verify user receives stamp successfully when they enter valid code SC11

  Scenario: Scanning-User Enters A Already Used Code Under Add Scan Code Screen SC12
    Given user login with valid credential SC12
    Then user navigate to add scan code screen SC12
    And Verify user receives invalid error pop up for already used code SC12

