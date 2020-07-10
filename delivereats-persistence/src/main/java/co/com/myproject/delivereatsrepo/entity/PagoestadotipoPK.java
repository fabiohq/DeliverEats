/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

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
public class PagoestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idpago")
    private int idpago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipopago")
    private int idtipopago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadopago")
    private int idestadopago;

    public PagoestadotipoPK() {
    }

    public PagoestadotipoPK(int idpago, int idtipopago, int idestadopago) {
        this.idpago = idpago;
        this.idtipopago = idtipopago;
        this.idestadopago = idestadopago;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(int idtipopago) {
        this.idtipopago = idtipopago;
    }

    public int getIdestadopago() {
        return idestadopago;
    }

    public void setIdestadopago(int idestadopago) {
        this.idestadopago = idestadopago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idpago;
        hash += (int) idtipopago;
        hash += (int) idestadopago;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoestadotipoPK)) {
            return false;
        }
        PagoestadotipoPK other = (PagoestadotipoPK) object;
        if (this.idpago != other.idpago) {
            return false;
        }
        if (this.idtipopago != other.idtipopago) {
            return false;
        }
        if (this.idestadopago != other.idestadopago) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.PagoestadotipoPK[ idpago=" + idpago + ", idtipopago=" + idtipopago + ", idestadopago=" + idestadopago + " ]";
    }
    
}
