package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadotransporteVO;
import co.com.myproject.delivereatspersistence.vo.TipotransporteVO;
import co.com.myproject.delivereatspersistence.vo.TransporteVO;

public class GestionTransporteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private TransporteVO transporte;
	private TipotransporteVO tipoTransporte;
	private EstadotransporteVO estadoTransporte;
	
	public TransporteVO getTransporte() {
		return transporte;
	}
	public void setTransporte(TransporteVO transporte) {
		this.transporte = transporte;
	}
	public TipotransporteVO getTipoTransporte() {
		return tipoTransporte;
	}
	public void setTipoTransporte(TipotransporteVO tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	public EstadotransporteVO getEstadoTransporte() {
		return estadoTransporte;
	}
	public void setEstadoTransporte(EstadotransporteVO estadoTransporte) {
		this.estadoTransporte = estadoTransporte;
	}	
}
