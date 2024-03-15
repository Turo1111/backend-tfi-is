Feature: Consultar un artículo por su código
  Como vendedor
  Quiero consultar un articulo por su codigo
  Para ver los detalles del articulo

  Scenario: Consultar un artículo existente
    Given existe un artículo con el código "1" en la base de datos
    When se consulta el artículo con el código "1"
    Then se devuelve el artículo con la información correspondiente
