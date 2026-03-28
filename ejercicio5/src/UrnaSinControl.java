public class UrnaSinControl{
    private int votos = 0;
    public void votar() {
        int aux = votos;
        try { Thread.sleep(1); } catch (InterruptedException e) {}
        votos = aux + 1;
    }

    public int getVotos() { return votos; }
}