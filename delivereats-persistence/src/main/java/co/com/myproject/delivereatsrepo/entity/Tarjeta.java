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
@Table(name = "tarjeta")
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t"),
    @NamedQuery(name = "Tarjeta.findByIdtarjeta", query = "SELECT t FROM Tarjeta t WHERE t.idtarjeta = :idtarjeta"),
    @NamedQuery(name = "Tarjeta.findByFranquicia", query = "SELECT t FROM Tarjeta t WHERE t.franquicia = :franquicia"),
    @NamedQuery(name = "Tarjeta.findByNumero", query = "SELECT t FROM Tarjeta t WHERE t.numero = :numero"),
    @NamedQuery(name = "Tarjeta.findByCodseguridad", query = "SELECT t FROM Tarjeta t WHERE t.codseguridad = :codseguridad"),
    @NamedQuery(name = "Tarjeta.findByAnio", query = "SELECT t FROM Tarjeta t WHERE t.anio = :anio"),
    @NamedQuery(name = "Tarjeta.findByMes", query = "SELECT t FROM Tarjeta t WHERE t.mes = :mes"),
    @NamedQuery(name = "Tarjeta.findByNombreusuario", query = "SELECT t FROM Tarjeta t WHERE t.nombreusuario = :nombreusuario")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtarjeta")
    private Integer idtarjeta;
    @Size(max = 100)
    @Column(name = "franquicia")
    private String franquicia;
    @Size(max = 50)
    @Column(name = "numero")
    private String numero;
    @Size(max = 6)
    @Column(name = "codseguridad")
    private String codseguridad;
    @Size(max = 4)
    @Column(name = "anio")
    private String anio;
    @Size(max = 2)
    @Column(name = "mes")
    private String mes;
    @Size(max = 200)
    @Column(name = "nombreusuario")
    private String nombreusuario;

    public Tarjeta() {
    }

    public Tarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public Integer getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodseguridad() {
        return codseguridad;
    }

    public void setCodseguridad(String codseguridad) {
        this.codseguridad = codseguridad;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjeta != null ? idtarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.idtarjeta == null && other.idtarjeta != null) || (this.idtarjeta != null && !this.idtarjeta.equals(other.idtarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Tarjeta[ idtarjeta=" + idtarjeta + " ]";
    }
    
}
