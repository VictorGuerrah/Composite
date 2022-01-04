import java.util.ArrayList;

public class Predio extends Bloco{

    public Predio(int numero, String nome) {
        super(numero, nome);
    }

    @Override
    public void add(Bloco f) {
        throw new IllegalCallerException();
    }

    @Override
    public ArrayList<Bloco> blocos() {
        return null;
    }

    @Override
    public String getBloco() {
        return "Predio: " + this.toString() + "\n";
    }
}