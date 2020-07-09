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
@Table(name = "tipotarjeta")
@NamedQueries({
    @NamedQuery(name = "Tipotarjeta.findAll", query = "SELECT t FROM Tipotarjeta t"),
    @NamedQuery(name = "Tipotarjeta.findByIdtipotarjeta", query = "SELECT t FROM Tipotarjeta t WHERE t.idtipotarjeta = :idtipotarjeta"),
    @NamedQuery(name = "Tipotarjeta.findByNombre", query = "SELECT t FROM Tipotarjeta t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipotarjeta.findByObservacion", query = "SELECT t FROM Tipotarjeta t WHERE t.observacion = :observacion")})
public class Tipotarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipotarjeta")
    private Integer idtipotarjeta;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipotarjeta() {
    }

    public Tipotarjeta(Integer idtipotarjeta) {
        this.idtipotarjeta = idtipotarjeta;
    }

    public Integer getIdtipotarjeta() {
        return idtipotarjeta;
    }

    public void setIdtipotarjeta(Integer idtipotarjeta) {
        this.idtipotarjeta = idtipotarjeta;
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
        hash += (idtipotarjeta != null ? idtipotarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotarjeta)) {
            return false;
        }
        Tipotarjeta other = (Tipotarjeta) object;
        if ((this.idtipotarjeta == null && other.idtipotarjeta != null) || (this.idtipotarjeta != null && !this.idtipotarjeta.equals(other.idtipotarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipotarjeta[ idtipotarjeta=" + idtipotarjeta + " ]";
    }
    
}
