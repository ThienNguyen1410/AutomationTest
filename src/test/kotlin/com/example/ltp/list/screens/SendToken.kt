package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

class SendToken (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "send_token_screen")
    @iOSXCUITFindBy(id = "send_token_screen")
    private lateinit var sendTokenScreen : WebElement
    fun isSendTokenDisplayed() = sendTokenScreen.isDisplayed
    fun clickScreen() = sendTokenScreen.click()



    @AndroidFindBy(accessibility = "receiver_input")
    @iOSXCUITFindBy(id = "receiver_input")
    private lateinit var receiverAddressInput : WebElement
    fun inputReceiverAddress(address : String) {
        receiverAddressInput.click()
        context.driver.keyboard.pressKey(address)
        clickScreen()
    }

    @AndroidFindBy(accessibility = "profile_view")
    @iOSXCUITFindBy(id = "profile_view")
    private lateinit var profile : WebElement
    fun isReceiverNameDisplayed() = profile.isDisplayed



    @AndroidFindBy(accessibility = "save_contact")
    @iOSXCUITFindBy(id = "save_contact")
    private lateinit var saveContactSwitch : WebElement
    fun clickSaveContactSwitch() = saveContactSwitch.click()

    @AndroidFindBy(accessibility = "next_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"next_button\"])[3]")
    private lateinit var nextButton : WebElement
    fun isNextButtonEnable() = nextButton.isEnabled
    fun clickNextButton() = nextButton.click()

    @AndroidFindBy(accessibility = "save_contact_modal")
    private lateinit var saveContactModal : WebElement
    fun isSaveContactModelDisplayed() = saveContactModal.isDisplayed


    @AndroidFindBy(accessibility = "save_contact_name_text_field")
    private lateinit var saveContactNameTextField : WebElement
    fun inputContactName(name : String) {
        saveContactNameTextField.click()
        context.driver.keyboard.pressKey(name)
        context.driver.keyboard.pressKey(Keys.RETURN)
    }

}
