package com.introProject.Pages;

import com.introProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//span[@id= 'nav-link-accountList-nav-line-1']") //span[@id= 'nav-link-accountList-nav-line-1']
    public WebElement SignInButton;
}
