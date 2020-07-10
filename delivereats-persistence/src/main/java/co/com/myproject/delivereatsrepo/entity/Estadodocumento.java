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
@Table(name = "estadodocumento")
@NamedQueries({
    @NamedQuery(name = "Estadodocumento.findAll", query = "SELECT e FROM Estadodocumento e"),
    @NamedQuery(name = "Estadodocumento.findByIdestadodocumento", query = "SELECT e FROM Estadodocumento e WHERE e.idestadodocumento = :idestadodocumento"),
    @NamedQuery(name = "Estadodocumento.findByNombre", query = "SELECT e FROM Estadodocumento e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadodocumento.findByCodigo", query = "SELECT e FROM Estadodocumento e WHERE e.codigo = :codigo")})
public class Estadodocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadodocumento")
    private Integer idestadodocumento;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadodocumento() {
    }

    public Estadodocumento(Integer idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
    }

    public Integer getIdestadodocumento() {
        return idestadodocumento;
    }

    public void setIdestadodocumento(Integer idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
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
        hash += (idestadodocumento != null ? idestadodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadodocumento)) {
            return false;
        }
        Estadodocumento other = (Estadodocumento) object;
        if ((this.idestadodocumento == null && other.idestadodocumento != null) || (this.idestadodocumento != null && !this.idestadodocumento.equals(other.idestadodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadodocumento[ idestadodocumento=" + idestadodocumento + " ]";
    }
    
}
