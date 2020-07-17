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

public class TipopagoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipopago;

    private String nombre;

    private String observacion;

    public TipopagoVO() {
    }

    public TipopagoVO(Integer idtipopago) {
        this.idtipopago = idtipopago;
    }

    public Integer getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(Integer idtipopago) {
        this.idtipopago = idtipopago;
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
		return "TipopagoVO [idtipopago=" + idtipopago + ", nombre=" + nombre + ", observacion=" + observacion + "]";
	}
    
}
