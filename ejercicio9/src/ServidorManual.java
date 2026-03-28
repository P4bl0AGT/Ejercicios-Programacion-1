import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorManual {
    public static void main(String[] args) {
        int puerto = 5000;

        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor de manual iniciado en el puerto " + puerto);

            while (true) {
                try {
                    Socket cliente = servidor.accept();
                    System.out.println("Cliente conectado para recibir el manual.");

                    BufferedReader archivo = new BufferedReader(new FileReader("ejercicio9/src/manual.txt"));
                    PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

                    String linea;
                    while ((linea = archivo.readLine()) != null) {
                        salida.println(linea);
                    }

                    archivo.close();
                    cliente.close();
                    servidor.close();

                } catch (Exception e) {
                    System.out.println("Error al enviar el manual: " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}