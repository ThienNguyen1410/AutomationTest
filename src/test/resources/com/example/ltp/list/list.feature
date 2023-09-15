Feature: KiWallet

#  Scenario: Verify that Login method appears correctly
#    Given In the Welcome Screen
#    And Email Button Enabled
#    And Google Button Enabled
#    And Facebook Button Enabled
#    And Apple Button Enabled
#    When Email Button Clicked
#    Then I should see the Login Screen


#  Scenario: Verify that user can create new account using new email | username created
#    Given Welcome Screen Displayed | username created
#    And Email Button Login Screen Enabled | username created
#    When Email Button Login Screen Clicked | username created
#    Then Login Screen Displayed | username created
#    And Confirm Button Login Screen Disable | username created
#    Then Input new email into Enter your email text box | username created
#    And Confirm Button Login Screen Enabled | username created
#    Then Click Confirm Button Login Screen | username created
#    Then Verify code screen displayed | username created
#    Then Enter verification code | username created
#    Then Wait Create Wallet Screen Displayed | username created
#    Then Click the continue button | username created
#    Then Wait for Secure Wallet displayed | username created
#    Then Reveal Seed Phrase | username created
#    Then Get Seed Phrase | username created
#    Then Click on Continue button | username created
#    Then Wait for Enter Your Passcode screen is displayed | username created
#    And  Verify that Continue button is disable | username created
#    Then Input valid code | username created
#    Then Verify that Continue button is enable | username created
#    Then Click on create passcode continue button | username created
#    Then Wait for ReEnter your passcode screen is displayed | username created
#    Then Re-enter passcode | username created
#    Then Click on Biometric toggle | username created
#    Then Verify that create button still disabled | username created
#    Then Click on I understand button to agree with condition | username created
#    Then Verify that create button is enabled | username created
#    Then Click on Re-enter create button | username created
#    Then Wait for Registration Completed screen displayed
#    Then Click on go to home button | username created
#    Then Verify that username is displayed correctly at Inventory Screen | username created

  Scenario: Verify that user can create new account using new email
#    Given On boarding Screen display
#    Then Click next button page 1 | Onboarding screen
#    Then Click next button page 2 | Onboarding screen
#    When Click done Button | Onboarding screen
    Then Welcome Screen Displayed | Welcome screen
    And Email Button Enabled | Welcome screen
    And Google Button Enabled | Welcome screen
    And Facebook Button Enabled | Welcome screen
    And Apple Button Enabled | Welcome screen
    When Email Button Login Screen Clicked
    Then Login Screen Displayed
    And Confirm Button Login Screen Disable
    Then Input new email into Enter your email text box
    And Confirm Button Login Screen Enabled
    Then Click Confirm Button Login Screen
    Then Verify code screen displayed
    Then Enter verification code
    Then Term and Condition Screen Displayed
    Then Tick on Require : Age term for 18 years olds checkbox
    Then Verify that Accept Button is disabled
    Then Tick on require Term of Service checkbox
    Then Verify that Accept button is enable
    Then Click on Accept button
    Then Wait for Create username displayed
    And Verify that Create button is disabled
    Then Input valid username
    And Verify Create button enabled
    Then Click on Create button
    Then Wait Create Wallet Screen Displayed
    Then Click the continue button
    Then Wait for Secure Wallet displayed
    Then Reveal Seed Phrase
    Then Get Seed Phrase
    Then Click on Continue button
    Then Wait for Enter Your Passcode screen is displayed
#    And  Verify that Continue button is disable
    Then Input valid code
#    Then Verify that Continue button is enable
#    Then Click on create passcode continue button
    Then Wait for ReEnter your passcode screen is displayed
    Then Re-enter passcode
    Then Click on Biometric toggle
    Then Verify that create button still disabled
    Then Click on I understand button to agree with condition
    Then Verify that create button is enabled
    Then Click on Re-enter create button
    Then Wait for Registration Completed screen displayed
    Then Click on go to home button
    Then Verify that username is displayed correctly at Inventory Screen
    Then Sign out wallet


