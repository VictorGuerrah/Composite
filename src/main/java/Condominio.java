import java.util.ArrayList;

public class Condominio extends Bloco {
    ArrayList<Bloco> blocos;

    public Condominio(int numero, String nome) {
        super(numero, nome);
        blocos = new ArrayList<>();
    }

    @Override
    public void add(Bloco bloco) {
        blocos.add(bloco);
    }

    @Override
    public ArrayList<Bloco> blocos() {
        return this.blocos;
    }

    @Override
    public String getBloco() {
        String saida = "";
        saida = "Condominio: " + this.toString() + "\n";
        for(Bloco bloco : blocos) {
            saida += bloco.getBloco();
        }
        return saida;
    }
}
