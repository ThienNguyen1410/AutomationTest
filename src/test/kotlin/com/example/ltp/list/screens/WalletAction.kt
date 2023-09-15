package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class WalletAction (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "wallet_action_screen")
    @iOSXCUITFindBy(id = "wallet_action_screen")
    private lateinit var walletActionScreen : WebElement
    fun isWalletActionScreenIsDisplayed() = walletActionScreen.isDisplayed

    @AndroidFindBy(accessibility = "approve_Button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"approve_Button\"])[2]")
    private lateinit var approveButton : WebElement
    fun isApproveButtonEnabled() = approveButton.isEnabled
    fun clickApproveButton() {
        approveButton.click()
        Thread.sleep(1000)
    }

    @AndroidFindBy(accessibility = "reject_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"reject_button\"])[2]")
    private lateinit var rejectButton : WebElement
    fun isRejectButtonEnabled() = rejectButton.isEnabled
    fun clickRejectButton() = rejectButton.click()

    fun inputPassCode(passcode : String) {
        context.driver.keyboard.pressKey(passcode[0].toString())
        context.driver.keyboard.pressKey(passcode[1].toString())
        context.driver.keyboard.pressKey(passcode[2].toString())
        context.driver.keyboard.pressKey(passcode[3].toString())
        context.driver.keyboard.pressKey(passcode[4].toString())
        context.driver.keyboard.pressKey(passcode[5].toString())
    }


}
