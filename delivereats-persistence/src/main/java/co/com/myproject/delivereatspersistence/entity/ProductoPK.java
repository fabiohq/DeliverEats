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
public class ProductoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idproducto")
    private int idproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoproducto")
    private int idtipoproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoproducto")
    private int idestadoproducto;

    public ProductoPK() {
    }

    public ProductoPK(int idproducto, int idtipoproducto, int idestadoproducto) {
        this.idproducto = idproducto;
        this.idtipoproducto = idtipoproducto;
        this.idestadoproducto = idestadoproducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(int idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public int getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(int idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idproducto;
        hash += (int) idtipoproducto;
        hash += (int) idestadoproducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoPK)) {
            return false;
        }
        ProductoPK other = (ProductoPK) object;
        if (this.idproducto != other.idproducto) {
            return false;
        }
        if (this.idtipoproducto != other.idtipoproducto) {
            return false;
        }
        if (this.idestadoproducto != other.idestadoproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.ProductoPK[ idproducto=" + idproducto + ", idtipoproducto=" + idtipoproducto + ", idestadoproducto=" + idestadoproducto + " ]";
    }
    
}
