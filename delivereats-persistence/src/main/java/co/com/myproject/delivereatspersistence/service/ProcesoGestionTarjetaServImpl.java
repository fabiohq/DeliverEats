package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionTarjetaDTO;
import co.com.myproject.delivereatspersistence.entity.Estadotarjeta;
import co.com.myproject.delivereatspersistence.entity.Tarjeta;
import co.com.myproject.delivereatspersistence.entity.Tarjetaestadotipo;
import co.com.myproject.delivereatspersistence.entity.TarjetaestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipotarjeta;
import co.com.myproject.delivereatspersistence.vo.EstadotarjetaVO;
import co.com.myproject.delivereatspersistence.vo.TarjetaVO;
import co.com.myproject.delivereatspersistence.vo.TipotarjetaVO;

public class ProcesoGestionTarjetaServImpl extends AbstractProcesoServ implements IProcesoGestionTarjetaServ{

	@Override
	public GestionTarjetaDTO crear(GestionTarjetaDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionTarjetaServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tarjeta\n");
		util.getStringBuilder().append(request.getTarjeta()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		TarjetaVO tarjetaVO = request.getTarjeta();
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setAnio(tarjetaVO.getAnio());
		tarjeta.setCodseguridad(tarjetaVO.getCodseguridad());
		tarjeta.setFranquicia(tarjetaVO.getFranquicia());
		tarjeta.setMes(tarjetaVO.getMes());
		tarjeta.setNombreusuario(tarjetaVO.getNombreusuario());
		tarjeta.setNumero(tarjetaVO.getNumero());
		tarjeta = tarjetaServ.save(tarjeta);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Tarjeta\n");
		util.getStringBuilder().append(request.getTipotarjeta());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipotarjetaVO tipoTarjetaVO = request.getTipotarjeta();
		Tipotarjeta tipotarjeta = new Tipotarjeta();
		tipotarjeta.setNombre(tipoTarjetaVO.getNombre());
		tipotarjeta.setObservacion(tipoTarjetaVO.getObservacion());
		tipotarjeta = tipoTarjetaServ.save(tipotarjeta);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Tarjeta\n");
		util.getStringBuilder().append(request.getEstadoTarjeta());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadotarjetaVO estadoTarjetaVO = request.getEstadoTarjeta();
		Estadotarjeta estadotarjeta = new Estadotarjeta();
		estadotarjeta.setCodigo(estadoTarjetaVO.getCodigo());
		estadotarjeta.setNombre(estadoTarjetaVO.getNombre());
		estadotarjeta = estadoTarjetaServ.save(estadotarjeta);
		
		Tarjetaestadotipo tarjetaEstadoTipo = new Tarjetaestadotipo();
		TarjetaestadotipoPK tarjetaestadotipoPK = new TarjetaestadotipoPK();
		tarjetaestadotipoPK.setIdestadotrajeta(estadotarjeta.getIdestadotrajeta());
		tarjetaestadotipoPK.setIdtarjeta(tarjeta.getIdtarjeta());
		tarjetaestadotipoPK.setIdtipotarjeta(tipotarjeta.getIdtipotarjeta());
		tarjetaEstadoTipo.setTarjetaestadotipoPK(tarjetaestadotipoPK);
		tarjetaEstadoTipo = tarjetaEstadoTipoServ.save(tarjetaEstadoTipo);
		
		GestionTarjetaDTO response = request;
		response.getEstadoTarjeta().setIdestadotrajeta(estadotarjeta.getIdestadotrajeta());
		response.getTarjeta().setIdtarjeta(tarjeta.getIdtarjeta());
		response.getTipotarjeta().setIdtipotarjeta(tipotarjeta.getIdtipotarjeta());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Tarjeta CREAR Parametro response\n");
		util.getStringBuilder().append("==> Tarjeta Response\n");
		util.getStringBuilder().append(response.getTarjeta());
		util.getStringBuilder().append("\n==> Tipo Tarjeta Response\n");
		util.getStringBuilder().append(response.getTipotarjeta());
		util.getStringBuilder().append("\n==> Estado Tarjeta Response\n");
		util.getStringBuilder().append(response.getEstadoTarjeta());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
