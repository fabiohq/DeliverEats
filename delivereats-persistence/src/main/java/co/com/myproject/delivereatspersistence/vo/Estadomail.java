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
@Table(name = "estadomail")
@NamedQueries({
    @NamedQuery(name = "Estadomail.findAll", query = "SELECT e FROM Estadomail e"),
    @NamedQuery(name = "Estadomail.findByIdestadomail", query = "SELECT e FROM Estadomail e WHERE e.idestadomail = :idestadomail"),
    @NamedQuery(name = "Estadomail.findByNombre", query = "SELECT e FROM Estadomail e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadomail.findByCodigo", query = "SELECT e FROM Estadomail e WHERE e.codigo = :codigo")})
public class Estadomail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadomail")
    private Integer idestadomail;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadomail() {
    }

    public Estadomail(Integer idestadomail) {
        this.idestadomail = idestadomail;
    }

    public Integer getIdestadomail() {
        return idestadomail;
    }

    public void setIdestadomail(Integer idestadomail) {
        this.idestadomail = idestadomail;
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
        hash += (idestadomail != null ? idestadomail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadomail)) {
            return false;
        }
        Estadomail other = (Estadomail) object;
        if ((this.idestadomail == null && other.idestadomail != null) || (this.idestadomail != null && !this.idestadomail.equals(other.idestadomail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadomail[ idestadomail=" + idestadomail + " ]";
    }
    
}
