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
public class ActorsistemaestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idactorsistema")
    private int idactorsistema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoactorsistema")
    private int idtipoactorsistema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoactorsistema")
    private int idestadoactorsistema;

    public ActorsistemaestadotipoPK() {
    }

    public ActorsistemaestadotipoPK(int idactorsistema, int idtipoactorsistema, int idestadoactorsistema) {
        this.idactorsistema = idactorsistema;
        this.idtipoactorsistema = idtipoactorsistema;
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public int getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(int idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public int getIdtipoactorsistema() {
        return idtipoactorsistema;
    }

    public void setIdtipoactorsistema(int idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
    }

    public int getIdestadoactorsistema() {
        return idestadoactorsistema;
    }

    public void setIdestadoactorsistema(int idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idactorsistema;
        hash += (int) idtipoactorsistema;
        hash += (int) idestadoactorsistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActorsistemaestadotipoPK)) {
            return false;
        }
        ActorsistemaestadotipoPK other = (ActorsistemaestadotipoPK) object;
        if (this.idactorsistema != other.idactorsistema) {
            return false;
        }
        if (this.idtipoactorsistema != other.idtipoactorsistema) {
            return false;
        }
        if (this.idestadoactorsistema != other.idestadoactorsistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.ActorsistemaestadotipoPK[ idactorsistema=" + idactorsistema + ", idtipoactorsistema=" + idtipoactorsistema + ", idestadoactorsistema=" + idestadoactorsistema + " ]";
    }
    
}
