Feature: test cart
Scenario: The one where user moves to cart without adding any item in it
Given Alex has registered in TestMeApp
When Alex Search a particular producvt like headphones
And try to proceed to payment without adding any item in the cart
Then TestMeApp doesn't display the cart icon