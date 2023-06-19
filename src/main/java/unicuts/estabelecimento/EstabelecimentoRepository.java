package unicuts.estabelecimento;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    
    List<Estabelecimento> findByMediaAvaliacaoGreaterThanEqual(Double avaliacaoMinima);
    
}
