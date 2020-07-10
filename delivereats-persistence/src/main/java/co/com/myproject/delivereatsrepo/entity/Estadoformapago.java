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
@Table(name = "estadoformapago")
@NamedQueries({
    @NamedQuery(name = "Estadoformapago.findAll", query = "SELECT e FROM Estadoformapago e"),
    @NamedQuery(name = "Estadoformapago.findByIdestadoformapago", query = "SELECT e FROM Estadoformapago e WHERE e.idestadoformapago = :idestadoformapago"),
    @NamedQuery(name = "Estadoformapago.findByNombre", query = "SELECT e FROM Estadoformapago e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoformapago.findByCodigo", query = "SELECT e FROM Estadoformapago e WHERE e.codigo = :codigo")})
public class Estadoformapago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoformapago")
    private Integer idestadoformapago;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadoformapago() {
    }

    public Estadoformapago(Integer idestadoformapago) {
        this.idestadoformapago = idestadoformapago;
    }

    public Integer getIdestadoformapago() {
        return idestadoformapago;
    }

    public void setIdestadoformapago(Integer idestadoformapago) {
        this.idestadoformapago = idestadoformapago;
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
        hash += (idestadoformapago != null ? idestadoformapago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoformapago)) {
            return false;
        }
        Estadoformapago other = (Estadoformapago) object;
        if ((this.idestadoformapago == null && other.idestadoformapago != null) || (this.idestadoformapago != null && !this.idestadoformapago.equals(other.idestadoformapago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadoformapago[ idestadoformapago=" + idestadoformapago + " ]";
    }
    
}
