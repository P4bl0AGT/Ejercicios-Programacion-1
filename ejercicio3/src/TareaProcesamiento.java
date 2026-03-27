public class TareaProcesamiento implements Runnable{
    @Override
    public void run(){
        System.out.println("Ejecutando tarea en: " + Thread.currentThread().getName());
    }
}
