Feature: Bank Manager functionality
  @sanity @smoke @regression
  Scenario: Bank Manager should add customer successfully
    Given I am on the bank manager login page
    When I click on Bank Manager Login tab
    And I click on Add Customer tab
    And I enter the first name "Saroj"
    And I enter the last name " Malviya"
    And I enter the postcode "123456"
    And I click on Add Customer button
    Then I should see a popup with message "Customer added successfully"
    And I click on OK button on the popup
  @smoke @regression
  Scenario: Bank Manager should open account successfully
    Given I am on the bank manager login page
    When I click on Bank Manager Login tab
    And I click on Open Account tab
    And I search for the customer "Saroj Malviya"
    And I select the currency "Pound"
    And I click on Process button
    Then I should see a popup with message Account created successfully
    And I click on OK button on the popup.
  @regression
  Scenario: Customer should login and logout successfully
    Given I am on the bank manager login page
    When I click on Customer Login tab
    And I search for the customer saroj malviya
    And I click on Login button
    Then I should see the Logout tab displayed
    When I click on Logout button
    Then I should see Saroj malviya text displayed
  @regression
  Scenario: Customer should deposit money successfully
    Given I am on the bank manager login page
    When I click on Customer Login tab
    And I search for the customer saroj malviya
    And I click on Login button
    And I click on Deposit tab
    And I enter the amount "100"
    And I click on Deposit button
    Then I should see a message "Deposit Successful"
  @regression
  Scenario: Customer should withdraw money successfully
    Given I am on the bank manager login page
    When I click on Customer Login tab
    And I search for the customer saroj malviya
    And I click on Login button
    And I click on Withdrawl tab
    And I enter the amount 50
    And I click on Withdraw button
    Then I should see a message Transaction Successful