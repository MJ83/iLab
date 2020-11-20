Feature: Apply on the iLab website

  @Apply
  Scenario Outline: Apply
    Given As a user I launch the iLabQuality web page
    When I click Careers
    And I click South Africa
    And I click first job opening
    And I click Apply Online button
    And I capture Name "<Name>"
    And I capture Email "<Email>"
    And I capture Phone
    And I click Send Application button
    Then I verify error message

    Examples:
      |       Name       |          Email          |
      | Maserole Mokoele | mokoelekelele@gmail.com |