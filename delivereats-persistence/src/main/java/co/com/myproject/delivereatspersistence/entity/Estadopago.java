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
@Table(name = "estadopago")
@NamedQueries({
    @NamedQuery(name = "Estadopago.findAll", query = "SELECT e FROM Estadopago e"),
    @NamedQuery(name = "Estadopago.findByIdestadopago", query = "SELECT e FROM Estadopago e WHERE e.idestadopago = :idestadopago"),
    @NamedQuery(name = "Estadopago.findByNombre", query = "SELECT e FROM Estadopago e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estadopago.findByCodigo", query = "SELECT e FROM Estadopago e WHERE e.codigo = :codigo")})
public class Estadopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadopago")
    private Integer idestadopago;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;

    public Estadopago() {
    }

    public Estadopago(Integer idestadopago) {
        this.idestadopago = idestadopago;
    }

    public Integer getIdestadopago() {
        return idestadopago;
    }

    public void setIdestadopago(Integer idestadopago) {
        this.idestadopago = idestadopago;
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
        hash += (idestadopago != null ? idestadopago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadopago)) {
            return false;
        }
        Estadopago other = (Estadopago) object;
        if ((this.idestadopago == null && other.idestadopago != null) || (this.idestadopago != null && !this.idestadopago.equals(other.idestadopago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Estadopago[ idestadopago=" + idestadopago + " ]";
    }
    
}
