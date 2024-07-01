package com.bank.pages;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Transactions']")
    WebElement transactionLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawlLink;

    public void clickOnTransactionLink(){
        clickOnElement(transactionLink);
        log.info("click on Transaction Link"+transactionLink.toString());
    }
    public void clickOnDepositLink(){
        clickOnElement(depositLink);
        log.info("click on Deposit link" + depositLink.toString());
    }
    public void clickOnWithdrawlLink(){
        clickOnElement(withdrawlLink);
        log.info("click on Withdrawllink"+withdrawlLink);
    }
}
