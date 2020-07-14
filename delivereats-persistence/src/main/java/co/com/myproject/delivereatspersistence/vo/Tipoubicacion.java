/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.vo;

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
@Table(name = "tipoubicacion")
@NamedQueries({
    @NamedQuery(name = "Tipoubicacion.findAll", query = "SELECT t FROM Tipoubicacion t"),
    @NamedQuery(name = "Tipoubicacion.findByIdtipoubicacion", query = "SELECT t FROM Tipoubicacion t WHERE t.idtipoubicacion = :idtipoubicacion"),
    @NamedQuery(name = "Tipoubicacion.findByNombre", query = "SELECT t FROM Tipoubicacion t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipoubicacion.findByObservaacion", query = "SELECT t FROM Tipoubicacion t WHERE t.observaacion = :observaacion")})
public class Tipoubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoubicacion")
    private Integer idtipoubicacion;
    @Size(max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 1000)
    @Column(name = "observaacion")
    private String observaacion;

    public Tipoubicacion() {
    }

    public Tipoubicacion(Integer idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public Integer getIdtipoubicacion() {
        return idtipoubicacion;
    }

    public void setIdtipoubicacion(Integer idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaacion() {
        return observaacion;
    }

    public void setObservaacion(String observaacion) {
        this.observaacion = observaacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoubicacion != null ? idtipoubicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoubicacion)) {
            return false;
        }
        Tipoubicacion other = (Tipoubicacion) object;
        if ((this.idtipoubicacion == null && other.idtipoubicacion != null) || (this.idtipoubicacion != null && !this.idtipoubicacion.equals(other.idtipoubicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipoubicacion[ idtipoubicacion=" + idtipoubicacion + " ]";
    }
    
}
