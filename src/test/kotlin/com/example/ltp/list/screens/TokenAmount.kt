package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class TokenAmount (context : Context) : Screen(context) {
    @AndroidFindBy(accessibility = "token_amount_screen")
    @iOSXCUITFindBy(id = "token_amount_screen")
    private lateinit var tokenAmountScreen: WebElement

    fun isTokenAmountScreenDisplay() = tokenAmountScreen.isDisplayed
    fun clickScreen() = tokenAmountScreen.click()

    @AndroidFindBy(accessibility = "dropdown_token_button")
    @iOSXCUITFindBy(id = "dropdown_token_button")
    private lateinit var dropDownButton: WebElement
    fun isDropDownButtonEnable() = dropDownButton.isEnabled
    fun clickDropDownButton() {
        dropDownButton.click()
    }
    fun click2timeDropDownButton() {
        dropDownButton.click()
        dropDownButton.click()
    }

    @AndroidFindBy(accessibility = "amount_input")
    @iOSXCUITFindBy(id = "amount_input")
    private lateinit var amountInput: WebElement
    fun inputAmount(amount: String) = amountInput.sendKeys(amount)

    @AndroidFindBy(accessibility = "usemax_button")
    @iOSXCUITFindBy(id = "usemax_button")
    private lateinit var useMaxButton: WebElement
    fun isUsemaxButtonEnable() = useMaxButton.isEnabled
    fun clickUseMaxButton() = useMaxButton.click()

    @AndroidFindBy(accessibility = "next_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"next_button\"])[3]")
    private lateinit var nextButton: WebElement
    fun isNextButtonEnabled() : Boolean {
        clickScreen()
        return nextButton.isEnabled
    }

    fun clickNextButton() = nextButton.click()

}
