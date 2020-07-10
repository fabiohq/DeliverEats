/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fabio
 */
@Embeddable
public class MailestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idmail")
    private int idmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipomail")
    private int idtipomail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadomail")
    private int idestadomail;

    public MailestadotipoPK() {
    }

    public MailestadotipoPK(int idmail, int idtipomail, int idestadomail) {
        this.idmail = idmail;
        this.idtipomail = idtipomail;
        this.idestadomail = idestadomail;
    }

    public int getIdmail() {
        return idmail;
    }

    public void setIdmail(int idmail) {
        this.idmail = idmail;
    }

    public int getIdtipomail() {
        return idtipomail;
    }

    public void setIdtipomail(int idtipomail) {
        this.idtipomail = idtipomail;
    }

    public int getIdestadomail() {
        return idestadomail;
    }

    public void setIdestadomail(int idestadomail) {
        this.idestadomail = idestadomail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idmail;
        hash += (int) idtipomail;
        hash += (int) idestadomail;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MailestadotipoPK)) {
            return false;
        }
        MailestadotipoPK other = (MailestadotipoPK) object;
        if (this.idmail != other.idmail) {
            return false;
        }
        if (this.idtipomail != other.idtipomail) {
            return false;
        }
        if (this.idestadomail != other.idestadomail) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.MailestadotipoPK[ idmail=" + idmail + ", idtipomail=" + idtipomail + ", idestadomail=" + idestadomail + " ]";
    }
    
}
