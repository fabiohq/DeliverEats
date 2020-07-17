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

public class TransporteVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtransporte;

    private String nombre;

    private String observacion;

    private String fechaini;

    private String fechafin;

    private String placa;

    private String seguro;

    public TransporteVO() {
    }

    public TransporteVO(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    public Integer getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

	@Override
	public String toString() {
		return "TransporteVO [idtransporte=" + idtransporte + ", nombre=" + nombre + ", observacion=" + observacion
				+ ", fechaini=" + fechaini + ", fechafin=" + fechafin + ", placa=" + placa + ", seguro=" + seguro + "]";
	}
    
}
