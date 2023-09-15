package com.example.ltp.list.step

import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.*
import io.cucumber.java8.En
import org.junit.Assert

class RestoreAccountSaveState
    (welcomeBack: WelcomeBack,
        importSeedPhrase: ImportSeedPhrase,
        createNewPassCode: CreateNewPassCode,
        reenterNewPassCode: ReenterNewPassCode,
        congratulationScreen: CongratulationScreen,
        home: Home
    ) : En {
        init {

            Then("Wait Welcome back screen displayed |save state|") {
                Assert.assertTrue(welcomeBack.isWelcomeBackScreenDisplayed())
            }

            And("Verify that Import seed phrase button is enable |save state|"){
                Assert.assertTrue(welcomeBack.isImportSeedPhraseButtonEnable())
            }

            When("Click on Import Seed Phrase button |save state|") {
                welcomeBack.clickImportSeedPhraseButton()
            }


            Then("Wait Import seed phrase screen is displayed |save state|") {
                Assert.assertTrue(importSeedPhrase.isImportSeedPhraseScreenDisplayed())
            }


            And("Verify that Confirm button is disabled at Import Seed Phrase Screen |save state|") {
                Assert.assertTrue(!importSeedPhrase.isConfirmButtonEnable())
            }

            Then("Input seed phrase to the text box |save state|") {
                importSeedPhrase.sendSeedPhrase()
            }

            And("Verify that Confirm button is enabled at Import Seed Phrase Screen |save state|") {
                Assert.assertTrue(importSeedPhrase.isConfirmButtonEnable())
            }

            When("Click on Confirm button at import seed phrase screen |save state|") {
                importSeedPhrase.clickConfirmButton()
            }

            Then("Wait to the create new pass code is displayed |save state|") {
                Assert.assertTrue(createNewPassCode.isCreateNewPassCodeScreenDisplayed())
            }


            Then("Wait for reenter new pass code screen displayed |save state|") {
                Assert.assertTrue(reenterNewPassCode.isReEnterNewPassCodeScreenDisplayed())
            }

            And("Verify that Confirm button at the reenter new pass code screen is disable |save state|") {
                Assert.assertTrue(!reenterNewPassCode.isConfirmButtonEnabled())
            }

            Then("Input the same pass code at the reenter new pass code screen |save state|") {
                reenterNewPassCode.reEnterNewPassCode(Config.pass)
            }

            And("Verify that the Confirm button at the reenter new pass code still disabled |save state|") {
                Assert.assertTrue(!reenterNewPassCode.isConfirmButtonEnabled())
            }

            Then("Click on agree term check box at the reenter new passcode screen |save state|") {
                reenterNewPassCode.clickOnTerm()
            }

            And("Verify that confirm button at the reenter new pass code screen enabled |save state|") {
                Assert.assertTrue(reenterNewPassCode.isConfirmButtonEnabled())
            }

            Then("Click on confirm button at the reenter new pass code screen |save state|") {
                reenterNewPassCode.clickConfirmButton()
            }

            Then("Wait for Your wallet is ready at the registration screen is displayed |save state|") {
                Assert.assertTrue(congratulationScreen.isCongratulationScreenDisplayed())
            }

            Then("Click on the go to wallet button at the registration completed screen |save state|") {
                congratulationScreen.clickConfirmButton()
            }

            And("Verify that username display correctly at the Home screen |save state|") {
                Assert.assertEquals(true, home.isUsernameDisplayedCorrectly(Config.username))
            }
        }

}
