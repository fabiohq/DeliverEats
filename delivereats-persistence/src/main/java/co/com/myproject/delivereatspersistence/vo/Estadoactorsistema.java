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
@Table(name = "estadoactorsistema")
@NamedQueries({
    @NamedQuery(name = "Estadoactorsistema.findAll", query = "SELECT e FROM Estadoactorsistema e"),
    @NamedQuery(name = "Estadoactorsistema.findByIdestadoactorsistema", query = "SELECT e FROM Estadoactorsistema e WHERE e.idestadoactorsistema = :idestadoactorsistema"),
    @NamedQuery(name = "Estadoactorsistema.findByNombre", query = "SELECT e FROM Estadoactorsistema e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoactorsistema.findByCodgo", query = "SELECT e FROM Estadoactorsistema e WHERE e.codgo = :codgo")})
public class Estadoactorsistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoactorsistema")
    private Integer idestadoactorsistema;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codgo")
    private String codgo;

    public Estadoactorsistema() {
    }

    public Estadoactorsistema(Integer idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public Integer getIdestadoactorsistema() {
        return idestadoactorsistema;
    }

    public void setIdestadoactorsistema(Integer idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodgo() {
        return codgo;
    }

    public void setCodgo(String codgo) {
        this.codgo = codgo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoactorsistema != null ? idestadoactorsistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoactorsistema)) {
            return false;
        }
        Estadoactorsistema other = (Estadoactorsistema) object;
        if ((this.idestadoactorsistema == null && other.idestadoactorsistema != null) || (this.idestadoactorsistema != null && !this.idestadoactorsistema.equals(other.idestadoactorsistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadoactorsistema[ idestadoactorsistema=" + idestadoactorsistema + " ]";
    }
    
}
