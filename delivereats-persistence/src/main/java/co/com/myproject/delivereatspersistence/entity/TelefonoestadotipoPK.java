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
public class TelefonoestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtelefono")
    private int idtelefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipotelefono")
    private int idtipotelefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadotelefono")
    private int idestadotelefono;

    public TelefonoestadotipoPK() {
    }

    public TelefonoestadotipoPK(int idtelefono, int idtipotelefono, int idestadotelefono) {
        this.idtelefono = idtelefono;
        this.idtipotelefono = idtipotelefono;
        this.idestadotelefono = idestadotelefono;
    }

    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
    }

    public int getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(int idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public int getIdestadotelefono() {
        return idestadotelefono;
    }

    public void setIdestadotelefono(int idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtelefono;
        hash += (int) idtipotelefono;
        hash += (int) idestadotelefono;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoestadotipoPK)) {
            return false;
        }
        TelefonoestadotipoPK other = (TelefonoestadotipoPK) object;
        if (this.idtelefono != other.idtelefono) {
            return false;
        }
        if (this.idtipotelefono != other.idtipotelefono) {
            return false;
        }
        if (this.idestadotelefono != other.idestadotelefono) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.TelefonoestadotipoPK[ idtelefono=" + idtelefono + ", idtipotelefono=" + idtipotelefono + ", idestadotelefono=" + idestadotelefono + " ]";
    }
    
}
