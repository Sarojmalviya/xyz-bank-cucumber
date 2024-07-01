package com.bank.steps;
import com.bank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BankTestSteps {
    @Given("I am on the bank manager login page")
    public void iAmOnTheBankManagerLoginPage() {
    }
    // click On "Bank Manager Login" Tab
    @When("I click on Bank Manager Login tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().bankMangerLoginPage();
    }
    //click On "Add Customer" Tab
    @And("I click on Add Customer tab")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().addCustomerPage();
    }
    //enter FirstName
    @And("I enter the first name {string}")
    public void iEnterTheFirstName(String firstName) {
        new AddCustomerPage().enterFirstNameField(firstName);
    }
    //enter LastName
    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lastName) {
        new AddCustomerPage().enterLastNameField(lastName);
    }
    //enter PostCode
    @And("I enter the postcode {string}")
    public void iEnterThePostcode(String postCode) {
        new AddCustomerPage().enterPostCodeField(postCode);
    }
    //click On "Add Customer" Button
    @And("I click on Add Customer button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickAddCustomerButton();
    }
    //verify message "Customer added successfully"
    @Then("I should see a popup with message {string}")
    public void iShouldSeeAPopupWithMessage(String message) {
        String expectedMessage = "Customer added successfully with customer id";
        String actualMessage = new AddCustomerPage().verifyMessage().split(":")[0];
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    //click on "ok" button on popup.
    @And("I click on OK button on the popup")
    public void iClickOnOKButtonOnThePopup() {
        new AddCustomerPage().clickOnOkButton();
    }
    //click On "Open Account" Tab
    @And("I click on Open Account tab")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().openAccountPage();
    }
    //Search customer that created in first test
    @And("I search for the customer {string}")
    public void iSearchForTheCustomer(String firstTest) {
        new OpenAccountPagexyz().customerNameFields(firstTest);
    }
    //Select currency Pound
    @And("I select the currency {string}")
    public void iSelectTheCurrency(String currency) {
        new OpenAccountPagexyz().selectCurrencyFiled(currency);
    }
   //click on "process" button
    @And("I click on Process button")
    public void iClickOnProcessButton() {
        new OpenAccountPagexyz().processButtonClick();
    }
    //	verify message "Account created successfully"
    @Then("I should see a popup with message Account created successfully")
    public void iShouldSeeAPopupWithMessageAccountCreatedSuccessfully() {
        String expectedMess = "Account created successfully with account Number";
        String actualMess = new OpenAccountPagexyz().verifyMessage().split(":")[0];
        Assert.assertEquals(expectedMess,actualMess);
    }
    //click on "ok" button on popup.
    @And("I click on OK button on the popup.")
    public void iClickOnOKButtonOnThePopup1() {
        new OpenAccountPagexyz().clickOnOkButton();
    }
    //click on "Customer Login" Tab
    @When("I click on Customer Login tab")
    public void iClickOnCustomerLoginTab() {
        new HomePage().customerLoginPage();
    }
    //search customer that you created.
    @And("I search for the customer saroj malviya")
    public void iSearchForTheCustomerSarojMalviya(String name) {
        new CustomerLoginPage().selectYourNameField(name);
    }
    //click on "Login" Button
    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().loginButtonClick();
    }
    //verify "Logout" Tab displayed.
    @Then("I should see the Logout tab displayed")
    public void iShouldSeeTheLogoutTabDisplayed() {
        String expectedResult = "Logout";
        String actualResult = new CustomerLoginPage().verifyMessageLogoutButton();
        Assert.assertEquals(expectedResult,actualResult);
    }
    //click on "Logout"
    @When("I click on Logout button")
    public void iClickOnLogoutButton() {
        new CustomerLoginPage().clickOnLogoutButton();
    }
    //verify "Your Name" text displayed.
    @Then("I should see Saroj malviya text displayed")
    public void iShouldSeeSarojMalviyaTextDisplayed() {
        String expectedText = "saroj malviya";
        String actualText = new CustomerLoginPage().verifyNameTextDisplayedMessage();
        Assert.assertEquals(expectedText,actualText);
    }
    //click on "Login" Button
    @And("I click on {string} button")
    public void iClickOnButton(String loginbutton) {
        new CustomerLoginPage().loginButtonClick();
    }
    //click on "Deposit" Tab
    @And("I click on Deposit tab")
    public void iClickOnDepositTab() {
    }
    //Enter amount 100
    @And("I enter the amount {string}")
    public void iEnterTheAmount(String arg0) {
    }
    //click on "Deposit" Button
    @And("I click on Deposit button")
    public void iClickOnDepositButton() {
    }
    //verify message "Deposit Successful"
    @Then("I should see a message {string}")
    public void iShouldSeeAMessage(String arg0) {
    }
    //click on "Withdrawl" Tab
    @And("I click on Withdrawl tab")
    public void iClickOnWithdrawlTab() {
    }
    //Enter amount 50
    @And("I enter the amount {int}")
    public void iEnterTheAmount(int arg0) {
    }
    //click on "Withdraw" Button
    @And("I click on Withdraw button")
    public void iClickOnWithdrawButton() {
    }
    //verify message "Transaction Successful"
    @Then("I should see a message Transaction Successful")
    public void iShouldSeeAMessageTransactionSuccessful() {
    }

}
