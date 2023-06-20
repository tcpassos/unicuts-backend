package unicuts.estabelecimento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import unicuts.endereco.Endereco;
import unicuts.gestor.Gestor;
import unicuts.servicoprestado.ServicoPrestado;

@Entity
@Table(name = "estabelecimento")
public class Estabelecimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nome;
    
    @OneToOne
    private Endereco endereco;
    
    @ManyToOne
    private Gestor gestor;
    
    @Column
    private Double mediaAvaliacao;
    
    @ManyToMany(mappedBy = "estabelecimento")
    private List<ServicoPrestado> servicosPrestados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(Double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public List<ServicoPrestado> getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(List<ServicoPrestado> servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

}
