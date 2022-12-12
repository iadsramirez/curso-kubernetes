package org.bcr.springcloud.msvcusuarios.services;

import org.bcr.springcloud.msvcusuarios.client.CursoClienteRest;
import org.bcr.springcloud.msvcusuarios.models.entity.Usuario;
import org.bcr.springcloud.msvcusuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl  implements  UsuarioService{

    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private CursoClienteRest client;



    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return   (List<Usuario>) repository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> porId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }


    @Override
    @Transactional
    public void eliminar(Long id) {
    repository.deleteById(id);
    client.eliminarCursoUsuarioPorId(id);

    }

    @Override
    public Optional<Usuario> porEamil(String email) {
        return repository.porEmail(email);
    }

    @Override
    public boolean existePorEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarPorIds(Iterable<Long> ids) {
        return (List<Usuario>) repository.findAllById(ids);
    }

}
