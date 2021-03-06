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

public class CredencialesVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idcredenciales;

    private String usuario;

    private String clave;

    private String fechaini;

    private String fechafin;

    public CredencialesVO() {
    }

    public CredencialesVO(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public Integer getIdcredenciales() {
        return idcredenciales;
    }

    public void setIdcredenciales(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

	@Override
	public String toString() {
		return "CredencialesVO [idcredenciales=" + idcredenciales + ", usuario=" + usuario + ", clave=" + clave
				+ ", fechaini=" + fechaini + ", fechafin=" + fechafin + "]";
	}
    
}
