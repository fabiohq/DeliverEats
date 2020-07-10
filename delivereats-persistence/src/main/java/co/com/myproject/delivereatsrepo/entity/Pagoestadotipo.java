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
@Table(name = "pagoestadotipo")
@NamedQueries({
    @NamedQuery(name = "Pagoestadotipo.findAll", query = "SELECT p FROM Pagoestadotipo p"),
    @NamedQuery(name = "Pagoestadotipo.findByIdpago", query = "SELECT p FROM Pagoestadotipo p WHERE p.pagoestadotipoPK.idpago = :idpago"),
    @NamedQuery(name = "Pagoestadotipo.findByIdtipopago", query = "SELECT p FROM Pagoestadotipo p WHERE p.pagoestadotipoPK.idtipopago = :idtipopago"),
    @NamedQuery(name = "Pagoestadotipo.findByIdestadopago", query = "SELECT p FROM Pagoestadotipo p WHERE p.pagoestadotipoPK.idestadopago = :idestadopago")})
public class Pagoestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagoestadotipoPK pagoestadotipoPK;

    public Pagoestadotipo() {
    }

    public Pagoestadotipo(PagoestadotipoPK pagoestadotipoPK) {
        this.pagoestadotipoPK = pagoestadotipoPK;
    }

    public Pagoestadotipo(int idpago, int idtipopago, int idestadopago) {
        this.pagoestadotipoPK = new PagoestadotipoPK(idpago, idtipopago, idestadopago);
    }

    public PagoestadotipoPK getPagoestadotipoPK() {
        return pagoestadotipoPK;
    }

    public void setPagoestadotipoPK(PagoestadotipoPK pagoestadotipoPK) {
        this.pagoestadotipoPK = pagoestadotipoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagoestadotipoPK != null ? pagoestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagoestadotipo)) {
            return false;
        }
        Pagoestadotipo other = (Pagoestadotipo) object;
        if ((this.pagoestadotipoPK == null && other.pagoestadotipoPK != null) || (this.pagoestadotipoPK != null && !this.pagoestadotipoPK.equals(other.pagoestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Pagoestadotipo[ pagoestadotipoPK=" + pagoestadotipoPK + " ]";
    }
    
}
