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
@Table(name = "telefonoestadotipo")
@NamedQueries({
    @NamedQuery(name = "Telefonoestadotipo.findAll", query = "SELECT t FROM Telefonoestadotipo t"),
    @NamedQuery(name = "Telefonoestadotipo.findByIdtelefono", query = "SELECT t FROM Telefonoestadotipo t WHERE t.telefonoestadotipoPK.idtelefono = :idtelefono"),
    @NamedQuery(name = "Telefonoestadotipo.findByIdtipotelefono", query = "SELECT t FROM Telefonoestadotipo t WHERE t.telefonoestadotipoPK.idtipotelefono = :idtipotelefono"),
    @NamedQuery(name = "Telefonoestadotipo.findByIdestadotelefono", query = "SELECT t FROM Telefonoestadotipo t WHERE t.telefonoestadotipoPK.idestadotelefono = :idestadotelefono"),
    @NamedQuery(name = "Telefonoestadotipo.findByIdestadodocumento", query = "SELECT t FROM Telefonoestadotipo t WHERE t.idestadodocumento = :idestadodocumento"),
    @NamedQuery(name = "Telefonoestadotipo.findByIdtipodocumento", query = "SELECT t FROM Telefonoestadotipo t WHERE t.idtipodocumento = :idtipodocumento"),
    @NamedQuery(name = "Telefonoestadotipo.findByIddocumento", query = "SELECT t FROM Telefonoestadotipo t WHERE t.iddocumento = :iddocumento")})
public class Telefonoestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelefonoestadotipoPK telefonoestadotipoPK;
    @Column(name = "idestadodocumento")
    private Integer idestadodocumento;
    @Column(name = "idtipodocumento")
    private Integer idtipodocumento;
    @Column(name = "iddocumento")
    private Integer iddocumento;

    public Telefonoestadotipo() {
    }

    public Telefonoestadotipo(TelefonoestadotipoPK telefonoestadotipoPK) {
        this.telefonoestadotipoPK = telefonoestadotipoPK;
    }

    public Telefonoestadotipo(int idtelefono, int idtipotelefono, int idestadotelefono) {
        this.telefonoestadotipoPK = new TelefonoestadotipoPK(idtelefono, idtipotelefono, idestadotelefono);
    }

    public TelefonoestadotipoPK getTelefonoestadotipoPK() {
        return telefonoestadotipoPK;
    }

    public void setTelefonoestadotipoPK(TelefonoestadotipoPK telefonoestadotipoPK) {
        this.telefonoestadotipoPK = telefonoestadotipoPK;
    }

    public Integer getIdestadodocumento() {
        return idestadodocumento;
    }

    public void setIdestadodocumento(Integer idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
    }

    public Integer getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public Integer getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Integer iddocumento) {
        this.iddocumento = iddocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefonoestadotipoPK != null ? telefonoestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefonoestadotipo)) {
            return false;
        }
        Telefonoestadotipo other = (Telefonoestadotipo) object;
        if ((this.telefonoestadotipoPK == null && other.telefonoestadotipoPK != null) || (this.telefonoestadotipoPK != null && !this.telefonoestadotipoPK.equals(other.telefonoestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Telefonoestadotipo[ telefonoestadotipoPK=" + telefonoestadotipoPK + " ]";
    }
    
}
