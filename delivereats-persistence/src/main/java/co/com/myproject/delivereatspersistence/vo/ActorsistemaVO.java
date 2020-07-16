/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.vo;

import java.io.Serializable;

public class ActorsistemaVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idactorsistema;
    
    private Integer idprocesopersona;

    public ActorsistemaVO() {
    }

    public ActorsistemaVO(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public Integer getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public Integer getIdprocesopersona() {
        return idprocesopersona;
    }

    public void setIdprocesopersona(Integer idprocesopersona) {
        this.idprocesopersona = idprocesopersona;
    }
   
    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Actorsistema[ idactorsistema=" + idactorsistema + " ]";
    }
    
}
