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

public class Tipopedido implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipopedido;

    private String nombre;

    private String observacion;

    public Tipopedido() {
    }

    public Tipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
    }

    public Integer getIdtipopedido() {
        return idtipopedido;
    }

    public void setIdtipopedido(Integer idtipopedido) {
        this.idtipopedido = idtipopedido;
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
