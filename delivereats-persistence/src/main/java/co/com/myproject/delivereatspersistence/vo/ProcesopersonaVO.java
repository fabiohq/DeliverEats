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

public class ProcesopersonaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idprocesopersona;

    private Integer idtipocredenciales;

    private Integer idestadocredenciales;

    private Integer idcredenciales;

    private Integer idestadotransporte;

    private Integer idtipotransporte;

    private Integer idtransporte;

    public ProcesopersonaVO() {
    }

    public ProcesopersonaVO(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }

    public Integer getIdprocesopersona() {
        return idprocesopersona;
    }

    public void setIdprocesopersona(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }

    public Integer getIdtipocredenciales() {
        return idtipocredenciales;
    }

    public void setIdtipocredenciales(Integer idtipocredenciales) {
        this.idtipocredenciales = idtipocredenciales;
    }

    public Integer getIdestadocredenciales() {
        return idestadocredenciales;
    }

    public void setIdestadocredenciales(Integer idestadocredenciales) {
        this.idestadocredenciales = idestadocredenciales;
    }

    public Integer getIdcredenciales() {
        return idcredenciales;
    }

    public void setIdcredenciales(Integer idcredenciales) {
        this.idcredenciales = idcredenciales;
    }

    public Integer getIdestadotransporte() {
        return idestadotransporte;
    }

    public void setIdestadotransporte(Integer idestadotransporte) {
        this.idestadotransporte = idestadotransporte;
    }

    public Integer getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(Integer idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public Integer getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }
    
}
