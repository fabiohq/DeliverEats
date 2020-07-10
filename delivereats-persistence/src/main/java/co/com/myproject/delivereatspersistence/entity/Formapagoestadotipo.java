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
@Table(name = "formapagoestadotipo")
@NamedQueries({
    @NamedQuery(name = "Formapagoestadotipo.findAll", query = "SELECT f FROM Formapagoestadotipo f"),
    @NamedQuery(name = "Formapagoestadotipo.findByIdestadoformapago", query = "SELECT f FROM Formapagoestadotipo f WHERE f.formapagoestadotipoPK.idestadoformapago = :idestadoformapago"),
    @NamedQuery(name = "Formapagoestadotipo.findByIdtipoformapago", query = "SELECT f FROM Formapagoestadotipo f WHERE f.formapagoestadotipoPK.idtipoformapago = :idtipoformapago"),
    @NamedQuery(name = "Formapagoestadotipo.findByIdformapago", query = "SELECT f FROM Formapagoestadotipo f WHERE f.formapagoestadotipoPK.idformapago = :idformapago"),
    @NamedQuery(name = "Formapagoestadotipo.findByIdactorsistema", query = "SELECT f FROM Formapagoestadotipo f WHERE f.idactorsistema = :idactorsistema")})
public class Formapagoestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormapagoestadotipoPK formapagoestadotipoPK;
    @Column(name = "idactorsistema")
    private Integer idactorsistema;

    public Formapagoestadotipo() {
    }

    public Formapagoestadotipo(FormapagoestadotipoPK formapagoestadotipoPK) {
        this.formapagoestadotipoPK = formapagoestadotipoPK;
    }

    public Formapagoestadotipo(int idestadoformapago, int idtipoformapago, int idformapago) {
        this.formapagoestadotipoPK = new FormapagoestadotipoPK(idestadoformapago, idtipoformapago, idformapago);
    }

    public FormapagoestadotipoPK getFormapagoestadotipoPK() {
        return formapagoestadotipoPK;
    }

    public void setFormapagoestadotipoPK(FormapagoestadotipoPK formapagoestadotipoPK) {
        this.formapagoestadotipoPK = formapagoestadotipoPK;
    }

    public Integer getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formapagoestadotipoPK != null ? formapagoestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formapagoestadotipo)) {
            return false;
        }
        Formapagoestadotipo other = (Formapagoestadotipo) object;
        if ((this.formapagoestadotipoPK == null && other.formapagoestadotipoPK != null) || (this.formapagoestadotipoPK != null && !this.formapagoestadotipoPK.equals(other.formapagoestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Formapagoestadotipo[ formapagoestadotipoPK=" + formapagoestadotipoPK + " ]";
    }
    
}
