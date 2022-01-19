Feature: Verify My Baby module functionality for pampers app

     Scenario: Mybaby-User View MyBaby Screen
    Given user login with valid credentials
    When user views my baby screen
    Then User Views Babys Name As My Baby
    Then User View Babys Current Date

  Scenario: Mybaby-User Views Add Baby Name Option
    When user lands on my baby screen
    Then user views add baby name option

  Scenario: Mybaby-User Views Edit and Remove Option In Hamburger Menu
    When user lands on my baby screen
    Then user should view edit and remove option on mybaby page

  Scenario: Mybaby-User Add A Baby Leaving DOB As Empty
    When user lands on my baby screen
    Then verify user cant able to add baby without baby birthdate

  Scenario: Mybaby-User Add A Baby Without Entering Baby name
    When user lands on my baby screen
    Then user add a baby with baby birthdate and gender
    Then user add a baby with birthdate alone

  Scenario: Mybaby-User Add A Baby With Entering Baby Name
    When user lands on my baby screen
    Then user add a baby with entering baby name

  Scenario: Mybaby-User Add A baby With Name Gender and DOB
    When user lands on my baby screen
    Then user add a baby with entering baby name gender and dob

  Scenario: Mybaby-User Remove baby info
    When user lands on my baby screen
    Then user removes a baby info sucessfully

  Scenario: Mybaby-User Taps To Remove A Baby
    When user lands on my baby screen
    Then user should cancel baby info deletion by tapping no keep it option

  Scenario: Mybaby-User Edits Baby Name
    When user lands on my baby screen
    Then user edits baby name

  Scenario: Mybaby-User Adds A Future Due Date Of The Baby
    When user lands on my baby screen
    Then user should add a future due date of the baby

  Scenario: Mybaby-User Adds A Past Due Date Of The Baby
    When user lands on my baby screen
    Then user should add a past due date of the baby

  Scenario: Mybaby-Verify the let add my baby name CTA in my baby list screen when user add baby without baby name from my baby update screen
    When user lands on my baby screen
    Then user adds a baby name successfully

  Scenario: Mybaby-User Try To Add A Baby With Selecting A Future Date
    When user lands on my baby screen
    Then Verify the user cannot able to future date when user tap on I have another baby to add CTA
    Then Verify user cannot able to select more than one year from the current date when user tap on lets add the due date for my next baby link
    Then Verify user cannot able to select more than past four year from the current date when user tap on I have another baby to add CTA
