package com.bank.pages;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customers']")
    WebElement customer;

    public void addCustomerPage(){
        clickOnElement(addCustomerLink);
        log.info("click on addCustomerPage" +addCustomerLink.toString());
    }
    public void openAccountPage(){
        clickOnElement(openAccount);
        log.info("click on openAccountPage" +openAccount.toString());
    }
    public void customerPage(){
        clickOnElement(customer);
        log.info("click on CustomerPage" +customer.toString());
    }

}
