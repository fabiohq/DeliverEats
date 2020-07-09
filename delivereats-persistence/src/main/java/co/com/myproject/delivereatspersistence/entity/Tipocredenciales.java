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
@Table(name = "tipocredenciales")
@NamedQueries({
    @NamedQuery(name = "Tipocredenciales.findAll", query = "SELECT t FROM Tipocredenciales t"),
    @NamedQuery(name = "Tipocredenciales.findByIdtipocredenciales", query = "SELECT t FROM Tipocredenciales t WHERE t.idtipocredenciales = :idtipocredenciales"),
    @NamedQuery(name = "Tipocredenciales.findByNombre", query = "SELECT t FROM Tipocredenciales t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipocredenciales.findByCodigo", query = "SELECT t FROM Tipocredenciales t WHERE t.codigo = :codigo")})
public class Tipocredenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocredenciales")
    private Integer idtipocredenciales;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "codigo")
    private String codigo;

    public Tipocredenciales() {
    }

    public Tipocredenciales(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
    }

    public Integer getIdtipocredenciales() {
        return idtipocredenciales;
    }

    public void setIdtipocredenciales(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
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
        hash += (idtipocredenciales != null ? idtipocredenciales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocredenciales)) {
            return false;
        }
        Tipocredenciales other = (Tipocredenciales) object;
        if ((this.idtipocredenciales == null && other.idtipocredenciales != null) || (this.idtipocredenciales != null && !this.idtipocredenciales.equals(other.idtipocredenciales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipocredenciales[ idtipocredenciales=" + idtipocredenciales + " ]";
    }
    
}
