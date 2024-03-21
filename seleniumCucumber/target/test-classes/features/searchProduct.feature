Feature: Search and Place the order for products


Scenario: Search Experience for product search in both home and offers page


Given User is on GreenKart page 
When User searched with shortname "tom" and extracted actual name of product 
Then User searche for shortname "tom" in offers page to check if product exist



