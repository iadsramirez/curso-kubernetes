package org.bcr.springcloud.msvcusuarios.models.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CONTROL_CIERRE_SISTEMA")
public class ControlCierreSistema {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "S_CONTROL_CIERRE_SISTEMA",allocationSize = 1)
    @Column(name = "ID_CONTROL_CIERRE")
    private Long idCControlCierre;

    @Column(name = "FECHA_ULTIMA_EJECUCION_PROCESO")
    private Date fechaUltimaEjecucionProceso;

    @Column(name = "FECHA_OPERACION_CERRADO")
    private  Date fechaOperacionCerrado;

    @Column(name = "FECHA_DIA_HABIL_SIGUIENTE")
    private Date fechaDiaHabilSiguiente;

    @Column(name = "ESTADO")
    private String estado;

    public Long getIdCControlCierre() {
        return idCControlCierre;
    }

    public void setIdCControlCierre(Long idCControlCierre) {
        this.idCControlCierre = idCControlCierre;
    }

    public Date getFechaUltimaEjecucionProceso() {
        return fechaUltimaEjecucionProceso;
    }

    public void setFechaUltimaEjecucionProceso(Date fechaUltimaEjecucionProceso) {
        this.fechaUltimaEjecucionProceso = fechaUltimaEjecucionProceso;
    }

    public Date getFechaOperacionCerrado() {
        return fechaOperacionCerrado;
    }

    public void setFechaOperacionCerrado(Date fechaOperacionCerrado) {
        this.fechaOperacionCerrado = fechaOperacionCerrado;
    }

    public Date getFechaDiaHabilSiguiente() {
        return fechaDiaHabilSiguiente;
    }

    public void setFechaDiaHabilSiguiente(Date fechaDiaHabilSiguiente) {
        this.fechaDiaHabilSiguiente = fechaDiaHabilSiguiente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    @Override
    public String toString() {
        return "ControlCierreSistema{" +
                "idCControlCierre=" + idCControlCierre +
                ", fechaUltimaEjecucionProceso=" + fechaUltimaEjecucionProceso +
                ", fechaOperacionCerrado=" + fechaOperacionCerrado +
                ", fechaDiaHabilSiguiente=" + fechaDiaHabilSiguiente +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }


    public ControlCierreSistema() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ControlCierreSistema)) return false;
        ControlCierreSistema that = (ControlCierreSistema) o;
        return Objects.equals(idCControlCierre, that.idCControlCierre) && Objects.equals(fechaUltimaEjecucionProceso, that.fechaUltimaEjecucionProceso) && Objects.equals(fechaOperacionCerrado, that.fechaOperacionCerrado) && Objects.equals(fechaDiaHabilSiguiente, that.fechaDiaHabilSiguiente) && Objects.equals(estado, that.estado) && Objects.equals(observaciones, that.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCControlCierre, fechaUltimaEjecucionProceso, fechaOperacionCerrado, fechaDiaHabilSiguiente, estado, observaciones);
    }



}
