Feature: Buscar viaje de Medellin a bogota

  @SmokeTest
  Scenario Outline: Busqueda exitosa de viaje de medellin a bogota
    Given Dado que estoy en la pagina de Pinbus
    When cuando busco un viaje de "<origen>" con destino "<value>" en el buscador
    Then verifico que la pagina de busqueda muestre lo que deseo

    Examples: 
      | origen | value    |
      | bogota | medellin |
