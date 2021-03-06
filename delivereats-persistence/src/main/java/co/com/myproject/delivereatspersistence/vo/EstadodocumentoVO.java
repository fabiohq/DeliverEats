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

public class EstadodocumentoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadodocumento;

    private String nombre;

    private String codigo;

    public EstadodocumentoVO() {
    }

    public EstadodocumentoVO(Integer idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
    }

    public Integer getIdestadodocumento() {
        return idestadodocumento;
    }

    public void setIdestadodocumento(Integer idestadodocumento) {
        this.idestadodocumento = idestadodocumento;
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
		return "EstadodocumentoVO [idestadodocumento=" + idestadodocumento + ", nombre=" + nombre + ", codigo=" + codigo
				+ "]";
	}
    
}
