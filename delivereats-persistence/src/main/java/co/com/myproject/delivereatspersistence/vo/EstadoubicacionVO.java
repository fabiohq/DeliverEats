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

public class EstadoubicacionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadoubicacion;

    private String nombre;

    private String codigo;

    public EstadoubicacionVO() {
    }

    public EstadoubicacionVO(Integer idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
    }

    public Integer getIdestadoubicacion() {
        return idestadoubicacion;
    }

    public void setIdestadoubicacion(Integer idestadoubicacion) {
        this.idestadoubicacion = idestadoubicacion;
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
		return "EstadoubicacionVO [idestadoubicacion=" + idestadoubicacion + ", nombre=" + nombre + ", codigo=" + codigo
				+ "]";
	}
    
}
