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
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Embeddable
public class ProductoadicionesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idproductoadiciones")
    private int idproductoadiciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idadiciones")
    private String idadiciones;

    public ProductoadicionesPK() {
    }

    public ProductoadicionesPK(int idproductoadiciones, String idadiciones) {
        this.idproductoadiciones = idproductoadiciones;
        this.idadiciones = idadiciones;
    }

    public int getIdproductoadiciones() {
        return idproductoadiciones;
    }

    public void setIdproductoadiciones(int idproductoadiciones) {
        this.idproductoadiciones = idproductoadiciones;
    }

    public String getIdadiciones() {
        return idadiciones;
    }

    public void setIdadiciones(String idadiciones) {
        this.idadiciones = idadiciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idproductoadiciones;
        hash += (idadiciones != null ? idadiciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoadicionesPK)) {
            return false;
        }
        ProductoadicionesPK other = (ProductoadicionesPK) object;
        if (this.idproductoadiciones != other.idproductoadiciones) {
            return false;
        }
        if ((this.idadiciones == null && other.idadiciones != null) || (this.idadiciones != null && !this.idadiciones.equals(other.idadiciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.ProductoadicionesPK[ idproductoadiciones=" + idproductoadiciones + ", idadiciones=" + idadiciones + " ]";
    }
    
}
