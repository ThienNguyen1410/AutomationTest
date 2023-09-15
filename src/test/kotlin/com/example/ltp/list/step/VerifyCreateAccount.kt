package com.example.ltp.list.step

import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.*
import io.cucumber.java8.En
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class VerifyCreateAccount(
    onBoarding: OnBoarding,
    welcomeScreen: WelcomeScreen,
    login: Login,
    verifyCode: VerifyCode,
    termAndCondition: TermAndCondition,
    createUsername: CreateUsername,
    createWallet: CreateWallet,
    createSecureWallet: SecureWallet,
    createPassCode: CreatePassCode,
    reEnterPasscode: ReEnterPasscode,
    registrationCompleted: RegistrationCompleted,
    home: Home,
    walletDrawers: WalletDrawers
) : En {

    init {
//        Given("On boarding Screen display") {
//            assertEquals(true, onBoarding.isOnBoardingScreenDisplayed())
//        }
//        Then("Click next button page 1 | Onboarding screen") {
//            onBoarding.clickNextButton()
//            Thread.sleep(1000)
//        }
//
//        Then("Click next button page 2 | Onboarding screen") {
//            onBoarding.clickNextButton()
//        }
//        When("Click done Button | Onboarding screen") {
//            onBoarding.clickDoneButton()
//        }
        Then("Welcome Screen Displayed | Welcome screen") {
            assertEquals(true, welcomeScreen.isScreenDisplayed())
        }
        And("Email Button Enabled | Welcome screen") {
            assertEquals(true, welcomeScreen.isEmailButtonEnable())
        }
        And("Google Button Enabled | Welcome screen") {
            assertEquals(true,welcomeScreen.isGoogleButtonEnabled())
        }
        And("Facebook Button Enabled | Welcome screen") {
            assertEquals(true, welcomeScreen.isFacebookButtonEnabled())
        }
        And("Apple Button Enabled | Welcome screen") {
            assertTrue(welcomeScreen.isAppleButtonEnabled())
        }
        When("Email Button Login Screen Clicked") {
            welcomeScreen.clickEmailButton()
        }
        Then("Login Screen Displayed") {
            assert(login.isLoginScreenDisplayed())
        }
        And("Confirm Button Login Screen Disable") {
            assertEquals(false, login.isConfirmButtonEnabled())
        }
        Then("Input new email into Enter your email text box") {
            login.setTextEmailLoginField(Config.email)
        }
        And("Confirm Button Login Screen Enabled") {
            assertTrue(login.isConfirmButtonEnabled())
        }
        Then("Click Confirm Button Login Screen") {
            login.clickedConfirmButton()
            Thread.sleep(1000)
        }
        Then("Verify code screen displayed") {
            assertEquals(true, verifyCode.isVerificationCodeScreenDisplayed())
        }
        Then("Enter verification code") {
            verifyCode.sendVerifyCode(Config.verifyCode)
        }
        Then("Term and Condition Screen Displayed") {
            termAndCondition.isTermAndConditionScreenDisplayed()
        }

        Then("Tick on Require : Age term for 18 years olds checkbox") {
            termAndCondition.tickAgeTermCheckBox()
        }

        Then("Verify that Accept Button is disabled") {
            assertEquals(false,termAndCondition.isAcceptButtonEnabled())
        }

        Then("Tick on require Term of Service checkbox") {
            termAndCondition.tickTermOfServiceCheckBox()
            Thread.sleep(1000)
        }

        And("Verify that Accept button is enable") {
            assertEquals(true, termAndCondition.isAcceptButtonEnabled())
        }

        Then("Click on Accept button") {
            termAndCondition.clickAcceptButton()
        }

        Then("Wait for Create username displayed") {
            assert(createUsername.isCreateUsernameScreenDisplayed())
        }

        And("Verify that Create button is disabled") {
            assertTrue(!createUsername.isCreateUsernameButtonEnabled())
        }

        Then("Input valid username") {
            createUsername.setUsername(Config.username)
        }

        And("Verify Create button enabled") {
            assertEquals(true, createUsername.isCreateUsernameButtonEnabled())
        }

        Then("Click on Create button") {
            createUsername.clickCreateUsernameButton()
        }

        Then("Wait Create Wallet Screen Displayed") {
            assertTrue(createWallet.isCreateWalletScreenDisplayed())
        }

        And("Verify that basic options is ticked by default") {
            assertTrue(createWallet.isBasicCheckBoxTicked())
        }

        Then("Click the continue button") {
            createWallet.clickContinueButton()
        }


        Then("Wait for Secure Wallet displayed") {
            assertTrue(createSecureWallet.isCreateSecureWalletScreenDisplayed())
        }

        Then("Reveal Seed Phrase") {
            createSecureWallet.revealSeedPhrase()
        }

        Then("Get Seed Phrase") {
            createSecureWallet.getSeedPhrase1()
            createSecureWallet.getSeedPhrase2()
            createSecureWallet.getSeedPhrase3()
            createSecureWallet.getSeedPhrase4()
            createSecureWallet.getSeedPhrase5()
            createSecureWallet.getSeedPhrase6()
            createSecureWallet.getSeedPhrase7()
            createSecureWallet.getSeedPhrase8()
            createSecureWallet.getSeedPhrase9()
            createSecureWallet.getSeedPhrase10()
            createSecureWallet.getSeedPhrase11()
            createSecureWallet.getSeedPhrase12()

        }

        Then("Click on Continue button") {
            createSecureWallet.clickContinueButton()
        }

        Then("Wait for Enter Your Passcode screen is displayed") {
            assertEquals(true, createPassCode.isCreatePassCodeScreenDisplayed())
        }

//        And("Verify that Continue button is disable") {
//            assertEquals(false, createPassCode.isConfirmButtonEnabled())
//        }

        Then("Input valid code") {
            createPassCode.createPassCode(Config.pass)
        }

//        Then("Verify that Continue button is enable") {
//            assertEquals(true, createPassCode.isConfirmButtonEnabled())
//        }

//        Then("Click on create passcode continue button") {
//            createPassCode.clickConfirmButton()
//        }

        Then("Wait for ReEnter your passcode screen is displayed") {
            assertEquals(true, reEnterPasscode.isReEnterPassCodeScreenDisplayed())
        }

        Then("Re-enter passcode") {
            reEnterPasscode.reEnterPassCode(Config.pass)
        }

        Then("Click on Biometric toggle") {
            reEnterPasscode.clickBiometricToggle()
            Thread.sleep(1000)
            reEnterPasscode.clickBiometricToggle()
        }

        And("Verify that create button still disabled") {
            assertEquals(false, reEnterPasscode.isCreateButtonEnabled())
        }

        Then("Click on I understand button to agree with condition") {
            reEnterPasscode.clickAgreeTerm()
            Thread.sleep(1000)
        }

        Then("Verify that create button is enabled") {
            assertEquals(true,reEnterPasscode.isCreateButtonEnabled())
        }
        Then("Click on Re-enter create button") {
            reEnterPasscode.clickCreateButton()
        }

        Thread.sleep(2000)

        Then("Wait for Registration Completed screen displayed") {
            registrationCompleted.isRegistrationCompletedScreenDisplayed()
        }

        Then("Click on go to home button") {
            registrationCompleted.clickGoToHomeButton()
        }

        Then("Verify that username is displayed correctly at Inventory Screen") {
            assertEquals(true, home.isUsernameDisplayedCorrectly(Config.username))
        }


        Then("Sign out wallet") {
            home.clickDrawerButton()
            walletDrawers.clickSignOutButton()
            Thread.sleep(1000)
            walletDrawers.clickOkButton()
        }

    }
}
