package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Alert
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class WelcomeScreen(context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "WelcomeScreen")
    @iOSXCUITFindBy(id = "WelcomeScreen")
    private lateinit var welcomeScreen: WebElement
//    var alert : Alert? = null
//    var webDriverWait = WebDriverWait(context.driver, Duration.ofSeconds(1))
    fun isScreenDisplayed() : Boolean {
//        try {
//            alert = webDriverWait.until(ExpectedConditions.alertIsPresent())
//        } catch (exception : Exception) {
//            throw exception
//        }
//        if(alert != null) {
//            context.driver.switchTo().alert().accept()
//        }
//        if(context.driver.capabilities.platformName.toString() == "IOS")
//        {
//            context.driver.switchTo().alert().accept()
//        }
        return welcomeScreen.isDisplayed
    }

    @AndroidFindBy(accessibility = "email_welcome_button")
    @iOSXCUITFindBy(id = "email_welcome_button")
    private  lateinit var emailButton : WebElement
    fun isEmailButtonEnable() = emailButton.isEnabled
    fun clickEmailButton() = emailButton.click()

    @AndroidFindBy(accessibility = "google_welcome_button")
    @iOSXCUITFindBy(id = "google_welcome_button")
    private  lateinit var googleButton : WebElement
    fun isGoogleButtonEnabled() = googleButton.isEnabled


    @AndroidFindBy(accessibility = "facebook_welcome_button")
    @iOSXCUITFindBy(id="facebook_welcome_button")
    private  lateinit var facebookButton : WebElement
    fun isFacebookButtonEnabled() = facebookButton.isEnabled

    @AndroidFindBy(accessibility = "apple_welcome_button")
    @iOSXCUITFindBy(id="apple_welcome_button")
    private  lateinit var appleButton : WebElement
    fun isAppleButtonEnabled() = appleButton.isEnabled

    @AndroidFindBy(accessibility = "wechat_welcome_button")
    @iOSXCUITFindBy(id="apple_welcome_button")
    private  lateinit var wechatButton : WebElement
    fun isWechatButtonEnabled() = wechatButton.isEnabled


}