Scenario: Restore Account use seed phrases
  Given Wait for Wallet Name screen isDisplayed
  And Wait for Email button isEnabled
  When Click on Email button
  Then Wait for Login with Email screen isDisplayed
  And Verify that Confirm button is disabled
  When Input old Email into Enter your email text box Email using on same device
  And Verify that Confirm button is enabled
  When Click on Confirm button
  Then Wait for Enter the verification code screen isDisplayed
  Then Input 6 digit OTP code
  Then Wait for Lock Screen is displayed | Restore Wallet
  When Reset passcode | Restore Wallet
  Then Wait Welcome back screen displayed
  And Verify that Import seed phrase button is enable
  When Click on Import Seed Phrase button
  Then Wait Import seed phrase screen is displayed
  And Verify that Confirm button is disabled at Import Seed Phrase Screen
  Then Input seed phrase to the text box
  And Verify that Confirm button is enabled at Import Seed Phrase Screen
  When Click on Confirm button at import seed phrase screen
  Then Wait to the create new pass code is displayed
  When Input new pass code
  Then Wait for reenter new pass code screen displayed
  And Verify that Confirm button at the reenter new pass code screen is disable
  Then Input the same pass code at the reenter new pass code screen
  And Verify that the Confirm button at the reenter new pass code still disabled
  Then Click on agree term check box at the reenter new passcode screen
  And Verify that confirm button at the reenter new pass code screen enabled
  Then Click on confirm button at the reenter new pass code screen
  Then Wait for Your wallet is ready at the registration screen is displayed
  Then Click on the go to wallet button at the registration completed screen
  And Verify that username display correctly at the Home screen
#
# Scenario: Restore using seed phrase with save state
#   Then Wait Welcome back screen displayed |save state|
#   And Verify that Import seed phrase button is enable |save state|
#   When Click on Import Seed Phrase button |save state|
#   Then Wait Import seed phrase screen is displayed |save state|
#   And Verify that Confirm button is disabled at Import Seed Phrase Screen |save state|
#   Then Input seed phrase to the text box |save state|
#   And Verify that Confirm button is enabled at Import Seed Phrase Screen |save state|
#   When Click on Confirm button at import seed phrase screen |save state|
#   Then Wait to the create new pass code is displayed |save state|
#   And Verify that confirm button at create new passcode screen is disabled |save state|
#   When Input new pass code |save state|
#   And Verify that confirm button at create new pass code screen enabled |save state|
#   When Click on the confirm button at create new pass code screen |save state|
#   Then Wait for reenter new pass code screen displayed |save state|
#   And Verify that Confirm button at the reenter new pass code screen is disable |save state|
#   Then Input the same pass code at the reenter new pass code screen |save state|
#   And Verify that the Confirm button at the reenter new pass code still disabled |save state|
#   Then Click on agree term check box at the reenter new passcode screen |save state|
#   And Verify that confirm button at the reenter new pass code screen enabled |save state|
#   Then Click on confirm button at the reenter new pass code screen |save state|
#   Then Wait for Your wallet is ready at the registration screen is displayed |save state|
#   Then Click on the go to wallet button at the registration completed screen |save state|
#   And Verify that username display correctly at the Home screen |save state|
#
 Scenario: Verify that user able to send token to other user by type username
   Given Wait to Home Screen is displayed |Send Token|
   And Verify send button is enable |Send Token|
   When Click on send token button |Send Token|
   Then Wait send token screen is displayed |Send Token|
   And Verify that Next button is disabled |Send Token|
   When Type username to receiver address text box |Send Token|
   And Verify username is displayed |Send Token|
   Then Click on Save contact |Send Token|
   And Verify that Save contact name is displayed |Send Token|
   And Verify that Next button is still disabled |Send Token|
   Then Type contact name into Contact Name text box |Send Token|
   And Verify that Done button is enabled |Send Token|
   Then Click on Done button |Send Token|
   And Verify that Next button is enabled |Send Token|
   When Click on Next button |Send Token|
   Then Wait for token amount screen is displayed |Send Token|
   And Verify drop down button is enabled |Send Token|
   And Verify next button is disable |Send Token|
#   When Click on drop down button |Send Token|
#   Then Use max amount |Send Token|
   Then Input token amount |Send Token|
   And Verify next button is enable |Send Token|
   When Click on next button |Send Token|
   Then Wait for Wallet Action screen is displayed |Send Token|
   And Verify that approve button is enabled |Send Token|
   And Verify that reject button is enabled |Send Token|
   When Click Approve button |Send Token|
   Then Input passcode |Send Token|
   Then Wait for history screen is displayed |Send Token|

