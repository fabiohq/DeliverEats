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
public class FormapagoestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idestadoformapago")
    private int idestadoformapago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoformapago")
    private int idtipoformapago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idformapago")
    private int idformapago;

    public FormapagoestadotipoPK() {
    }

    public FormapagoestadotipoPK(int idestadoformapago, int idtipoformapago, int idformapago) {
        this.idestadoformapago = idestadoformapago;
        this.idtipoformapago = idtipoformapago;
        this.idformapago = idformapago;
    }

    public int getIdestadoformapago() {
        return idestadoformapago;
    }

    public void setIdestadoformapago(int idestadoformapago) {
        this.idestadoformapago = idestadoformapago;
    }

    public int getIdtipoformapago() {
        return idtipoformapago;
    }

    public void setIdtipoformapago(int idtipoformapago) {
        this.idtipoformapago = idtipoformapago;
    }

    public int getIdformapago() {
        return idformapago;
    }

    public void setIdformapago(int idformapago) {
        this.idformapago = idformapago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestadoformapago;
        hash += (int) idtipoformapago;
        hash += (int) idformapago;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormapagoestadotipoPK)) {
            return false;
        }
        FormapagoestadotipoPK other = (FormapagoestadotipoPK) object;
        if (this.idestadoformapago != other.idestadoformapago) {
            return false;
        }
        if (this.idtipoformapago != other.idtipoformapago) {
            return false;
        }
        if (this.idformapago != other.idformapago) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.FormapagoestadotipoPK[ idestadoformapago=" + idestadoformapago + ", idtipoformapago=" + idtipoformapago + ", idformapago=" + idformapago + " ]";
    }
    
}
