package com.automation.pages;

import com.automationbytarun.components.BaseActions;
import org.openqa.selenium.WebDriver;


public class WelcomePage extends BaseActions {

        WebDriver driver;

    public WelcomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
            }

    public String getWelcomeMessage(){
        return getTextFromElement("HomePage.lbl_welcomeMsg");
    }
}
