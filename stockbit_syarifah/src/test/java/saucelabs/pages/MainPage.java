package saucelabs.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import saucelabs.data.SaucelabData;

public class MainPage extends BasePage {

    public MainPage(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public void isOnProductListPage() {
        validateDisplayed("SAUCELAB_PRODUCT_LIST_TITLE", 5);
        validateDisplayed("SAUCELAB_PRODUCT_LIST", 5);
    }

    public void tapOnProduct(String productName) {
        tap().element(constructLocator("SAUCELAB_PRODUCT", productName));
    }

    public void validateProductDetail() {
        validateDisplayed("SAUCELAB_PRODUCT_RATING", 5);
        validateDisplayed("SAUCELAB_PRODUCT_COLOR", 5);
        validateDisplayed("SAUCELAB_PRODUCT_PRICE", 5);
    }

    public void chooseColor(String color) {
        tap().element(constructLocator("SAUCELAB_CHOOSE_COLOR", color));
    }

    public void tapOnQtyBtn(int qty) {
        for (int i = 1; i < qty; i++) {
            tap().element(constructLocator("SAUCELAB_ADD_QTY_BTN", SaucelabData.getProductName()));
    }}

    public void tapOnAddToCartBtn() {
        tap().element("SAUCELAB_ADD_TO_CART_BTN");
    }

    public void tapOnCartIcon() {
        tap().element("SAUCELAB_CART_ICON_BTN");
    }

    public void validateShoppingCartPage() {
        validateDisplayed("SAUCELAB_SHOPPING_CART_PAGE", 5);
        validateDisplayed("SAUCELAB_TOTAL_PRICE", 5);
        validateDisplayed("SAUCELAB_REMOVE_BTN", 5);
    }

    public void tapOnCheckoutBtn() {
        tap().element("SAUCELAB_PROCEED_TO_CHECKOUT_BTN");
    }

    public void validateShippingAddressPage() {
//        delay(3000); //waiting for page displayed
        validateDisplayed("SAUCELAB_SHIPPING_ADDRESS", 5);
    }

    public void fillFullName(String fullName) {
        validateDisplayed("SAUCELAB_FULL_NAME_FIELD", 5);
        type().element("SAUCELAB_FULL_NAME_FIELD", fullName);
    }

    public void fillAddress1(String address) {
        validateDisplayed("SAUCELAB_ADDRESS_1_FIELD", 5);
        type().element("SAUCELAB_ADDRESS_1_FIELD", address);
    }

    public void fillAddress2(String address) {
        validateDisplayed("SAUCELAB_ADDRESS_2_FIELD", 5);
        type().element("SAUCELAB_ADDRESS_2_FIELD", address);
    }

    public void fillCity(String city) {
        validateDisplayed("SAUCELAB_CITY_FIELD", 5);
        type().element("SAUCELAB_CITY_FIELD", city);
    }

    public void fillState(String state) {
        validateDisplayed("SAUCELAB_STATE_FIELD", 5);
        type().element("SAUCELAB_STATE_FIELD", state);
    }

    public void fillZipCode(String zipCode) {
        validateDisplayed("SAUCELAB_ZIP_CODE_FIELD", 5);
        type().element("SAUCELAB_ZIP_CODE_FIELD", zipCode);
    }

    public void fillCountry(String country) {
        validateDisplayed("SAUCELAB_COUNTRY_FIELD", 5);
        type().element("SAUCELAB_COUNTRY_FIELD", country);
    }

    public void tapOnPaymentBtn() {
        tap().element("SAUCELAB_PAYMENT_BTN");
    }

    public void validateCheckoutPage() {
        validateDisplayed("SAUCELAB_CHECKOUT_PAGE", 5);
    }

    public void fillCardNumber(String cardNumber) {
        validateDisplayed("SAUCELAB_CARD_NUMBER_FIELD", 5);
        type().element("SAUCELAB_CARD_NUMBER_FIELD", cardNumber);
    }

    public void fillExpDate(String expDate) {
        validateDisplayed("SAUCELAB_EXP_DATE_FIELD", 5);
        type().element("SAUCELAB_EXP_DATE_FIELD", expDate);
    }

    public void fillSecurityCode(String securityCode) {
        validateDisplayed("SAUCELAB_SECURITY_CODE", 5);
        type().element("SAUCELAB_SECURITY_CODE", securityCode);
    }

    public void tapOnReviewOrderBtn() {
        tap().element("SAUCELAB_REVIEW_ORDER_BTN");
    }

    public void validateReviewOrderPage() {
        validateDisplayed("SAUCELAB_REVIEW_ORDER_PAGE", 5);
        validateDisplayed("SAUCELAB_ADDRESS_REVIEW", 5);
        validateDisplayed("SAUCELAB_TOTAL_PAYMENT", 5);
    }

    public void tapOnPlaceOrderBtn() {
        tap().element("SAUCELAB_PLACE_ORDER_BTN");
    }

    public void validateTransactionSuccess() {
        validateDisplayed("SAUCELAB_TRANSACTION_SUCCESS_MESSAGE", 5);
        validateDisplayed("SAUCELAB_CONTINUE_SHOPPING_BTN", 5);
    }
}