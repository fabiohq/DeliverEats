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
@Table(name = "tiporol")
@NamedQueries({
    @NamedQuery(name = "Tiporol.findAll", query = "SELECT t FROM Tiporol t"),
    @NamedQuery(name = "Tiporol.findByIdtiporol", query = "SELECT t FROM Tiporol t WHERE t.idtiporol = :idtiporol"),
    @NamedQuery(name = "Tiporol.findByNombre", query = "SELECT t FROM Tiporol t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tiporol.findByObservacion", query = "SELECT t FROM Tiporol t WHERE t.observacion = :observacion")})
public class Tiporol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiporol")
    private Integer idtiporol;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tiporol() {
    }

    public Tiporol(Integer idtiporol) {
        this.idtiporol = idtiporol;
    }

    public Integer getIdtiporol() {
        return idtiporol;
    }

    public void setIdtiporol(Integer idtiporol) {
        this.idtiporol = idtiporol;
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
        hash += (idtiporol != null ? idtiporol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiporol)) {
            return false;
        }
        Tiporol other = (Tiporol) object;
        if ((this.idtiporol == null && other.idtiporol != null) || (this.idtiporol != null && !this.idtiporol.equals(other.idtiporol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tiporol[ idtiporol=" + idtiporol + " ]";
    }
    
}
