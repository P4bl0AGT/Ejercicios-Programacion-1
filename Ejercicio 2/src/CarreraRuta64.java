package Ejercicio2;

public class CarreraRuta64 {
    public static void main(String[] args) throws InterruptedException{
        Vehiculo vehiculo1= new Vehiculo("Auto 1");
        Vehiculo vehiculo2= new Vehiculo("Auto 2");
        Vehiculo vehiculo3= new Vehiculo("Auto 3");

        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();

        vehiculo1.join();
        vehiculo2.join();
        vehiculo3.join();

        System.out.println("¡Todos llegaron a la meta!");
    }
}
