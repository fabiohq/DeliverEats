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
public class CategoriaestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idestadocategoria")
    private int idestadocategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocategoria")
    private int idtipocategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcategoria")
    private int idcategoria;

    public CategoriaestadotipoPK() {
    }

    public CategoriaestadotipoPK(int idestadocategoria, int idtipocategoria, int idcategoria) {
        this.idestadocategoria = idestadocategoria;
        this.idtipocategoria = idtipocategoria;
        this.idcategoria = idcategoria;
    }

    public int getIdestadocategoria() {
        return idestadocategoria;
    }

    public void setIdestadocategoria(int idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
    }

    public int getIdtipocategoria() {
        return idtipocategoria;
    }

    public void setIdtipocategoria(int idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestadocategoria;
        hash += (int) idtipocategoria;
        hash += (int) idcategoria;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaestadotipoPK)) {
            return false;
        }
        CategoriaestadotipoPK other = (CategoriaestadotipoPK) object;
        if (this.idestadocategoria != other.idestadocategoria) {
            return false;
        }
        if (this.idtipocategoria != other.idtipocategoria) {
            return false;
        }
        if (this.idcategoria != other.idcategoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK[ idestadocategoria=" + idestadocategoria + ", idtipocategoria=" + idtipocategoria + ", idcategoria=" + idcategoria + " ]";
    }
    
}
