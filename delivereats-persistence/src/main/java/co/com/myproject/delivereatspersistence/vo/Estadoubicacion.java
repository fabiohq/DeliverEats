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
@Table(name = "estadoubicacion")
@NamedQueries({
    @NamedQuery(name = "Estadoubicacion.findAll", query = "SELECT e FROM Estadoubicacion e"),
    @NamedQuery(name = "Estadoubicacion.findByIdestadoubicacion", query = "SELECT e FROM Estadoubicacion e WHERE e.idestadoubicacion = :idestadoubicacion"),
    @NamedQuery(name = "Estadoubicacion.findByNombre", query = "SELECT e FROM Estadoubicacion e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoubicacion.findByCodigo", query = "SELECT e FROM Estadoubicacion e WHERE e.codigo = :codigo")})
public class Estadoubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoubicacion")
    private Integer idestadoubicacion;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadoubicacion() {
    }

    public Estadoubicacion(Integer idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
    }

    public Integer getIdestadoubicacion() {
        return idestadoubicacion;
    }

    public void setIdestadoubicacion(Integer idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
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
        hash += (idestadoubicacion != null ? idestadoubicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoubicacion)) {
            return false;
        }
        Estadoubicacion other = (Estadoubicacion) object;
        if ((this.idestadoubicacion == null && other.idestadoubicacion != null) || (this.idestadoubicacion != null && !this.idestadoubicacion.equals(other.idestadoubicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadoubicacion[ idestadoubicacion=" + idestadoubicacion + " ]";
    }
    
}
