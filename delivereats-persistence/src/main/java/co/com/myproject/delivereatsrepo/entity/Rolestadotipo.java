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
@Table(name = "rolestadotipo")
@NamedQueries({
    @NamedQuery(name = "Rolestadotipo.findAll", query = "SELECT r FROM Rolestadotipo r"),
    @NamedQuery(name = "Rolestadotipo.findByIdrol", query = "SELECT r FROM Rolestadotipo r WHERE r.rolestadotipoPK.idrol = :idrol"),
    @NamedQuery(name = "Rolestadotipo.findByIdtiporol", query = "SELECT r FROM Rolestadotipo r WHERE r.rolestadotipoPK.idtiporol = :idtiporol"),
    @NamedQuery(name = "Rolestadotipo.findByIdestadorol", query = "SELECT r FROM Rolestadotipo r WHERE r.rolestadotipoPK.idestadorol = :idestadorol"),
    @NamedQuery(name = "Rolestadotipo.findByIdestadomail", query = "SELECT r FROM Rolestadotipo r WHERE r.idestadomail = :idestadomail"),
    @NamedQuery(name = "Rolestadotipo.findByIdtipomail", query = "SELECT r FROM Rolestadotipo r WHERE r.idtipomail = :idtipomail"),
    @NamedQuery(name = "Rolestadotipo.findByIdmail", query = "SELECT r FROM Rolestadotipo r WHERE r.idmail = :idmail")})
public class Rolestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolestadotipoPK rolestadotipoPK;
    @Column(name = "idestadomail")
    private Integer idestadomail;
    @Column(name = "idtipomail")
    private Integer idtipomail;
    @Column(name = "idmail")
    private Integer idmail;

    public Rolestadotipo() {
    }

    public Rolestadotipo(RolestadotipoPK rolestadotipoPK) {
        this.rolestadotipoPK = rolestadotipoPK;
    }

    public Rolestadotipo(int idrol, int idtiporol, int idestadorol) {
        this.rolestadotipoPK = new RolestadotipoPK(idrol, idtiporol, idestadorol);
    }

    public RolestadotipoPK getRolestadotipoPK() {
        return rolestadotipoPK;
    }

    public void setRolestadotipoPK(RolestadotipoPK rolestadotipoPK) {
        this.rolestadotipoPK = rolestadotipoPK;
    }

    public Integer getIdestadomail() {
        return idestadomail;
    }

    public void setIdestadomail(Integer idestadomail) {
        this.idestadomail = idestadomail;
    }

    public Integer getIdtipomail() {
        return idtipomail;
    }

    public void setIdtipomail(Integer idtipomail) {
        this.idtipomail = idtipomail;
    }

    public Integer getIdmail() {
        return idmail;
    }

    public void setIdmail(Integer idmail) {
        this.idmail = idmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolestadotipoPK != null ? rolestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolestadotipo)) {
            return false;
        }
        Rolestadotipo other = (Rolestadotipo) object;
        if ((this.rolestadotipoPK == null && other.rolestadotipoPK != null) || (this.rolestadotipoPK != null && !this.rolestadotipoPK.equals(other.rolestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Rolestadotipo[ rolestadotipoPK=" + rolestadotipoPK + " ]";
    }
    
}
