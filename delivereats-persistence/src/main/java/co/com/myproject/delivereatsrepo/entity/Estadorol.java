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
@Table(name = "estadorol")
@NamedQueries({
    @NamedQuery(name = "Estadorol.findAll", query = "SELECT e FROM Estadorol e"),
    @NamedQuery(name = "Estadorol.findByIdestadorol", query = "SELECT e FROM Estadorol e WHERE e.idestadorol = :idestadorol"),
    @NamedQuery(name = "Estadorol.findByNombre", query = "SELECT e FROM Estadorol e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadorol.findByCodigo", query = "SELECT e FROM Estadorol e WHERE e.codigo = :codigo")})
public class Estadorol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadorol")
    private Integer idestadorol;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadorol() {
    }

    public Estadorol(Integer idestadorol) {
        this.idestadorol = idestadorol;
    }

    public Integer getIdestadorol() {
        return idestadorol;
    }

    public void setIdestadorol(Integer idestadorol) {
        this.idestadorol = idestadorol;
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
        hash += (idestadorol != null ? idestadorol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadorol)) {
            return false;
        }
        Estadorol other = (Estadorol) object;
        if ((this.idestadorol == null && other.idestadorol != null) || (this.idestadorol != null && !this.idestadorol.equals(other.idestadorol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Estadorol[ idestadorol=" + idestadorol + " ]";
    }
    
}
