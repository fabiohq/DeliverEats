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

public class RolVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idrol;

    private String nombre;

    private String obsservacion;

    private String fechaini;

    private String fechafin;

    public RolVO() {
    }

    public RolVO(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObsservacion() {
        return obsservacion;
    }

    public void setObsservacion(String obsservacion) {
        this.obsservacion = obsservacion;
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
		return "RolVO [idrol=" + idrol + ", nombre=" + nombre + ", obsservacion=" + obsservacion + ", fechaini="
				+ fechaini + ", fechafin=" + fechafin + "]";
	}
    
}
