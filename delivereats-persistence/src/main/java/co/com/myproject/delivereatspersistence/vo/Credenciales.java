/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.vo;

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
@Table(name = "credenciales")
@NamedQueries({
    @NamedQuery(name = "Credenciales.findAll", query = "SELECT c FROM Credenciales c"),
    @NamedQuery(name = "Credenciales.findByIdcredenciales", query = "SELECT c FROM Credenciales c WHERE c.idcredenciales = :idcredenciales"),
    @NamedQuery(name = "Credenciales.findByUsuario", query = "SELECT c FROM Credenciales c WHERE c.usuario = :usuario"),
    @NamedQuery(name = "Credenciales.findByClave", query = "SELECT c FROM Credenciales c WHERE c.clave = :clave"),
    @NamedQuery(name = "Credenciales.findByFechaini", query = "SELECT c FROM Credenciales c WHERE c.fechaini = :fechaini"),
    @NamedQuery(name = "Credenciales.findByFechafin", query = "SELECT c FROM Credenciales c WHERE c.fechafin = :fechafin")})
public class Credenciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcredenciales")
    private Integer idcredenciales;
    @Size(max = 2000)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 2000)
    @Column(name = "clave")
    private String clave;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;

    public Credenciales() {
    }

    public Credenciales(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public Integer getIdcredenciales() {
        return idcredenciales;
    }

    public void setIdcredenciales(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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
        hash += (idcredenciales != null ? idcredenciales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credenciales)) {
            return false;
        }
        Credenciales other = (Credenciales) object;
        if ((this.idcredenciales == null && other.idcredenciales != null) || (this.idcredenciales != null && !this.idcredenciales.equals(other.idcredenciales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Credenciales[ idcredenciales=" + idcredenciales + " ]";
    }
    
}
