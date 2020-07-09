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
@Table(name = "mailestadotipo")
@NamedQueries({
    @NamedQuery(name = "Mailestadotipo.findAll", query = "SELECT m FROM Mailestadotipo m"),
    @NamedQuery(name = "Mailestadotipo.findByIdmail", query = "SELECT m FROM Mailestadotipo m WHERE m.mailestadotipoPK.idmail = :idmail"),
    @NamedQuery(name = "Mailestadotipo.findByIdtipomail", query = "SELECT m FROM Mailestadotipo m WHERE m.mailestadotipoPK.idtipomail = :idtipomail"),
    @NamedQuery(name = "Mailestadotipo.findByIdestadomail", query = "SELECT m FROM Mailestadotipo m WHERE m.mailestadotipoPK.idestadomail = :idestadomail"),
    @NamedQuery(name = "Mailestadotipo.findByIdestadotelefono", query = "SELECT m FROM Mailestadotipo m WHERE m.idestadotelefono = :idestadotelefono"),
    @NamedQuery(name = "Mailestadotipo.findByIdtipotelefono", query = "SELECT m FROM Mailestadotipo m WHERE m.idtipotelefono = :idtipotelefono"),
    @NamedQuery(name = "Mailestadotipo.findByIdtelefono", query = "SELECT m FROM Mailestadotipo m WHERE m.idtelefono = :idtelefono")})
public class Mailestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MailestadotipoPK mailestadotipoPK;
    @Column(name = "idestadotelefono")
    private Integer idestadotelefono;
    @Column(name = "idtipotelefono")
    private Integer idtipotelefono;
    @Column(name = "idtelefono")
    private Integer idtelefono;

    public Mailestadotipo() {
    }

    public Mailestadotipo(MailestadotipoPK mailestadotipoPK) {
        this.mailestadotipoPK = mailestadotipoPK;
    }

    public Mailestadotipo(int idmail, int idtipomail, int idestadomail) {
        this.mailestadotipoPK = new MailestadotipoPK(idmail, idtipomail, idestadomail);
    }

    public MailestadotipoPK getMailestadotipoPK() {
        return mailestadotipoPK;
    }

    public void setMailestadotipoPK(MailestadotipoPK mailestadotipoPK) {
        this.mailestadotipoPK = mailestadotipoPK;
    }

    public Integer getIdestadotelefono() {
        return idestadotelefono;
    }

    public void setIdestadotelefono(Integer idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
    }

    public Integer getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public Integer getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mailestadotipoPK != null ? mailestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mailestadotipo)) {
            return false;
        }
        Mailestadotipo other = (Mailestadotipo) object;
        if ((this.mailestadotipoPK == null && other.mailestadotipoPK != null) || (this.mailestadotipoPK != null && !this.mailestadotipoPK.equals(other.mailestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Mailestadotipo[ mailestadotipoPK=" + mailestadotipoPK + " ]";
    }
    
}
