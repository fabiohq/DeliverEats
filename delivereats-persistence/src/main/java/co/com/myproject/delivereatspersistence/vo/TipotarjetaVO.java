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

public class TipotarjetaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipotarjeta;

    private String nombre;

    private String observacion;

    public TipotarjetaVO() {
    }

    public TipotarjetaVO(Integer idtipotarjeta) {
        this.idtipotarjeta = idtipotarjeta;
    }

    public Integer getIdtipotarjeta() {
        return idtipotarjeta;
    }

    public void setIdtipotarjeta(Integer idtipotarjeta) {
        this.idtipotarjeta = idtipotarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

	@Override
	public String toString() {
		return "TipotarjetaVO [idtipotarjeta=" + idtipotarjeta + ", nombre=" + nombre + ", observacion=" + observacion
				+ "]";
	}
    
}
