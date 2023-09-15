package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class Login (context : Context)  : Screen(context){

    @AndroidFindBy(accessibility = "login_screen")
    @iOSXCUITFindBy(id = "login_screen")
    private lateinit var loginScreen : WebElement
    fun isLoginScreenDisplayed() = loginScreen.isDisplayed

    @AndroidFindBy(accessibility = "facebook_login_button")
    @iOSXCUITFindBy(id = "facebook_login_button")
    private lateinit var facebookLoginButton : WebElement
    fun isFacebookLoginButtonEnable() = facebookLoginButton.isEnabled

    @AndroidFindBy(accessibility = "google_login_button")
    @iOSXCUITFindBy(id = "google_login_button")
    private lateinit var googleLoginButton : WebElement
    fun isGoogleLoginButtonEnable() = googleLoginButton.isEnabled


    @AndroidFindBy(accessibility = "apple_login_button")
    @iOSXCUITFindBy(id="apple_login_button")
    private lateinit var appleLoginButton : WebElement
    fun isAppleLoginButtonEnable() = appleLoginButton.isEnabled

    @AndroidFindBy(accessibility = "wechat_login_button")
    @iOSXCUITFindBy(id="wechat_login_button")
    private lateinit var wechatLoginButton : WebElement
    fun isWechatLoginButtonEnable() = wechatLoginButton.isEnabled

    @AndroidFindBy(accessibility = "confirm_login_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"confirm_login_button\"])[2]")
    private lateinit var confirmLoginButton : WebElement
    fun isConfirmButtonEnabled() = confirmLoginButton.isEnabled
    fun clickedConfirmButton() = confirmLoginButton.click()

    @AndroidFindBy(accessibility = "email_login_textfield")
    @iOSXCUITFindBy(id="email_login_textfield")
    private lateinit var emailLoginTextfield : WebElement
    fun setTextEmailLoginField(email : String) {
        emailLoginTextfield.sendKeys(email)
    }


}
