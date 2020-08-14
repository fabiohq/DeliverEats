package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionProductoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadoproducto;
import co.com.myproject.delivereatspersistence.entity.Producto;
import co.com.myproject.delivereatspersistence.entity.Tipoproducto;
import co.com.myproject.delivereatspersistence.vo.CategoriaVO;
import co.com.myproject.delivereatspersistence.vo.EstadocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.EstadoproductoVO;
import co.com.myproject.delivereatspersistence.vo.ProductoVO;
import co.com.myproject.delivereatspersistence.vo.TipocategoriaVO;
import co.com.myproject.delivereatspersistence.vo.TipoproductoVO;

public class ProcesoGestionProductoServImpl  extends AbstractProcesoServ implements IProcesoGestionProductoServ{

	@Override
	public GestionProductoDTO crear(GestionProductoDTO request) throws Exception {

		Logger log =util.getLoggger(ProcesoGestionProductoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Producto\n");
		util.getStringBuilder().append(request.getProducto()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		ProductoVO productoVO = request.getProducto();
		CategoriaVO categoriaVO = request.getCategoria();		
		EstadocategoriaVO estadoCategoriaVO = request.getEstadoCategoria();
		TipocategoriaVO tipoCategoriaVO = request.getTipoCategoria();
		Producto producto = new Producto();
		
		producto.setDescripcion(productoVO.getDescripcion());
		producto.setFechafin(productoVO.getFechafin());
		producto.setFechaini(productoVO.getFechaini());
		producto.setIdcategoria(categoriaVO.getIdcategoria());
		producto.setIdestadocategoria(estadoCategoriaVO.getIdestadocategoria());
		producto.setIdtipocategoria(tipoCategoriaVO.getIdtipocategoria());
		producto.setNombre(productoVO.getNombre());
		producto.setObservacion(productoVO.getObservacion());
		producto = productoServ.save(producto);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Producto\n");
		util.getStringBuilder().append(request.getTipoProducto());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipoproductoVO tipoProductoVO = request.getTipoProducto();
		Tipoproducto tipoProducto = new Tipoproducto();
		tipoProducto.setNombre(tipoProductoVO.getNombre());
		tipoProducto.setObservacion(tipoProductoVO.getObservacion());
		tipoProducto = tipoProductoServ.save(tipoProducto);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Producto\n");
		util.getStringBuilder().append(request.getEstadoProducto());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoproductoVO estadoProductoVO= request.getEstadoProducto();
		Estadoproducto estadoProducto = new Estadoproducto();
		estadoProducto.setCodigo(estadoProductoVO.getCodigo());
		estadoProducto.setNombre(estadoProductoVO.getNombre());
		estadoProducto = estadoProductoServ.save(estadoProducto);
		
		GestionProductoDTO response = request;
		response.getEstadoProducto().setIdestadoproducto(estadoProducto.getIdestadoproducto());		
		response.getProducto().setIdproducto(producto.getProductoPK().getIdproducto());
		response.getTipoProducto().setIdtipoproducto(tipoProducto.getIdtipoproducto());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Producto CREAR Parametro response\n");
		util.getStringBuilder().append("==> Producto Response\n");
		util.getStringBuilder().append(response.getProducto());
		util.getStringBuilder().append("\n==> Tipo Producto Response\n");
		util.getStringBuilder().append(response.getTipoProducto());
		util.getStringBuilder().append("\n==> Estado Producto Response\n");
		util.getStringBuilder().append(response.getEstadoProducto());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
