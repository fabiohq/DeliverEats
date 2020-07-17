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

public class EstadotransporteVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadotransporte;

    private String nombre;

    private String codigo;

    public EstadotransporteVO() {
    }

    public EstadotransporteVO(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    public Integer getIdestadotransporte() {
        return idestadotransporte;
    }

    public void setIdestadotransporte(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
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
		return "EstadotransporteVO [idestadotransporte=" + idestadotransporte + ", nombre=" + nombre + ", codigo="
				+ codigo + "]";
	}
    
}
