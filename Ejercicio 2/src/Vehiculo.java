package Ejercicio2;

public class Vehiculo extends Thread{
    private String nombre;
    public Vehiculo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        int tiempo = (int) ((Math.random() * 3000) + 1000);
        try{
            Thread.sleep(tiempo);
            System.out.println(nombre + " ha llegado a Viña del Mar");
        }catch (InterruptedException e){}
    }
}


