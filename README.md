Transacciones Bancarias
================================

Este ejercicio en JSE contiene ejemplos de:

 - Herencia
 - lases Abstractas
 - Sobreescritura de métodos
 - Polimorfismo
 - Uso de un ArrayList
 
Se requiere crear una pequeña aplicación que simule las operaciones de un banco. 
Para esto se ha definido dos tipos de cuentas: Ahorros y Corriente, quedando la posibilidad abierta a que en un futuro se cree otro tipo de cuenta. 
Cualquier cuenta va a tener siempre los atributos: id, saldo, interés y un estado (“Activa” o “Bloqueada”).
 
 Para ambos tipos de cuenta:
  No se pueden realizar depósitos ni retiros de valores negativos. 
  No se pueden retirar valores mayores al saldo de la cuenta.

En las cuentas corrientes, por cada depósito se realiza un descuento del 1% del monto depositado.
En las cuentas de ahorros no se puede retirar un monto mayor a 1000.
En las cuentas corrientes no se puede retirar un monto mayor a 2000.
Al crear una cuenta de ahorros, el valor de interés será siempre del 0.01% diario (0.0001)
Al crear una cuenta corriente, el valor de interés será siempre del 0.012% (0.00015)
Las cuentas se crean siempre con estado “Activa”
Si no se puede depositar o retirar porque no cumple alguna de las condiciones especificadas, mostrar un mensaje que indique al usuario el motivo.
Los clientes del banco, pueden tener más de una cuenta.

La aplicación debe brindar la posibilidad de realizar las siguientes operaciones:

 Crear un Cliente
 Crear una Cuenta
 Agregar cuentas a un cliente
 Realizar depósitos sobre una cuenta
 Realizar retiros sobre una cuenta
 Realizar transferencias entre cuentas
 Imprimir información de cuentas y clientes
 
