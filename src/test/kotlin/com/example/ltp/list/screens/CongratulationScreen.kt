package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class CongratulationScreen (context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "congratulation_screen")
    @iOSXCUITFindBy(accessibility="congratulation_screen")
    private lateinit var congratulationScreen: WebElement
    fun isCongratulationScreenDisplayed() = congratulationScreen.isDisplayed

    @AndroidFindBy(accessibility = "congratulation_screen_username")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"congratulation_screen_username\"]")
    private lateinit var username: WebElement
    fun getUsername(): String {
        return username.text
    }

    fun isUsernameCorrectly(username: String): Boolean {
        val currentUsername = getUsername()
        println("Current username " + currentUsername)
        return currentUsername == username
    }

    @AndroidFindBy(accessibility = "go_to_wallet_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"go_to_wallet_button\"])[3]")
    private lateinit var confirmButton : WebElement
    fun clickConfirmButton() = confirmButton.click()
}
