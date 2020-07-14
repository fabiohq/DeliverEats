/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.vo;

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
@Table(name = "combo")
@NamedQueries({
    @NamedQuery(name = "Combo.findAll", query = "SELECT c FROM Combo c"),
    @NamedQuery(name = "Combo.findByIdcombo", query = "SELECT c FROM Combo c WHERE c.idcombo = :idcombo"),
    @NamedQuery(name = "Combo.findByIdestadoproducto", query = "SELECT c FROM Combo c WHERE c.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Combo.findByIdtipoproducto", query = "SELECT c FROM Combo c WHERE c.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Combo.findByIdproducto", query = "SELECT c FROM Combo c WHERE c.idproducto = :idproducto"),
    @NamedQuery(name = "Combo.findByNombre", query = "SELECT c FROM Combo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Combo.findByAdiciones", query = "SELECT c FROM Combo c WHERE c.adiciones = :adiciones"),
    @NamedQuery(name = "Combo.findByDescripcion", query = "SELECT c FROM Combo c WHERE c.descripcion = :descripcion")})
public class Combo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcombo")
    private Integer idcombo;
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

    public Combo() {
    }

    public Combo(Integer idcombo) {
        this.idcombo = idcombo;
    }

    public Integer getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(Integer idcombo) {
        this.idcombo = idcombo;
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
        hash += (idcombo != null ? idcombo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combo)) {
            return false;
        }
        Combo other = (Combo) object;
        if ((this.idcombo == null && other.idcombo != null) || (this.idcombo != null && !this.idcombo.equals(other.idcombo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Combo[ idcombo=" + idcombo + " ]";
    }
    
}
