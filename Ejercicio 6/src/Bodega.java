package Ejercicio6;

public class Bodega {
    public static void main(String[] args) throws InterruptedException{
        Recursos grua = new Recursos("Grua");
        Recursos escaner = new Recursos("Escaner");

        Runnable operario = () ->{
            synchronized (grua){
                System.out.println(Thread.currentThread().getName() + " tomo la Grúa");
                try{Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (escaner){
                    System.out.println(Thread.currentThread().getName() + " tomo el Escaner");
                }
            }
        };

        Thread t1 = new Thread(operario, "Operario 1");
        Thread t2 = new Thread(operario, "Operario 2");

        t1.start();
        t2.start();
    }
}
