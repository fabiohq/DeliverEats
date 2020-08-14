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
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Embeddable
public class ProductocomboPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idproductocombo")
    private Integer idproductocombo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idcombo")
    private Integer idcombo;

    public ProductocomboPK() {
    }

    public ProductocomboPK(Integer idproductocombo, Integer idcombo) {
        this.idproductocombo = idproductocombo;
        this.idcombo = idcombo;
    }

    public Integer getIdproductocombo() {
        return idproductocombo;
    }

    public void setIdproductocombo(Integer idproductocombo) {
        this.idproductocombo = idproductocombo;
    }

    public Integer getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(Integer idcombo) {
        this.idcombo = idcombo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idproductocombo;
        hash += (idcombo != null ? idcombo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductocomboPK)) {
            return false;
        }
        ProductocomboPK other = (ProductocomboPK) object;
        if (this.idproductocombo != other.idproductocombo) {
            return false;
        }
        if ((this.idcombo == null && other.idcombo != null) || (this.idcombo != null && !this.idcombo.equals(other.idcombo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.ProductocomboPK[ idproductocombo=" + idproductocombo + ", idcombo=" + idcombo + " ]";
    }
    
}
