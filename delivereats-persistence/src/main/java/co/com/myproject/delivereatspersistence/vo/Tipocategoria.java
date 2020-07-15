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

public class Tipocategoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipocategoria;

    private String nombre;

    private String observacion;

    public Tipocategoria() {
    }

    public Tipocategoria(Integer idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public Integer getIdtipocategoria() {
        return idtipocategoria;
    }

    public void setIdtipocategoria(Integer idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
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
