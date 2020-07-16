package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadotelefonoVO;
import co.com.myproject.delivereatspersistence.vo.TelefonoVO;
import co.com.myproject.delivereatspersistence.vo.TipotelefonoVO;

public class GestionTelefonoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private TelefonoVO telefono;
	private TipotelefonoVO tipoTelefono;
	private EstadotelefonoVO estadoTelefono;
	
	public TelefonoVO getTelefono() {
		return telefono;
	}
	public void setTelefono(TelefonoVO telefono) {
		this.telefono = telefono;
	}
	public TipotelefonoVO getTipoTelefono() {
		return tipoTelefono;
	}
	public void setTipoTelefono(TipotelefonoVO tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}
	public EstadotelefonoVO getEstadoTelefono() {
		return estadoTelefono;
	}
	public void setEstadoTelefono(EstadotelefonoVO estadoTelefono) {
		this.estadoTelefono = estadoTelefono;
	}
	
	
}
