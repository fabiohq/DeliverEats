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
@Table(name = "tipopedido")
@NamedQueries({
    @NamedQuery(name = "Tipopedido.findAll", query = "SELECT t FROM Tipopedido t"),
    @NamedQuery(name = "Tipopedido.findByIdtipopedido", query = "SELECT t FROM Tipopedido t WHERE t.idtipopedido = :idtipopedido"),
    @NamedQuery(name = "Tipopedido.findByNombre", query = "SELECT t FROM Tipopedido t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipopedido.findByObservacion", query = "SELECT t FROM Tipopedido t WHERE t.observacion = :observacion")})
public class Tipopedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopedido")
    private Integer idtipopedido;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "observacion")
    private String observacion;

    public Tipopedido() {
    }

    public Tipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
    }

    public Integer getIdtipopedido() {
        return idtipopedido;
    }

    public void setIdtipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
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
        hash += (idtipopedido != null ? idtipopedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopedido)) {
            return false;
        }
        Tipopedido other = (Tipopedido) object;
        if ((this.idtipopedido == null && other.idtipopedido != null) || (this.idtipopedido != null && !this.idtipopedido.equals(other.idtipopedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipopedido[ idtipopedido=" + idtipopedido + " ]";
    }
    
}
