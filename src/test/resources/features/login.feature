Feature: Login Functionality for OpenCart E-commerce website

  As a User I should be able to login to OpenCart E-commerce website
  So that I could access my account related stuff

  Background:
    Given user should be on OpenCart Application

  Scenario: Validate User Login Functionality with valid credentials
    Given user has enter valid username and password
    When user click on login button
    Then user should be logged in successfully

  Scenario Outline: Validate User login Functionality with invalid credentials
    Given user entered invalid "<username>" and "<password>"
    When user click on login button
    Then user should get error message "<error_message>"

    Examples:
      | username               | password        | error_message                                         |
      | invalidEmail@gmail.com | invalidPassword | Warning: No match for E-Mail Address and/or Password. |
      | abccdeee               | validPassword   | Warning: No match for E-Mail Address and/or Password. |
      | 12345@gmail.com        | abcccc          | Warning: No match for E-Mail Address and/or Password. |

    Scenario: Navigating to forgotten Password Page
      When user click on "Forgotten Password" link
      Then user should be redirected to the password reset page

