/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

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
@Table(name = "estadoturno")
@NamedQueries({
    @NamedQuery(name = "Estadoturno.findAll", query = "SELECT e FROM Estadoturno e"),
    @NamedQuery(name = "Estadoturno.findByIdestadoturno", query = "SELECT e FROM Estadoturno e WHERE e.idestadoturno = :idestadoturno"),
    @NamedQuery(name = "Estadoturno.findByNombre", query = "SELECT e FROM Estadoturno e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadoturno.findByCodigo", query = "SELECT e FROM Estadoturno e WHERE e.codigo = :codigo")})
public class Estadoturno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoturno")
    private Integer idestadoturno;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;

    public Estadoturno() {
    }

    public Estadoturno(Integer idestadoturno) {
        this.idestadoturno = idestadoturno;
    }

    public Integer getIdestadoturno() {
        return idestadoturno;
    }

    public void setIdestadoturno(Integer idestadoturno) {
        this.idestadoturno = idestadoturno;
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
        hash += (idestadoturno != null ? idestadoturno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoturno)) {
            return false;
        }
        Estadoturno other = (Estadoturno) object;
        if ((this.idestadoturno == null && other.idestadoturno != null) || (this.idestadoturno != null && !this.idestadoturno.equals(other.idestadoturno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadoturno[ idestadoturno=" + idestadoturno + " ]";
    }
    
}
