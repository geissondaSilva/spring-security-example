package br.edu.unidep.ApiES.resource;

import br.edu.unidep.ApiES.model.Usuario;
import br.edu.unidep.ApiES.repository.UsuarioRepository;
import br.edu.unidep.ApiES.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @GetMapping("/by-email/{email}")
    public Usuario findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }
}
