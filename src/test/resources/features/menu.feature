Feature: Menu for users on the page

  Background:
    Given The user open the URL
    And Enter the user and password ok and click to dominio button
    When The user click in the button Ingresar

  Scenario: The admin add the new user
    Given The user click the admin button and click button add
    When The user fill the user dates and click button save
    Then User add succesfully

  Scenario: The admin modify the user
    Given The user click the admin button and fill the username and click button search
    When The user click the edit button and fill the user dates and click button save
    Then User modify succesfully

  Scenario: The admin delete the user
    Given The user click the admin button and fill the username and click button search
    When The user click the delete button and click button sure delete
    Then User delete succesfully