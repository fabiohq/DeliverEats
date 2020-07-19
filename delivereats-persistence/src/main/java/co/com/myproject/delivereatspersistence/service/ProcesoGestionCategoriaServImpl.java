package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionCategoriaDTO;
import co.com.myproject.delivereatspersistence.entity.Categoria;
import co.com.myproject.delivereatspersistence.entity.Categoriaestadotipo;
import co.com.myproject.delivereatspersistence.entity.CategoriaestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Estadocategoria;
import co.com.myproject.delivereatspersistence.entity.Tipocategoria;
import co.com.myproject.delivereatspersistence.vo.CategoriaVO;
import co.com.myproject.delivereatspersistence.vo.EstadocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.TipocategoriaVO;

public class ProcesoGestionCategoriaServImpl extends AbstractProcesoServ implements IProcesoGestionCategoriaServ{

	@Override
	public GestionCategoriaDTO crear(GestionCategoriaDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionCategoriaServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Categoria\n");
		util.getStringBuilder().append(request.getCategoria()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		CategoriaVO categoriaVO = request.getCategoria();
		Categoria categoria = new Categoria();
		categoria.setFechafin(categoriaVO.getFechafin());
		categoria.setFechaini(categoriaVO.getFechaini());
		categoria.setNombre(categoriaVO.getNombre());
		categoria.setObservacion(categoriaVO.getObservacion());
		categoria=categoriaServ.save(categoria);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Categoria\n");
		util.getStringBuilder().append(request.getTipoCategoria());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipocategoriaVO tipoCategoriaVO = request.getTipoCategoria();
		Tipocategoria tipoCategoria = new Tipocategoria();
		tipoCategoria.setNombre(tipoCategoriaVO.getNombre());
		tipoCategoria.setObservacion(tipoCategoriaVO.getObservacion());
		tipoCategoria = tipoCategoriaServ.save(tipoCategoria);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Categoria\n");
		util.getStringBuilder().append(request.getEstadoCategoria());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadocategoriaVO estadoCategoriaVO = request.getEstadoCategoria();
		Estadocategoria estadoCategoria = new Estadocategoria();
		estadoCategoria.setCodigo(estadoCategoriaVO.getCodigo());
		estadoCategoria.setNombre(estadoCategoriaVO.getNombre());
		estadoCategoria = estadoCategoriaServ.save(estadoCategoria);
		
		Categoriaestadotipo categoriaEstadoTipo = new Categoriaestadotipo();
		CategoriaestadotipoPK categoriaestadotipoPK = new CategoriaestadotipoPK();
		categoriaestadotipoPK.setIdcategoria(categoria.getIdcategoria());
		categoriaestadotipoPK.setIdestadocategoria(estadoCategoria.getIdestadocategoria());
		categoriaestadotipoPK.setIdtipocategoria(tipoCategoria.getIdtipocategoria());
		categoriaEstadoTipo.setCategoriaestadotipoPK(categoriaestadotipoPK);
		categoriaEstadoTipo = categoriaEstadoTipoServ.save(categoriaEstadoTipo);
		
		GestionCategoriaDTO response = request;
		response.getCategoria().setIdcategoria(categoria.getIdcategoria());
		response.getEstadoCategoria().setIdestadocategoria(estadoCategoria.getIdestadocategoria());
		response.getTipoCategoria().setIdtipocategoria(tipoCategoria.getIdtipocategoria());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Categoria CREAR Parametro response\n");
		util.getStringBuilder().append("==> Categoria\n");
		util.getStringBuilder().append(response.getCategoria());
		util.getStringBuilder().append("\n==> Tipo Categoria Response\n");
		util.getStringBuilder().append(response.getTipoCategoria());
		util.getStringBuilder().append("\n==> Estado Categoria Response\n");
		util.getStringBuilder().append(response.getEstadoCategoria());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
