package com.example.ltp.list.screens

import com.example.ltp.list.Context
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement

class WelcomeBack (context: Context) : Screen(context) {
    @AndroidFindBy(accessibility = "welcome_back_screen")
    @iOSXCUITFindBy(id = "welcome_back_screen")
    private lateinit var welcomeBackScreen : WebElement
    fun isWelcomeBackScreenDisplayed() = welcomeBackScreen.isDisplayed

    @AndroidFindBy(accessibility = "import_seed_phrase_button")
    @iOSXCUITFindBy(id = "import_seed_phrase_button")
    private lateinit var importSeedPhraseButton : WebElement
    fun isImportSeedPhraseButtonEnable() = importSeedPhraseButton.isEnabled
    fun clickImportSeedPhraseButton() = importSeedPhraseButton.click()

    @AndroidFindBy(accessibility = "sync_data_button")
    private lateinit var syncDataButton : WebElement
    fun isSyncDataButtonEnable() = syncDataButton.isEnabled

}
