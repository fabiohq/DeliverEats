/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

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
@Table(name = "tipotelefono")
@NamedQueries({
    @NamedQuery(name = "Tipotelefono.findAll", query = "SELECT t FROM Tipotelefono t"),
    @NamedQuery(name = "Tipotelefono.findByIdtipotelefono", query = "SELECT t FROM Tipotelefono t WHERE t.idtipotelefono = :idtipotelefono"),
    @NamedQuery(name = "Tipotelefono.findByNombre", query = "SELECT t FROM Tipotelefono t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipotelefono.findByObservacion", query = "SELECT t FROM Tipotelefono t WHERE t.observacion = :observacion")})
public class Tipotelefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipotelefono")
    private Integer idtipotelefono;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipotelefono() {
    }

    public Tipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public Integer getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
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
        hash += (idtipotelefono != null ? idtipotelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotelefono)) {
            return false;
        }
        Tipotelefono other = (Tipotelefono) object;
        if ((this.idtipotelefono == null && other.idtipotelefono != null) || (this.idtipotelefono != null && !this.idtipotelefono.equals(other.idtipotelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Tipotelefono[ idtipotelefono=" + idtipotelefono + " ]";
    }
    
}
