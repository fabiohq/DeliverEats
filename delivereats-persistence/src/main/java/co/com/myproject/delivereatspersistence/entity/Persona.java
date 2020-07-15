/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

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
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdpersona", query = "SELECT p FROM Persona p WHERE p.idpersona = :idpersona"),
    @NamedQuery(name = "Persona.findByNombre1", query = "SELECT p FROM Persona p WHERE p.nombre1 = :nombre1"),
    @NamedQuery(name = "Persona.findByNombre2", query = "SELECT p FROM Persona p WHERE p.nombre2 = :nombre2"),
    @NamedQuery(name = "Persona.findByApellido1", query = "SELECT p FROM Persona p WHERE p.apellido1 = :apellido1"),
    @NamedQuery(name = "Persona.findByApellido2", query = "SELECT p FROM Persona p WHERE p.apellido2 = :apellido2"),
    @NamedQuery(name = "Persona.findByObservaciones", query = "SELECT p FROM Persona p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Persona.findByAnionacimiento", query = "SELECT p FROM Persona p WHERE p.anionacimiento = :anionacimiento"),
    @NamedQuery(name = "Persona.findByMesnacimiento", query = "SELECT p FROM Persona p WHERE p.mesnacimiento = :mesnacimiento"),
    @NamedQuery(name = "Persona.findByDianacimiento", query = "SELECT p FROM Persona p WHERE p.dianacimiento = :dianacimiento"),
    @NamedQuery(name = "Persona.findByFechaini", query = "SELECT p FROM Persona p WHERE p.fechaini = :fechaini"),
    @NamedQuery(name = "Persona.findByFechafin", query = "SELECT p FROM Persona p WHERE p.fechafin = :fechafin")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersona")
    private Integer idpersona;
    @Size(max = 100)
    @Column(name = "nombre1")
    private String nombre1;
    @Size(max = 100)
    @Column(name = "nombre2")
    private String nombre2;
    @Size(max = 100)
    @Column(name = "apellido1")
    private String apellido1;
    @Size(max = 100)
    @Column(name = "apellido2")
    private String apellido2;
    @Size(max = 1000)
    @Column(name = "observaciones")
    private String observaciones;
    @Size(max = 4)
    @Column(name = "anionacimiento")
    private String anionacimiento;
    @Size(max = 2)
    @Column(name = "mesnacimiento")
    private String mesnacimiento;
    @Size(max = 2)
    @Column(name = "dianacimiento")
    private String dianacimiento;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;

    public Persona() {
    }

    public Persona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAnionacimiento() {
        return anionacimiento;
    }

    public void setAnionacimiento(String anionacimiento) {
        this.anionacimiento = anionacimiento;
    }

    public String getMesnacimiento() {
        return mesnacimiento;
    }

    public void setMesnacimiento(String mesnacimiento) {
        this.mesnacimiento = mesnacimiento;
    }

    public String getDianacimiento() {
        return dianacimiento;
    }

    public void setDianacimiento(String dianacimiento) {
        this.dianacimiento = dianacimiento;
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
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Persona[ idpersona=" + idpersona + " ]";
    }
    
}
