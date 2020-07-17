package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadopagoVO;
import co.com.myproject.delivereatspersistence.vo.PagoVO;
import co.com.myproject.delivereatspersistence.vo.TipopagoVO;

public class GestionPagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private PagoVO pago;
	private TipopagoVO tipoPago;
	private EstadopagoVO estadoPago;
	
	public PagoVO getPago() {
		return pago;
	}
	public void setPago(PagoVO pago) {
		this.pago = pago;
	}
	public TipopagoVO getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(TipopagoVO tipoPago) {
		this.tipoPago = tipoPago;
	}
	public EstadopagoVO getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(EstadopagoVO estadoPago) {
		this.estadoPago = estadoPago;
	}
	
}
