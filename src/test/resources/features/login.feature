@Test
Feature: User login

  Scenario: Enter login wrong
    Given The user open the URL
    And Enter the user and password and click to dominio button
    When The user click in the button Ingresar
    Then The user will be see the welcome page

  Scenario: Enter login empty user
    Given The user open the URL
    And Enter the empty user and password and click to dominio button
    When The user click in the button Ingresar
    Then The user will be see the required page

  Scenario: Enter login empty password
    Given The user open the URL
    And Enter the user and password empty and click to dominio button
    When The user click in the button Ingresar
    Then The user will be see the password required page

  Scenario: Enter login ok
    Given The user open the URL
    And Enter the user and password ok and click to dominio button
    When The user click in the button Ingresar
    Then The user will be see the OK page