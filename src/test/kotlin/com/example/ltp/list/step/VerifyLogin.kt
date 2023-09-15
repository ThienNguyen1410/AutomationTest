package com.example.ltp.list.step

import com.example.ltp.list.config.Config
import com.example.ltp.list.screens.Home
import com.example.ltp.list.screens.Login
import com.example.ltp.list.screens.VerifyCode
import com.example.ltp.list.screens.WelcomeScreen
import io.cucumber.java8.En
import org.junit.Assert.assertTrue
import kotlin.math.log

class VerifyLogin(welcomeScreen: WelcomeScreen, login: Login, verifyCode: VerifyCode, home: Home) : En {
//    init {
//        Given("Wait for Wallet Name screen isDisplayed") {
//            assertTrue(welcomeScreen.isScreenDisplayed())
//        }
//
//        And("Wait for Email button isEnabled") {
//            assertTrue(welcomeScreen.isEmailButtonEnable())
//        }
//
//        When("Click on Email button") {
//            welcomeScreen.clickEmailButton()
//        }
//
//        Then("Wait for Login with Email screen isDisplayed") {
//            assertTrue(login.isLoginScreenDisplayed())
//        }
//
//        And("Verify that Confirm button is disabled") {
//            assertTrue(!login.isConfirmButtonEnabled())
//        }
//
//        When("Input old Email into Enter your email text box Email using on same device") {
//            login.setTextEmailLoginField(Config.email)
//        }
//
//        And("Verify that Confirm button is enabled") {
//            assertTrue(login.isConfirmButtonEnabled())
//        }
//
//        When("Click on Confirm button") {
//            login.clickedConfirmButton()
//        }
//
//        Then("Wait for Enter the verification code screen isDisplayed") {
//            assertTrue(verifyCode.isVerificationCodeScreenDisplayed())
//        }
//
//        Then("Input 6 digit OTP code") {
//            verifyCode.sendVerifyCode(Config.verifyCode)
//        }
//
//    }
}
