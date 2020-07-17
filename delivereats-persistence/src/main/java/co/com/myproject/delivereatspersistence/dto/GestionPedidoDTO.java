package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadopedidoVO;
import co.com.myproject.delivereatspersistence.vo.PedidoVO;
import co.com.myproject.delivereatspersistence.vo.TipopedidoVO;

public class GestionPedidoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private PedidoVO pedido;
	private TipopedidoVO tipoPedido;
	private EstadopedidoVO estadoPedido;
	
	public PedidoVO getPedido() {
		return pedido;
	}
	public void setPedido(PedidoVO pedido) {
		this.pedido = pedido;
	}
	public TipopedidoVO getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(TipopedidoVO tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public EstadopedidoVO getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(EstadopedidoVO estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	

}
