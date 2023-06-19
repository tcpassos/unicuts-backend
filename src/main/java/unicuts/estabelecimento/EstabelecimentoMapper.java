package unicuts.estabelecimento;

import org.springframework.stereotype.Component;
import unicuts.EntityMapper;

@Component
public class EstabelecimentoMapper extends EntityMapper<Estabelecimento, Void, EstabelecimentoOutput> {

    @Override
    public EstabelecimentoOutput wrap(Estabelecimento entity) {
        EstabelecimentoOutput output = new EstabelecimentoOutput();
        output.setId(entity.getId());
        output.setNome(entity.getNome());
        output.setEndereco(entity.getEndereco());
        output.setMediaAvaliacao(entity.getMediaAvaliacao());
        return output;
    }

    @Override
    public Estabelecimento unwrap(Void entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
