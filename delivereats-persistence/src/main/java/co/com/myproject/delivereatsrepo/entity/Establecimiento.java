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
@Table(name = "establecimiento")
@NamedQueries({
    @NamedQuery(name = "Establecimiento.findAll", query = "SELECT e FROM Establecimiento e"),
    @NamedQuery(name = "Establecimiento.findByIdestablecimiento", query = "SELECT e FROM Establecimiento e WHERE e.idestablecimiento = :idestablecimiento"),
    @NamedQuery(name = "Establecimiento.findByNombre", query = "SELECT e FROM Establecimiento e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Establecimiento.findByObservacion", query = "SELECT e FROM Establecimiento e WHERE e.observacion = :observacion"),
    @NamedQuery(name = "Establecimiento.findByFechaini", query = "SELECT e FROM Establecimiento e WHERE e.fechaini = :fechaini"),
    @NamedQuery(name = "Establecimiento.findByFechafin", query = "SELECT e FROM Establecimiento e WHERE e.fechafin = :fechafin")})
public class Establecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestablecimiento")
    private Integer idestablecimiento;
    @Size(max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;

    public Establecimiento() {
    }

    public Establecimiento(Integer idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    public Integer getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(Integer idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
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
        hash += (idestablecimiento != null ? idestablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if ((this.idestablecimiento == null && other.idestablecimiento != null) || (this.idestablecimiento != null && !this.idestablecimiento.equals(other.idestablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Establecimiento[ idestablecimiento=" + idestablecimiento + " ]";
    }
    
}
