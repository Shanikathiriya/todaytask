@SecondOperations
Feature: additon of given digit

  Scenario Outline: sum of digit
    Given when passed the  <input>
    Then it returns  addition of <expectedCount>
    Examples:
      | input | expectedCount |
      | -12345 | 15            |
      | -11111 | 5             |
      | -22222 | 10            |


