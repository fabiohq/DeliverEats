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
public class TurnoestadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idturno")
    private int idturno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoturno")
    private int idestadoturno;

    public TurnoestadoPK() {
    }

    public TurnoestadoPK(int idturno, int idestadoturno) {
        this.idturno = idturno;
        this.idestadoturno = idestadoturno;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public int getIdestadoturno() {
        return idestadoturno;
    }

    public void setIdestadoturno(int idestadoturno) {
        this.idestadoturno = idestadoturno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idturno;
        hash += (int) idestadoturno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnoestadoPK)) {
            return false;
        }
        TurnoestadoPK other = (TurnoestadoPK) object;
        if (this.idturno != other.idturno) {
            return false;
        }
        if (this.idestadoturno != other.idestadoturno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.TurnoestadoPK[ idturno=" + idturno + ", idestadoturno=" + idestadoturno + " ]";
    }
    
}
