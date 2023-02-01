@SearchHotel
Feature: Verifying the Search Hotel page of Adactin Hotel

  Scenario Outline: Verifying the Search page of Adactin hotel by selecting all the fields
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom |
      | Greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         |

  Scenario Outline: Verifying the Search page of Adactin Hotel by selecting only manatory fields
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should enter only mandatory fields in Search hotels  "<location>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>" and "<AdultPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"

    Examples: 
      | username   | password | location | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom |
      | Greens8767 | L4R739   | Sydney   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      |

  Scenario Outline: Verifying the Search page of Adactin Hotel by Invalid date
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after enter invalid date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom |
      | Greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 10/10/2023  | 12/10/2022   | 2 - Two      | 1 - One         |

  Scenario Outline: Verifying the Search page of Adactin Hotel without entering any fields
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should click Search button without selecting any fields
    Then User should verify location error messgage  after Search "Please Select a Location"

    Examples: 
      | username   |  | password |
      | Greens8767 |  | L4R739   |
