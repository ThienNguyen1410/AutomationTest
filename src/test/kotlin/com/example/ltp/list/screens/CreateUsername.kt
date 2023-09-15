package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class CreateUsername (context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "create_username_screen")
    @iOSXCUITFindBy(id = "create_username_screen")
    private lateinit var createUsernameScreen: WebElement
    fun isCreateUsernameScreenDisplayed() = createUsernameScreen.isDisplayed

    @AndroidFindBy(accessibility = "create_username_textfield")
    @iOSXCUITFindBy(id = "create_username_textfield")
    private lateinit var createUsernameTextField : WebElement
    fun setUsername(name : String) {
        createUsernameTextField.click()
        context.driver.keyboard.pressKey(name)
        context.driver.keyboard.pressKey(Keys.RETURN)
        Thread.sleep(1000)
    }

    @AndroidFindBy(accessibility = "create_username_button")
    @iOSXCUITFindBy(id = "create_username_button")
    private lateinit var createUsernameButton : WebElement
    fun isCreateUsernameButtonEnabled() = createUsernameButton.isEnabled
    fun clickCreateUsernameButton() = createUsernameButton.click()

    @AndroidFindBy(accessibility = "skip_username_button")
    @iOSXCUITFindBy(id = "skip_username_button")
    private lateinit var skipButton : WebElement
    fun isSkipButtonDisplayed() = skipButton.isEnabled
    fun clickSkipButton() = skipButton.click()
}
