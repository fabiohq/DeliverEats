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
@Table(name = "estadopedido")
@NamedQueries({
    @NamedQuery(name = "Estadopedido.findAll", query = "SELECT e FROM Estadopedido e"),
    @NamedQuery(name = "Estadopedido.findByIdestadopedido", query = "SELECT e FROM Estadopedido e WHERE e.idestadopedido = :idestadopedido"),
    @NamedQuery(name = "Estadopedido.findByNombre", query = "SELECT e FROM Estadopedido e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadopedido.findByCodigo", query = "SELECT e FROM Estadopedido e WHERE e.codigo = :codigo")})
public class Estadopedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadopedido")
    private Integer idestadopedido;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadopedido() {
    }

    public Estadopedido(Integer idestadopedido) {
        this.idestadopedido = idestadopedido;
    }

    public Integer getIdestadopedido() {
        return idestadopedido;
    }

    public void setIdestadopedido(Integer idestadopedido) {
        this.idestadopedido = idestadopedido;
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
        hash += (idestadopedido != null ? idestadopedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadopedido)) {
            return false;
        }
        Estadopedido other = (Estadopedido) object;
        if ((this.idestadopedido == null && other.idestadopedido != null) || (this.idestadopedido != null && !this.idestadopedido.equals(other.idestadopedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadopedido[ idestadopedido=" + idestadopedido + " ]";
    }
    
}
