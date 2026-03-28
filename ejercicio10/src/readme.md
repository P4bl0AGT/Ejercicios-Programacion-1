## Ejecución del ejercicio 10

Para resolver y ejecutar el problema correspondiente al **Ejercicio 10: Difusión de mensajes en grupo**, primero se debe ejecutar el archivo:

`WhatsappServer.java`

Este archivo contiene el servidor, que mantiene una lista de clientes conectados, recibe los mensajes enviados por un emisor y los reenvía al resto de los miembros del grupo.

Luego se debe ejecutar el archivo:

`WhatsappClient.java`

Este archivo actúa como cliente y permite enviar mensajes al servidor, además de recibir e imprimir en consola los mensajes difundidos al grupo.

## Forma de prueba

Para comprobar el funcionamiento correctamente, se recomienda:

1. Ejecutar una vez el servidor.
2. Ejecutar dos o más clientes.
3. Escribir un mensaje en uno de los clientes.
4. Verificar que el mensaje llegue a los demás clientes conectados.

Si un cliente se desconecta, el servidor continúa funcionando y sigue enviando mensajes al resto del grupo.