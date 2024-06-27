#Author: your.email@your.domain.com
## (Comments)
## Hooks as Before and After 
## BackGround:

@Demo
Feature: Validates all the functionalities of PHP Travels 
 

  @smoke
  @Sanity
  Scenario: Validating DemoRequest Form
    Given User Opens Browser and navigates to URL
    And Clicks on Demo link from Homepage
    When Enter detials for Demo Request form
    Then Quit Browser

  @Regression
  @Sanity
  Scenario Outline: Validating Registration page
    Given User Opens Browser and navigates to URL
    And Clicks on Demo link from Homepage
    When Enter detials for Demo Request form "<Fname>" "<Lname>" "<Bname>" "<Email>"
    Then Quit Browser

    Examples: 
      | Fname  | Lname | Bname  | Email |
      | Ramesh |     Podugu | QT | ramesh@gmail.com |
      | Varun	 |    Panja | Ihub    | varun@gmail.com |
      
  @Regression
  Scenario Outline: Validate Signup 
  Given User Opens Browser and navigates to URL
  And Cliks on SignUp link from Homepage
  When Enter Details for Signup user "<Fname>" "<Lname>" "<Email>" "<pwd>" <CountryCode> "<MobNo>"
   Then Quit Browser
  Examples:
  |  Fname  | Lname  | Email  |  pwd  | CountryCode |  MobNo  |
  | Ramesh  | Podugu  | ramesh@gmail.com | ramesh@1234 | 91 | 9876543211 | 
