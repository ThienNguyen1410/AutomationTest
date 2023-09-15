package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class WalletDrawers (context: Context) : Screen(context) {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"wallet_drawer\"]/android.view.ViewGroup[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"\uE942 Sign out \uE96D\"]")
    private lateinit var signOutButton : WebElement
    fun isSignOutButtonEnable() = signOutButton.isEnabled
    fun clickSignOutButton() = signOutButton.click()

    @AndroidFindBy(accessibility = "walletDrawer_popup")
    @iOSXCUITFindBy(id = "walletDrawer_popup")
    private lateinit var walletDrawerPopup : WebElement
    fun isWalletPopupDisplayed() = walletDrawerPopup.isDisplayed

    @AndroidFindBy(accessibility = "popup_ok_button")
    @iOSXCUITFindBy(id = "popup_ok_button")
    private lateinit var okButton : WebElement
    fun isOkButtonEnable() = okButton.isEnabled
    fun clickOkButton() = okButton.click()

    @AndroidFindBy(accessibility = "popup_cancel_button")
    @iOSXCUITFindBy(id = "popup_cancel_button")
    private lateinit var cancelButton : WebElement
    fun isCancelButtonEnable() = cancelButton.isEnabled
    fun clickCancelButton() = cancelButton.click()






}
