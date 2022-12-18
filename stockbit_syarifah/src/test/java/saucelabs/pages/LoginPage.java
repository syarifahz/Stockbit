package saucelabs.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public void validateLoginPage() {
        validateDisplayed("SAUCELAB_LOGIN_PAGE", 5);
    }

    public void fillUsername(String username) {
        validateDisplayed("SAUCELAB_LOGIN_USERNAME", 5);
        type().element("SAUCELAB_LOGIN_USERNAME", username);
    }

    public void fillPassword(String password) {
        validateDisplayed("SAUCELAB_LOGIN_PASSWORD", 5);
        type().element("SAUCELAB_LOGIN_PASSWORD", password);
    }

    public void tapOnLoginBtn() {
        tap().element("SAUCELAB_LOGIN_BTN");
    }
}
