package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class CreateWallet (context: Context) : Screen(context){

    @AndroidFindBy(accessibility = "create_wallet_screen")
    @iOSXCUITFindBy(id = "create_wallet_screen")
    private lateinit var createWalletScreen : WebElement
    fun isCreateWalletScreenDisplayed() = createWalletScreen.isDisplayed

    @AndroidFindBy(accessibility = "basic_checkbox")
    @iOSXCUITFindBy(id = "basic_checkbox")
    private lateinit var basicCheckBox : WebElement
    fun isBasicCheckBoxTicked() = basicCheckBox.isSelected

    @AndroidFindBy(accessibility = "advanced_checkbox")
    @iOSXCUITFindBy(id = "advanced_checkbox")
    private lateinit var advancedCheckBox : WebElement
    fun tickAdvancedCheckBox() = advancedCheckBox.click()

    @AndroidFindBy(accessibility = "create_wallet_continue_button")
    @iOSXCUITFindBy(id = "create_wallet_continue_button")
    private lateinit var createWalletContinueButton : WebElement
    fun clickContinueButton() = createWalletContinueButton.click()




}
