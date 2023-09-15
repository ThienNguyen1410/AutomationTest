package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class OnBoarding (context: Context) : Screen(context) {

    @AndroidFindBy(accessibility = "onboarding_screen")
    @iOSXCUITFindBy(id = "onboarding_screen")
    private lateinit var onBoardingScreen : WebElement
    fun isOnBoardingScreenDisplayed() = onBoardingScreen.isDisplayed

    @AndroidFindBy(accessibility = "skip_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"skip_button\"])[3]")
    private lateinit var skipButton : WebElement
    fun isSkipButtonEnable() = skipButton.isEnabled
    fun clickSkipButton() = skipButton.click()

    @AndroidFindBy(accessibility = "next_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"next_button\"])[3]")
    private lateinit var nextButton : WebElement
    fun isNextButtonEnable() = nextButton.isEnabled
    fun clickNextButton() = nextButton.click()

    @AndroidFindBy(accessibility = "done_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"done_button\"])[5]")
    private lateinit var doneButton : WebElement
    fun isDoneButtonEnable() = doneButton.isEnabled
    fun clickDoneButton() = doneButton.click()




}
