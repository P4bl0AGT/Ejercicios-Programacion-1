public class Server {
    public static void main(String[] args){
        TareaProcesamiento tarea = new TareaProcesamiento();

        System.out.println("----- Probando con run() -----");

        tarea.run();
        tarea.run();
        tarea.run();

        System.out.println("\n--- Probando con start() ---");

        new Thread(tarea).start();
        new Thread(tarea).start();
        new Thread(tarea).start();
    }
}
