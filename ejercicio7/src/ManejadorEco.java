import java.io.*;
import java.net.*;

class ManejadorEco implements Runnable {
    private Socket socket;
    public ManejadorEco(Socket socket) { this.socket = socket; }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String linea;
            while ((linea = in.readLine()) != null) {
                String invertida = new StringBuilder(linea).reverse().toString();
                out.println(invertida);
            }
        } catch (IOException e) {
            System.out.println("Cliente desconectado.");
        }
    }
}
