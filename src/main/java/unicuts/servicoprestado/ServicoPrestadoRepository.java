package unicuts.servicoprestado;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Long> {
    
    public List<ServicoPrestado> findAllByEstabelecimento_Id(Long estabelecimentoId);
    
}
