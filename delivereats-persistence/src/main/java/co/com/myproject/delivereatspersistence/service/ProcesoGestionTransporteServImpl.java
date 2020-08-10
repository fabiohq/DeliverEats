package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionTransporteDTO;
import co.com.myproject.delivereatspersistence.entity.Estadotransporte;
import co.com.myproject.delivereatspersistence.entity.Tipotransporte;
import co.com.myproject.delivereatspersistence.entity.Transporte;
import co.com.myproject.delivereatspersistence.entity.Transporteestadotipo;
import co.com.myproject.delivereatspersistence.entity.TransporteestadotipoPK;
import co.com.myproject.delivereatspersistence.vo.EstadotransporteVO;
import co.com.myproject.delivereatspersistence.vo.TipotransporteVO;
import co.com.myproject.delivereatspersistence.vo.TransporteVO;

public class ProcesoGestionTransporteServImpl extends AbstractProcesoServ implements IProcesoGestionTransporteServ{

	@Override
	public GestionTransporteDTO crear(GestionTransporteDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionTransporteServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Transporte\n");
		util.getStringBuilder().append(request.getTransporte()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		TransporteVO transporteVO = request.getTransporte();
		Transporte transporte = new Transporte();
		transporte.setFechafin(transporteVO.getFechafin());
		transporte.setFechaini(transporteVO.getFechaini());
		transporte.setNombre(transporteVO.getNombre());
		transporte.setObservacion(transporteVO.getObservacion());
		transporte.setPlaca(transporteVO.getPlaca());
		transporte.setSeguro(transporteVO.getSeguro());
		transporte=transporteServ.save(transporte);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Transporte\n");
		util.getStringBuilder().append(request.getTipoTransporte());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipotransporteVO tipoTransporteVO = request.getTipoTransporte();
		Tipotransporte tipoTransporte = new Tipotransporte();
		tipoTransporte.setNombre(tipoTransporteVO.getNombre());
		tipoTransporte.setObservacion(tipoTransporteVO.getObservacion());
		tipoTransporte=tipoTransporteServ.save(tipoTransporte);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Transporte\n");
		util.getStringBuilder().append(request.getEstadoTransporte());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadotransporteVO estadotransporteVO = request.getEstadoTransporte();
		Estadotransporte estadotransporte = new Estadotransporte();
		estadotransporte.setCodigo(estadotransporteVO.getCodigo());
		estadotransporte.setNombre(estadotransporteVO.getNombre());
		estadotransporte= estadoTransporteServ.save(estadotransporte);
		
		Transporteestadotipo transporteEstadoTipo = new Transporteestadotipo();
		TransporteestadotipoPK transporteestadotipoPK = new TransporteestadotipoPK();
		transporteestadotipoPK.setIdestadotransporte(estadotransporte.getIdestadotransporte());
		transporteestadotipoPK.setIdtipotransporte(tipoTransporte.getIdtipotransporte());
		transporteestadotipoPK.setIdtransporte(transporte.getIdtransporte());		
		transporteEstadoTipo.setTransporteestadotipoPK(transporteestadotipoPK);
		transporteEstadoTipo=transporteEstadoTipoServ.save(transporteEstadoTipo);
		
		GestionTransporteDTO response = request;
		response.getEstadoTransporte().setIdestadotransporte(estadotransporte.getIdestadotransporte());
		response.getTipoTransporte().setIdtipotransporte(tipoTransporte.getIdtipotransporte());
		response.getTransporte().setIdtransporte(transporte.getIdtransporte());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Transporte CREAR Parametro response\n");
		util.getStringBuilder().append("==> Transporte Response\n");
		util.getStringBuilder().append(response.getTransporte());
		util.getStringBuilder().append("\n==> Tipo Transporte Response\n");
		util.getStringBuilder().append(response.getTipoTransporte());
		util.getStringBuilder().append("\n==> Estado Transporte Response\n");
		util.getStringBuilder().append(response.getEstadoTransporte());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
