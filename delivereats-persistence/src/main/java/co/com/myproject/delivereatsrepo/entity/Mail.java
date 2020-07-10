/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "mail")
@NamedQueries({
    @NamedQuery(name = "Mail.findAll", query = "SELECT m FROM Mail m"),
    @NamedQuery(name = "Mail.findByIdmail", query = "SELECT m FROM Mail m WHERE m.idmail = :idmail"),
    @NamedQuery(name = "Mail.findByMail", query = "SELECT m FROM Mail m WHERE m.mail = :mail"),
    @NamedQuery(name = "Mail.findByObservaciones", query = "SELECT m FROM Mail m WHERE m.observaciones = :observaciones"),
    @NamedQuery(name = "Mail.findByFechaini", query = "SELECT m FROM Mail m WHERE m.fechaini = :fechaini"),
    @NamedQuery(name = "Mail.findByFechafin", query = "SELECT m FROM Mail m WHERE m.fechafin = :fechafin")})
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmail")
    private Integer idmail;
    @Size(max = 500)
    @Column(name = "mail")
    private String mail;
    @Size(max = 100)
    @Column(name = "observaciones")
    private String observaciones;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;

    public Mail() {
    }

    public Mail(Integer idmail) {
        this.idmail = idmail;
    }

    public Integer getIdmail() {
        return idmail;
    }

    public void setIdmail(Integer idmail) {
        this.idmail = idmail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmail != null ? idmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mail)) {
            return false;
        }
        Mail other = (Mail) object;
        if ((this.idmail == null && other.idmail != null) || (this.idmail != null && !this.idmail.equals(other.idmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Mail[ idmail=" + idmail + " ]";
    }
    
}
