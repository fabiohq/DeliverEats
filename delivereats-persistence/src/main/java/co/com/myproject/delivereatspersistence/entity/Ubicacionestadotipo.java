/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "ubicacionestadotipo")
@NamedQueries({
    @NamedQuery(name = "Ubicacionestadotipo.findAll", query = "SELECT u FROM Ubicacionestadotipo u"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdubicacion", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.ubicacionestadotipoPK.idubicacion = :idubicacion"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdtipoubicacion", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.ubicacionestadotipoPK.idtipoubicacion = :idtipoubicacion"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdestadoubicacion", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.ubicacionestadotipoPK.idestadoubicacion = :idestadoubicacion"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdestadorol", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.idestadorol = :idestadorol"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdtiporol", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.idtiporol = :idtiporol"),
    @NamedQuery(name = "Ubicacionestadotipo.findByIdrol", query = "SELECT u FROM Ubicacionestadotipo u WHERE u.idrol = :idrol")})
public class Ubicacionestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UbicacionestadotipoPK ubicacionestadotipoPK;
    @Column(name = "idestadorol")
    private Integer idestadorol;
    @Column(name = "idtiporol")
    private Integer idtiporol;
    @Column(name = "idrol")
    private Integer idrol;

    public Ubicacionestadotipo() {
    }

    public Ubicacionestadotipo(UbicacionestadotipoPK ubicacionestadotipoPK) {
        this.ubicacionestadotipoPK = ubicacionestadotipoPK;
    }

    public Ubicacionestadotipo(int idubicacion, int idtipoubicacion, int idestadoubicacion) {
        this.ubicacionestadotipoPK = new UbicacionestadotipoPK(idubicacion, idtipoubicacion, idestadoubicacion);
    }

    public UbicacionestadotipoPK getUbicacionestadotipoPK() {
        return ubicacionestadotipoPK;
    }

    public void setUbicacionestadotipoPK(UbicacionestadotipoPK ubicacionestadotipoPK) {
        this.ubicacionestadotipoPK = ubicacionestadotipoPK;
    }

    public Integer getIdestadorol() {
        return idestadorol;
    }

    public void setIdestadorol(Integer idestadorol) {
        this.idestadorol = idestadorol;
    }

    public Integer getIdtiporol() {
        return idtiporol;
    }

    public void setIdtiporol(Integer idtiporol) {
        this.idtiporol = idtiporol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubicacionestadotipoPK != null ? ubicacionestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicacionestadotipo)) {
            return false;
        }
        Ubicacionestadotipo other = (Ubicacionestadotipo) object;
        if ((this.ubicacionestadotipoPK == null && other.ubicacionestadotipoPK != null) || (this.ubicacionestadotipoPK != null && !this.ubicacionestadotipoPK.equals(other.ubicacionestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Ubicacionestadotipo[ ubicacionestadotipoPK=" + ubicacionestadotipoPK + " ]";
    }
    
}
