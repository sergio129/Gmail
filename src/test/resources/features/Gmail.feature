Feature: Iniciar sesion sesion en gmail


  @Test1
  Scenario: Validar exitosamente el inicio de sesion en gmail
    Given Ingresamos a la pagina de gmail
    When Ingresamos usuario y contrasena
    Then Validamos que se muestre el menu "Inicio"


