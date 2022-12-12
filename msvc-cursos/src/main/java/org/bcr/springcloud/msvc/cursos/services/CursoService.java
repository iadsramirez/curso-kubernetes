package org.bcr.springcloud.msvc.cursos.services;

import org.bcr.springcloud.msvc.cursos.models.Usuario;
import org.bcr.springcloud.msvc.cursos.models.entity.Curso;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CursoService {


    List<Curso> listar();

    Optional<Curso> porId(Long id);

    Optional<Curso> porIdConUsuarios(Long id);

    Curso guardar(Curso curso);

    void eliminar(Long id);

    void eliminarCursoUsuarioPorId(Long id);




    Optional<Usuario> asignarUsuario(Usuario usuario,Long CursoId);

    Optional<Usuario> crearUsuario(Usuario usuario,Long cursoId);

    Optional<Usuario> eliminarUsuario(Usuario usuario,Long cursoId);







}
