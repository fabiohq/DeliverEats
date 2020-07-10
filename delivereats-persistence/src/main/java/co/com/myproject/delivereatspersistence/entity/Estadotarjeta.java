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
@Table(name = "estadotrajeta")
@NamedQueries({
    @NamedQuery(name = "Estadotrajeta.findAll", query = "SELECT e FROM Estadotrajeta e"),
    @NamedQuery(name = "Estadotrajeta.findByIdestadotrajeta", query = "SELECT e FROM Estadotrajeta e WHERE e.idestadotrajeta = :idestadotrajeta"),
    @NamedQuery(name = "Estadotrajeta.findByNombre", query = "SELECT e FROM Estadotrajeta e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadotrajeta.findByCodigo", query = "SELECT e FROM Estadotrajeta e WHERE e.codigo = :codigo")})
public class Estadotarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadotrajeta")
    private Integer idestadotrajeta;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadotarjeta() {
    }

    public Estadotarjeta(Integer idestadotrajeta) {
        this.idestadotrajeta = idestadotrajeta;
    }

    public Integer getIdestadotrajeta() {
        return idestadotrajeta;
    }

    public void setIdestadotrajeta(Integer idestadotrajeta) {
        this.idestadotrajeta = idestadotrajeta;
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
        hash += (idestadotrajeta != null ? idestadotrajeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadotarjeta)) {
            return false;
        }
        Estadotarjeta other = (Estadotarjeta) object;
        if ((this.idestadotrajeta == null && other.idestadotrajeta != null) || (this.idestadotrajeta != null && !this.idestadotrajeta.equals(other.idestadotrajeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadotrajeta[ idestadotrajeta=" + idestadotrajeta + " ]";
    }
    
}
