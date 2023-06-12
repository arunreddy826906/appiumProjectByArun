Feature: Sample Feature1

Background:
Given open browser
When launch site "https://www.google.com"

Scenario: Scenario1
Then page should contains "google" title
Then close site 

Scenario: Scenario2
Then get google page source
Then close site