import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEco {
    public static void main(String[] args) {
        try (ServerSocket servidor = new ServerSocket(5000)) {
            System.out.println("Servidor de Eco iniciado en puerto 5000...");
            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado");
                new Thread(new ManejadorEco(cliente)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}