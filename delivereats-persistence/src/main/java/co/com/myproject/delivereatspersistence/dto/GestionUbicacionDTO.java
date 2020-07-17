package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadoubicacionVO;
import co.com.myproject.delivereatspersistence.vo.TipoubicacionVO;
import co.com.myproject.delivereatspersistence.vo.UbicacionVO;

public class GestionUbicacionDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private UbicacionVO ubicacion;
	private TipoubicacionVO tipoUbicacion;
	private EstadoubicacionVO estadoUbicacion;
	
	public UbicacionVO getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(UbicacionVO ubicacion) {
		this.ubicacion = ubicacion;
	}
	public TipoubicacionVO getTipoUbicacion() {
		return tipoUbicacion;
	}
	public void setTipoUbicacion(TipoubicacionVO tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}
	public EstadoubicacionVO getEstadoUbicacion() {
		return estadoUbicacion;
	}
	public void setEstadoUbicacion(EstadoubicacionVO estadoUbicacion) {
		this.estadoUbicacion = estadoUbicacion;
	}
	
}
