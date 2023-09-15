package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class TermAndCondition (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "termsAndConditions_screen")
    @iOSXCUITFindBy(id = "termsAndConditions_screen")
    private lateinit var termAndConditionScreen : WebElement
    fun isTermAndConditionScreenDisplayed() = termAndConditionScreen.isDisplayed

    @AndroidFindBy(accessibility = "age_term_checkbox")
    @iOSXCUITFindBy(id = "age_term_checkbox")
    private lateinit var ageTermCheckBox : WebElement
    fun tickAgeTermCheckBox() {
        ageTermCheckBox.click()
    }

    @AndroidFindBy(accessibility = "condition_term_checkbox")
    @iOSXCUITFindBy(id = "condition_term_checkbox")
    private lateinit var termOfService : WebElement
    fun tickTermOfServiceCheckBox() {
        termOfService.click()
    }

    @AndroidFindBy(accessibility = "term_accept_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"term_accept_button\"])[3]")
    private lateinit var termAcceptButton : WebElement
    fun isAcceptButtonEnabled() = termAcceptButton.isEnabled
    fun clickAcceptButton() = termAcceptButton.click()
}
