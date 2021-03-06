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

public class TipotransporteVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipotransporte;

    private String nombre;

    private String observacion;

    public TipotransporteVO() {
    }

    public TipotransporteVO(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public Integer getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
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
		return "TipotransporteVO [idtipotransporte=" + idtipotransporte + ", nombre=" + nombre + ", observacion="
				+ observacion + "]";
	}
    
}
