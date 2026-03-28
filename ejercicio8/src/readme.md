## Ejecución del ejercicio 8

Para resolver y ejecutar el problema correspondiente al **Ejercicio 8: Protocolo de login para sistema municipal**, primero se debe ejecutar el archivo:

`ServidorLogin.java`

Este archivo contiene el servidor, que espera conexiones de clientes, recibe las credenciales en formato `usuario:password` y responde con `OK` o `ERROR`.

Luego se debe ejecutar el archivo:

`ClienteLogin.java`

Este archivo actúa como cliente y permite ingresar las credenciales para enviarlas al servidor y mostrar la respuesta recibida.

## Credenciales de prueba

Para comprobar el funcionamiento del sistema, se definieron las siguientes credenciales válidas:

- Usuario: `admin`
- Contraseña: `1234`

Si se ingresan esos datos, el servidor responderá `OK`.  
Si se ingresa cualquier otra combinación, responderá `ERROR`.