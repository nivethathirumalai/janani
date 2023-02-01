@SelectHotel
Feature: Verifying the Select Hotel page of Adactin Hotel

  Scenario Outline: Verifying the Select hotel page of Adactin hotel
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"
    And User should Select a hotel name
    Then User should verify after Select hotel success message "Book A Hotel"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom |
      | greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         |

  Scenario Outline: Verifying the Select hotel page of Adactin Hotel without Select a hotel
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"
    And User should click continue without select any hotel name
    Then User should verify after Select hotel error mesage "Please Select a Hotel"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom |
      | greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         |
