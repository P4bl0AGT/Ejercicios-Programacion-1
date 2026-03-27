package Ejercicio5;

public class Urna{
    private int votos = 0;

    public synchronized void votar(){
        votos++;
    }
    public int getVotos(){ return votos; }
}
