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

public class TiporolVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtiporol;

    private String nombre;

    private String observacion;

    public TiporolVO() {
    }

    public TiporolVO(Integer idtiporol) {
        this.idtiporol = idtiporol;
    }

    public Integer getIdtiporol() {
        return idtiporol;
    }

    public void setIdtiporol(Integer idtiporol) {
        this.idtiporol = idtiporol;
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
