public class Mapa {
    private Condominio condominio;

    public void setMapa(Condominio condominio) {
        this.condominio = condominio;
    }

    public String getMapa() {
        if(this.condominio == null) {
            throw new NullPointerException("Região inexistente");
        }
        return this.condominio.getBloco();
    }
}
