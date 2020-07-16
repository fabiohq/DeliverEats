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

public class TipotelefonoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipotelefono;

    private String nombre;

    private String observacion;

    public TipotelefonoVO() {
    }

    public TipotelefonoVO(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
    }

    public Integer getIdtipotelefono() {
        return idtipotelefono;
    }

    public void setIdtipotelefono(Integer idtipotelefono) {
        this.idtipotelefono = idtipotelefono;
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
    
}
