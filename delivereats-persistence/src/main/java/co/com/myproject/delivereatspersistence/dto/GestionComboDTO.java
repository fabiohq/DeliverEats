package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.ComboVO;
import co.com.myproject.delivereatspersistence.vo.EstadoproductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoVO;
import co.com.myproject.delivereatspersistence.vo.TipoproductoVO;

public class GestionComboDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private ProductoVO producto;
	private TipoproductoVO tipoProducto;
	private EstadoproductoVO estadoProducto;
	private ComboVO combo;
	
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
	public ComboVO getCombo() {
		return combo;
	}
	public void setCombo(ComboVO combo) {
		this.combo = combo;
	}	
}