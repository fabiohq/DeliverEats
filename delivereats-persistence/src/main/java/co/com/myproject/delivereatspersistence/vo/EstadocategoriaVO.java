package co.com.myproject.delivereatspersistence.vo;

import java.io.Serializable;

/**
 *
 * @author fabio
 */

public class EstadocategoriaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idestadocategoria;

    private String nombre;

    private String codigo;

    public EstadocategoriaVO() {
    }

    public EstadocategoriaVO(Integer idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
    }

    public Integer getIdestadocategoria() {
        return idestadocategoria;
    }

    public void setIdestadocategoria(Integer idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
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
		return "EstadocategoriaVO [idestadocategoria=" + idestadocategoria + ", nombre=" + nombre + ", codigo=" + codigo
				+ "]";
	}
    
}
