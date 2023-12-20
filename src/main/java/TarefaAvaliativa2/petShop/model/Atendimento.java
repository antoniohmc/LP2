package TarefaAvaliativa2.petShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "PET-SHOP")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 15)
    private Date data;
    @Column(nullable = false, length = 255)
    private String nome_atendente;
    @Column(nullable = false)
    private Boolean pagamento_efetuado;
    @Column(nullable = false)
    private Float valorConsulta;
    @Column(nullable = false, length = 50)
    private String estado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome_atendente() {
        return nome_atendente;
    }

    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }

    public Boolean getPagamento_efetuado() {
        return pagamento_efetuado;
    }

    public void setPagamento_efetuado(Boolean pagamento_efetuado) {
        this.pagamento_efetuado = pagamento_efetuado;
    }

    public Float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
