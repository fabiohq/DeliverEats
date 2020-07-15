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

public class EstadopersonaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadopersona;

    private String nombre;

    private String codigo;

    public EstadopersonaVO() {
    }

    public EstadopersonaVO(Integer idestadopersona) {
        this.idestadopersona = idestadopersona;
    }

    public Integer getIdestadopersona() {
        return idestadopersona;
    }

    public void setIdestadopersona(Integer idestadopersona) {
        this.idestadopersona = idestadopersona;
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
		return "EstadopersonaVO [idestadopersona=" + idestadopersona + ", nombre=" + nombre + ", codigo=" + codigo
				+ "]";
	}

}
