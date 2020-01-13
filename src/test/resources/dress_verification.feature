Feature: Dress verification

#  Scenario: Verify discount
#    Given Open Automation Practice page
#    When I click on "Best sellers" option in bottom menu
#    Then I expect the "Printed Chiffon Dress" has "-20%" as discount

  Scenario: verify discount
    Given Open Automation Practice page
    When I click on "Best sellers" option in bottom menu
    And I hover "Printed Chiffon Dress" then add to the card
    And I click on "Continue shopping" button
    And I hover "Blouse" then add to the card
    And I click on "Continue shopping" button
    And I go to the Cart dropdown and select "Check Out"
    Then I expect "Printed Chiffon Dress" is displayed in summary table and the availability is "In stock"
    And I expect "Blouse" is displayed in summary table and the availability is "In stock"
    And I remove "Blouse" from the summary table
    And I expect "Blouse" is no longer displayed in the summary table
    And I expect the total amount to pay is "$18.40"
