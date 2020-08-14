package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.AdicionesVO;
import co.com.myproject.delivereatspersistence.vo.EstadoproductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoadicionesVO;
import co.com.myproject.delivereatspersistence.vo.TipoproductoVO;

public class GestionAdicionesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private ProductoVO producto;
	private TipoproductoVO tipoProducto;
	private EstadoproductoVO estadoProducto;
	private AdicionesVO adiciones;
	private ProductoadicionesVO productoadiciones;
	
	public ProductoVO getProducto() {
		return producto;
	}
	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}
	public TipoproductoVO getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoproductoVO tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public EstadoproductoVO getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(EstadoproductoVO estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public AdicionesVO getAdiciones() {
		return adiciones;
	}
	public void setAdiciones(AdicionesVO adiciones) {
		this.adiciones = adiciones;
	}
	
}
