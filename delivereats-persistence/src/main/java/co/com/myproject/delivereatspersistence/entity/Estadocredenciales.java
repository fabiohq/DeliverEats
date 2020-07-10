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
@Table(name = "estadocredenciales")
@NamedQueries({
    @NamedQuery(name = "Estadocredenciales.findAll", query = "SELECT e FROM Estadocredenciales e"),
    @NamedQuery(name = "Estadocredenciales.findByIdestadocredenciales", query = "SELECT e FROM Estadocredenciales e WHERE e.idestadocredenciales = :idestadocredenciales"),
    @NamedQuery(name = "Estadocredenciales.findByNombre", query = "SELECT e FROM Estadocredenciales e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadocredenciales.findByCodigo", query = "SELECT e FROM Estadocredenciales e WHERE e.codigo = :codigo")})
public class Estadocredenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadocredenciales")
    private Integer idestadocredenciales;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadocredenciales() {
    }

    public Estadocredenciales(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
    }

    public Integer getIdestadocredenciales() {
        return idestadocredenciales;
    }

    public void setIdestadocredenciales(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
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
        hash += (idestadocredenciales != null ? idestadocredenciales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadocredenciales)) {
            return false;
        }
        Estadocredenciales other = (Estadocredenciales) object;
        if ((this.idestadocredenciales == null && other.idestadocredenciales != null) || (this.idestadocredenciales != null && !this.idestadocredenciales.equals(other.idestadocredenciales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadocredenciales[ idestadocredenciales=" + idestadocredenciales + " ]";
    }
    
}
