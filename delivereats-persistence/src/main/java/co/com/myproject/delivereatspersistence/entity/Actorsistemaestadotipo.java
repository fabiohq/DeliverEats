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
@Table(name = "actorsistemaestadotipo")
@NamedQueries({
    @NamedQuery(name = "Actorsistemaestadotipo.findAll", query = "SELECT a FROM Actorsistemaestadotipo a"),
    @NamedQuery(name = "Actorsistemaestadotipo.findByIdactorsistema", query = "SELECT a FROM Actorsistemaestadotipo a WHERE a.actorsistemaestadotipoPK.idactorsistema = :idactorsistema"),
    @NamedQuery(name = "Actorsistemaestadotipo.findByIdtipoactorsistema", query = "SELECT a FROM Actorsistemaestadotipo a WHERE a.actorsistemaestadotipoPK.idtipoactorsistema = :idtipoactorsistema"),
    @NamedQuery(name = "Actorsistemaestadotipo.findByIdestadoactorsistema", query = "SELECT a FROM Actorsistemaestadotipo a WHERE a.actorsistemaestadotipoPK.idestadoactorsistema = :idestadoactorsistema")})
public class Actorsistemaestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActorsistemaestadotipoPK actorsistemaestadotipoPK;

    public Actorsistemaestadotipo() {
    }

    public Actorsistemaestadotipo(ActorsistemaestadotipoPK actorsistemaestadotipoPK) {
        this.actorsistemaestadotipoPK = actorsistemaestadotipoPK;
    }

    public Actorsistemaestadotipo(int idactorsistema, int idtipoactorsistema, int idestadoactorsistema) {
        this.actorsistemaestadotipoPK = new ActorsistemaestadotipoPK(idactorsistema, idtipoactorsistema, idestadoactorsistema);
    }

    public ActorsistemaestadotipoPK getActorsistemaestadotipoPK() {
        return actorsistemaestadotipoPK;
    }

    public void setActorsistemaestadotipoPK(ActorsistemaestadotipoPK actorsistemaestadotipoPK) {
        this.actorsistemaestadotipoPK = actorsistemaestadotipoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actorsistemaestadotipoPK != null ? actorsistemaestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actorsistemaestadotipo)) {
            return false;
        }
        Actorsistemaestadotipo other = (Actorsistemaestadotipo) object;
        if ((this.actorsistemaestadotipoPK == null && other.actorsistemaestadotipoPK != null) || (this.actorsistemaestadotipoPK != null && !this.actorsistemaestadotipoPK.equals(other.actorsistemaestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Actorsistemaestadotipo[ actorsistemaestadotipoPK=" + actorsistemaestadotipoPK + " ]";
    }
    
}
