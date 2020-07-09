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
@Table(name = "transporteestadotipo")
@NamedQueries({
    @NamedQuery(name = "Transporteestadotipo.findAll", query = "SELECT t FROM Transporteestadotipo t"),
    @NamedQuery(name = "Transporteestadotipo.findByIdtransporte", query = "SELECT t FROM Transporteestadotipo t WHERE t.transporteestadotipoPK.idtransporte = :idtransporte"),
    @NamedQuery(name = "Transporteestadotipo.findByIdtipotransporte", query = "SELECT t FROM Transporteestadotipo t WHERE t.transporteestadotipoPK.idtipotransporte = :idtipotransporte"),
    @NamedQuery(name = "Transporteestadotipo.findByIdestadotransporte", query = "SELECT t FROM Transporteestadotipo t WHERE t.transporteestadotipoPK.idestadotransporte = :idestadotransporte"),
    @NamedQuery(name = "Transporteestadotipo.findByIdestadoturno", query = "SELECT t FROM Transporteestadotipo t WHERE t.idestadoturno = :idestadoturno"),
    @NamedQuery(name = "Transporteestadotipo.findByIdturno", query = "SELECT t FROM Transporteestadotipo t WHERE t.idturno = :idturno")})
public class Transporteestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransporteestadotipoPK transporteestadotipoPK;
    @Column(name = "idestadoturno")
    private Integer idestadoturno;
    @Column(name = "idturno")
    private Integer idturno;

    public Transporteestadotipo() {
    }

    public Transporteestadotipo(TransporteestadotipoPK transporteestadotipoPK) {
        this.transporteestadotipoPK = transporteestadotipoPK;
    }

    public Transporteestadotipo(int idtransporte, int idtipotransporte, int idestadotransporte) {
        this.transporteestadotipoPK = new TransporteestadotipoPK(idtransporte, idtipotransporte, idestadotransporte);
    }

    public TransporteestadotipoPK getTransporteestadotipoPK() {
        return transporteestadotipoPK;
    }

    public void setTransporteestadotipoPK(TransporteestadotipoPK transporteestadotipoPK) {
        this.transporteestadotipoPK = transporteestadotipoPK;
    }

    public Integer getIdestadoturno() {
        return idestadoturno;
    }

    public void setIdestadoturno(Integer idestadoturno) {
        this.idestadoturno = idestadoturno;
    }

    public Integer getIdturno() {
        return idturno;
    }

    public void setIdturno(Integer idturno) {
        this.idturno = idturno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transporteestadotipoPK != null ? transporteestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporteestadotipo)) {
            return false;
        }
        Transporteestadotipo other = (Transporteestadotipo) object;
        if ((this.transporteestadotipoPK == null && other.transporteestadotipoPK != null) || (this.transporteestadotipoPK != null && !this.transporteestadotipoPK.equals(other.transporteestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Transporteestadotipo[ transporteestadotipoPK=" + transporteestadotipoPK + " ]";
    }
    
}
