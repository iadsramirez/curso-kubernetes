package org.bcr.springcloud.msvc.cursos.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "cursos_usuarios")
public class CursoUsuario {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "id_SeCursoUsuario")
    @SequenceGenerator(name = "id_SeCursoUsuario", sequenceName = "ID_SEQCURSOUSUARIO",allocationSize=50)
    private Long id;

    @Column(name = "usuario_id",unique = true)
    private Long usuarioId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj){
           return  true;
       }

       if(!(obj instanceof  CursoUsuario)){
           return  false;
       }

       CursoUsuario o= ( CursoUsuario) obj;
       return  this.usuarioId !=null && this.usuarioId.equals(o.usuarioId);

    }
}
