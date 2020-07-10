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
@Table(name = "credencialesestadotipo")
@NamedQueries({
    @NamedQuery(name = "Credencialesestadotipo.findAll", query = "SELECT c FROM Credencialesestadotipo c"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdcredenciales", query = "SELECT c FROM Credencialesestadotipo c WHERE c.credencialesestadotipoPK.idcredenciales = :idcredenciales"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdestadocredenciales", query = "SELECT c FROM Credencialesestadotipo c WHERE c.credencialesestadotipoPK.idestadocredenciales = :idestadocredenciales"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdtipocredenciales", query = "SELECT c FROM Credencialesestadotipo c WHERE c.credencialesestadotipoPK.idtipocredenciales = :idtipocredenciales"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdestadoubicacion", query = "SELECT c FROM Credencialesestadotipo c WHERE c.idestadoubicacion = :idestadoubicacion"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdtipoubicacion", query = "SELECT c FROM Credencialesestadotipo c WHERE c.idtipoubicacion = :idtipoubicacion"),
    @NamedQuery(name = "Credencialesestadotipo.findByIdubicacion", query = "SELECT c FROM Credencialesestadotipo c WHERE c.idubicacion = :idubicacion")})
public class Credencialesestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CredencialesestadotipoPK credencialesestadotipoPK;
    @Column(name = "idestadoubicacion")
    private Integer idestadoubicacion;
    @Column(name = "idtipoubicacion")
    private Integer idtipoubicacion;
    @Column(name = "idubicacion")
    private Integer idubicacion;

    public Credencialesestadotipo() {
    }

    public Credencialesestadotipo(CredencialesestadotipoPK credencialesestadotipoPK) {
        this.credencialesestadotipoPK = credencialesestadotipoPK;
    }

    public Credencialesestadotipo(int idcredenciales, int idestadocredenciales, int idtipocredenciales) {
        this.credencialesestadotipoPK = new CredencialesestadotipoPK(idcredenciales, idestadocredenciales, idtipocredenciales);
    }

    public CredencialesestadotipoPK getCredencialesestadotipoPK() {
        return credencialesestadotipoPK;
    }

    public void setCredencialesestadotipoPK(CredencialesestadotipoPK credencialesestadotipoPK) {
        this.credencialesestadotipoPK = credencialesestadotipoPK;
    }

    public Integer getIdestadoubicacion() {
        return idestadoubicacion;
    }

    public void setIdestadoubicacion(Integer idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
    }

    public Integer getIdtipoubicacion() {
        return idtipoubicacion;
    }

    public void setIdtipoubicacion(Integer idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public Integer getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(Integer idubicacion) {
        this.idubicacion = idubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credencialesestadotipoPK != null ? credencialesestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credencialesestadotipo)) {
            return false;
        }
        Credencialesestadotipo other = (Credencialesestadotipo) object;
        if ((this.credencialesestadotipoPK == null && other.credencialesestadotipoPK != null) || (this.credencialesestadotipoPK != null && !this.credencialesestadotipoPK.equals(other.credencialesestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Credencialesestadotipo[ credencialesestadotipoPK=" + credencialesestadotipoPK + " ]";
    }
    
}
