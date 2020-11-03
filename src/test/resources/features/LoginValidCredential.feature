Feature: Checks Login Valid Cred
  Scenario: TC_007 User enters valid credentials
Given I am on home page as a user.
When I click the Login button
And I enter valid credentials
And click on login button
Then I see  my account page.