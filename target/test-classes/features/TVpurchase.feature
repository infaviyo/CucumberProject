#Author: viyola.email@your.domain.com
@TV
Feature: Mobile purchase
  I want to use this template for my feature file

  Background:
  Given user launches flipkart application
  And user Login into flipkart
  Scenario: TV scenario

When user search TV
And user choose the TV and doing payment
Then user receive order confirmation message

  Scenario: TV scenario one dim list
    

When user search TV by useing one dim list
|realme|Smsung|MiTV|
And user choose the TV and doing payment
Then user receive order confirmation message

 Scenario: TV scenario one dim map
 
When user search TV by useing one dim Map
|phone1|realme|
|phone2|Samsung|
|phone3|MiTV|
And user choose the TV and doing payment
Then user receive order confirmation message

Scenario Outline:All TV

When user search TV"<TV>"
And user choose the TV and doing payment
Then user receive order confirmation message

Examples:
|TV|
|realme|
|samsung|
|miTV|