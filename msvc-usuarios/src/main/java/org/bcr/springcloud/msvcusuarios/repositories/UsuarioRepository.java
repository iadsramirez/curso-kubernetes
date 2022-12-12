package org.bcr.springcloud.msvcusuarios.repositories;

import org.bcr.springcloud.msvcusuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository  extends CrudRepository<Usuario,Long> {

    Optional<Usuario> findByEmail(String email);

    @Query("Select u from Usuario u where u.email=?1")
    Optional<Usuario> porEmail(String email);

    boolean existsByEmail(String email);



}
