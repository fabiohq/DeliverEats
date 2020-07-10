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
@Table(name = "adiciones")
@NamedQueries({
    @NamedQuery(name = "Adiciones.findAll", query = "SELECT a FROM Adiciones a"),
    @NamedQuery(name = "Adiciones.findByIdadiciones", query = "SELECT a FROM Adiciones a WHERE a.idadiciones = :idadiciones"),
    @NamedQuery(name = "Adiciones.findByIdestadoproducto", query = "SELECT a FROM Adiciones a WHERE a.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Adiciones.findByIdtipoproducto", query = "SELECT a FROM Adiciones a WHERE a.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Adiciones.findByIdproducto", query = "SELECT a FROM Adiciones a WHERE a.idproducto = :idproducto"),
    @NamedQuery(name = "Adiciones.findByNombre", query = "SELECT a FROM Adiciones a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Adiciones.findByAdiciones", query = "SELECT a FROM Adiciones a WHERE a.adiciones = :adiciones"),
    @NamedQuery(name = "Adiciones.findByDescripcion", query = "SELECT a FROM Adiciones a WHERE a.descripcion = :descripcion")})
public class Adiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idadiciones")
    private Integer idadiciones;
    @Column(name = "idestadoproducto")
    private Integer idestadoproducto;
    @Column(name = "idtipoproducto")
    private Integer idtipoproducto;
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 1000)
    @Column(name = "adiciones")
    private String adiciones;
    @Size(max = 1000)
    @Column(name = "descripcion")
    private String descripcion;

    public Adiciones() {
    }

    public Adiciones(Integer idadiciones) {
        this.idadiciones = idadiciones;
    }

    public Integer getIdadiciones() {
        return idadiciones;
    }

    public void setIdadiciones(Integer idadiciones) {
        this.idadiciones = idadiciones;
    }

    public Integer getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    public Integer getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdiciones() {
        return adiciones;
    }

    public void setAdiciones(String adiciones) {
        this.adiciones = adiciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idadiciones != null ? idadiciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adiciones)) {
            return false;
        }
        Adiciones other = (Adiciones) object;
        if ((this.idadiciones == null && other.idadiciones != null) || (this.idadiciones != null && !this.idadiciones.equals(other.idadiciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Adiciones[ idadiciones=" + idadiciones + " ]";
    }
    
}
