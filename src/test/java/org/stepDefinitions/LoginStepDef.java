package org.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;
import org.testng.Assert;

public class LoginStepDef extends Hooks {

    private LoginPage loginPage;



    @Given("user should be on OpenCart Application")
    public void user_should_be_on_open_cart_application() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage = new LoginPage(driver);
    }

    @Given("user has enter valid username and password")
    public void user_has_enter_valid_username_and_password() {
        loginPage.enterEmail("");
        loginPage.enterPassword("");

    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        String title = loginPage.getTitleOfPage();
        Assert.assertEquals(title, "");
    }
    
    @Given("user entered invalid {string} and {string}")
    public void user_entered_invalid_and(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @Then("user should get error message {string}")
    public void user_should_get_error_message(String string) {
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }

    @When("user click on {string} link")
    public void userClickOnLink(String linkName) {
        loginPage.clickOnForgetPasswordLink();
    }

    @Then("user should be redirected to the password reset page")
    public void userShouldBeRedirectedToThePasswordResetPage() {
        Assert.assertTrue(loginPage.getForgotPwdPageUrl().contains("account/forgotten"));

    }
}
