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
@Table(name = "tipomail")
@NamedQueries({
    @NamedQuery(name = "Tipomail.findAll", query = "SELECT t FROM Tipomail t"),
    @NamedQuery(name = "Tipomail.findByIdtipomail", query = "SELECT t FROM Tipomail t WHERE t.idtipomail = :idtipomail"),
    @NamedQuery(name = "Tipomail.findByNombre", query = "SELECT t FROM Tipomail t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipomail.findByObservacion", query = "SELECT t FROM Tipomail t WHERE t.observacion = :observacion")})
public class Tipomail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipomail")
    private Integer idtipomail;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "observacion")
    private String observacion;

    public Tipomail() {
    }

    public Tipomail(Integer idtipomail) {
        this.idtipomail = idtipomail;
    }

    public Integer getIdtipomail() {
        return idtipomail;
    }

    public void setIdtipomail(Integer idtipomail) {
        this.idtipomail = idtipomail;
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
        hash += (idtipomail != null ? idtipomail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipomail)) {
            return false;
        }
        Tipomail other = (Tipomail) object;
        if ((this.idtipomail == null && other.idtipomail != null) || (this.idtipomail != null && !this.idtipomail.equals(other.idtipomail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipomail[ idtipomail=" + idtipomail + " ]";
    }
    
}
