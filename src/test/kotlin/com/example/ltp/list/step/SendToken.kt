package com.example.ltp.list.step

import com.example.ltp.list.Context
import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.*
import com.example.ltp.list.screens.SendToken
import com.example.ltp.list.screens.modal.SaveContactModal
import io.cucumber.java8.En
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class SendToken (lock: Lock,
                 home: Home,
                 sendToken: SendToken,
                 saveContactModal: SaveContactModal,
                 tokenAmount: TokenAmount,
                 walletAction: WalletAction,
                 history: History) : En {
   init {
        Given("Wait to Home Screen is displayed |Send Token|") {
            assertEquals(true, home.isHomeScreenDisplayed())
        }

        And("Verify send button is enable |Send Token|") {
            assertEquals(true,home.isSendTokenEnabled())
        }

        When("Click on send token button |Send Token|") {
            home.clickSendTokenButton()
        }

        Then("Wait send token screen is displayed |Send Token|") {
            assertEquals(true, sendToken.isSendTokenDisplayed())
        }

        And("Verify that Next button is disabled |Send Token|") {
            assertEquals(false, sendToken.isNextButtonEnable())
        }

        When("Type username to receiver address text box |Send Token|") {
            sendToken.inputReceiverAddress(Config.receiverName)
        }

        And("Verify username is displayed |Send Token|") {
            assertTrue(sendToken.isReceiverNameDisplayed())
        }
        Then("Click on Save contact |Send Token|") {
            sendToken.clickSaveContactSwitch()
        }
        And("Verify that Save contact name is displayed |Send Token|") {
            assertEquals(true, saveContactModal.isSaveContactModalDisplayed())
        }
        And("Verify that Next button is still disabled |Send Token|") {
            assertEquals(false, saveContactModal.isDoneButtonEnabled())
        }

        Then("Type contact name into Contact Name text box |Send Token|") {
            saveContactModal.inputContactName(Config.contactName)
        }

        And("Verify that Done button is enabled |Send Token|") {
            assertEquals(true, saveContactModal.isDoneButtonEnabled())
        }

        Then("Click on Done button |Send Token|") {
            saveContactModal.clickDoneButton()
        }

        And("Verify that Next button is enabled |Send Token|") {
            assertEquals(true, sendToken.isNextButtonEnable())
        }

        When("Click on Next button |Send Token|") {
            sendToken.clickNextButton()
        }

       Then("Wait for token amount screen is displayed |Send Token|") {
           assertEquals(true, tokenAmount.isTokenAmountScreenDisplay())
       }

       And("Verify drop down button is enabled |Send Token|") {
           assertEquals(true, tokenAmount.isDropDownButtonEnable())
       }

       And("Verify next button is disable |Send Token|") {
           assertEquals(false, tokenAmount.isNextButtonEnabled())
       }

//       When("Click on drop down button |Send Token|") {
//            tokenAmount.click2timeDropDownButton()
//
//       }

//       Then("Use max amount |Send Token|") {
//           tokenAmount.clickUseMaxButton()
//       }

       Then("Input token amount |Send Token|") {
           tokenAmount.inputAmount(Config.amount)
       }

       And("Verify next button is enable |Send Token|") {
           assertEquals(true, tokenAmount.isNextButtonEnabled())
       }

       When("Click on next button |Send Token|") {
           tokenAmount.clickNextButton()
       }

       Then("Wait for Wallet Action screen is displayed |Send Token|") {
           assertEquals(true, walletAction.isWalletActionScreenIsDisplayed())
       }
       And("Verify that approve button is enabled |Send Token|") {
           assertEquals(true, walletAction.isApproveButtonEnabled())
       }
       And("Verify that reject button is enabled |Send Token|") {
          assertEquals(true, walletAction.isRejectButtonEnabled())
       }

       When("Click Approve button |Send Token|") {
           walletAction.clickApproveButton()
       }

       Then("Input passcode |Send Token|") {
           walletAction.inputPassCode(Config.pass)
       }

       Then("Wait for history screen is displayed |Send Token|") {
            assertEquals(true, history.isHistoryScreenDisplayed())
       }

    }
}
