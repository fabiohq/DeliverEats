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

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "procesopersona")
@NamedQueries({
    @NamedQuery(name = "Procesopersona.findAll", query = "SELECT p FROM Procesopersona p"),
    @NamedQuery(name = "Procesopersona.findByIdprocesopersona", query = "SELECT p FROM Procesopersona p WHERE p.idprocesopersona = :idprocesopersona"),
    @NamedQuery(name = "Procesopersona.findByIdtipocredenciales", query = "SELECT p FROM Procesopersona p WHERE p.idtipocredenciales = :idtipocredenciales"),
    @NamedQuery(name = "Procesopersona.findByIdestadocredenciales", query = "SELECT p FROM Procesopersona p WHERE p.idestadocredenciales = :idestadocredenciales"),
    @NamedQuery(name = "Procesopersona.findByIdcredenciales", query = "SELECT p FROM Procesopersona p WHERE p.idcredenciales = :idcredenciales"),
    @NamedQuery(name = "Procesopersona.findByIdestadotransporte", query = "SELECT p FROM Procesopersona p WHERE p.idestadotransporte = :idestadotransporte"),
    @NamedQuery(name = "Procesopersona.findByIdtipotransporte", query = "SELECT p FROM Procesopersona p WHERE p.idtipotransporte = :idtipotransporte"),
    @NamedQuery(name = "Procesopersona.findByIdtransporte", query = "SELECT p FROM Procesopersona p WHERE p.idtransporte = :idtransporte")})
public class Procesopersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprocesopersona")
    private Integer idprocesopersona;
    @Column(name = "idtipocredenciales")
    private Integer idtipocredenciales;
    @Column(name = "idestadocredenciales")
    private Integer idestadocredenciales;
    @Column(name = "idcredenciales")
    private Integer idcredenciales;
    @Column(name = "idestadotransporte")
    private Integer idestadotransporte;
    @Column(name = "idtipotransporte")
    private Integer idtipotransporte;
    @Column(name = "idtransporte")
    private Integer idtransporte;

    public Procesopersona() {
    }

    public Procesopersona(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }

    public Integer getIdprocesopersona() {
        return idprocesopersona;
    }

    public void setIdprocesopersona(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }

    public Integer getIdtipocredenciales() {
        return idtipocredenciales;
    }

    public void setIdtipocredenciales(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
    }

    public Integer getIdestadocredenciales() {
        return idestadocredenciales;
    }

    public void setIdestadocredenciales(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
    }

    public Integer getIdcredenciales() {
        return idcredenciales;
    }

    public void setIdcredenciales(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public Integer getIdestadotransporte() {
        return idestadotransporte;
    }

    public void setIdestadotransporte(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    public Integer getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public Integer getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprocesopersona != null ? idprocesopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesopersona)) {
            return false;
        }
        Procesopersona other = (Procesopersona) object;
        if ((this.idprocesopersona == null && other.idprocesopersona != null) || (this.idprocesopersona != null && !this.idprocesopersona.equals(other.idprocesopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Procesopersona[ idprocesopersona=" + idprocesopersona + " ]";
    }
    
}
