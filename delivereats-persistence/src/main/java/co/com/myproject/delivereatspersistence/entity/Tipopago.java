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
@Table(name = "tipopago")
@NamedQueries({
    @NamedQuery(name = "Tipopago.findAll", query = "SELECT t FROM Tipopago t"),
    @NamedQuery(name = "Tipopago.findByIdtipopago", query = "SELECT t FROM Tipopago t WHERE t.idtipopago = :idtipopago"),
    @NamedQuery(name = "Tipopago.findByNombre", query = "SELECT t FROM Tipopago t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipopago.findByObservacion", query = "SELECT t FROM Tipopago t WHERE t.observacion = :observacion")})
public class Tipopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopago")
    private Integer idtipopago;
    @Size(max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipopago() {
    }

    public Tipopago(Integer idtipopago) {
        this.idtipopago = idtipopago;
    }

    public Integer getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(Integer idtipopago) {
        this.idtipopago = idtipopago;
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
        hash += (idtipopago != null ? idtipopago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopago)) {
            return false;
        }
        Tipopago other = (Tipopago) object;
        if ((this.idtipopago == null && other.idtipopago != null) || (this.idtipopago != null && !this.idtipopago.equals(other.idtipopago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipopago[ idtipopago=" + idtipopago + " ]";
    }
    
}
