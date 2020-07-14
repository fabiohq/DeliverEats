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

public class Adiciones implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer idadiciones;
   
    private Integer idestadoproducto;
   
    private Integer idtipoproducto;
   
    private Integer idproducto;
       
    private String nombre;
    
    private String adiciones;
    
    private String descripcion;

    public Adiciones() {
    }

    public Adiciones(Integer idadiciones) {
        this.idadiciones = idadiciones;
    }

    public Integer getIdadiciones() {
        return idadiciones;
    }

    public void setIdadiciones(Integer idadiciones) {
        this.idadiciones = idadiciones;
    }

    public Integer getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    public Integer getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdiciones() {
        return adiciones;
    }

    public void setAdiciones(String adiciones) {
        this.adiciones = adiciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Adiciones[ idadiciones=" + idadiciones + " ]";
    }
    
}
