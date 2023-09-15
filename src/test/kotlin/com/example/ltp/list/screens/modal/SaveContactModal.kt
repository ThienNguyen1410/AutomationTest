package com.example.ltp.list.screens.modal

import com.example.ltp.list.Context
import com.example.ltp.list.screens.Screen
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class SaveContactModal (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "save_contact_modal")
    @iOSXCUITFindBy(id = "save_contact_modal")
    private lateinit var saveContactModal : WebElement
    fun isSaveContactModalDisplayed() = saveContactModal.isDisplayed

    @AndroidFindBy(accessibility = "contact_name_input")
    @iOSXCUITFindBy(id = "contact_name_input")
    private lateinit var contactNameInput : WebElement
    fun inputContactName(name : String) {
        contactNameInput.sendKeys(name)

    }

    @AndroidFindBy(accessibility = "done_button")
    @iOSXCUITFindBy(id = "done_button")
    private lateinit var doneButton : WebElement
    fun isDoneButtonEnabled() = doneButton.isEnabled
    fun clickDoneButton() = doneButton.click()

}
