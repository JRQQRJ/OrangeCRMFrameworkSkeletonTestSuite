package com.automation.pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActions {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    public LoginPage enterUserName(String username){

        typeInto("LoginPage.tbx_Username",username);
        return this;

    }

    public LoginPage enterPassword(String password){

        typeInto("LoginPage.tbx_Password",password);
        return this;

    }

    public WelcomePage clickLogin(){

        clickIt("LoginPage.tbx_btn_Submit");
        return new WelcomePage(driver);

    }





}

