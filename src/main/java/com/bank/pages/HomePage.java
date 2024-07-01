package com.bank.pages;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLogin;

 public void customerLoginPage(){
     clickOnElement(customerLogin);
     log.info("click on CustomerLogin"+customerLogin.toString());
 }
 public void bankMangerLoginPage(){
     clickOnElement(bankManagerLogin);
     log.info("click on BankManagerLogin"+bankManagerLogin.toString());
 }
}
