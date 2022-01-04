import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapaTest {

    @Test
    void deveRetornarMapa() {
        Condominio condominio1 = new Condominio(1, "Alphaville");
        Predio p1 = new Predio(101, "A");
        Predio p2 = new Predio(102, "B");
        condominio1.add(p1);
        condominio1.add(p2);

        Condominio condominio2 = new Condominio(2, "Green Village");
        Predio p3 = new Predio(201, "C");
        condominio2.add(p3);

        Condominio regiao = new Condominio(1, "M");
        regiao.add(condominio1);
        regiao.add(condominio2);

        Mapa mapa = new Mapa();
        mapa.setMapa(regiao);

        assertEquals("Condominio: 1 - M\n" +
                "Condominio: 1 - Alphaville\n" +
                "Predio: 101 - A\n" +
                "Predio: 102 - B\n" +
                "Condominio: 2 - Green Village\n" +
                "Predio: 201 - C\n",mapa.getMapa());
    }
    @Test
    void deveRetornarExcecaoRegiaoSemCondominio() {
        try {
            Mapa mapa = new Mapa();
            mapa.getMapa();
            fail();
        } catch(NullPointerException e) {
            assertEquals("Região inexistente", e.getMessage());
        }
    }
}