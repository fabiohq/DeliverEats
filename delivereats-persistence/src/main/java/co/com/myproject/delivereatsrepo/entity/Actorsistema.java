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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "actorsistema")
@NamedQueries({
    @NamedQuery(name = "Actorsistema.findAll", query = "SELECT a FROM Actorsistema a"),
    @NamedQuery(name = "Actorsistema.findByIdactorsistema", query = "SELECT a FROM Actorsistema a WHERE a.idactorsistema = :idactorsistema"),
    @NamedQuery(name = "Actorsistema.findByIdprocesopersona", query = "SELECT a FROM Actorsistema a WHERE a.idprocesopersona = :idprocesopersona")})
public class Actorsistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idactorsistema")
    private Integer idactorsistema;
    @Column(name = "idprocesopersona")
    private Integer idprocesopersona;

    public Actorsistema() {
    }

    public Actorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public Integer getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public Integer getIdprocesopersona() {
        return idprocesopersona;
    }

    public void setIdprocesopersona(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactorsistema != null ? idactorsistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actorsistema)) {
            return false;
        }
        Actorsistema other = (Actorsistema) object;
        if ((this.idactorsistema == null && other.idactorsistema != null) || (this.idactorsistema != null && !this.idactorsistema.equals(other.idactorsistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Actorsistema[ idactorsistema=" + idactorsistema + " ]";
    }
    
}
