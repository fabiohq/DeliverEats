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

public class TipoubicacionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipoubicacion;

    private String nombre;

    private String observaacion;

    public TipoubicacionVO() {
    }

    public TipoubicacionVO(Integer idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public Integer getIdtipoubicacion() {
        return idtipoubicacion;
    }

    public void setIdtipoubicacion(Integer idtipoubicacion) {
        this.idtipoubicacion = idtipoubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaacion() {
        return observaacion;
    }

    public void setObservaacion(String observaacion) {
        this.observaacion = observaacion;
    }

	@Override
	public String toString() {
		return "TipoubicacionVO [idtipoubicacion=" + idtipoubicacion + ", nombre=" + nombre + ", observaacion="
				+ observaacion + "]";
	}
    
}
