package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.ios.touch.IOSPressOptions
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class CreateNewPassCode(context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "create_new_passcode_screen")
    @iOSXCUITFindBy(id="create_new_passcode_screen")
    private lateinit var createNewPassCodeScreen: WebElement
    fun isCreateNewPassCodeScreenDisplayed() = createNewPassCodeScreen.isDisplayed
    fun clickScreen() = createNewPassCodeScreen.click()

    @iOSXCUITFindBy(id = "\uE967")
    private lateinit var passcodeVisibility : WebElement
    fun showPasscode() = passcodeVisibility.click()

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_new_passcode_screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private lateinit var passcodeField : WebElement
    fun sendPassCode(passcode : String) {
        if(context.driver.capabilities.platformName.toString() === "IOS") {
            context.driver.keyboard.pressKey(passcode)
            context.driver.keyboard.pressKey(Keys.RETURN)
        } else {
            passcodeField.click()
            context.driver.keyboard.pressKey(passcode)
            context.driver.keyboard.pressKey(Keys.RETURN)
        }
    }
}
