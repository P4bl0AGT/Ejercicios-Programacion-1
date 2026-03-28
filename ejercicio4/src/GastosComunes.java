public class GastosComunes{
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria();

        Thread h1 = new Thread(() -> cuenta.retirar(700, "Habitante A"));
        Thread h2 = new Thread(() -> cuenta.retirar(700, "Habitante B"));

        h1.start();
        h2.start();
    }
}