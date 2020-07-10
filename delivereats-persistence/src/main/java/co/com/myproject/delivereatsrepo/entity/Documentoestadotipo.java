/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

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
@Table(name = "documentoestadotipo")
@NamedQueries({
    @NamedQuery(name = "Documentoestadotipo.findAll", query = "SELECT d FROM Documentoestadotipo d"),
    @NamedQuery(name = "Documentoestadotipo.findByIddocumento", query = "SELECT d FROM Documentoestadotipo d WHERE d.documentoestadotipoPK.iddocumento = :iddocumento"),
    @NamedQuery(name = "Documentoestadotipo.findByIdtipodocumento", query = "SELECT d FROM Documentoestadotipo d WHERE d.documentoestadotipoPK.idtipodocumento = :idtipodocumento"),
    @NamedQuery(name = "Documentoestadotipo.findByIdestadodocumento", query = "SELECT d FROM Documentoestadotipo d WHERE d.documentoestadotipoPK.idestadodocumento = :idestadodocumento"),
    @NamedQuery(name = "Documentoestadotipo.findByIdestadopersona", query = "SELECT d FROM Documentoestadotipo d WHERE d.idestadopersona = :idestadopersona"),
    @NamedQuery(name = "Documentoestadotipo.findByIdtipopersona", query = "SELECT d FROM Documentoestadotipo d WHERE d.idtipopersona = :idtipopersona"),
    @NamedQuery(name = "Documentoestadotipo.findByIdpersona", query = "SELECT d FROM Documentoestadotipo d WHERE d.idpersona = :idpersona")})
public class Documentoestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentoestadotipoPK documentoestadotipoPK;
    @Column(name = "idestadopersona")
    private Integer idestadopersona;
    @Column(name = "idtipopersona")
    private Integer idtipopersona;
    @Column(name = "idpersona")
    private Integer idpersona;

    public Documentoestadotipo() {
    }

    public Documentoestadotipo(DocumentoestadotipoPK documentoestadotipoPK) {
        this.documentoestadotipoPK = documentoestadotipoPK;
    }

    public Documentoestadotipo(int iddocumento, int idtipodocumento, int idestadodocumento) {
        this.documentoestadotipoPK = new DocumentoestadotipoPK(iddocumento, idtipodocumento, idestadodocumento);
    }

    public DocumentoestadotipoPK getDocumentoestadotipoPK() {
        return documentoestadotipoPK;
    }

    public void setDocumentoestadotipoPK(DocumentoestadotipoPK documentoestadotipoPK) {
        this.documentoestadotipoPK = documentoestadotipoPK;
    }

    public Integer getIdestadopersona() {
        return idestadopersona;
    }

    public void setIdestadopersona(Integer idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    public Integer getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(Integer idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoestadotipoPK != null ? documentoestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentoestadotipo)) {
            return false;
        }
        Documentoestadotipo other = (Documentoestadotipo) object;
        if ((this.documentoestadotipoPK == null && other.documentoestadotipoPK != null) || (this.documentoestadotipoPK != null && !this.documentoestadotipoPK.equals(other.documentoestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Documentoestadotipo[ documentoestadotipoPK=" + documentoestadotipoPK + " ]";
    }
    
}
