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

public class TipocredencialesVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipocredenciales;

    private String nombre;

    private String codigo;

    public TipocredencialesVO() {
    }

    public TipocredencialesVO(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
    }

    public Integer getIdtipocredenciales() {
        return idtipocredenciales;
    }

    public void setIdtipocredenciales(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
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
