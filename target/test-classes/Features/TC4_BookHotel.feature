Feature: Verifying the Book Hotel page of Adactin Hotel

  Scenario Outline: Verifying the Book hotel page of Adactin hotel
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
    Then User should verify after booking success message "Booking Confirmation"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom | firstName | lastName | address |
      | greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         | Kar       | mugil    | Chennai |

  @BookHotel
  Scenario Outline: Verifying the Book hotel page of Adactin Hotel without Select any fields
    Given User is on the Adactin Hotel Page
    When User should perfom login "<username>","<password>"
    Then User should verify after login success message "Hello Greens8767!"
    And User should Search hotels by selecting all the fields using "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    Then User should verify after Search hotel success message "Select Hotel"
    And User should Select a hotel name
    Then User should verify after Select hotel success message "Book A Hotel"
    And User should click book hotel without entering any fields
    Then User should verify without enter any fields while booking error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username   | password | location | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom |
      | greens8767 | L4R739   | Sydney   | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         |
