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
@Table(name = "estadotransporte")
@NamedQueries({
    @NamedQuery(name = "Estadotransporte.findAll", query = "SELECT e FROM Estadotransporte e"),
    @NamedQuery(name = "Estadotransporte.findByIdestadotransporte", query = "SELECT e FROM Estadotransporte e WHERE e.idestadotransporte = :idestadotransporte"),
    @NamedQuery(name = "Estadotransporte.findByNombre", query = "SELECT e FROM Estadotransporte e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadotransporte.findByCodigo", query = "SELECT e FROM Estadotransporte e WHERE e.codigo = :codigo")})
public class Estadotransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadotransporte")
    private Integer idestadotransporte;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadotransporte() {
    }

    public Estadotransporte(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    public Integer getIdestadotransporte() {
        return idestadotransporte;
    }

    public void setIdestadotransporte(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadotransporte != null ? idestadotransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadotransporte)) {
            return false;
        }
        Estadotransporte other = (Estadotransporte) object;
        if ((this.idestadotransporte == null && other.idestadotransporte != null) || (this.idestadotransporte != null && !this.idestadotransporte.equals(other.idestadotransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadotransporte[ idestadotransporte=" + idestadotransporte + " ]";
    }
    
}
