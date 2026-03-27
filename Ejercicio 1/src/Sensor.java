package Ejercicio1;

import java.util.Random;

public class Sensor extends Thread {
    private int id;

    public Sensor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int temp = random.nextInt(150); // Esto lo que hace es generar valores entre 0 y 150
            System.out.println("Sensor " + id + " leyendo: " + temp + "°C");

            if (temp > 100) {
                System.out.println("Sensor " + id + " detenido por sobrecalentamiento ");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
