Feature: Sample feature3

  Scenario: Sample scenario4
    Given open browser
    When launch site "https://www.google.com"
    Then search a word and click enter key and check page title
      | word        |
      | Virat Kohli |
      | Ganguly     |
    Then close site

  Scenario: Sample scenario5
    Then register an account and check a/c number
      | firstname | lastname | age | location |
      | steve     | jobs     |  88 | USA      |
      | Karan     | Chetan   |  55 | Hyd      |
