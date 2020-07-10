/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "establecimientoestadotipo")
@NamedQueries({
    @NamedQuery(name = "Establecimientoestadotipo.findAll", query = "SELECT e FROM Establecimientoestadotipo e"),
    @NamedQuery(name = "Establecimientoestadotipo.findByIdestablecimiento", query = "SELECT e FROM Establecimientoestadotipo e WHERE e.establecimientoestadotipoPK.idestablecimiento = :idestablecimiento"),
    @NamedQuery(name = "Establecimientoestadotipo.findByIdestadoestablecimiento", query = "SELECT e FROM Establecimientoestadotipo e WHERE e.establecimientoestadotipoPK.idestadoestablecimiento = :idestadoestablecimiento"),
    @NamedQuery(name = "Establecimientoestadotipo.findByIdtipoestadoestablecimiento", query = "SELECT e FROM Establecimientoestadotipo e WHERE e.establecimientoestadotipoPK.idtipoestadoestablecimiento = :idtipoestadoestablecimiento"),
    @NamedQuery(name = "Establecimientoestadotipo.findByIdespecialidad", query = "SELECT e FROM Establecimientoestadotipo e WHERE e.establecimientoestadotipoPK.idespecialidad = :idespecialidad")})
public class Establecimientoestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstablecimientoestadotipoPK establecimientoestadotipoPK;

    public Establecimientoestadotipo() {
    }

    public Establecimientoestadotipo(EstablecimientoestadotipoPK establecimientoestadotipoPK) {
        this.establecimientoestadotipoPK = establecimientoestadotipoPK;
    }

    public Establecimientoestadotipo(int idestablecimiento, int idestadoestablecimiento, int idtipoestadoestablecimiento, int idespecialidad) {
        this.establecimientoestadotipoPK = new EstablecimientoestadotipoPK(idestablecimiento, idestadoestablecimiento, idtipoestadoestablecimiento, idespecialidad);
    }

    public EstablecimientoestadotipoPK getEstablecimientoestadotipoPK() {
        return establecimientoestadotipoPK;
    }

    public void setEstablecimientoestadotipoPK(EstablecimientoestadotipoPK establecimientoestadotipoPK) {
        this.establecimientoestadotipoPK = establecimientoestadotipoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (establecimientoestadotipoPK != null ? establecimientoestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Establecimientoestadotipo)) {
            return false;
        }
        Establecimientoestadotipo other = (Establecimientoestadotipo) object;
        if ((this.establecimientoestadotipoPK == null && other.establecimientoestadotipoPK != null) || (this.establecimientoestadotipoPK != null && !this.establecimientoestadotipoPK.equals(other.establecimientoestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Establecimientoestadotipo[ establecimientoestadotipoPK=" + establecimientoestadotipoPK + " ]";
    }
    
}
