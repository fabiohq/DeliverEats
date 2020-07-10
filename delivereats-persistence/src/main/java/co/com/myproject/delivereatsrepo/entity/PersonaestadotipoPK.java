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
public class PersonaestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idpersona")
    private int idpersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipopersona")
    private int idtipopersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadopersona")
    private int idestadopersona;

    public PersonaestadotipoPK() {
    }

    public PersonaestadotipoPK(int idpersona, int idtipopersona, int idestadopersona) {
        this.idpersona = idpersona;
        this.idtipopersona = idtipopersona;
        this.idestadopersona = idestadopersona;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(int idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public int getIdestadopersona() {
        return idestadopersona;
    }

    public void setIdestadopersona(int idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idpersona;
        hash += (int) idtipopersona;
        hash += (int) idestadopersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaestadotipoPK)) {
            return false;
        }
        PersonaestadotipoPK other = (PersonaestadotipoPK) object;
        if (this.idpersona != other.idpersona) {
            return false;
        }
        if (this.idtipopersona != other.idtipopersona) {
            return false;
        }
        if (this.idestadopersona != other.idestadopersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.PersonaestadotipoPK[ idpersona=" + idpersona + ", idtipopersona=" + idtipopersona + ", idestadopersona=" + idestadopersona + " ]";
    }
    
}
