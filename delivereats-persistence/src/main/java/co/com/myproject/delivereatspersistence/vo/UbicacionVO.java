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

public class UbicacionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idubicacion;

    private String latitud;

    private String longitud;

    private String codpostal;

    private String nombre;

    private String descripcion;

    public UbicacionVO() {
    }

    public UbicacionVO(Integer idubicacion) {
        this.idubicacion = idubicacion;
    }

    public Integer getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(Integer idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

	@Override
	public String toString() {
		return "UbicacionVO [idubicacion=" + idubicacion + ", latitud=" + latitud + ", longitud=" + longitud
				+ ", codpostal=" + codpostal + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
    
}
