/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fabio
 */
@Embeddable
public class TarjetaestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idestadotrajeta")
    private int idestadotrajeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipotarjeta")
    private int idtipotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtarjeta")
    private int idtarjeta;

    public TarjetaestadotipoPK() {
    }

    public TarjetaestadotipoPK(int idestadotrajeta, int idtipotarjeta, int idtarjeta) {
        this.idestadotrajeta = idestadotrajeta;
        this.idtipotarjeta = idtipotarjeta;
        this.idtarjeta = idtarjeta;
    }

    public int getIdestadotrajeta() {
        return idestadotrajeta;
    }

    public void setIdestadotrajeta(int idestadotrajeta) {
        this.idestadotrajeta = idestadotrajeta;
    }

    public int getIdtipotarjeta() {
        return idtipotarjeta;
    }

    public void setIdtipotarjeta(int idtipotarjeta) {
        this.idtipotarjeta = idtipotarjeta;
    }

    public int getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(int idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestadotrajeta;
        hash += (int) idtipotarjeta;
        hash += (int) idtarjeta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetaestadotipoPK)) {
            return false;
        }
        TarjetaestadotipoPK other = (TarjetaestadotipoPK) object;
        if (this.idestadotrajeta != other.idestadotrajeta) {
            return false;
        }
        if (this.idtipotarjeta != other.idtipotarjeta) {
            return false;
        }
        if (this.idtarjeta != other.idtarjeta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.TarjetaestadotipoPK[ idestadotrajeta=" + idestadotrajeta + ", idtipotarjeta=" + idtipotarjeta + ", idtarjeta=" + idtarjeta + " ]";
    }
    
}
