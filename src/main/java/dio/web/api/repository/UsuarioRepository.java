package dio.web.api.repository;

import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null)
            throw new CampoObrigatorioException("login");

        if (usuario.getPassword() == null)
            throw new CampoObrigatorioException("password");

        if (usuario.getId() == null) {
            System.out.println("SAVE");
        } else {
            System.out.println("UPDATE");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - %d", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Kaiki", "12345"));
        usuarios.add(new Usuario("Ikiak", "54321"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id %d", id);
        return new Usuario("Kaiki", "12345");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("FIND/username %s", username);
        return new Usuario("Kaiki", "12345");
    }
}
