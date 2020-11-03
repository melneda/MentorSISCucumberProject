Feature: Check  Login with Invalid credentials
  Scenario:TC_006_Login_Invalid_Credentials
    Given User is in the  home   page
    When User  clicks the   Login button
    And enter valid email and invalid password
    And click on the login   button
    Then User is able to see  warning  text