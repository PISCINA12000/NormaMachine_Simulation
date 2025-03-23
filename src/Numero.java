public class Numero {
    private int sinal;
    private int magnitude;

    // Construtores
    public Numero(int sinal, int magnitude) {
        this.sinal = sinal;
        this.magnitude = magnitude;
    }

    public Numero() {
        this(0,0);
    }

    // Gets e Sets
    public int getSinal() {
        return sinal;
    }

    public void setSinal(int sinal) {
        this.sinal = sinal;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }
}
