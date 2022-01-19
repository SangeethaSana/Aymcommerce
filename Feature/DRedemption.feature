Feature: Verify redemption module functionality for pampers app

  Scenario: Redemption-User View Product Images
    Given user login with valid credential SC01
    Then user clicks rewards page SC01
    And Verify the page redirects to Product details screen when user tap on products SC01

  Scenario: Redemption-User View Product Details SC02
    Given user lands rewards page SC02
    And Verify the down arrow able to clickable or not in product detail screen SC02
    Then Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC02

  Scenario: Redemption-User View Description and Merchant Details SC03
    Given user lands rewards page SC03
    And Verify the CTA at the bottom after page redirects to Product details screen when user tap on products SC03
    Then Verify User views Description and Merchant Details SC03

  Scenario: Redemption-User Taps Order Now Without Entering FirstName and LastName View Order Page Under Soft Reward SC04
    Given user lands on rewards page SC04
    And Verify user redirects to Shipping address screen or not after tap on redeem now in coupon detail screen SC04
    Then Verify user can submit the form with firstname and lastname fields empty SC04

  Scenario: Redemption-User Checkout A Product and Redeem With Points SC05
    Given user login with valid credntials SC05
    When user scan code and got ten points SC05
    Then Verify the page redirects to rewards screen when tap on rewards icon at the bottom of the screen SC05
    And Verify the CTA should be Redeem now if user have enough points to redeem SC05
    And Verify user redirects to product detail size select screen when he tap on redeem now CTA from product detail screen SC05
    And Verify user redirects to Shipping address screen or not SC05
    And Verify Save my details CTA should enable after completed mandatory fields SC05
    And Verify user redirects to order summary screen after completed shipping details and Tap on Save my details CTA
    And Verify user entered details is displaying proper in order summary screen SC05
    And Verify the free shipping section is displaying for physical reward and non-physical reward SC05
    And Verify the user redirects to order confirmation screen when user tap on CTA in the summary screen SC05
    And Verify the user redirects to home screen when user tap on CTA in the Order confirmation screen SC05

  Scenario: Redemption-Automation report cleanup
    Given report cooldown


  
    
