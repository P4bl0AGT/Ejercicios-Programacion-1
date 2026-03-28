import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhatsappServer {
    private static List<PrintWriter> clientes = new ArrayList<>();

    public static void main(String[] args) {
        int puerto = 5000;

        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor de grupo iniciado...");

            while (true) {
                Socket socket = servidor.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                synchronized (clientes) {
                    clientes.add(out);
                }

                System.out.println("Nuevo cliente conectado.");

                Thread hilo = new Thread(() -> manejarCliente(socket, out));
                hilo.start();
            }

        } catch (Exception e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }

    public static void manejarCliente(Socket socket, PrintWriter out) {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String mensaje;
            while ((mensaje = in.readLine()) != null) {
                System.out.println("Mensaje recibido: " + mensaje);
                difundirMensaje(mensaje, out);
            }

        } catch (Exception e) {
            System.out.println("Un cliente se desconecto.");
        } finally {
            synchronized (clientes) {
                clientes.remove(out);
            }

            try {
                socket.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion.");
            }
        }
    }

    public static void difundirMensaje(String mensaje, PrintWriter emisor) {
        synchronized (clientes) {
            Iterator<PrintWriter> it = clientes.iterator();

            while (it.hasNext()) {
                PrintWriter cliente = it.next();

                try {
                    if (cliente != emisor) {
                        cliente.println(mensaje);
                    }
                } catch (Exception e) {
                    System.out.println("No se pudo enviar a un cliente.");
                    it.remove();
                }
            }
        }
    }
}