package com.example.ltp.list

import com.example.ltp.list.config.Config
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.MobileCapabilityType
import io.appium.java_client.remote.MobilePlatform
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class DriverFactory {

    companion object {
        val context = Context()

        private val serviceUrl = URL("http://127.0.0.1:4723/wd/hub")


        fun createDriver(): AppiumDriver {
            if (Config.device == "iOS") {

                val capabilities = DesiredCapabilities().apply {
                    setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS)
                    setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5")
                    setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13")
                    setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest")
                    setCapability(
                        MobileCapabilityType.APP,
                        "/Users/Thien/Library/Developer/Xcode/DerivedData/wallet-bxuyjrnhvgfulrfadrzuqubhslyl/Build/Products/Debug-iphonesimulator/YoVerse.dev.app"
                    )
//                    setCapability("autoAcceptAlerts", "true");
                    setCapability("autoDismissAlerts", "true");
                    setCapability(MobileCapabilityType.NO_RESET, true)
                    setCapability(MobileCapabilityType.FULL_RESET, false)
                }

                return IOSDriver(serviceUrl, capabilities)
            } else {
                val capabilities = DesiredCapabilities().apply {
                    setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID)
                    setCapability(MobileCapabilityType.PLATFORM_VERSION, "10")
                    setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator")
//                    setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi")
                    setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
//                    setCapability(MobileCapabilityType.APP, "/Users/Thien/Apk/VngWallet.apk")
                    setCapability(MobileCapabilityType.FULL_RESET, false)
                    setCapability(MobileCapabilityType.NO_RESET, true)
                    setCapability("autoAcceptAlerts", "true"); //to dismiss all alerts
                }
                return AndroidDriver(serviceUrl, capabilities)
            }
        }

    }

}
