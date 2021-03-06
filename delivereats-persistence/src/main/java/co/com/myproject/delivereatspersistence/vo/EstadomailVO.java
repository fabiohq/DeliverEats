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

public class EstadomailVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadomail;

    private String nombre;

    private String codigo;

    public EstadomailVO() {
    }

    public EstadomailVO(Integer idestadomail) {
        this.idestadomail = idestadomail;
    }

    public Integer getIdestadomail() {
        return idestadomail;
    }

    public void setIdestadomail(Integer idestadomail) {
        this.idestadomail = idestadomail;
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

	@Override
	public String toString() {
		return "EstadomailVO [idestadomail=" + idestadomail + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
    
}
