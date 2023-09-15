package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class ReenterNewPassCode (context: Context) : Screen(context){
    @AndroidFindBy(accessibility = "re_enter_new_passcode_screen")
    @iOSXCUITFindBy(id = "re_enter_new_passcode_screen" )
    private lateinit var reEnterNewPassCodeScreen: WebElement
    fun isReEnterNewPassCodeScreenDisplayed() = reEnterNewPassCodeScreen.isDisplayed
    fun clickScreen() = reEnterNewPassCodeScreen.click()

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"re_enter_new_passcode_screen\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField[@name=\"re_enter_new_passcode_input\"])[1]")
    private lateinit var passcodeField : WebElement
    fun reEnterNewPassCode(passcode : String) {
        if(context.driver.capabilities.platformName.toString() === "IOS") {
            context.driver.keyboard.pressKey(passcode)
            clickScreen()
        } else {
            passcodeField.click()
            context.driver.keyboard.pressKey(passcode)
            context.driver.keyboard.pressKey(Keys.RETURN)
            Thread.sleep(1000)
        }
    }

    @AndroidFindBy(accessibility = "isUnderstood_checkbox")
    @iOSXCUITFindBy(id = "isUnderstood_checkbox")
    private lateinit var term : WebElement
    fun clickOnTerm() {
        term.click()
        Thread.sleep(1000)
    }


    @AndroidFindBy(accessibility = "confirm_reenter_new_passcode_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"confirm_reenter_new_passcode_button\"])[3]")
    private lateinit var confirmButton : WebElement
    fun isConfirmButtonEnabled() = confirmButton.isEnabled
    fun clickConfirmButton() = confirmButton.click()
}
