package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.CategoriaVO;
import co.com.myproject.delivereatspersistence.vo.EstadocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.TipocategoriaVO;

public class GestionCategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private CategoriaVO categoria;
	private TipocategoriaVO tipoCategoria;
	private EstadocategoriaVO estadoCategoria;
	
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
