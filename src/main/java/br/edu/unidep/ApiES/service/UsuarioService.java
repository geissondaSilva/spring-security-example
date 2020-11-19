package br.edu.unidep.ApiES.service;

import br.edu.unidep.ApiES.model.Usuario;
import br.edu.unidep.ApiES.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public Usuario findByEmail(String email) {
        List<Usuario> users = repository.findByEmail(email);
        if(users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }
}
