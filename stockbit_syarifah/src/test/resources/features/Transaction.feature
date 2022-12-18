Feature: Create transaction
  Scenario: User successfully buy items
    Given user is on product list
    When user tap on product "Sauce Lab Back Packs"
    Then user see product detail page
    When user choose "Blue color"
    And user add qty "2" via plus button
    And user tap on Add to cart button
    And user tap on cart icon
    Then user see shopping cart
    When user tap on proceed to checkout button
    Then user see login page
    And user fill username "bod@example.com"
    And user fill password "10203040"
    When user tap on login button
    Then user see form shipping address
    When user fill full name "Syarifah Zhuhra"
    And user fill address line 1 "Jl Narogong Sakti"
    And user fill address line 2 "Taman Narogong Indah"
    And user fill city "Bekasi"
    And user fill state "Jawa Barat"
    And user fill zip code "17115"
    And user fill country "Indonesia"
    And user tap on to payment button
    Then user see checkout page
    When user fill username "Syarifah Zura"
    And user fill card number "12345678910"
    And user fill expiration date "1223"
    And user fill security code "123"
    And user tap on review order button
    Then user see review order page
    When user tap on Place Order button
    Then user see transaction is success