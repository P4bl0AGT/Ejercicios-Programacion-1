package Ejercicio4;

class CuentaBancaria {
    private int saldo = 1000;

    public synchronized void retirar(int monto, String nombre) {
        if (saldo >= monto) {
            System.out.println(nombre + " esta procesando el retiro");
            try {Thread.sleep(100);} catch (InterruptedException e) {}

            saldo -= monto;
            System.out.println(nombre + " retiro " + monto + " saldo restante " + saldo);
        }else{
            System.out.println("Saldo insuficiente " + nombre);
        }
    }
}

public class GastosComunes{
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria();

        Thread h1 = new Thread(() -> cuenta.retirar(700, "Habitante A"));
        Thread h2 = new Thread(() -> cuenta.retirar(700, "Habitante B"));

        h1.start();
        h2.start();
    }
}