package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import io.appium.java_client.touch.TapOptions
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class CreatePassCode (context: Context) : Screen(context){
    @AndroidFindBy(accessibility = "create_passcode_screen")
    @iOSXCUITFindBy(accessibility="create_passcode_screen")
    private lateinit var createPassCodeScreen: WebElement
    fun isCreatePassCodeScreenDisplayed() = createPassCodeScreen.isDisplayed
    fun clickCreatePasscodeScreen() = createPassCodeScreen.click()

    @AndroidFindBy(accessibility = "create_passcode_caption")
    @iOSXCUITFindBy(id = "create_passcode_caption")
    private lateinit var createPassCodeCaption : WebElement
    // To hide keyboard
    fun clickCaption() = createPassCodeCaption.click()


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_passcode_screen\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private lateinit var passCode : WebElement
    fun createPassCode(code : String) {
        if(context.driver.capabilities.platformName.toString() === "IOS") {
            context.driver.keyboard.pressKey(code)
        } else {
            passCode.click()
            context.driver.keyboard.pressKey(code)
            context.driver.keyboard.pressKey(Keys.RETURN)
        }
    }

    @AndroidFindBy(accessibility = "create_passcode_confirm_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"create_passcode_confirm_button\"])[2]")
    private lateinit var confirmPassCodeButton : WebElement

    fun isConfirmButtonEnabled() = confirmPassCodeButton.isEnabled
    fun clickConfirmButton() = confirmPassCodeButton.click()
}
