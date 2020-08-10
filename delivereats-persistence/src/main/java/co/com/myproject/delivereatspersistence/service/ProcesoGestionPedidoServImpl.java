package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionPedidoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadopedido;
import co.com.myproject.delivereatspersistence.entity.Pedido;
import co.com.myproject.delivereatspersistence.entity.Pedidotipoestado;
import co.com.myproject.delivereatspersistence.entity.PedidotipoestadoPK;
import co.com.myproject.delivereatspersistence.entity.Tipopedido;
import co.com.myproject.delivereatspersistence.vo.EstadopedidoVO;
import co.com.myproject.delivereatspersistence.vo.PedidoVO;
import co.com.myproject.delivereatspersistence.vo.TipopedidoVO;

public class ProcesoGestionPedidoServImpl extends AbstractProcesoServ implements IProcesoGestionPedidoServ{

	@Override
	public GestionPedidoDTO crear(GestionPedidoDTO request) throws Exception {
		Logger log =util.getLoggger(ProcesoGestionPedidoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Pedido\n");
		util.getStringBuilder().append(request.getPedido()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		PedidoVO pedidoVO = request.getPedido();
		Pedido pedido = new Pedido();
		pedido.setFechafin(pedidoVO.getFechafin());
		pedido.setFechaini(pedidoVO.getFechaini());
		pedido.setObservacion(pedidoVO.getObservacion());
		pedido = pedidoServ.save(pedido);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Pedido\n");
		util.getStringBuilder().append(request.getTipoPedido());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipopedidoVO tipoPedidoVO = request.getTipoPedido();
		Tipopedido tipoPedido = new Tipopedido();
		tipoPedido.setNombre(tipoPedidoVO.getNombre());
		tipoPedido.setObservacion(tipoPedidoVO.getObservacion());
		tipoPedido = tipoPedidoServ.save(tipoPedido);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Pedido\n");
		util.getStringBuilder().append(request.getEstadoPedido());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadopedidoVO estadoPedidoVO = request.getEstadoPedido();
		Estadopedido estadoPedido = new Estadopedido();
		estadoPedido.setCodigo(estadoPedidoVO.getCodigo());
		estadoPedido.setNombre(estadoPedidoVO.getNombre());
		estadoPedido = estadoPedidoServ.save(estadoPedido);
		
		Pedidotipoestado pedidoTipoEstado = new Pedidotipoestado();
		pedidoTipoEstado.setIdactorsistema(request.getActorSistema().getIdactorsistema());
		pedidoTipoEstado.setIdadiciones(request.getAdiciones().getIdadiciones().toString());//**
		pedidoTipoEstado.setIdcombo(request.getCombo().getIdcombo().toString());//**
		pedidoTipoEstado.setIdestadoactorsistema(request.getEstadoActorSistema().getIdestadoactorsistema());
		pedidoTipoEstado.setIdestadopago(request.getEstadoPago().getIdestadopago());
		pedidoTipoEstado.setIdestadoproducto(request.getEstadoProducto().getIdestadoproducto());
		pedidoTipoEstado.setIdpago(request.getPago().getIdpago());
		pedidoTipoEstado.setIdproducto(request.getProducto().getIdproducto());
		pedidoTipoEstado.setIdproductocombo(request.getProductoCombo().getIdproductocombo().toString());//**;
		pedidoTipoEstado.setIdtipoactorsistema(request.getTipoActorSistema().getIdtipoactorsistema());
		pedidoTipoEstado.setIdtipopago(request.getTipoPago().getIdtipopago());
		pedidoTipoEstado.setIdtipoproducto(request.getTipoProducto().getIdtipoproducto());			
		PedidotipoestadoPK pedidotipoestadoPK = new PedidotipoestadoPK();
		pedidotipoestadoPK.setIdestadopedido(estadoPedido.getIdestadopedido());
		pedidotipoestadoPK.setIdpedido(pedido.getIdpedido());
		pedidotipoestadoPK.setIdtipopedido(tipoPedido.getIdtipopedido());				
		pedidoTipoEstado.setPedidotipoestadoPK(pedidotipoestadoPK);
		pedidoTipoEstado = pedidoTipoEsadoServ.save(pedidoTipoEstado);
		
		GestionPedidoDTO response = request;
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Pedido CREAR Parametro response\n");
		util.getStringBuilder().append("==> Pedido Response\n");
		util.getStringBuilder().append(response.getPedido());
		util.getStringBuilder().append("\n==> Estado Pedido Response\n");
		util.getStringBuilder().append(response.getPedido());
		util.getStringBuilder().append("\n==> Tipo Pedido Response\n");
		util.getStringBuilder().append(response.getTipoPedido());
		util.getStringBuilder().append("\n==> Pedido Tipo Estado\n");
		util.getStringBuilder().append(pedidoTipoEstado);
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
