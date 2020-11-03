@datatable
Feature: scenario outline example
  Scenario Outline: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "<first name>"
    And User enters last name "<last name>"
    And User enters positions "<positions>"
    And User enters start date "<start date>"
    And User enters salary "<salary>"
    And User clicks create button
    And User enters first name "<first name>" to the searchbox
    Then verify that user see the first name "<first name>" in the searchbox
    Examples: Test data for data tables
      |first name|last name|position|start date|salary|
      |Ayse      |Koc      |Doctor  |2000      |150000|
      |Ali       |Demir    |Teacher |2001      |85000 |
      |Zeyney    |Gun      |CEO     |2006      |140000|
      |Ilknur    |Kocyigit |Worker  |2013      |45000