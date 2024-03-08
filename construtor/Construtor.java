package construtor;

public class Construtor {
    
    public static Construtor construtor;
    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
