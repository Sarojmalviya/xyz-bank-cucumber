package com.bank.pages;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;

    public void enterFirstNameField(String name){
        sendTextToElement(enterFirstName,name);
        log.info("enter firstName"+enterFirstName.toString());
    }
    public void enterLastNameField(String lastName){
        sendTextToElement(enterLastName,lastName);
        log.info("enterLastName"+enterLastName.toString());
    }
    public void enterPostCodeField(String postCode){
        sendTextToElement(enterPostCode,postCode);
        log.info("enterPostCode"+enterPostCode.toString());
    }
    public void clickAddCustomerButton(){
        clickOnElement(addCustomerButton);
        log.info("click AddCustomerButton"+addCustomerButton.toString());
    }

    public String verifyMessage(){
        return getTextFromAlert();
    }
    public void clickOnOkButton(){
        acceptAlert();
    }
}
