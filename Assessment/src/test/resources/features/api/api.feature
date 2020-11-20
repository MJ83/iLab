Feature: API Automation with REST ASSURED

  @SearchForRandomBreed
  Scenario: Search for random breed
    Given User access the API
    When  User search for random breed
    Then  User should be presented with successful message


  @VerifyBulldog
  Scenario Outline: Verify bulldog
    Given User access the API
    When  User verify dog breed "<Breed>" is on the list
    Then  User should be successful response

    Examples:
     |  Breed    |
     | bulldog   |

  @RetrieveSubBreed
  Scenario:  Retrieve sub-breed
    Given User access the API
    When  User retrieve all sub-breeds for bulldogs
    Then  User should get the list and images