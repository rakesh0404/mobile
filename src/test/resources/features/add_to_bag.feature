Feature: Search

  As a customer
  I want to search for a product
  So that I can buy or add a product to bag

  @demo
  Scenario: Add to bag and proceed to checkout without login
    When I search for a product "tops"
    And I add product to bag
    And I go to bag
    Then I see signIn screen is displayed

  @wip
  Scenario: Collect items at nearest store
    When I search for a product "tops"
    And I add product to bag
    And I go to bag
    And I do signIn
    Then I see delivery type screen
    # And I go to checkout
     #Then I see sign is displayed
