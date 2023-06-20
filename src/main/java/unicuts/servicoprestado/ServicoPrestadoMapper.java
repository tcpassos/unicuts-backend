package unicuts.servicoprestado;

import org.springframework.stereotype.Component;
import unicuts.EntityMapper;

@Component
public class ServicoPrestadoMapper extends EntityMapper<ServicoPrestado, Void, ServicoPrestadoOutput> {

    @Override
    public ServicoPrestadoOutput wrap(ServicoPrestado entity) {
        ServicoPrestadoOutput output = new ServicoPrestadoOutput();
        output.setId(entity.getId());
        output.setServico(entity.getServico());
        output.setValor(entity.getValor());
        return output;
    }

    @Override
    public ServicoPrestado unwrap(Void entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
