public class GastosComunes2{
    public static void main(String[] args){
        CuentaBancaria2 cuenta = new CuentaBancaria2();

        Thread h1 = new Thread(() -> cuenta.retirar(700, "Habitante A"));
        Thread h2 = new Thread(() -> cuenta.retirar(700, "Habitante B"));

        h1.start();
        h2.start();
    }
}