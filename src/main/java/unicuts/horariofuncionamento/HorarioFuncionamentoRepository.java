package unicuts.horariofuncionamento;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioFuncionamentoRepository extends JpaRepository<HorarioFuncionamento, Long> {
    
    public List<HorarioFuncionamento> findAllByEstabelecimento_Id(Long estabelecimentoId);
    
}
