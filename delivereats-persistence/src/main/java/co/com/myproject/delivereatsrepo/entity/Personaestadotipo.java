/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

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
@Table(name = "personaestadotipo")
@NamedQueries({
    @NamedQuery(name = "Personaestadotipo.findAll", query = "SELECT p FROM Personaestadotipo p"),
    @NamedQuery(name = "Personaestadotipo.findByIdpersona", query = "SELECT p FROM Personaestadotipo p WHERE p.personaestadotipoPK.idpersona = :idpersona"),
    @NamedQuery(name = "Personaestadotipo.findByIdtipopersona", query = "SELECT p FROM Personaestadotipo p WHERE p.personaestadotipoPK.idtipopersona = :idtipopersona"),
    @NamedQuery(name = "Personaestadotipo.findByIdestadopersona", query = "SELECT p FROM Personaestadotipo p WHERE p.personaestadotipoPK.idestadopersona = :idestadopersona")})
public class Personaestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaestadotipoPK personaestadotipoPK;

    public Personaestadotipo() {
    }

    public Personaestadotipo(PersonaestadotipoPK personaestadotipoPK) {
        this.personaestadotipoPK = personaestadotipoPK;
    }

    public Personaestadotipo(int idpersona, int idtipopersona, int idestadopersona) {
        this.personaestadotipoPK = new PersonaestadotipoPK(idpersona, idtipopersona, idestadopersona);
    }

    public PersonaestadotipoPK getPersonaestadotipoPK() {
        return personaestadotipoPK;
    }

    public void setPersonaestadotipoPK(PersonaestadotipoPK personaestadotipoPK) {
        this.personaestadotipoPK = personaestadotipoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaestadotipoPK != null ? personaestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personaestadotipo)) {
            return false;
        }
        Personaestadotipo other = (Personaestadotipo) object;
        if ((this.personaestadotipoPK == null && other.personaestadotipoPK != null) || (this.personaestadotipoPK != null && !this.personaestadotipoPK.equals(other.personaestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Personaestadotipo[ personaestadotipoPK=" + personaestadotipoPK + " ]";
    }
    
}
