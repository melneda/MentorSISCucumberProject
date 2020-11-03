Feature: Check  Request Demo with Valid credentials
  Scenario:C_008_Request_Demo_Valid_Credentials
    Given User is in the home page
    When User  clicks the  Request Demo buttos
    And enter a name,valid email, valid company email and message
    And click on the send  button
    Then User is able to see submission text