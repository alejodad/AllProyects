Feature: Search in google with data feature
  Alejandro wants makes a search in google with parameters

  @SmokeTest
  Scenario Outline: Search in Google
    Given he is in Google home page
    When he search "<word>" in googlemcompuest "<wordtwo>"
    Then he verifies thath "<expected>" results be in search

    Examples: 
      | word              | wordtwo | expected               |
      | swithc            | hello   | swithc hello           |
      | chopos            | world   | chopos                 |
      | sdfsdlfkjerlkjlsd | tree    | sdfsdlfkjerlkjlsd tree |
