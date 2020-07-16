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

public class TipomailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipomail;

    private String nombre;

    private String observacion;

    public TipomailVO() {
    }

    public TipomailVO(Integer idtipomail) {
        this.idtipomail = idtipomail;
    }

    public Integer getIdtipomail() {
        return idtipomail;
    }

    public void setIdtipomail(Integer idtipomail) {
        this.idtipomail = idtipomail;
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
		return "TipomailVO [idtipomail=" + idtipomail + ", nombre=" + nombre + ", observacion=" + observacion + "]";
	}
    
    
}
