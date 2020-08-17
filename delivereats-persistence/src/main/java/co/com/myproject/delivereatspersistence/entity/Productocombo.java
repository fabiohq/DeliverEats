/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

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
@Table(name = "productocombo")
@NamedQueries({
    @NamedQuery(name = "Productocombo.findAll", query = "SELECT p FROM Productocombo p"),
    @NamedQuery(name = "Productocombo.findByIdproductocombo", query = "SELECT p FROM Productocombo p WHERE p.productocomboPK.idproductocombo = :idproductocombo"),
    @NamedQuery(name = "Productocombo.findByIdcombo", query = "SELECT p FROM Productocombo p WHERE p.productocomboPK.idcombo = :idcombo")})
public class Productocombo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductocomboPK productocomboPK;
    
    public Productocombo() {
    }

    public Productocombo(ProductocomboPK productocomboPK) {
        this.productocomboPK = productocomboPK;
    }

    public Productocombo(Integer idproductocombo, Integer idcombo) {
        this.productocomboPK = new ProductocomboPK(idproductocombo, idcombo);
    }

    public ProductocomboPK getProductocomboPK() {
        return productocomboPK;
    }

    public void setProductocomboPK(ProductocomboPK productocomboPK) {
        this.productocomboPK = productocomboPK;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productocomboPK != null ? productocomboPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productocombo)) {
            return false;
        }
        Productocombo other = (Productocombo) object;
        if ((this.productocomboPK == null && other.productocomboPK != null) || (this.productocomboPK != null && !this.productocomboPK.equals(other.productocomboPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Productocombo[ productocomboPK=" + productocomboPK + " ]";
    }
    
}
