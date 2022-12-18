package saucelabs.test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static saucelabs.Hook.saucelab;

public class SaucelabTest {
    
    @Given("user is on product list")
    public void isOnProductListPage() {
        saucelab.mainPage().isOnProductListPage();
    }

    @When("^user tap on product \"([^\"]*)\"")
    public void userTapOnItem(String productName) {
        saucelab.mainPage().tapOnProduct(productName);
    }
    
    @Then("user see product detail page")
    public void userSeeProductDetail() {
        saucelab.mainPage().validateProductDetail();
    }
    
    @When("^user choose \"([^\"]*)\"")
    public void userChooseColor(String color) {
        saucelab.mainPage().chooseColor(color);
    }

    @And("^user add qty \"([^\"]*)\" via plus button")
    public void userAddQty(String qty) {
        saucelab.mainPage().tapOnQtyBtn(Integer.valueOf(qty));
    }

    @And("user tap on Add to cart button")
    public void userAddtoCart() {
        saucelab.mainPage().tapOnAddToCartBtn();
    }

    @And("user tap on cart icon")
    public void userTapCartIcon() {
        saucelab.mainPage().tapOnCartIcon();
    }

    @Then("user see shopping cart")
    public void userSeeShoppingCart() {
        saucelab.mainPage().validateShoppingCartPage();
    }

    @When("user tap on proceed to checkout button")
    public void userGoToCheckoutBtn() {
        saucelab.mainPage().tapOnCheckoutBtn();
    }
    
    @Then("user see login page")
    public void userSeeLoginPage() {
        saucelab.loginPage().validateLoginPage();
    }

    @And("^user fill username \"([^\"]*)\"")
    public void userFillUsername(String username) {
        saucelab.loginPage().fillUsername(username);
    }

    @And("^user fill password \"([^\"]*)\"")
    public void userFillPassword(String password) {
        saucelab.loginPage().fillPassword(password);
    }

    @When("user tap on login button")
    public void userTapOnLoginBtn() {
        saucelab.loginPage().tapOnLoginBtn();
    }     

    @Then("user see form shipping address")
    public void userSeeShippingAddress() {
        saucelab.mainPage().validateShippingAddressPage();
    }

    @When("^user fill full name \"([^\"]*)\"")
    public void userFillFullName(String fullName) {
        saucelab.mainPage().fillFullName(fullName);
    }

    @And("^user fill address line 1 \"([^\"]*)\"")
    public void userFillAddress1(String address) {
        saucelab.mainPage().fillAddress1(address);
    }

    @And("^user fill address line 2 \"([^\"]*)\"")
    public void userFillAddress2(String address) {
        saucelab.mainPage().fillAddress2(address);
    }

    @And("^user fill city \"([^\"]*)\"")
    public void userFillCity(String city) {
        saucelab.mainPage().fillCity(city);
    }

    @And("^user fill state \"([^\"]*)\"")
    public void userFillState(String state) {
        saucelab.mainPage().fillState(state);
    }

    @And("^user fill zip code \"([^\"]*)\"")
    public void userFillZipCode(String zipCode) {
        saucelab.mainPage().fillZipCode(zipCode);
    }

    @And("^user fill country \"([^\"]*)\"")
    public void userFillCountry(String country) {
        saucelab.mainPage().fillCountry(country);
    }

    @And("user tap on to payment button")
    public void userTapOnPayment() {
        saucelab.mainPage().tapOnPaymentBtn();
    }

    @Then("user see checkout page")
    public void userSeeCheckoutPage() {
        saucelab.mainPage().validateCheckoutPage();
    }

    @And("^user fill card number \"([^\"]*)\"")
    public void userFillCardNumber(String cardNumber) {
        saucelab.mainPage().fillCardNumber(cardNumber);
    }

    @And("^user fill expiration date \"([^\"]*)\"")
    public void userFillExpDate(String expDate) {
        saucelab.mainPage().fillExpDate(expDate);
    }

    @And("^user fill security code \"([^\"]*)\"")
    public void userFillSecurityCode(String securityCode) {
        saucelab.mainPage().fillSecurityCode(securityCode);
    }

    @And("user tap on review order button")
    public void userTapOnReviewOrderBtn() {
        saucelab.mainPage().tapOnReviewOrderBtn();
    } 

    @Then("user see review order page")
    public void userSeeReviewOrderPage() {
        saucelab.mainPage().validateReviewOrderPage();
    }

    @When("user tap on Place Order button")
    public void userTapOnPlaceOrderBtn() {
        saucelab.mainPage().tapOnPlaceOrderBtn();
    }

    @Then("user see transaction is success")
    public void userTransactionSuccess() {
        saucelab.mainPage().validateTransactionSuccess();
    }
}