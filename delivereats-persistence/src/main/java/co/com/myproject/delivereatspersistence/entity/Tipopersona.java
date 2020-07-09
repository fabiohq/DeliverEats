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
@Table(name = "tipopersona")
@NamedQueries({
    @NamedQuery(name = "Tipopersona.findAll", query = "SELECT t FROM Tipopersona t"),
    @NamedQuery(name = "Tipopersona.findByIdtipopersona", query = "SELECT t FROM Tipopersona t WHERE t.idtipopersona = :idtipopersona"),
    @NamedQuery(name = "Tipopersona.findByNombre", query = "SELECT t FROM Tipopersona t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipopersona.findByObservacion", query = "SELECT t FROM Tipopersona t WHERE t.observacion = :observacion"),
    @NamedQuery(name = "Tipopersona.findByFechaini", query = "SELECT t FROM Tipopersona t WHERE t.fechaini = :fechaini"),
    @NamedQuery(name = "Tipopersona.findByFechafin", query = "SELECT t FROM Tipopersona t WHERE t.fechafin = :fechafin")})
public class Tipopersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopersona")
    private Integer idtipopersona;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;

    public Tipopersona() {
    }

    public Tipopersona(Integer idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public Integer getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(Integer idtipopersona) {
        this.idtipopersona = idtipopersona;
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

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopersona != null ? idtipopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopersona)) {
            return false;
        }
        Tipopersona other = (Tipopersona) object;
        if ((this.idtipopersona == null && other.idtipopersona != null) || (this.idtipopersona != null && !this.idtipopersona.equals(other.idtipopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipopersona[ idtipopersona=" + idtipopersona + " ]";
    }
    
}
