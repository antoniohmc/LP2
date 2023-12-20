package TarefaAvaliativa2.petShop.model;

public class Mamifero extends TipoAnimal {

    private String raca;

    private Boolean possuiPelos;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean getPossuiPelos() {
        return possuiPelos;
    }

    public void setPossuiPelos(Boolean possuiPelos) {
        this.possuiPelos = possuiPelos;
    }
}
