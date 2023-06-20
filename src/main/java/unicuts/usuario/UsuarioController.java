package unicuts.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import unicuts.gestor.GestorRepository;

@RestController
public class UsuarioController {

    @Autowired
    GestorRepository gestorRepository;
    @Autowired
    UsuarioMapper usuarioMapper;

    @GetMapping("/me")
    public UsuarioOutput getUserInfo() {
        // Retorna um usuário exemplo pois não foi implementado o sistema de autenticação ainda
        return usuarioMapper.wrap(gestorRepository.findById(3l).get());
    }

}
