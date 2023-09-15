package com.example.ltp.list.step

import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.*
import io.cucumber.java8.En
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class CreateAccountUsernameCreated(
    welcomeScreen: WelcomeScreen,
    login: Login,
    verifyCode: VerifyCode,
    createWallet: CreateWallet,
    createSecureWallet: SecureWallet,
    createPassCode: CreatePassCode,
    reEnterPasscode: ReEnterPasscode,
    registrationCompleted: RegistrationCompleted,
    home: Home
) : En {

    init {
        Given("Welcome Screen Displayed | username created") {
            assert(welcomeScreen.isScreenDisplayed())
        }
        And("Email Button Login Screen Enabled | username created") {
            assert(welcomeScreen.isEmailButtonEnable())
        }
        When("Email Button Login Screen Clicked | username created") {
            welcomeScreen.clickEmailButton()
        }
        Then("Login Screen Displayed | username created") {
            assertEquals(true, login.isLoginScreenDisplayed())
        }
        And("Confirm Button Login Screen Disable | username created") {
            assertEquals(false, login.isConfirmButtonEnabled())
        }
        Then("Input new email into Enter your email text box | username created") {
            login.setTextEmailLoginField(Config.email)
        }
        And("Confirm Button Login Screen Enabled | username created") {
            assertTrue(login.isConfirmButtonEnabled())
        }
        Then("Click Confirm Button Login Screen | username created") {
            login.clickedConfirmButton()
            Thread.sleep(1000)
        }
        Then("Verify code screen displayed | username created") {
            assertEquals(true, verifyCode.isVerificationCodeScreenDisplayed())
        }

        Then("Enter verification code | username created") {
            verifyCode.sendVerifyCode(Config.verifyCode)
        }

        Then("Wait Create Wallet Screen Displayed | username created") {
            assertTrue(createWallet.isCreateWalletScreenDisplayed())
        }

        And("Verify that basic options is ticked by default | username created") {
            assertTrue(createWallet.isBasicCheckBoxTicked())
        }

        Then("Click the continue button | username created") {
            createWallet.clickContinueButton()
        }


        Then("Wait for Secure Wallet displayed | username created") {
            assertTrue(createSecureWallet.isCreateSecureWalletScreenDisplayed())
        }

        Then("Reveal Seed Phrase | username created") {
            createSecureWallet.revealSeedPhrase()
        }

        Then("Get Seed Phrase | username created") {
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

        Then("Click on Continue button | username created") {
            createSecureWallet.clickContinueButton()
        }

        Then("Wait for Enter Your Passcode screen is displayed | username created") {
            assertEquals(true, createPassCode.isCreatePassCodeScreenDisplayed())
        }

        And("Verify that Continue button is disable | username created") {
            assertEquals(false, createPassCode.isConfirmButtonEnabled())
        }

        Then("Input valid code | username created") {
            createPassCode.createPassCode(Config.pass)
        }

        Then("Verify that Continue button is enable | username created") {
            assertEquals(true, createPassCode.isConfirmButtonEnabled())
        }

        Then("Click on create passcode continue button | username created") {
            createPassCode.clickConfirmButton()
        }

        Then("Wait for ReEnter your passcode screen is displayed | username created") {
            assertEquals(true, reEnterPasscode.isReEnterPassCodeScreenDisplayed())
        }


        Then("Re-enter passcode | username created") {
            reEnterPasscode.reEnterPassCode(Config.pass)
        }

        Then("Click on Biometric toggle | username created") {
            reEnterPasscode.clickBiometricToggle()
        }

        And("Verify that create button still disabled | username created") {
            assertEquals(false, reEnterPasscode.isCreateButtonEnabled())
        }

        Then("Click on I understand button to agree with condition | username created") {
            reEnterPasscode.clickAgreeTerm()
        }

        Then("Verify that create button is enabled | username created") {
            assertTrue(reEnterPasscode.isCreateButtonEnabled())
        }
        Then("Click on Re-enter create button | username created") {
            reEnterPasscode.clickCreateButton()
        }

        Then("Wait for Registration Completed screen displayed | username created") {
            registrationCompleted.isRegistrationCompletedScreenDisplayed()
        }

        Then("Click on go to home button | username created") {
            registrationCompleted.clickGoToHomeButton()
        }

        Then("Verify that username is displayed correctly at Inventory Screen | username created") {
            assertEquals(true,home.isUsernameDisplayedCorrectly(Config.pass))
        }

    }
}

