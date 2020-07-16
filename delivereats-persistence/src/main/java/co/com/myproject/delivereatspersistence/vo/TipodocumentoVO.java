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

public class TipodocumentoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipodocumento;

    private String nombre;

    private String observacion;

    public TipodocumentoVO() {
    }

    public TipodocumentoVO(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public Integer getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
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
		return "TipodocumentoVO [idtipodocumento=" + idtipodocumento + ", nombre=" + nombre + ", observacion="
				+ observacion + "]";
	}
    
}
