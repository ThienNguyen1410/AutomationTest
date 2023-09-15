package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class Home (context: Context) : Screen(context){

    @AndroidFindBy(accessibility = "home_screen")
    @iOSXCUITFindBy(id = "home_screen")
    private lateinit var homeScreen : WebElement
    fun isHomeScreenDisplayed() = homeScreen.isDisplayed

    @AndroidFindBy(accessibility = "drawer_button")
    @iOSXCUITFindBy(id = "drawer_button")
    private lateinit var drawerButton : WebElement
    fun isDrawerButtonEnable() = drawerButton.isEnabled
    fun clickDrawerButton() = drawerButton.click()


//    If use android enable this id
//    @AndroidFindBy(accessibility = "home_screen_username")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"home_screen\"]/android.view.ViewGroup[3]/android.widget.TextView[1]")
    @iOSXCUITFindBy(id = "home_screen_username")
    private lateinit var username : WebElement

    fun getUsername() : String {
        return username.text
    }

    fun isUsernameDisplayedCorrectly(username : String) : Boolean {
        val currentUsername = getUsername()
        println("Current username : $currentUsername " )
        println("Config username : $username " )
        return currentUsername == username
    }

    @AndroidFindBy(accessibility = "send_token_button")
    @iOSXCUITFindBy(id = "send_token_button")
    private lateinit var sendTokenButton : WebElement
    fun isSendTokenEnabled() = sendTokenButton.isEnabled
    fun clickSendTokenButton() = sendTokenButton.click()

    @AndroidFindBy(accessibility = "receive_token_button")
    @iOSXCUITFindBy(id = "receive_token_button")
    private lateinit var receiveTokenButton : WebElement
    fun isReceiveButtonEnabled() = receiveTokenButton.isEnabled
    fun clickReceiveEnable() = receiveTokenButton.click()

}
