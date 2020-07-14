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

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idcategoria;
    
    private int idtipocategoria;
    
    private int idestadocategoria;
    
    private String nombre;
    
    private String observacion;
    
    private String fechaini;
    
    private String fechafin;
    
    private Integer valor;
    
    private String descripcion;

    public Producto() {
    }

    
    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdtipocategoria() {
        return idtipocategoria;
    }

    public void setIdtipocategoria(int idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public int getIdestadocategoria() {
        return idestadocategoria;
    }

    public void setIdestadocategoria(int idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
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

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
}
