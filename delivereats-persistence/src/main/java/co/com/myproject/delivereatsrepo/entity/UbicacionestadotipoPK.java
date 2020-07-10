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
public class UbicacionestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idubicacion")
    private int idubicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoubicacion")
    private int idtipoubicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoubicacion")
    private int idestadoubicacion;

    public UbicacionestadotipoPK() {
    }

    public UbicacionestadotipoPK(int idubicacion, int idtipoubicacion, int idestadoubicacion) {
        this.idubicacion = idubicacion;
        this.idtipoubicacion = idtipoubicacion;
        this.idestadoubicacion = idestadoubicacion;
    }

    public int getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }

    public int getIdtipoubicacion() {
        return idtipoubicacion;
    }

    public void setIdtipoubicacion(int idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public int getIdestadoubicacion() {
        return idestadoubicacion;
    }

    public void setIdestadoubicacion(int idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idubicacion;
        hash += (int) idtipoubicacion;
        hash += (int) idestadoubicacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UbicacionestadotipoPK)) {
            return false;
        }
        UbicacionestadotipoPK other = (UbicacionestadotipoPK) object;
        if (this.idubicacion != other.idubicacion) {
            return false;
        }
        if (this.idtipoubicacion != other.idtipoubicacion) {
            return false;
        }
        if (this.idestadoubicacion != other.idestadoubicacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.UbicacionestadotipoPK[ idubicacion=" + idubicacion + ", idtipoubicacion=" + idtipoubicacion + ", idestadoubicacion=" + idestadoubicacion + " ]";
    }
    
}
