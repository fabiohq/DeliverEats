package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadorolVO;
import co.com.myproject.delivereatspersistence.vo.RolVO;
import co.com.myproject.delivereatspersistence.vo.TiporolVO;

public class GestionRolDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private RolVO rol;
	private TiporolVO tipoRol;
	private EstadorolVO estadoRol;
	
	public RolVO getRol() {
		return rol;
	}
	public void setRol(RolVO rol) {
		this.rol = rol;
	}
	public TiporolVO getTipoRol() {
		return tipoRol;
	}
	public void setTipoRol(TiporolVO tipoRol) {
		this.tipoRol = tipoRol;
	}
	public EstadorolVO getEstadoRol() {
		return estadoRol;
	}
	public void setEstadoRol(EstadorolVO estadoRol) {
		this.estadoRol = estadoRol;
	}
	
	
}
