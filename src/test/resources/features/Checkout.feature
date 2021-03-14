Feature: Automated End2End Test
  A User should be able to browse the shop,
  search for the product,
  put an item in the cart,
  proceed to checkout,
  pick up a collection point

@Regression
Scenario:User goes to the homepage and search for product , add product to cart and checkout
  Given user is on the homepage
  And select UK as delivery location and accept tracking cookie
  And the page should display the search box
  When type the word "running" in search box
  Then user is navigated to the  search page
  And Choose to buy the first product from PLP page
  Then verify product page by checking url and product name
  When pick any size and click on Add to Bag button
  Then verify product is added to bag successfully
  When click on view bag button
  And navigate to the cart page
  Then verify the cart page by the title "Your Bag"
  When click on the checkout button
  Then user is navigated to the delivery page
  And from the Get Your Order module click on From A Collection Point
  When type "London" in the location text box
  And click Search for Collection Points button
  Then it should navigate to store location model
  When from the list of store, pick "New Oxford Street" collection point
  Then verify that correct collection point is selected


