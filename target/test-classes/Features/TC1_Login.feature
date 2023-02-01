@Login
Feature: Verifying Adactin Hotel Login Details

  Scenario Outline: Verifying Adactin Hotel login Valid
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adactin Hotel login using Enter
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>" with Enter Key
    Then User should verify after login success message "Hello Greens8767!"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adactin Hotel login Invalid Credentials
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then user should verify after login with invalid credential error message contains "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | username    | password   |
      | Greens84973 | L4R7FD9435 |
