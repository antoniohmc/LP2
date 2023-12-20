package TarefaAvaliativa2.petShop.model;

public class Peixe extends TipoAnimal {

    private String tipoAgua;

    public Peixe(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
