package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.ActorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.AdicionesVO;
import co.com.myproject.delivereatspersistence.vo.ComboVO;
import co.com.myproject.delivereatspersistence.vo.EstadoactorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.EstadopagoVO;
import co.com.myproject.delivereatspersistence.vo.EstadopedidoVO;
import co.com.myproject.delivereatspersistence.vo.EstadoproductoVO;
import co.com.myproject.delivereatspersistence.vo.PagoVO;
import co.com.myproject.delivereatspersistence.vo.PedidoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductocomboVO;
import co.com.myproject.delivereatspersistence.vo.TipoactorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.TipopagoVO;
import co.com.myproject.delivereatspersistence.vo.TipopedidoVO;
import co.com.myproject.delivereatspersistence.vo.TipoproductoVO;

public class GestionPedidoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private PedidoVO pedido;
	private TipopedidoVO tipoPedido;
	private EstadopedidoVO estadoPedido;
	
	private ActorsistemaVO actorSistema;
	private EstadoactorsistemaVO estadoActorSistema;
	private TipoactorsistemaVO tipoActorSistema;		
	private EstadopagoVO estadoPago;
	private TipopagoVO tipoPago;
	private ProductoVO producto;
	private EstadoproductoVO estadoProducto;
	private TipoproductoVO tipoProducto;	
	private AdicionesVO adiciones;
	private ComboVO combo;
	private PagoVO pago;
	private ProductocomboVO productoCombo;
	
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
	public ActorsistemaVO getActorSistema() {
		return actorSistema;
	}
	public void setActorSistema(ActorsistemaVO actorSistema) {
		this.actorSistema = actorSistema;
	}
	public EstadoactorsistemaVO getEstadoActorSistema() {
		return estadoActorSistema;
	}
	public void setEstadoActorSistema(EstadoactorsistemaVO estadoActorSistema) {
		this.estadoActorSistema = estadoActorSistema;
	}
	public TipoactorsistemaVO getTipoActorSistema() {
		return tipoActorSistema;
	}
	public void setTipoActorSistema(TipoactorsistemaVO tipoActorSistema) {
		this.tipoActorSistema = tipoActorSistema;
	}
	public EstadopagoVO getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(EstadopagoVO estadoPago) {
		this.estadoPago = estadoPago;
	}
	public TipopagoVO getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(TipopagoVO tipoPago) {
		this.tipoPago = tipoPago;
	}
	public ProductoVO getProducto() {
		return producto;
	}
	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}
	public EstadoproductoVO getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(EstadoproductoVO estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public TipoproductoVO getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoproductoVO tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public AdicionesVO getAdiciones() {
		return adiciones;
	}
	public void setAdiciones(AdicionesVO adiciones) {
		this.adiciones = adiciones;
	}
	public ComboVO getCombo() {
		return combo;
	}
	public void setCombo(ComboVO combo) {
		this.combo = combo;
	}
	public PagoVO getPago() {
		return pago;
	}
	public void setPago(PagoVO pago) {
		this.pago = pago;
	}
	public ProductocomboVO getProductoCombo() {
		return productoCombo;
	}
	public void setProductoCombo(ProductocomboVO productoCombo) {
		this.productoCombo = productoCombo;
	}	
}