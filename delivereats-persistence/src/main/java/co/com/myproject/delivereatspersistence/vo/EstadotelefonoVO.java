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

public class EstadotelefonoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadotelefono;

    private String nombre;

    private String codigo;

    public EstadotelefonoVO() {
    }

    public EstadotelefonoVO(Integer idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
    }

    public Integer getIdestadotelefono() {
        return idestadotelefono;
    }

    public void setIdestadotelefono(Integer idestadotelefono) {
        this.idestadotelefono = idestadotelefono;
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
    
}
