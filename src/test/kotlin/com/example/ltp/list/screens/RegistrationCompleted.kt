package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class RegistrationCompleted (context : Context) : Screen(context) {
    @AndroidFindBy(accessibility = "registrationCompleted_screen")
    @iOSXCUITFindBy(id = "registrationCompleted_screen")
    private lateinit var registrationScreen : WebElement
    fun isRegistrationCompletedScreenDisplayed() = registrationScreen.isDisplayed


    @AndroidFindBy(accessibility = "registrationCompleted_username")
    @iOSXCUITFindBy(id ="registrationCompleted_username" )
    private lateinit var usernameText : WebElement

    fun getUsername() : String {
        return usernameText.text
    }

    fun isUsernameDisplayCorrect(previousUsername : String) : Boolean {
        val username = getUsername()
        println("username : " + username)
        return username == previousUsername
    }

    @AndroidFindBy(accessibility = "go_to_home_button")
    @iOSXCUITFindBy(id = "go_to_home_button")
    private lateinit var goToHomeButton : WebElement
    fun clickGoToHomeButton() = goToHomeButton.click()


}
