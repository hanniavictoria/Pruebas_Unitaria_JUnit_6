# PRUEBAS UNITARIAS JAVA JUnit6.
# Cálculo de compras y descuentos

## 1. Descripción del problema

El programa consiste en una calculadora de compras para una tienda en línea, desarrollada en Java.
Su objetivo es calcular el subtotal de una compra, verificar si una compra es válida, determinar si 
corresponde aplicar un descuento del 10 % y calcular el precio final que debe pagar el cliente.

Para comprobar su funcionamiento se utilizan pruebas unitarias con JUnit 6, que permiten verificar 
los resultados de cada método y detectar posibles errores en los cálculos. Estas pruebas son 
importantes porque un error podría provocar que un cliente pague una cantidad incorrecta.

## 2. Reglas de negocio

El programa utiliza cuatro métodos para realizar los cálculos de una compra:

**1. Cálculo del subtotal (`calculateSubtotal`)**
Multiplica el precio de un producto por la cantidad solicitada.
Por ejemplo, si un producto cuesta 100 y se compran 3 unidades, el subtotal es 300.

**2. Validación de la compra (`isValidPurchase`)**
Verifica que el precio del producto y la cantidad sean mayores que cero.
Si ambas condiciones se cumplen, devuelve `true`. En caso contrario, devuelve `false`.

**3. Cálculo del descuento (`calculateDiscount`)**
Si el subtotal es igual o superior a 1,000, se aplica un descuento del 10 %.
Si el subtotal es menor a 1,000, no se aplica ningún descuento.

**4. Cálculo del precio final (`calculateFinalPrice`)**
Calcula el importe que debe pagar el cliente restando el descuento al subtotal.
Este método reutiliza `calculateDiscount` para obtener el descuento correspondiente.

## 3. Casos de prueba

Se realizaron pruebas unitarias utilizando JUnit 6 para verificar el funcionamiento de los cuatro 
métodos de la calculadora de compras. Se utilizaron 16 comprobaciones agrupadas en 4 métodos de prueba. 
Los casos seleccionados permiten verificar operaciones normales, valores inválidos y los límites de 
aplicación del descuento.

| Método | Datos de entrada | Resultado esperado | Resultado obtenido | Propósito |
|---|---|---|---|---|
| calculateSubtotal | 100, 3 | 300 | 300 | Comprobar el cálculo del subtotal. |
| calculateSubtotal | 500, 5 | 2500 | 2500 | Verificar una compra de varios productos. |
| calculateSubtotal | 600, 1 | 600 | 600 | Comprobar una compra de un solo producto. |
| calculateSubtotal | 0, 3 | 0 | 0 | Verificar el subtotal con precio cero. |
| isValidPurchase | 100, 3 | true | true | Verificar una compra válida. |
| isValidPurchase | 0, 5 | false | false | Comprobar que el precio no sea cero. |
| isValidPurchase | 100, 0 | false | false | Comprobar que la cantidad no sea cero. |
| isValidPurchase | -50, 2 | false | false | Rechazar precios negativos. |
| isValidPurchase | 90, -3 | false | false | Rechazar cantidades negativas. |
| calculateDiscount | 500 | 0 | 0 | Verificar una compra sin descuento. |
| calculateDiscount | 1000 | 100 | 100 | Comprobar el límite del descuento. |
| calculateDiscount | 1200 | 120 | 120 | Comprobar el descuento del 10 %. |
| calculateDiscount | -1000 | 0 | 0 | Verificar el comportamiento con subtotal negativo. |
| calculateFinalPrice | 500 | 500 | 500 | Verificar el precio final sin descuento. |
| calculateFinalPrice | 1000 | 900 | 900 | Verificar el precio final con subtotal de $1,000. |
| calculateFinalPrice | 1200 | 1080 | 1080 | Verificar el precio final con descuento. |


## 4. Resultados de ejecución

Las pruebas unitarias se ejecutaron en IntelliJ IDEA utilizando JUnit 6.
Se obtuvieron los siguientes resultados:

- Métodos de prueba ejecutados: 4.
- Comprobaciones realizadas: 16.
- Pruebas aprobadas: 4.
- Pruebas fallidas: 0.

Los resultados muestran que los cuatro métodos de la calculadora cumplen con los casos comprobados 
durante la ejecución. Las pruebas permitieron verificar el cálculo del subtotal, la validación de 
compras, la aplicación del descuento y el cálculo del precio final.

## 5. Errores que se pueden prevenir

Las pruebas unitarias permiten detectar errores en los cálculos y validaciones de una compra.

**1. Aplicación incorrecta del descuento**

Un posible error sería utilizar `>` en lugar de `>=` al verificar si el subtotal es de $1,000 o más.
Esto provocaría que una compra de exactamente 1,000 no recibiera el descuento de 100 que le corresponde.

**2. Cálculo incorrecto del precio final**

Otro error sería sumar el descuento al subtotal en lugar de restarlo.
Esto provocaría que el cliente pagara más de lo que debería.

**3. Aceptar compras con valores inválidos**

Si no se verifican correctamente el precio y la cantidad, el sistema podría aceptar compras con 
precios negativos o cantidades iguales a cero. Las pruebas permiten detectar estos errores antes 
de que afecten el funcionamiento de la tienda.

## 6. Conclusión

Las pruebas unitarias con JUnit 6 permiten comprobar que los métodos de una aplicación funcionan de 
acuerdo con las reglas establecidas.
En este ejercicio se verificaron los cálculos del subtotal, la validación de compras, la aplicación 
de descuentos y el cálculo del precio final.

Se ejecutaron 4 pruebas unitarias con 16 comprobaciones, obteniendo resultados satisfactorios.

Las pruebas ayudan a detectar errores y mejorar la confiabilidad del sistema, evitando posibles 
problemas en los precios que pagan los clientes de una tienda en línea.