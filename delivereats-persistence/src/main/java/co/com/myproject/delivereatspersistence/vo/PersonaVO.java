/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.vo;

import java.io.Serializable;

/**
 *
 * @author fabio
 */

public class PersonaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idpersona;

    private String nombre1;

    private String nombre2;

    private String apellido1;

    private String apellido2;

    private String observaciones;

    private String anionacimiento;

    private String mesnacimiento;

    private String dianacimiento;

    private String fechaini;

    private String fechafin;

    public PersonaVO() {
    }

    public PersonaVO(Integer idpersona) {
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
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Persona[ idpersona=" + idpersona + " ]";
    }
    
}
