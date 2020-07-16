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

public class EstadoactorsistemaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadoactorsistema;

    private String nombre;

    private String codgo;

    public EstadoactorsistemaVO() {
    }

    public EstadoactorsistemaVO(Integer idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public Integer getIdestadoactorsistema() {
        return idestadoactorsistema;
    }

    public void setIdestadoactorsistema(Integer idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodgo() {
        return codgo;
    }

    public void setCodgo(String codgo) {
        this.codgo = codgo;
    }
    
}
