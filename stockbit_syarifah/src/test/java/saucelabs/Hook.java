package saucelabs;

import id.aldochristiaan.salad.Salad;
import id.aldochristiaan.salad.util.Driver;
import id.aldochristiaan.salad.util.LogLevel;
import id.aldochristiaan.salad.util.PropertiesLoader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


import java.util.Properties;

public class Hook {

    private static Salad salad; // Automation Engine
    private static AndroidDriver<AndroidElement> androidDriver;
    public static Saucelab saucelab;

    @BeforeAll
    public static void setUp() { // To start appium server and inject elements
        String elementPropertiesDirectory = "src/test/resources/elements/"; // Element properties file
        String capabilitiesFileName = "capabilities.properties";
        Properties capabilitiesProperties = PropertiesLoader.loadCapabilities(capabilitiesFileName);
        // You can choose other constructor to run automation
        salad = new Salad(
                capabilitiesProperties,
                elementPropertiesDirectory,
                Driver.UIAUTOMATOR2,
                LogLevel.DEBUG
        );
        salad.start();
        androidDriver = salad.getAndroidDriver();
        saucelab = new Saucelab(androidDriver);
    }

    @AfterAll
    public static void tearDown() {
        salad.stop(Driver.UIAUTOMATOR2);
    }
}
