Feature: Registro de usuario nuevo

  @tag2
  Scenario Outline: Formulario de registro de usuario
    Given open browser and type web page
    When fill camps tell us about yourself
    When fill "name" camps and "lastname" input
    When fill camps add your adress "email@real.com" input
    When fill tell us about "device" devices
    When type "model" and type "opertative"
    When create valid "password" password
    Then send and complete

    Examples: 
      | name   | lastname | email             | device | model | opertative | password |
      | eduart | smith    | josmt@nodomain.uh | HP     | Veer  | WebOsS 2.2 | 321n2h1j |
