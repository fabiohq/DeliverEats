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
public class CredencialesestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idcredenciales")
    private int idcredenciales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadocredenciales")
    private int idestadocredenciales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocredenciales")
    private int idtipocredenciales;

    public CredencialesestadotipoPK() {
    }

    public CredencialesestadotipoPK(int idcredenciales, int idestadocredenciales, int idtipocredenciales) {
        this.idcredenciales = idcredenciales;
        this.idestadocredenciales = idestadocredenciales;
        this.idtipocredenciales = idtipocredenciales;
    }

    public int getIdcredenciales() {
        return idcredenciales;
    }

    public void setIdcredenciales(int idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public int getIdestadocredenciales() {
        return idestadocredenciales;
    }

    public void setIdestadocredenciales(int idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
    }

    public int getIdtipocredenciales() {
        return idtipocredenciales;
    }

    public void setIdtipocredenciales(int idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcredenciales;
        hash += (int) idestadocredenciales;
        hash += (int) idtipocredenciales;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredencialesestadotipoPK)) {
            return false;
        }
        CredencialesestadotipoPK other = (CredencialesestadotipoPK) object;
        if (this.idcredenciales != other.idcredenciales) {
            return false;
        }
        if (this.idestadocredenciales != other.idestadocredenciales) {
            return false;
        }
        if (this.idtipocredenciales != other.idtipocredenciales) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.CredencialesestadotipoPK[ idcredenciales=" + idcredenciales + ", idestadocredenciales=" + idestadocredenciales + ", idtipocredenciales=" + idtipocredenciales + " ]";
    }
    
}
