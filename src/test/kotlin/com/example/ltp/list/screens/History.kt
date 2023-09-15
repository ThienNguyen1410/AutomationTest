package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class History (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "history_screen")
    @iOSXCUITFindBy(id = "history_screen")
    private lateinit var historyScreen : WebElement
    fun isHistoryScreenDisplayed() = historyScreen.isDisplayed


}
