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
@Table(name = "productoadiciones")
@NamedQueries({
    @NamedQuery(name = "Productoadiciones.findAll", query = "SELECT p FROM Productoadiciones p"),
    @NamedQuery(name = "Productoadiciones.findByIdproductoadiciones", query = "SELECT p FROM Productoadiciones p WHERE p.productoadicionesPK.idproductoadiciones = :idproductoadiciones"),
    @NamedQuery(name = "Productoadiciones.findByIdadiciones", query = "SELECT p FROM Productoadiciones p WHERE p.productoadicionesPK.idadiciones = :idadiciones"),
    @NamedQuery(name = "Productoadiciones.findByIdestadoproducto", query = "SELECT p FROM Productoadiciones p WHERE p.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Productoadiciones.findByIdtipoproducto", query = "SELECT p FROM Productoadiciones p WHERE p.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Productoadiciones.findByIdproducto", query = "SELECT p FROM Productoadiciones p WHERE p.idproducto = :idproducto")})
public class Productoadiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoadicionesPK productoadicionesPK;
    @Column(name = "idestadoproducto")
    private Integer idestadoproducto;
    @Column(name = "idtipoproducto")
    private Integer idtipoproducto;
    @Column(name = "idproducto")
    private Integer idproducto;

    public Productoadiciones() {
    }

    public Productoadiciones(ProductoadicionesPK productoadicionesPK) {
        this.productoadicionesPK = productoadicionesPK;
    }

    public Productoadiciones(int idproductoadiciones, String idadiciones) {
        this.productoadicionesPK = new ProductoadicionesPK(idproductoadiciones, idadiciones);
    }

    public ProductoadicionesPK getProductoadicionesPK() {
        return productoadicionesPK;
    }

    public void setProductoadicionesPK(ProductoadicionesPK productoadicionesPK) {
        this.productoadicionesPK = productoadicionesPK;
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
        hash += (productoadicionesPK != null ? productoadicionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productoadiciones)) {
            return false;
        }
        Productoadiciones other = (Productoadiciones) object;
        if ((this.productoadicionesPK == null && other.productoadicionesPK != null) || (this.productoadicionesPK != null && !this.productoadicionesPK.equals(other.productoadicionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Productoadiciones[ productoadicionesPK=" + productoadicionesPK + " ]";
    }
    
}
