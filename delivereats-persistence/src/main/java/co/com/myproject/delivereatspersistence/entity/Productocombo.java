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
    @NamedQuery(name = "Productocombo.findByIdcombo", query = "SELECT p FROM Productocombo p WHERE p.productocomboPK.idcombo = :idcombo"),
    @NamedQuery(name = "Productocombo.findByIdestadoproducto", query = "SELECT p FROM Productocombo p WHERE p.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Productocombo.findByIdtipoproducto", query = "SELECT p FROM Productocombo p WHERE p.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Productocombo.findByIdproducto", query = "SELECT p FROM Productocombo p WHERE p.idproducto = :idproducto")})
public class Productocombo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductocomboPK productocomboPK;
    @Column(name = "idestadoproducto")
    private Integer idestadoproducto;
    @Column(name = "idtipoproducto")
    private Integer idtipoproducto;
    @Column(name = "idproducto")
    private Integer idproducto;

    public Productocombo() {
    }

    public Productocombo(ProductocomboPK productocomboPK) {
        this.productocomboPK = productocomboPK;
    }

    public Productocombo(int idproductocombo, String idcombo) {
        this.productocomboPK = new ProductocomboPK(idproductocombo, idcombo);
    }

    public ProductocomboPK getProductocomboPK() {
        return productocomboPK;
    }

    public void setProductocomboPK(ProductocomboPK productocomboPK) {
        this.productocomboPK = productocomboPK;
    }

    public Integer getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    public Integer getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
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
