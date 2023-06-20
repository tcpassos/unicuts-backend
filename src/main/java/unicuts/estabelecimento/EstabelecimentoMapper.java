package unicuts.estabelecimento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import unicuts.EntityMapper;
import unicuts.servicoprestado.ServicoPrestadoMapper;
import unicuts.servicoprestado.ServicoPrestadoOutput;

@Component
public class EstabelecimentoMapper extends EntityMapper<Estabelecimento, Void, EstabelecimentoOutput> {
    
    @Autowired
    ServicoPrestadoMapper servicoPrestadoMapper;

    @Override
    public EstabelecimentoOutput wrap(Estabelecimento entity) {
        EstabelecimentoOutput output = new EstabelecimentoOutput();
        output.setId(entity.getId());
        output.setNome(entity.getNome());
        output.setEndereco(entity.getEndereco());
        output.setMediaAvaliacao(entity.getMediaAvaliacao());
        if (!CollectionUtils.isEmpty(entity.getServicosPrestados())) {
            List<ServicoPrestadoOutput> servicosPrestados = entity.getServicosPrestados()
                                                                  .stream()
                                                                  .map(servicoPrestado -> servicoPrestadoMapper.wrap(servicoPrestado))
                                                                  .toList();
            output.setServicosPrestados(servicosPrestados);
        }        
        return output;
    }

    @Override
    public Estabelecimento unwrap(Void entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
