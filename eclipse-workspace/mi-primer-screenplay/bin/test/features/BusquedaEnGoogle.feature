Feature: Search in google with data from feature
  Arthur quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given arthur esta en el sitio de google
    When el busca la frase compuesta
      | cadenaUno | cadenaDos    |
      | <palabra> | <palabrados> |
    Then el verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados | resultadoEsperado    |
      | switch           | uno        | switch uno           |
      | sophos solutions | dos        | sophos solutions dos |
      | hola             | tres       | kjadshkjashdkjhaskjd |
