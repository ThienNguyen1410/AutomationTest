package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import kotlin.time.Duration.Companion.seconds
import kotlin.time.toDuration

class ReEnterPasscode (context: Context) : Screen(context){
    @AndroidFindBy(accessibility = "re_enter_passcode_screen")
    @iOSXCUITFindBy(id = "re_enter_passcode_screen")
    private lateinit var reEnterPasscodeScreen : WebElement
    fun isReEnterPassCodeScreenDisplayed() = reEnterPasscodeScreen.isDisplayed
    fun clickReEnterPasscodeScreen() = reEnterPasscodeScreen.click()

    @AndroidFindBy(accessibility = "re_enter_passcode_caption")
    @iOSXCUITFindBy(id = "re_enter_passcode_caption")
    private lateinit var caption: WebElement
    // To hide keyboard
    fun clickCaption() = caption.click()

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"re_enter_passcode_screen\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private lateinit var passCode : WebElement
    fun reEnterPassCode(code : String) {
        if(context.driver.capabilities.platformName.toString() === "IOS") {
            context.driver.keyboard.pressKey(code)
            clickReEnterPasscodeScreen()
        } else {
            passCode.click()
            context.driver.keyboard.pressKey(code)
            context.driver.keyboard.pressKey(Keys.ENTER)
        }

    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    private lateinit var cancelButton : WebElement
    fun clickCancelButton() = cancelButton.click()

    @AndroidFindBy(accessibility = "biometric_switch")
    @iOSXCUITFindBy(id = "biometric_switch")
    private lateinit var biometric : WebElement
    fun clickBiometricToggle() {
        biometric.click()
//        if(context.driver.capabilities.platformName.toString() == "IOS") {
//            context.driver.switchTo().alert().dismiss()
//        } else {
//            clickCancelButton()
//        }

    }

        @AndroidFindBy(accessibility = "understood_textbox")
        @iOSXCUITFindBy(id = "understood_textbox")
        private lateinit var term : WebElement
        fun clickAgreeTerm() = term.click()

        @AndroidFindBy(accessibility = "re_enter_passcode_button")
        @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"re_enter_passcode_button\"])[2]")
        private lateinit var continueButton : WebElement
        fun isCreateButtonEnabled() = continueButton.isEnabled
        fun clickCreateButton() = continueButton.click()
}
