package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.AdicionesVO;
import co.com.myproject.delivereatspersistence.vo.CategoriaVO;
import co.com.myproject.delivereatspersistence.vo.ComboVO;
import co.com.myproject.delivereatspersistence.vo.EstadocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.EstadoproductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoVO;
import co.com.myproject.delivereatspersistence.vo.TipocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.TipoproductoVO;

public class GestionProductoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private ProductoVO producto;
	private TipoproductoVO tipoProducto;
	private EstadoproductoVO estadoProducto;
	private AdicionesVO adiciones;
	private ComboVO combo;
	private CategoriaVO categoria;
	private TipocategoriaVO tipoCategoria;
	private EstadocategoriaVO estadoCategoria;
	
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
	public ComboVO getCombo() {
		return combo;
	}
	public void setCombo(ComboVO combo) {
		this.combo = combo;
	}
	public CategoriaVO getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaVO categoria) {
		this.categoria = categoria;
	}
	public TipocategoriaVO getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(TipocategoriaVO tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	public EstadocategoriaVO getEstadoCategoria() {
		return estadoCategoria;
	}
	public void setEstadoCategoria(EstadocategoriaVO estadoCategoria) {
		this.estadoCategoria = estadoCategoria;
	}	
}