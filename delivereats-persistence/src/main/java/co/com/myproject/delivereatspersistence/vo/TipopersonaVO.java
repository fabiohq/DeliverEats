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

public class TipopersonaVO implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer idtipopersona;
   
    private String nombre;
   
    private String observacion;
   
    private String fechaini;
   
    private String fechafin;

    public TipopersonaVO() {
    }

    public TipopersonaVO(Integer idtipopersona) {
        this.idtipopersona = idtipopersona;
    }

    public Integer getIdtipopersona() {
        return idtipopersona;
    }

    public void setIdtipopersona(Integer idtipopersona) {
        this.idtipopersona = idtipopersona;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopersona != null ? idtipopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipopersonaVO)) {
            return false;
        }
        TipopersonaVO other = (TipopersonaVO) object;
        if ((this.idtipopersona == null && other.idtipopersona != null) || (this.idtipopersona != null && !this.idtipopersona.equals(other.idtipopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Tipopersona[ idtipopersona=" + idtipopersona + " ]";
    }
    
}
