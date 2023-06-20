package unicuts.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import unicuts.EntityMapper;
import unicuts.servicoprestado.ServicoPrestadoMapper;

@Component
public class UsuarioMapper extends EntityMapper<Usuario, Void, UsuarioOutput> {
    
    @Autowired
    ServicoPrestadoMapper servicoPrestadoMapper;

    @Override
    public UsuarioOutput wrap(Usuario entity) {
        UsuarioOutput output = new UsuarioOutput();
        output.setId(entity.getId());
        output.setEmail(entity.getEmail());
        output.setNome(entity.getNome());
        return output;
    }

    @Override
    public Usuario unwrap(Void entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
