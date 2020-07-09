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
@Table(name = "transporte")
@NamedQueries({
    @NamedQuery(name = "Transporte.findAll", query = "SELECT t FROM Transporte t"),
    @NamedQuery(name = "Transporte.findByIdtransporte", query = "SELECT t FROM Transporte t WHERE t.idtransporte = :idtransporte"),
    @NamedQuery(name = "Transporte.findByNombre", query = "SELECT t FROM Transporte t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Transporte.findByObservacion", query = "SELECT t FROM Transporte t WHERE t.observacion = :observacion"),
    @NamedQuery(name = "Transporte.findByFechaini", query = "SELECT t FROM Transporte t WHERE t.fechaini = :fechaini"),
    @NamedQuery(name = "Transporte.findByFechafin", query = "SELECT t FROM Transporte t WHERE t.fechafin = :fechafin"),
    @NamedQuery(name = "Transporte.findByPlaca", query = "SELECT t FROM Transporte t WHERE t.placa = :placa"),
    @NamedQuery(name = "Transporte.findBySeguro", query = "SELECT t FROM Transporte t WHERE t.seguro = :seguro")})
public class Transporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtransporte")
    private Integer idtransporte;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;
    @Size(max = 20)
    @Column(name = "placa")
    private String placa;
    @Size(max = 100)
    @Column(name = "seguro")
    private String seguro;

    public Transporte() {
    }

    public Transporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    public Integer getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtransporte != null ? idtransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.idtransporte == null && other.idtransporte != null) || (this.idtransporte != null && !this.idtransporte.equals(other.idtransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Transporte[ idtransporte=" + idtransporte + " ]";
    }
    
}
