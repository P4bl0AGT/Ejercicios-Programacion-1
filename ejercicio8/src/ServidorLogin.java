import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorLogin {
    public static void main(String[] args) {
        int puerto = 5000;

        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor de login iniciado en el puerto " + puerto);

            while (true) {
                try {
                    Socket cliente = servidor.accept();
                    System.out.println("Cliente conectado");

                    BufferedReader entrada = new BufferedReader(
                            new InputStreamReader(cliente.getInputStream()));
                    PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

                    String credenciales = entrada.readLine();
                    System.out.println("Credenciales recibidas: " + credenciales);

                    if (credenciales != null && credenciales.equals("admin:1234")) {
                        salida.println("OK");
                    } else {
                        salida.println("ERROR");
                    }

                    cliente.close();
                    servidor.close();
                } catch (Exception e) {
                    System.out.println("Se perdio la conexion con un cliente.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
        
        
    }
}