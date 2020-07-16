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

public class TipoestablecimientoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idtipoestadoestablecimiento;

    private String nombre;

    private String observacion;

    public TipoestablecimientoVO() {
    }

    public TipoestablecimientoVO(Integer idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
    }

    public Integer getIdtipoestadoestablecimiento() {
        return idtipoestadoestablecimiento;
    }

    public void setIdtipoestadoestablecimiento(Integer idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
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
    
}
