package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {
    @FindBy(id="ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id="ctl00_MainContent_password")
    private WebElement passWord;


    public void login(){
        String username= ConfigurationReader.getProperty("username");
        String password= ConfigurationReader.getProperty("password");
        userName.sendKeys(username);
        passWord.sendKeys(password, Keys.ENTER);
    }

    public void login(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password, Keys.ENTER);
    }
}
