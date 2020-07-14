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
@Table(name = "telefono")
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t"),
    @NamedQuery(name = "Telefono.findByIdtelefono", query = "SELECT t FROM Telefono t WHERE t.idtelefono = :idtelefono"),
    @NamedQuery(name = "Telefono.findByNumero", query = "SELECT t FROM Telefono t WHERE t.numero = :numero"),
    @NamedQuery(name = "Telefono.findByObservacion", query = "SELECT t FROM Telefono t WHERE t.observacion = :observacion"),
    @NamedQuery(name = "Telefono.findByFechaini", query = "SELECT t FROM Telefono t WHERE t.fechaini = :fechaini"),
    @NamedQuery(name = "Telefono.findByFehcafin", query = "SELECT t FROM Telefono t WHERE t.fehcafin = :fehcafin")})
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefono")
    private Integer idtelefono;
    @Size(max = 20)
    @Column(name = "numero")
    private String numero;
    @Size(max = 1000)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fehcafin")
    private String fehcafin;

    public Telefono() {
    }

    public Telefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public Integer getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getFehcafin() {
        return fehcafin;
    }

    public void setFehcafin(String fehcafin) {
        this.fehcafin = fehcafin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefono != null ? idtelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.idtelefono == null && other.idtelefono != null) || (this.idtelefono != null && !this.idtelefono.equals(other.idtelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Telefono[ idtelefono=" + idtelefono + " ]";
    }
    
}
