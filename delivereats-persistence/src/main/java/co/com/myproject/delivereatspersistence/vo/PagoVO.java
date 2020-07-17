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

public class PagoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idpago;

    private Integer fecha;

    private Integer valor;

    public PagoVO() {
    }

    public PagoVO(Integer idpago) {
        this.idpago = idpago;
    }

    public Integer getIdpago() {
        return idpago;
    }

    public void setIdpago(Integer idpago) {
        this.idpago = idpago;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

	@Override
	public String toString() {
		return "PagoVO [idpago=" + idpago + ", fecha=" + fecha + ", valor=" + valor + "]";
	}
    
}
