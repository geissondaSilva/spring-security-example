package br.edu.unidep.ApiES.repository;

import br.edu.unidep.ApiES.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from Usuario u where u.email = :email")
    List<Usuario> findByEmail(@Param("email") String emailAddress);
}
