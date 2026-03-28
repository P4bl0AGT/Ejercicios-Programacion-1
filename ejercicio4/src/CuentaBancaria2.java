class CuentaBancaria2 {
    private int saldo = 1000;

    public void retirar(int monto, String nombre) {
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