import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteManual {
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 5000;

        try {
            Socket socket = new Socket(host, puerto);
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String linea;
            System.out.println("Contenido del manual recibido:\n");

            while ((linea = entrada.readLine()) != null) {
                System.out.println(linea);
            }

            socket.close();

        } catch (Exception e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }
}