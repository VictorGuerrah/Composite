import java.util.ArrayList;

public abstract class Bloco {
    private int numero;
    private String nome;

    public Bloco(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public abstract void add(Bloco bloco);
    public abstract ArrayList<Bloco> blocos();
    public abstract String getBloco();

    @Override
    public String toString() {
        return String.format("%d - %s", numero, nome);
    }
}