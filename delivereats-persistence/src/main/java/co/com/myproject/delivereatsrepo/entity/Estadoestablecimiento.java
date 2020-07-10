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
@Table(name = "estadoestablecimiento")
@NamedQueries({
    @NamedQuery(name = "Estadoestablecimiento.findAll", query = "SELECT e FROM Estadoestablecimiento e"),
    @NamedQuery(name = "Estadoestablecimiento.findByIdestadoestablecimiento", query = "SELECT e FROM Estadoestablecimiento e WHERE e.idestadoestablecimiento = :idestadoestablecimiento"),
    @NamedQuery(name = "Estadoestablecimiento.findByNombre", query = "SELECT e FROM Estadoestablecimiento e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoestablecimiento.findByCodigo", query = "SELECT e FROM Estadoestablecimiento e WHERE e.codigo = :codigo")})
public class Estadoestablecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoestablecimiento")
    private Integer idestadoestablecimiento;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadoestablecimiento() {
    }

    public Estadoestablecimiento(Integer idestadoestablecimiento) {
        this.idestadoestablecimiento = idestadoestablecimiento;
    }

    public Integer getIdestadoestablecimiento() {
        return idestadoestablecimiento;
    }

    public void setIdestadoestablecimiento(Integer idestadoestablecimiento) {
        this.idestadoestablecimiento = idestadoestablecimiento;
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
        hash += (idestadoestablecimiento != null ? idestadoestablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoestablecimiento)) {
            return false;
        }
        Estadoestablecimiento other = (Estadoestablecimiento) object;
        if ((this.idestadoestablecimiento == null && other.idestadoestablecimiento != null) || (this.idestadoestablecimiento != null && !this.idestadoestablecimiento.equals(other.idestadoestablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadoestablecimiento[ idestadoestablecimiento=" + idestadoestablecimiento + " ]";
    }
    
}
