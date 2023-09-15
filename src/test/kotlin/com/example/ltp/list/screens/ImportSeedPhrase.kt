package com.example.ltp.list.screens

import com.example.ltp.list.Context
import com.example.ltp.list.config.Config
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.junit.experimental.theories.Theories
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import java.io.File

class ImportSeedPhrase (context: Context) : Screen(context) {

    private lateinit var secureWallet: SecureWallet

    @AndroidFindBy(accessibility = "import_seed_phrase_screen")
    @iOSXCUITFindBy(id = "import_seed_phrase_screen")
    private lateinit var importSeedPhraseScreen: WebElement
    fun isImportSeedPhraseScreenDisplayed() = importSeedPhraseScreen.isDisplayed
    //To out keyboard, keycode enter not work
    fun clickScreen() = importSeedPhraseScreen.click()


//    @AndroidFindBy(accessibility = "seed_phrase_input")

    @AndroidFindBy(accessibility = "seed_phrase_textfield")
    @iOSXCUITFindBy(id = "seed_phrase_textfield")
    private lateinit var seedPhraseInput : WebElement
    fun sendSeedPhrase() {
        seedPhraseInput.click()
        val seedPhrase = File("seed-phrase.txt").readText()
        println("Seed Phrase:---" + seedPhrase+"---")
        context.driver.keyboard.pressKey(seedPhrase)
        clickScreen()
        Thread.sleep(4000)

    }

    @AndroidFindBy(accessibility = "confirm_import_seed_phrase_button")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"confirm_import_seed_phrase_button\"])[3]")
    private lateinit var confirmButton : WebElement
    fun isConfirmButtonEnable() = confirmButton.isEnabled
    fun clickConfirmButton() = confirmButton.click()

}
