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
public class RolestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idrol")
    private int idrol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtiporol")
    private int idtiporol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadorol")
    private int idestadorol;

    public RolestadotipoPK() {
    }

    public RolestadotipoPK(int idrol, int idtiporol, int idestadorol) {
        this.idrol = idrol;
        this.idtiporol = idtiporol;
        this.idestadorol = idestadorol;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdtiporol() {
        return idtiporol;
    }

    public void setIdtiporol(int idtiporol) {
        this.idtiporol = idtiporol;
    }

    public int getIdestadorol() {
        return idestadorol;
    }

    public void setIdestadorol(int idestadorol) {
        this.idestadorol = idestadorol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idrol;
        hash += (int) idtiporol;
        hash += (int) idestadorol;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolestadotipoPK)) {
            return false;
        }
        RolestadotipoPK other = (RolestadotipoPK) object;
        if (this.idrol != other.idrol) {
            return false;
        }
        if (this.idtiporol != other.idtiporol) {
            return false;
        }
        if (this.idestadorol != other.idestadorol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.RolestadotipoPK[ idrol=" + idrol + ", idtiporol=" + idtiporol + ", idestadorol=" + idestadorol + " ]";
    }
    
}
