import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WhatsappClient {
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 5000;

        try {
            Socket socket = new Socket(host, puerto);

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            Thread receptor = new Thread(() -> {
                try {
                    String mensaje;
                    while ((mensaje = entrada.readLine()) != null) {
                        System.out.println("Mensaje recibido: " + mensaje);
                    }
                } catch (Exception e) {
                    System.out.println("Se perdio la conexion con el servidor.");
                }
            });
            receptor.start();

            System.out.println("Escribe mensajes para enviar al grupo:");

            while (true) {
                String mensaje = scanner.nextLine();
                salida.println(mensaje);
            }


        } catch (Exception e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }
}