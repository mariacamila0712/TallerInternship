Feature: ingresar a la pagina Linio.com.co y entrar a la categoria Hogar y seleccionar un producto de la seccion colchones
  Yo como usuario de la aplicacion Linio.com.co
  necesito seleccionar un producto
  para agregarlo al carrito de compras

  Scenario: Agregar productos al carrito
    Given el usuario se encuentra en la aplicacion https://www.linio.com.co/
    And el usuario ingresa categoria Hogar y selecciona la seccion de Colchones, Base Camas y Almohadas
    When el usuario selecciona el producto Super Mega Combo Blue Queen 160x190 Spring Marshall
    And el usuario agrega 3 productos al carrito
    And el usuario hace clic en "Ir al carrito"
    Then el usuario debe verificar el resumen del pedido


  Scenario: Eliminar productos del carrito
    Given el usuario se encuentra en la aplicacion https://www.linio.com.co/
    When el usuario selecciona el carrito de compras
    Then el usuario elimina los productos del carrito de compras
    And el usuario ve el mensaje "No hay productos en tu carrito"
    