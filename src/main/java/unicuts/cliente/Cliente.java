package unicuts.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import unicuts.usuario.Usuario;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {
        
}
