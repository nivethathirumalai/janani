@CancelBooking
Feature: Verifying the Cancel Booking page of Adactin Hotel

  Scenario Outline: Verifying the Cancel booking page of Adactin hotel with created Orderid
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"
    And User should Select a hotel name
    Then User should verify after Select hotel success message "Book A Hotel"
    And User should book a hotel "<firstName>", "<lastName>" and "<address>"
      | ccNo             | ccType           | ccMonth | ccYear | cvvNo |
      | 4234567890987654 | VISA             | March   |   2022 |   123 |
      | 3876543210987654 | Master Card      | June    |   2022 |   456 |
      | 4347839201293478 | American Express | July    |   2022 |   789 |
    Then User should verify after booking success message "Booking Confirmation" and saved Orderid
    And User should cancel created Orderid
    Then User should verify after cancel Orderid success message "The booking has been cancelled."

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom | firstName | lastName | address |
      | greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         | Kar       | mugil    | Chennai |

  Scenario Outline: Verifying the Cancel booking page of Adactin Hotel with existing Orderid
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should cancel existing Orderid "<Orderid>"
    Then User should verify after cancel Orderid success message "The booking has been cancelled."

    Examples: 
      | username   | password | Orderid    |
      | greens8767 | L4R739   | 45DGBMX2AV |
