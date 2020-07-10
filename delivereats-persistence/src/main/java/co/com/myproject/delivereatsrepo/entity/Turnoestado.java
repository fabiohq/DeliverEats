/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

import java.io.Serializable;
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
@Table(name = "turnoestado")
@NamedQueries({
    @NamedQuery(name = "Turnoestado.findAll", query = "SELECT t FROM Turnoestado t"),
    @NamedQuery(name = "Turnoestado.findByIdturno", query = "SELECT t FROM Turnoestado t WHERE t.turnoestadoPK.idturno = :idturno"),
    @NamedQuery(name = "Turnoestado.findByIdestadoturno", query = "SELECT t FROM Turnoestado t WHERE t.turnoestadoPK.idestadoturno = :idestadoturno")})
public class Turnoestado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurnoestadoPK turnoestadoPK;

    public Turnoestado() {
    }

    public Turnoestado(TurnoestadoPK turnoestadoPK) {
        this.turnoestadoPK = turnoestadoPK;
    }

    public Turnoestado(int idturno, int idestadoturno) {
        this.turnoestadoPK = new TurnoestadoPK(idturno, idestadoturno);
    }

    public TurnoestadoPK getTurnoestadoPK() {
        return turnoestadoPK;
    }

    public void setTurnoestadoPK(TurnoestadoPK turnoestadoPK) {
        this.turnoestadoPK = turnoestadoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnoestadoPK != null ? turnoestadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turnoestado)) {
            return false;
        }
        Turnoestado other = (Turnoestado) object;
        if ((this.turnoestadoPK == null && other.turnoestadoPK != null) || (this.turnoestadoPK != null && !this.turnoestadoPK.equals(other.turnoestadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Turnoestado[ turnoestadoPK=" + turnoestadoPK + " ]";
    }
    
}
