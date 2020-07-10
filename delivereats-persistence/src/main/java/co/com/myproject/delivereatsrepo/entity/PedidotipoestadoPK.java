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
public class PedidotipoestadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idestadopedido")
    private int idestadopedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipopedido")
    private int idtipopedido;

    public PedidotipoestadoPK() {
    }

    public PedidotipoestadoPK(int idestadopedido, int idpedido, int idtipopedido) {
        this.idestadopedido = idestadopedido;
        this.idpedido = idpedido;
        this.idtipopedido = idtipopedido;
    }

    public int getIdestadopedido() {
        return idestadopedido;
    }

    public void setIdestadopedido(int idestadopedido) {
        this.idestadopedido = idestadopedido;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdtipopedido() {
        return idtipopedido;
    }

    public void setIdtipopedido(int idtipopedido) {
        this.idtipopedido = idtipopedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestadopedido;
        hash += (int) idpedido;
        hash += (int) idtipopedido;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidotipoestadoPK)) {
            return false;
        }
        PedidotipoestadoPK other = (PedidotipoestadoPK) object;
        if (this.idestadopedido != other.idestadopedido) {
            return false;
        }
        if (this.idpedido != other.idpedido) {
            return false;
        }
        if (this.idtipopedido != other.idtipopedido) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.PedidotipoestadoPK[ idestadopedido=" + idestadopedido + ", idpedido=" + idpedido + ", idtipopedido=" + idtipopedido + " ]";
    }
    
}
