package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadotarjetaVO;
import co.com.myproject.delivereatspersistence.vo.TarjetaVO;
import co.com.myproject.delivereatspersistence.vo.TipotarjetaVO;

public class GestionTarjetaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private TarjetaVO tarjeta;
	private TipotarjetaVO tipotarjeta;
	private EstadotarjetaVO estadoTarjeta;
	
	public TarjetaVO getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaVO tarjeta) {
		this.tarjeta = tarjeta;
	}
	public TipotarjetaVO getTipotarjeta() {
		return tipotarjeta;
	}
	public void setTipotarjeta(TipotarjetaVO tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}
	public EstadotarjetaVO getEstadoTarjeta() {
		return estadoTarjeta;
	}
	public void setEstadoTarjeta(EstadotarjetaVO estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}
	
}
