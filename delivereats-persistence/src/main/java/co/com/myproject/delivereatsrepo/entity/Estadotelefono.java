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
@Table(name = "estadotelefono")
@NamedQueries({
    @NamedQuery(name = "Estadotelefono.findAll", query = "SELECT e FROM Estadotelefono e"),
    @NamedQuery(name = "Estadotelefono.findByIdestadotelefono", query = "SELECT e FROM Estadotelefono e WHERE e.idestadotelefono = :idestadotelefono"),
    @NamedQuery(name = "Estadotelefono.findByNombre", query = "SELECT e FROM Estadotelefono e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadotelefono.findByCodigo", query = "SELECT e FROM Estadotelefono e WHERE e.codigo = :codigo")})
public class Estadotelefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadotelefono")
    private Integer idestadotelefono;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadotelefono() {
    }

    public Estadotelefono(Integer idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
    }

    public Integer getIdestadotelefono() {
        return idestadotelefono;
    }

    public void setIdestadotelefono(Integer idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
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
        hash += (idestadotelefono != null ? idestadotelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadotelefono)) {
            return false;
        }
        Estadotelefono other = (Estadotelefono) object;
        if ((this.idestadotelefono == null && other.idestadotelefono != null) || (this.idestadotelefono != null && !this.idestadotelefono.equals(other.idestadotelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadotelefono[ idestadotelefono=" + idestadotelefono + " ]";
    }
    
}
