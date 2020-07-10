/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "tarjetaestadotipo")
@NamedQueries({
    @NamedQuery(name = "Tarjetaestadotipo.findAll", query = "SELECT t FROM Tarjetaestadotipo t"),
    @NamedQuery(name = "Tarjetaestadotipo.findByIdestadotrajeta", query = "SELECT t FROM Tarjetaestadotipo t WHERE t.tarjetaestadotipoPK.idestadotrajeta = :idestadotrajeta"),
    @NamedQuery(name = "Tarjetaestadotipo.findByIdtipotarjeta", query = "SELECT t FROM Tarjetaestadotipo t WHERE t.tarjetaestadotipoPK.idtipotarjeta = :idtipotarjeta"),
    @NamedQuery(name = "Tarjetaestadotipo.findByIdtarjeta", query = "SELECT t FROM Tarjetaestadotipo t WHERE t.tarjetaestadotipoPK.idtarjeta = :idtarjeta"),
    @NamedQuery(name = "Tarjetaestadotipo.findByIdactorsistema", query = "SELECT t FROM Tarjetaestadotipo t WHERE t.idactorsistema = :idactorsistema")})
public class Tarjetaestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarjetaestadotipoPK tarjetaestadotipoPK;
    @Column(name = "idactorsistema")
    private Integer idactorsistema;

    public Tarjetaestadotipo() {
    }

    public Tarjetaestadotipo(TarjetaestadotipoPK tarjetaestadotipoPK) {
        this.tarjetaestadotipoPK = tarjetaestadotipoPK;
    }

    public Tarjetaestadotipo(int idestadotrajeta, int idtipotarjeta, int idtarjeta) {
        this.tarjetaestadotipoPK = new TarjetaestadotipoPK(idestadotrajeta, idtipotarjeta, idtarjeta);
    }

    public TarjetaestadotipoPK getTarjetaestadotipoPK() {
        return tarjetaestadotipoPK;
    }

    public void setTarjetaestadotipoPK(TarjetaestadotipoPK tarjetaestadotipoPK) {
        this.tarjetaestadotipoPK = tarjetaestadotipoPK;
    }

    public Integer getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarjetaestadotipoPK != null ? tarjetaestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetaestadotipo)) {
            return false;
        }
        Tarjetaestadotipo other = (Tarjetaestadotipo) object;
        if ((this.tarjetaestadotipoPK == null && other.tarjetaestadotipoPK != null) || (this.tarjetaestadotipoPK != null && !this.tarjetaestadotipoPK.equals(other.tarjetaestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Tarjetaestadotipo[ tarjetaestadotipoPK=" + tarjetaestadotipoPK + " ]";
    }
    
}
