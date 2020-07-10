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
@Table(name = "estadoproducto")
@NamedQueries({
    @NamedQuery(name = "Estadoproducto.findAll", query = "SELECT e FROM Estadoproducto e"),
    @NamedQuery(name = "Estadoproducto.findByIdestadoproducto", query = "SELECT e FROM Estadoproducto e WHERE e.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Estadoproducto.findByNombre", query = "SELECT e FROM Estadoproducto e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoproducto.findByCodigo", query = "SELECT e FROM Estadoproducto e WHERE e.codigo = :codigo")})
public class Estadoproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoproducto")
    private Integer idestadoproducto;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadoproducto() {
    }

    public Estadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    public Integer getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
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
        hash += (idestadoproducto != null ? idestadoproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoproducto)) {
            return false;
        }
        Estadoproducto other = (Estadoproducto) object;
        if ((this.idestadoproducto == null && other.idestadoproducto != null) || (this.idestadoproducto != null && !this.idestadoproducto.equals(other.idestadoproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadoproducto[ idestadoproducto=" + idestadoproducto + " ]";
    }
    
}
