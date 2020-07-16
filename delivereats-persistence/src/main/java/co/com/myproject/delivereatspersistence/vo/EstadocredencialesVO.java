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

public class EstadocredencialesVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadocredenciales;

    private String nombre;

    private String codigo;

    public EstadocredencialesVO() {
    }

    public EstadocredencialesVO(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
    }

    public Integer getIdestadocredenciales() {
        return idestadocredenciales;
    }

    public void setIdestadocredenciales(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
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
