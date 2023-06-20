package unicuts.estabelecimento;

import java.util.List;
import unicuts.endereco.Endereco;
import unicuts.servicoprestado.ServicoPrestadoOutput;

public class EstabelecimentoOutput {
    
    private Long id;
    private String nome;
    private Endereco endereco;
    private Double mediaAvaliacao;
    private List<ServicoPrestadoOutput> servicosPrestados;

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

    public Double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(Double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public List<ServicoPrestadoOutput> getServicosPrestados() {
        return servicosPrestados;
    }

    public void setServicosPrestados(List<ServicoPrestadoOutput> servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }   

}
