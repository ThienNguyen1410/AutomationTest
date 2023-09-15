package com.example.ltp.list.step

import com.example.ltp.list.Context
import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.*
import io.cucumber.java8.En
import org.junit.Assert

class RestoreAccoutSeedPhrase(
    welcomeScreen: WelcomeScreen,
    login: Login,
    verifyCode: VerifyCode,
    lock: Lock,
    welcomeBack: WelcomeBack,
    importSeedPhrase: ImportSeedPhrase,
    createNewPassCode: CreateNewPassCode,
    reenterNewPassCode: ReenterNewPassCode,
    congratulationScreen: CongratulationScreen,
    home: Home
    ) :
    En {
    init {
        Given("Wait for Wallet Name screen isDisplayed") {
            Assert.assertTrue(welcomeScreen.isScreenDisplayed())
        }

        And("Wait for Email button isEnabled") {
            Assert.assertTrue(welcomeScreen.isEmailButtonEnable())
        }

        When("Click on Email button") {
            welcomeScreen.clickEmailButton()
        }

        Then("Wait for Login with Email screen isDisplayed") {
            Assert.assertTrue(login.isLoginScreenDisplayed())
        }

        And("Verify that Confirm button is disabled") {
            Assert.assertEquals(false, login.isConfirmButtonEnabled())
        }

        When("Input old Email into Enter your email text box Email using on same device") {
            login.setTextEmailLoginField(Config.email)
        }

        And("Verify that Confirm button is enabled") {
            Assert.assertTrue(login.isConfirmButtonEnabled())
        }

        When("Click on Confirm button") {
            login.clickedConfirmButton()
            Thread.sleep(1000)
        }

        Then("Wait for Enter the verification code screen isDisplayed") {
            Assert.assertEquals(true,verifyCode.isVerificationCodeScreenDisplayed())
        }

        Then("Input 6 digit OTP code") {
            verifyCode.sendVerifyCode(Config.verifyCode)
        }

        Then("Wait for Lock Screen is displayed | Restore Wallet") {
            Assert.assertEquals(true, lock.isLockScreenDisplayed())

        }

        When("Reset passcode | Restore Wallet") {
            lock.clickRestoreButton()
            lock.clickResetButton()
            lock.inputResetField(Config.resetKey)
            lock.clickResetButton()
        }

        Then("Wait Welcome back screen displayed") {
            Assert.assertTrue(welcomeBack.isWelcomeBackScreenDisplayed())
        }

        And("Verify that Import seed phrase button is enable"){
            Assert.assertTrue(welcomeBack.isImportSeedPhraseButtonEnable())
        }

        When("Click on Import Seed Phrase button") {
            welcomeBack.clickImportSeedPhraseButton()
        }

        Then("Wait Import seed phrase screen is displayed") {
            Assert.assertTrue(importSeedPhrase.isImportSeedPhraseScreenDisplayed())
        }


        And("Verify that Confirm button is disabled at Import Seed Phrase Screen") {
            Assert.assertEquals(false, importSeedPhrase.isConfirmButtonEnable())
        }

        Then("Input seed phrase to the text box") {
            importSeedPhrase.sendSeedPhrase()
        }

        And("Verify that Confirm button is enabled at Import Seed Phrase Screen") {
            Assert.assertTrue(importSeedPhrase.isConfirmButtonEnable())
        }

        When("Click on Confirm button at import seed phrase screen") {
            importSeedPhrase.clickConfirmButton()
        }

        Then("Wait to the create new pass code is displayed") {
            Assert.assertTrue(createNewPassCode.isCreateNewPassCodeScreenDisplayed())
        }

        When("Input new pass code") {
            createNewPassCode.sendPassCode(Config.pass)
            Thread.sleep(1000)
        }

        Then("Wait for reenter new pass code screen displayed") {
            Assert.assertEquals(true, reenterNewPassCode.isReEnterNewPassCodeScreenDisplayed())
        }

        And("Verify that Confirm button at the reenter new pass code screen is disable") {
            Assert.assertEquals(false,reenterNewPassCode.isConfirmButtonEnabled())
        }

        Then("Input the same pass code at the reenter new pass code screen") {
            reenterNewPassCode.reEnterNewPassCode(Config.pass)
        }

        And("Verify that the Confirm button at the reenter new pass code still disabled") {
            Assert.assertTrue(!reenterNewPassCode.isConfirmButtonEnabled())
        }

        Then("Click on agree term check box at the reenter new passcode screen") {
            reenterNewPassCode.clickOnTerm()
        }

        And("Verify that confirm button at the reenter new pass code screen enabled") {
            Assert.assertTrue(reenterNewPassCode.isConfirmButtonEnabled())
        }

        Then("Click on confirm button at the reenter new pass code screen") {
            reenterNewPassCode.clickConfirmButton()
        }

        Then("Wait for Your wallet is ready at the registration screen is displayed") {
            Assert.assertTrue(congratulationScreen.isCongratulationScreenDisplayed())
        }

        Then("Click on the go to wallet button at the registration completed screen") {
            congratulationScreen.clickConfirmButton()
        }

        And("Verify that username display correctly at the Home screen") {
            Assert.assertEquals(true, home.isUsernameDisplayedCorrectly(Config.username))
        }

    }
}
