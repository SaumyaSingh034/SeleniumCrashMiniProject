package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailInputLocator  = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginBtnLocator = By.xpath("//input[@value='Login']");
    private By forgotPwdLink = By.xpath("//*[text()='Forgotten Password']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Methods/Actions

    public void enterEmail(String email){
        driver.findElement(emailInputLocator).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordInputLocator).sendKeys(password);
    }

    public void clickOnLoginBtn(){
        driver.findElement(loginBtnLocator).click();
    }

    public void clickOnForgetPasswordLink(){
        driver.findElement(forgotPwdLink).click();
    }

    public void checkForgetPasswordLink(){
        driver.findElement(forgotPwdLink).isDisplayed();
    }

    public AccountPage login(String email, String password){
        driver.findElement(emailInputLocator).sendKeys(email);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginBtnLocator).click();
        return new AccountPage();
    }

    public String getForgotPwdPageUrl(){
        String forgetPwdUrl = driver.getCurrentUrl();
        return forgetPwdUrl;
    }



}
