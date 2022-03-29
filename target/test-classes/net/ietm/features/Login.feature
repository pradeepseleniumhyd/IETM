Feature: Validate IETM - Code and Pixels Login Page

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"

@labelVerification   @Smoke
Scenario: IETM - Code and Pixels URL verification
Then user validates Title of the page
Then user verifies URL of the page
Then user is able to see the IETM login page

@labelVerification
Scenario: IETM - Code and Pixels Header & Footer Validation
Then user is to verify the text "Interactive Electronic Technical Manual"
And user is to verify the text "IETM"
And user is to verify the text "Level - IV"
And user is to verify the Image "Code and Pixels"
And user is to verify the Image "Client Logo"
And user is to verify the text "Copyright © 2022 Code and Pixels All Rights Reserved."

@labelVerification
Scenario: IETM - Code and Pixels - Login Form Label validation
Then user is to verify the text "Login"
And user is to verify the text "Enter username"
And user is to verify the text "Enter password"
And user is to verify the text "SUBMIT"
And user is to verify the Image "username"
And user is to verify the Image "password"
And user is to verify the Image "password eye icon"
And user is to verify disabled button "SUBMIT"

@negative
Scenario: IETM - Code and Pixels - Login Form validation - Negative Scenarios
When user enters username as "@#$%^&&"
When user enters password as "password"
When user clicks on "SUBMIT"
Then user is to verify the text "Invalid Credentials"


@Smoke1 @Functional
Scenario: IETM - Code and Pixels - Login Form validation - Valid Data
When user enters username as "admin"
When user enters password as "password"
When user clicks on "SUBMIT"
