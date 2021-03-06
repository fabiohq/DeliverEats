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
@Table(name = "tipotransporte")
@NamedQueries({
    @NamedQuery(name = "Tipotransporte.findAll", query = "SELECT t FROM Tipotransporte t"),
    @NamedQuery(name = "Tipotransporte.findByIdtipotransporte", query = "SELECT t FROM Tipotransporte t WHERE t.idtipotransporte = :idtipotransporte"),
    @NamedQuery(name = "Tipotransporte.findByNombre", query = "SELECT t FROM Tipotransporte t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipotransporte.findByObservacion", query = "SELECT t FROM Tipotransporte t WHERE t.observacion = :observacion")})
public class Tipotransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipotransporte")
    private Integer idtipotransporte;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipotransporte() {
    }

    public Tipotransporte(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public Integer getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
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
        hash += (idtipotransporte != null ? idtipotransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotransporte)) {
            return false;
        }
        Tipotransporte other = (Tipotransporte) object;
        if ((this.idtipotransporte == null && other.idtipotransporte != null) || (this.idtipotransporte != null && !this.idtipotransporte.equals(other.idtipotransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipotransporte[ idtipotransporte=" + idtipotransporte + " ]";
    }
    
}
