@uno
Feature: Inicio de sesion
  yo como usuario de google quiero ser capaz de iniciar sesion en gmail

  @smokeTest
  Scenario Outline: Envio de correo gmail
    Given puede entrar a la pagina de inicio de sesion de gmail
    When inicie sesion en google con las credenciales
      | user   | password   |
      | <user> | <password> |
    Then Deberia ver mi sesion iniciada

    Examples: 
      | user            | password    | destinatario                 | asunto |
      | vivaserenity123 | Serenity123 | arturo.castllo1218@gmail.com | PRUEBA |
