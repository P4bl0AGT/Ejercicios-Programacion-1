package Ejercicio4;

class Urna {
    private int votos = 0;

    public synchronized void votar() {
        votos++;
    }
    public int getVotos() { return votos; }
}

public class Elecciones {
    public static void main(String[] args) throws InterruptedException {
        Urna urna = new Urna();
        Thread[] votantes = new Thread[100];

        for (int i = 0; i < 100; i++) {
            votantes[i] = new Thread(urna::votar);
            votantes[i].start();
        }
        for (Thread t : votantes) t.join();

        System.out.println("Conteo final de votos: " + urna.getVotos());
    }
}