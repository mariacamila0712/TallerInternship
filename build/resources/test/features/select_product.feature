Feature: go to the Linio.com.co page and enter the Home category and select a product from the mattresses section
  Me as a user of the application Linio.com.co
  I need to select a product
  to add it to the shopping cart and when removing them show a message

  Scenario: Add products to cart
    Given the user is in the application https://www.linio.com.co/
    And the user enters the Home category and selects the Mattresses, Bed Bases and Pillows section
    When the user selects the product Super Mega Combo Blue Queen 160x190 Spring Marshall
    And the user adds 3 products to the cart
    And the user clicks "Go to cart"
    Then the user should check the order summary


  Scenario: Remove products from cart
    Given the user is in the application https://www.linio.com.co/
    When the user selects the shopping cart
    Then the user removes the products from the shopping cart
    And the user sees the message "There are no products in your cart"
