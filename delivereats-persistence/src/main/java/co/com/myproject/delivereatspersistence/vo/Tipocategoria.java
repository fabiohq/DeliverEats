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
@Table(name = "tipocategoria")
@NamedQueries({
    @NamedQuery(name = "Tipocategoria.findAll", query = "SELECT t FROM Tipocategoria t"),
    @NamedQuery(name = "Tipocategoria.findByIdtipocategoria", query = "SELECT t FROM Tipocategoria t WHERE t.idtipocategoria = :idtipocategoria"),
    @NamedQuery(name = "Tipocategoria.findByNombre", query = "SELECT t FROM Tipocategoria t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipocategoria.findByObservacion", query = "SELECT t FROM Tipocategoria t WHERE t.observacion = :observacion")})
public class Tipocategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocategoria")
    private Integer idtipocategoria;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;

    public Tipocategoria() {
    }

    public Tipocategoria(Integer idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public Integer getIdtipocategoria() {
        return idtipocategoria;
    }

    public void setIdtipocategoria(Integer idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocategoria != null ? idtipocategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocategoria)) {
            return false;
        }
        Tipocategoria other = (Tipocategoria) object;
        if ((this.idtipocategoria == null && other.idtipocategoria != null) || (this.idtipocategoria != null && !this.idtipocategoria.equals(other.idtipocategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipocategoria[ idtipocategoria=" + idtipocategoria + " ]";
    }
    
}
