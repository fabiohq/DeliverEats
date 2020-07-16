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

public class TelefonoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtelefono;

    private String numero;

    private String observacion;

    private String fechaini;

    private String fehcafin;

    public TelefonoVO() {
    }

    public TelefonoVO(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public Integer getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(Integer idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getFehcafin() {
        return fehcafin;
    }

    public void setFehcafin(String fehcafin) {
        this.fehcafin = fehcafin;
    }
    
}
