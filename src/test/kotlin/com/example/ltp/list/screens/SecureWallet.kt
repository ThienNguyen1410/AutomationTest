package com.example.ltp.list.screens

import com.example.ltp.list.Context
import com.example.ltp.list.config.Config
import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSXCUITFindBy
import org.openqa.selenium.WebElement
import java.io.File
import javax.print.attribute.standard.JobOriginatingUserName

class SecureWallet (context: Context) : Screen(context) {

    private var seedPhrase : String = ""

    @AndroidFindBy(accessibility = "create_secure_wallet_screen")
    @iOSXCUITFindBy(id = "create_secure_wallet_screen")
    private lateinit var createSecureWalletScreen : WebElement
    fun isCreateSecureWalletScreenDisplayed() = createSecureWalletScreen.isDisplayed

    @AndroidFindBy(accessibility = "create_secure_wallet_continue_button")
    @iOSXCUITFindBy(id = "create_secure_wallet_continue_button")
    private lateinit var continueButton : WebElement
    fun clickContinueButton() = continueButton.click()

    @AndroidFindBy(accessibility = "reveal_seed_phrase")
    @iOSXCUITFindBy(id = "reveal_seed_phrase")
    private lateinit var reveal : WebElement
    fun revealSeedPhrase() = reveal.click()

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
    @iOSXCUITFindBy(id = "seed_view1")
    private lateinit var seedPhrase1: WebElement
    fun getSeedPhrase1() {
        val re = Regex("[0-9. ]+")
        var seed = re.replace(seedPhrase1.text,"")
        seedPhrase = "$seedPhrase$seed"
        println(seed)

    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    @iOSXCUITFindBy(id = "seed_view2")
    private lateinit var seedPhrase2: WebElement
    fun getSeedPhrase2() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase2.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[3]")
    @iOSXCUITFindBy(id = "seed_view3")
        private lateinit var seedPhrase3: WebElement
        fun getSeedPhrase3() {
            val re = Regex("[0-9. ]")
            var seed = re.replace(seedPhrase3.text,"")
            seedPhrase = "$seedPhrase $seed"
            println(seed)
        }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")
    @iOSXCUITFindBy(id = "seed_view4")
    private lateinit var seedPhrase4: WebElement
    fun getSeedPhrase4() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase4.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[5]")
    @iOSXCUITFindBy(id = "seed_view5")
    private lateinit var seedPhrase5: WebElement
    fun getSeedPhrase5() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase5.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[6]")
    @iOSXCUITFindBy(id = "seed_view6")
    private lateinit var seedPhrase6: WebElement
    fun getSeedPhrase6() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase6.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[7]")
    @iOSXCUITFindBy(id = "seed_view7")
    private lateinit var seedPhrase7: WebElement
    fun getSeedPhrase7() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase7.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[8]")
    @iOSXCUITFindBy(id = "seed_view8")
    private lateinit var seedPhrase8: WebElement
    fun getSeedPhrase8() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase8.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[9]")
    @iOSXCUITFindBy(id = "seed_view9")
    private lateinit var seedPhrase9: WebElement
    fun getSeedPhrase9() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase9.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[10]")
    @iOSXCUITFindBy(id = "seed_view10")
    private lateinit var seedPhrase10: WebElement
    fun getSeedPhrase10() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase10.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[11]")
    @iOSXCUITFindBy(id = "seed_view11")
    private lateinit var seedPhrase11: WebElement
    fun getSeedPhrase11() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase11.text,"")
        seedPhrase = "$seedPhrase $seed"
        println(seed)
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"create_secure_wallet_screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[12]")
    @iOSXCUITFindBy(id = "seed_view12")
    private lateinit var seedPhrase12: WebElement
    fun getSeedPhrase12() {
        val re = Regex("[0-9. ]")
        var seed = re.replace(seedPhrase12.text,"")
        seedPhrase = "$seedPhrase $seed"
        println("---$seedPhrase---")
        saveSeedPhrase(seedPhrase)
    }

    fun saveSeedPhrase(seedPhrase : String) {
        File("seed-phrase.txt").writeText(seedPhrase)
    }
}
