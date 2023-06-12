Feature: Sample feature2

  Scenario Outline: Sample scenario3
    Given open browser
    When launch site "https://www.google.com"
    And search "<word>" and click enter key
    Then page contains "<word>" as title
    Then close site

    Examples: 
      | word        |
      | abdul kalam |
      | Sehwag      |
