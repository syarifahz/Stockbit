package saucelabs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import saucelabs.pages.LoginPage;
import saucelabs.pages.MainPage;

public class Saucelab {

    private AndroidDriver<AndroidElement> androidDriver;

    public Saucelab(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
    }

    public MainPage mainPage() {
        return new MainPage(androidDriver);
    }

    public LoginPage loginPage() {
        return new LoginPage(androidDriver);
    }
}
