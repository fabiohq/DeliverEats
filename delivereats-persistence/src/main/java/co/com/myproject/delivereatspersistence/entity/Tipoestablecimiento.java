/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "tipoestablecimiento")
@NamedQueries({
    @NamedQuery(name = "Tipoestablecimiento.findAll", query = "SELECT t FROM Tipoestablecimiento t"),
    @NamedQuery(name = "Tipoestablecimiento.findByIdtipoestadoestablecimiento", query = "SELECT t FROM Tipoestablecimiento t WHERE t.idtipoestadoestablecimiento = :idtipoestadoestablecimiento"),
    @NamedQuery(name = "Tipoestablecimiento.findByNombre", query = "SELECT t FROM Tipoestablecimiento t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipoestablecimiento.findByObservacion", query = "SELECT t FROM Tipoestablecimiento t WHERE t.observacion = :observacion")})
public class Tipoestablecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoestadoestablecimiento")
    private Integer idtipoestadoestablecimiento;
    @Size(max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "observacion")
    private String observacion;

    public Tipoestablecimiento() {
    }

    public Tipoestablecimiento(Integer idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
    }

    public Integer getIdtipoestadoestablecimiento() {
        return idtipoestadoestablecimiento;
    }

    public void setIdtipoestadoestablecimiento(Integer idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoestadoestablecimiento != null ? idtipoestadoestablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoestablecimiento)) {
            return false;
        }
        Tipoestablecimiento other = (Tipoestablecimiento) object;
        if ((this.idtipoestadoestablecimiento == null && other.idtipoestadoestablecimiento != null) || (this.idtipoestadoestablecimiento != null && !this.idtipoestadoestablecimiento.equals(other.idtipoestadoestablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipoestablecimiento[ idtipoestadoestablecimiento=" + idtipoestadoestablecimiento + " ]";
    }
    
}
