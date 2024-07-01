package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourName;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clickOnLoginButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement verifyMessageLogout;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement clickOnLogOut;
    @CacheLookup
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement verifyNameTextDisplayed;

    public void selectYourNameField(String name){
        selectByVisibleTextFromDropDown(selectYourName,name);
        log.info("select name"+selectYourName.toString());
    }
    public void loginButtonClick(){
        clickOnElement(clickOnLoginButton);
        log.info("click on Login Button"+clickOnLoginButton.toString());
    }
    public String verifyMessageLogoutButton(){
        log.info("Display Logout Button" + verifyMessageLogout.toString());
        return getTextFromElement(verifyMessageLogout);
    }
    public void clickOnLogoutButton(){
        clickOnElement(clickOnLogOut);
        log.info("click on logout button"+clickOnLogOut);
    }
    public String verifyNameTextDisplayedMessage(){
        return getTextFromElement(verifyNameTextDisplayed);
    }

}
