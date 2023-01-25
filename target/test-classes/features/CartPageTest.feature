Feature: Testing of Cart Page Functionalities
Background:
  Given user open website
  Then verify user is on login page
  When user enter the valid credentials
  Then verify home page is displayed
  When user search with TV
  Then verify user is on product listing page
  When user click on the first product from the list
  Then verify user is on product detail page
  When user click on add to cart button
  Then verify cart page is displayed

  @smoke @regression
  Scenario: Verify user can add item into cart
    And verify item on the cart page

  @regression
  Scenario: Verify user can remove item from cart
    When user remove item from the cart
    Then verify no item present in the cart
  @smoke
  Scenario: Verify user can change quantity on the page
    When user change quantity of the item
    When verify total quantity updated on the cart
