@Smoke
Feature: Como usuario del sistema quiero interactuar con la aplicacion para registrar las horas de trabajo

  Scenario Outline: Login exitoso
    Given Estar en la pagina de login
    When el usuario se loguea con <email> y <password>
    Then se visualiza la pagina principal

    Examples:
      | email                    | password |
      | albagaitan.fsk@gmail.com | alba1234 |

  Scenario Outline: Cargar horas exitosamente y asociar un proyecto
    Given Estar en la pagina de login
    And el usuario se loguea con <email> y <password>
    And hace click en el signo mas
    And hace click en start time
    When carga horas de inicio y de fin
    And hace click en guardar
    And selecciona un proyecto
    And hace click en guardar
    Then se verifica que las horas se cargaron exitosamente

    Examples:
      | email                    | password |
      | albagaitan.fsk@gmail.com | alba1234 |





