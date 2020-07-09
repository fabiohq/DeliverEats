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
public class EstablecimientoestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idestablecimiento")
    private int idestablecimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoestablecimiento")
    private int idestadoestablecimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoestadoestablecimiento")
    private int idtipoestadoestablecimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idespecialidad")
    private int idespecialidad;

    public EstablecimientoestadotipoPK() {
    }

    public EstablecimientoestadotipoPK(int idestablecimiento, int idestadoestablecimiento, int idtipoestadoestablecimiento, int idespecialidad) {
        this.idestablecimiento = idestablecimiento;
        this.idestadoestablecimiento = idestadoestablecimiento;
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
        this.idespecialidad = idespecialidad;
    }

    public int getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(int idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    public int getIdestadoestablecimiento() {
        return idestadoestablecimiento;
    }

    public void setIdestadoestablecimiento(int idestadoestablecimiento) {
        this.idestadoestablecimiento = idestadoestablecimiento;
    }

    public int getIdtipoestadoestablecimiento() {
        return idtipoestadoestablecimiento;
    }

    public void setIdtipoestadoestablecimiento(int idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
    }

    public int getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(int idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestablecimiento;
        hash += (int) idestadoestablecimiento;
        hash += (int) idtipoestadoestablecimiento;
        hash += (int) idespecialidad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstablecimientoestadotipoPK)) {
            return false;
        }
        EstablecimientoestadotipoPK other = (EstablecimientoestadotipoPK) object;
        if (this.idestablecimiento != other.idestablecimiento) {
            return false;
        }
        if (this.idestadoestablecimiento != other.idestadoestablecimiento) {
            return false;
        }
        if (this.idtipoestadoestablecimiento != other.idtipoestadoestablecimiento) {
            return false;
        }
        if (this.idespecialidad != other.idespecialidad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.EstablecimientoestadotipoPK[ idestablecimiento=" + idestablecimiento + ", idestadoestablecimiento=" + idestadoestablecimiento + ", idtipoestadoestablecimiento=" + idtipoestadoestablecimiento + ", idespecialidad=" + idespecialidad + " ]";
    }
    
}
