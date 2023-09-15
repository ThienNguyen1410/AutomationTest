package com.example.ltp.list.step

import com.example.ltp.list.screens.Login
import com.example.ltp.list.screens.WelcomeScreen
import io.cucumber.java8.En
import org.junit.Assert.assertTrue

class VerifyLoginDisplay(welcomeScreen: WelcomeScreen, login: Login) : En {
    init {
        Given("In the Welcome Screen") {
            assertTrue(welcomeScreen.isScreenDisplayed())
        }
        And("Email Button Enabled") {
            assertTrue(welcomeScreen.isEmailButtonEnable())
        }
        And("Google Button Enabled") {
            assertTrue(welcomeScreen.isGoogleButtonEnabled())
        }
        And("Facebook Button Enabled") {
            assertTrue(welcomeScreen.isFacebookButtonEnabled())
       }
        And("Apple Button Enabled") {
            assertTrue(welcomeScreen.isAppleButtonEnabled())
        }

        When("Email Button Clicked"){
            welcomeScreen.clickEmailButton()
        }

        Then("I should see the Login Screen") {
            login.isLoginScreenDisplayed()
        }
    }

}
