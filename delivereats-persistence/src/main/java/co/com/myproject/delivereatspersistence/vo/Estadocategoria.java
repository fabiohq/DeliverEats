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
@Table(name = "estadocategoria")
@NamedQueries({
    @NamedQuery(name = "Estadocategoria.findAll", query = "SELECT e FROM Estadocategoria e"),
    @NamedQuery(name = "Estadocategoria.findByIdestadocategoria", query = "SELECT e FROM Estadocategoria e WHERE e.idestadocategoria = :idestadocategoria"),
    @NamedQuery(name = "Estadocategoria.findByNombre", query = "SELECT e FROM Estadocategoria e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadocategoria.findByCodigo", query = "SELECT e FROM Estadocategoria e WHERE e.codigo = :codigo")})
public class Estadocategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadocategoria")
    private Integer idestadocategoria;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadocategoria() {
    }

    public Estadocategoria(Integer idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
    }

    public Integer getIdestadocategoria() {
        return idestadocategoria;
    }

    public void setIdestadocategoria(Integer idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
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
        hash += (idestadocategoria != null ? idestadocategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadocategoria)) {
            return false;
        }
        Estadocategoria other = (Estadocategoria) object;
        if ((this.idestadocategoria == null && other.idestadocategoria != null) || (this.idestadocategoria != null && !this.idestadocategoria.equals(other.idestadocategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadocategoria[ idestadocategoria=" + idestadocategoria + " ]";
    }
    
}
