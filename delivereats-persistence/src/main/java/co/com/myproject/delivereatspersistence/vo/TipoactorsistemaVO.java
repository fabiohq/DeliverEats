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

public class TipoactorsistemaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipoactorsistema;

    private String nombre;

    private String codigo;

    private String observaacion;

    public TipoactorsistemaVO() {
    }

    public TipoactorsistemaVO(Integer idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
    }

    public Integer getIdtipoactorsistema() {
        return idtipoactorsistema;
    }

    public void setIdtipoactorsistema(Integer idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getObservaacion() {
        return observaacion;
    }

    public void setObservaacion(String observaacion) {
        this.observaacion = observaacion;
    }
    
}
