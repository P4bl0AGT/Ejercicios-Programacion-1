## Ejecución del ejercicio 9

Para resolver y ejecutar el problema correspondiente al **Ejercicio 9: Transferencia de manuales por socket**, primero se debe ejecutar el archivo:

`ServidorManual.java`

Este archivo contiene el servidor, que abre el archivo de texto `manual.txt` y transmite su contenido línea por línea al cliente conectado.

Luego se debe ejecutar el archivo:

`ClienteManual.java`

Este archivo actúa como cliente y recibe el contenido enviado por el servidor, imprimiéndolo completo en su terminal.

## Archivo necesario

Para que el programa funcione correctamente, se debe contar con un archivo llamado:

`manual.txt`

Este archivo debe contener el texto que será enviado al cliente.

## Ubicación del archivo

En este proyecto, el archivo `manual.txt` fue ubicado en la ruta:

`ejercicio9/src/manual.txt`

Por esta razón, el programa fue pensado para ejecutarse manteniendo la estructura completa del repositorio desde la carpeta raíz:

`Ejercicios-Programacion-1`

Si se cambia la ubicación del archivo o se ejecuta el programa desde otra carpeta distinta, puede producirse un error al momento de leer el manual.