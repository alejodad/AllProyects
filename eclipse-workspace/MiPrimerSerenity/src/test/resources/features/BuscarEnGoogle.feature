Feature: Busqueda en Google
  Yo como usuario de la web quiero  realizar una busqueda en google

  @SmokeTest
  Scenario Outline: Busqueda exitosa en google
    Given Dado que el sujeto esta en la pagina de inicio de Google
    When El busca una "<word>"concatenada "<wordtwo>"
    Then verifica que la "<expected>" se encuentre alli  

    Examples: 
      | word              | wordtwo | expected               |
      | swithc            | hello   | swithc hello           |
      | chopos            | world   | chopos                 |
      | sdfsdlfkjerlkjlsd | tree    | sdfsdlfkjerlkjlsd tree |

