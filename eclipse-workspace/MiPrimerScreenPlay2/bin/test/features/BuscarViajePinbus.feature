Feature: Buscar viaje de Medellin a bogota

  @SmokeTest
  Scenario: Busqueda exitosa de viaje de bogota a medellin
    Given El esta en la pagina principal de Pinbus
    When El busca el viaje con los parametros dados
      | strRutaIda | strRutaRgreso | strDiaIdA | strMesIda | srtAnoIda | strDiaRegreso | strMesRegreso | strAnoRegrso |
      | bogota  | medellin, ant  |        15 | abril     |      2019 |               |               |              |
    Then El verifica el resultado
