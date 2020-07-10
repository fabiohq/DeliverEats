/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

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
public class DocumentoestadotipoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "iddocumento")
    private int iddocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipodocumento")
    private int idtipodocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadodocumento")
    private int idestadodocumento;

    public DocumentoestadotipoPK() {
    }

    public DocumentoestadotipoPK(int iddocumento, int idtipodocumento, int idestadodocumento) {
        this.iddocumento = iddocumento;
        this.idtipodocumento = idtipodocumento;
        this.idestadodocumento = idestadodocumento;
    }

    public int getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(int iddocumento) {
        this.iddocumento = iddocumento;
    }

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public int getIdestadodocumento() {
        return idestadodocumento;
    }

    public void setIdestadodocumento(int idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iddocumento;
        hash += (int) idtipodocumento;
        hash += (int) idestadodocumento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoestadotipoPK)) {
            return false;
        }
        DocumentoestadotipoPK other = (DocumentoestadotipoPK) object;
        if (this.iddocumento != other.iddocumento) {
            return false;
        }
        if (this.idtipodocumento != other.idtipodocumento) {
            return false;
        }
        if (this.idestadodocumento != other.idestadodocumento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.DocumentoestadotipoPK[ iddocumento=" + iddocumento + ", idtipodocumento=" + idtipodocumento + ", idestadodocumento=" + idestadodocumento + " ]";
    }
    
}
