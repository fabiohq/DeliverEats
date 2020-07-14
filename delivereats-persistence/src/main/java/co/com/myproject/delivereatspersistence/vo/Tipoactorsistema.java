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
@Table(name = "tipoactorsistema")
@NamedQueries({
    @NamedQuery(name = "Tipoactorsistema.findAll", query = "SELECT t FROM Tipoactorsistema t"),
    @NamedQuery(name = "Tipoactorsistema.findByIdtipoactorsistema", query = "SELECT t FROM Tipoactorsistema t WHERE t.idtipoactorsistema = :idtipoactorsistema"),
    @NamedQuery(name = "Tipoactorsistema.findByNombre", query = "SELECT t FROM Tipoactorsistema t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipoactorsistema.findByCodigo", query = "SELECT t FROM Tipoactorsistema t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "Tipoactorsistema.findByObservaacion", query = "SELECT t FROM Tipoactorsistema t WHERE t.observaacion = :observaacion")})
public class Tipoactorsistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoactorsistema")
    private Integer idtipoactorsistema;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 5)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 200)
    @Column(name = "observaacion")
    private String observaacion;

    public Tipoactorsistema() {
    }

    public Tipoactorsistema(Integer idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
    }

    public Integer getIdtipoactorsistema() {
        return idtipoactorsistema;
    }

    public void setIdtipoactorsistema(Integer idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
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

    public String getObservaacion() {
        return observaacion;
    }

    public void setObservaacion(String observaacion) {
        this.observaacion = observaacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoactorsistema != null ? idtipoactorsistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoactorsistema)) {
            return false;
        }
        Tipoactorsistema other = (Tipoactorsistema) object;
        if ((this.idtipoactorsistema == null && other.idtipoactorsistema != null) || (this.idtipoactorsistema != null && !this.idtipoactorsistema.equals(other.idtipoactorsistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipoactorsistema[ idtipoactorsistema=" + idtipoactorsistema + " ]";
    }
    
}
