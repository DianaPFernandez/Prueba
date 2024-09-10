Feature: probar el registro
  
  Scenario: ingresar al formulario
    Given abrir el navegador
    And seleccionar el boton registrar
    When ingresar formulario
    Then guardar informacion

  