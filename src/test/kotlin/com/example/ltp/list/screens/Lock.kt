package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class Lock (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "lock_screen")
    @iOSXCUITFindBy(id = "lock_screen")
    private lateinit var lockScreen : WebElement
    fun isLockScreenDisplayed() = lockScreen.isDisplayed

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"lock_screen\"]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
    private lateinit var passcode : WebElement
    fun inputPasscode(code : String) {
        if(context.driver.capabilities.platformName.toString() == "IOS") {
            context.driver.keyboard.pressKey(code)
        } else {
        passcode.click()
        context.driver.keyboard.pressKey(code)
        context.driver.keyboard.pressKey(Keys.RETURN)
        }
    }

    @AndroidFindBy(accessibility = "restore_button")
    @iOSXCUITFindBy(id = "restore_button")
    private lateinit var restore_button : WebElement
    fun clickRestoreButton() = restore_button.click()

    @AndroidFindBy(accessibility = "reset_input_field")
    @iOSXCUITFindBy(id = "reset_input_field")
    private lateinit var resetInputField : WebElement
    fun inputResetField(resetKey : String) {
        resetInputField.click()
        context.driver.keyboard.pressKey(resetKey)
        context.driver.keyboard.pressKey(Keys.RETURN)
    }

    @AndroidFindBy(accessibility = "reset_button")
    @iOSXCUITFindBy(id = "reset_button")
    private lateinit var resetButton : WebElement
    fun isResetButtonEnable() = resetButton.isEnabled
    fun clickResetButton() = resetButton.click()

}
