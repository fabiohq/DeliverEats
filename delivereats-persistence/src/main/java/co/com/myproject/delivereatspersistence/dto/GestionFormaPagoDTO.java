package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadoformapagoVO;
import co.com.myproject.delivereatspersistence.vo.FormapagoVO;
import co.com.myproject.delivereatspersistence.vo.TipoformapagoVO;

public class GestionFormaPagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private FormapagoVO formaPago;
	private TipoformapagoVO tipoFormaPago;
	private EstadoformapagoVO estadoformapago;
	
	public FormapagoVO getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(FormapagoVO formaPago) {
		this.formaPago = formaPago;
	}
	public TipoformapagoVO getTipoFormaPago() {
		return tipoFormaPago;
	}
	public void setTipoFormaPago(TipoformapagoVO tipoFormaPago) {
		this.tipoFormaPago = tipoFormaPago;
	}
	public EstadoformapagoVO getEstadoformapago() {
		return estadoformapago;
	}
	public void setEstadoformapago(EstadoformapagoVO estadoformapago) {
		this.estadoformapago = estadoformapago;
	}
	
}
