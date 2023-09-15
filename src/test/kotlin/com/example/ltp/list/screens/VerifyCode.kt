package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class VerifyCode(context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "auth_verification_code_screen")
    @iOSXCUITFindBy(id="auth_verification_code_screen")
    private lateinit var verificationCodeScreen: WebElement
    fun isVerificationCodeScreenDisplayed() = verificationCodeScreen.isDisplayed

    @AndroidFindBy(accessibility = "verify_code_textfield")
    @iOSXCUITFindBy(id = "verify_code_textfield")
    private lateinit var verifyCodeField: WebElement
    fun sendVerifyCode(code : String) {
        if(context.driver.capabilities.platformName.toString() === "IOS") {
            context.driver.keyboard.pressKey(code)
            context.driver.keyboard.pressKey(Keys.RETURN)
        } else {
            verifyCodeField.sendKeys(code)

        }
    }
}
