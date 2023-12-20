package TarefaAvaliativa2.petShop.model;

import java.util.Date;

public class Vacina extends Mamifero {

    private String nome;

    private Date validade;

    private String doencasAplicaveis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getDoencasAplicaveis() {
        return doencasAplicaveis;
    }

    public void setDoencasAplicaveis(String doencasAplicaveis) {
        this.doencasAplicaveis = doencasAplicaveis;
    }
}
