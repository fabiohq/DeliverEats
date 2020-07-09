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
@Table(name = "estadopersona")
@NamedQueries({
    @NamedQuery(name = "Estadopersona.findAll", query = "SELECT e FROM Estadopersona e"),
    @NamedQuery(name = "Estadopersona.findByIdestadopersona", query = "SELECT e FROM Estadopersona e WHERE e.idestadopersona = :idestadopersona"),
    @NamedQuery(name = "Estadopersona.findByNombre", query = "SELECT e FROM Estadopersona e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadopersona.findByCodigo", query = "SELECT e FROM Estadopersona e WHERE e.codigo = :codigo")})
public class Estadopersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadopersona")
    private Integer idestadopersona;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadopersona() {
    }

    public Estadopersona(Integer idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    public Integer getIdestadopersona() {
        return idestadopersona;
    }

    public void setIdestadopersona(Integer idestadopersona) {
        this.idestadopersona = idestadopersona;
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
        hash += (idestadopersona != null ? idestadopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadopersona)) {
            return false;
        }
        Estadopersona other = (Estadopersona) object;
        if ((this.idestadopersona == null && other.idestadopersona != null) || (this.idestadopersona != null && !this.idestadopersona.equals(other.idestadopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadopersona[ idestadopersona=" + idestadopersona + " ]";
    }
    
}
