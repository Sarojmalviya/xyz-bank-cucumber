package com.bank.pages;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPagexyz extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPagexyz.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement clickProcessButton;

 public void customerNameFields(String sarojmalviya){
    clickOnElement(customerNameDropDown);
    customerNameDropDown.sendKeys(sarojmalviya);
     log.info("click on customerNameFields"+customerNameDropDown.toString());
 }
 public void selectCurrencyFiled(String currency){
     selectByVisibleTextFromDropDown(selectCurrency,currency);
     log.info("select currency pound"+selectCurrency.toString());
 }
 public void processButtonClick(){
     clickOnElement(clickProcessButton);
     log.info("click on process button"+clickProcessButton.toString());
 }
    public String verifyMessage(){
        return getTextFromAlert();
    }
    public void clickOnOkButton(){
        acceptAlert();
    }
}
