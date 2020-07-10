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
public class TransporteestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtransporte")
    private int idtransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipotransporte")
    private int idtipotransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadotransporte")
    private int idestadotransporte;

    public TransporteestadotipoPK() {
    }

    public TransporteestadotipoPK(int idtransporte, int idtipotransporte, int idestadotransporte) {
        this.idtransporte = idtransporte;
        this.idtipotransporte = idtipotransporte;
        this.idestadotransporte = idestadotransporte;
    }

    public int getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(int idtransporte) {
        this.idtransporte = idtransporte;
    }

    public int getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(int idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public int getIdestadotransporte() {
        return idestadotransporte;
    }

    public void setIdestadotransporte(int idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtransporte;
        hash += (int) idtipotransporte;
        hash += (int) idestadotransporte;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransporteestadotipoPK)) {
            return false;
        }
        TransporteestadotipoPK other = (TransporteestadotipoPK) object;
        if (this.idtransporte != other.idtransporte) {
            return false;
        }
        if (this.idtipotransporte != other.idtipotransporte) {
            return false;
        }
        if (this.idestadotransporte != other.idestadotransporte) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.TransporteestadotipoPK[ idtransporte=" + idtransporte + ", idtipotransporte=" + idtipotransporte + ", idestadotransporte=" + idestadotransporte + " ]";
    }
    
}
