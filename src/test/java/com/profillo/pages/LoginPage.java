package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="inputEmail")
    public WebElement userMail;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signIn;

    public void login(String userMailStr, String passwordStr) {
       userMail.sendKeys(userMailStr);
       password.sendKeys(passwordStr);
       signIn.click();
    }





}
