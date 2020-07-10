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
@Table(name = "tipoformapago")
@NamedQueries({
    @NamedQuery(name = "Tipoformapago.findAll", query = "SELECT t FROM Tipoformapago t"),
    @NamedQuery(name = "Tipoformapago.findByIdtipoformapago", query = "SELECT t FROM Tipoformapago t WHERE t.idtipoformapago = :idtipoformapago"),
    @NamedQuery(name = "Tipoformapago.findByNombre", query = "SELECT t FROM Tipoformapago t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipoformapago.findByObservacion", query = "SELECT t FROM Tipoformapago t WHERE t.observacion = :observacion")})
public class Tipoformapago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoformapago")
    private Integer idtipoformapago;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipoformapago() {
    }

    public Tipoformapago(Integer idtipoformapago) {
        this.idtipoformapago = idtipoformapago;
    }

    public Integer getIdtipoformapago() {
        return idtipoformapago;
    }

    public void setIdtipoformapago(Integer idtipoformapago) {
        this.idtipoformapago = idtipoformapago;
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
        hash += (idtipoformapago != null ? idtipoformapago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoformapago)) {
            return false;
        }
        Tipoformapago other = (Tipoformapago) object;
        if ((this.idtipoformapago == null && other.idtipoformapago != null) || (this.idtipoformapago != null && !this.idtipoformapago.equals(other.idtipoformapago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Tipoformapago[ idtipoformapago=" + idtipoformapago + " ]";
    }
    
}
