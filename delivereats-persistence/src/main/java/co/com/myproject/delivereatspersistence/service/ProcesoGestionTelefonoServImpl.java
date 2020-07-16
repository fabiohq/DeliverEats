package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionTelefonoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadotelefono;
import co.com.myproject.delivereatspersistence.entity.Telefono;
import co.com.myproject.delivereatspersistence.entity.Telefonoestadotipo;
import co.com.myproject.delivereatspersistence.entity.TelefonoestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipotelefono;
import co.com.myproject.delivereatspersistence.vo.EstadotelefonoVO;
import co.com.myproject.delivereatspersistence.vo.TelefonoVO;
import co.com.myproject.delivereatspersistence.vo.TipotelefonoVO;

public class ProcesoGestionTelefonoServImpl extends AbstractProcesoServ implements IProcesoGestionTelefonoServ{

	@Override
	public GestionTelefonoDTO crear(GestionTelefonoDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionTelefonoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Telefono\n");
		util.getStringBuilder().append(request.getTelefono()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		TelefonoVO telefonoVO = request.getTelefono();
		Telefono telefono = new Telefono();
		telefono.setFechaini(telefonoVO.getFechaini());
		telefono.setFehcafin(telefonoVO.getFehcafin());
		telefono.setNumero(telefonoVO.getNumero());
		telefono.setObservacion(telefonoVO.getObservacion());
		telefono=telefonoServ.save(telefono);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Telefono\n");
		util.getStringBuilder().append(request.getTipoTelefono());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipotelefonoVO tipoTelefonoVO = request.getTipoTelefono();
		Tipotelefono tipoTelefono = new Tipotelefono();
		tipoTelefono.setNombre(tipoTelefonoVO.getNombre());
		tipoTelefono.setObservacion(tipoTelefonoVO.getObservacion());
		tipoTelefono=tipoTelefonoServ.save(tipoTelefono);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Telefono\n");
		util.getStringBuilder().append(request.getEstadoTelefono());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadotelefonoVO estadoTelefonoVO = request.getEstadoTelefono();
		Estadotelefono estadoTelefono = new Estadotelefono();
		estadoTelefono.setCodigo(estadoTelefonoVO.getCodigo());
		estadoTelefono.setNombre(estadoTelefonoVO.getNombre());
		estadoTelefono=estadoTelefonoServ.save(estadoTelefono);
		
		Telefonoestadotipo telefonoEstadoTipo = new Telefonoestadotipo();
		TelefonoestadotipoPK telefonoestadotipoPK = new TelefonoestadotipoPK();
		telefonoestadotipoPK.setIdestadotelefono(estadoTelefono.getIdestadotelefono());
		telefonoestadotipoPK.setIdtelefono(tipoTelefono.getIdtipotelefono());
		telefonoestadotipoPK.setIdtipotelefono(tipoTelefono.getIdtipotelefono());
		telefonoEstadoTipo.setTelefonoestadotipoPK(telefonoestadotipoPK);
		telefonoEstadoTipo =telefonoEstadoTipoServ.save(telefonoEstadoTipo);
		
		GestionTelefonoDTO response = request;
		response.getEstadoTelefono().setIdestadotelefono(estadoTelefono.getIdestadotelefono());
		response.getTelefono().setIdtelefono(telefono.getIdtelefono());
		response.getTipoTelefono().setIdtipotelefono(tipoTelefono.getIdtipotelefono());

		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Telefono CREAR Parametro response\n");
		util.getStringBuilder().append("==> Telefono Response\n");
		util.getStringBuilder().append(response.getTelefono());
		util.getStringBuilder().append("\n==> Tipo Telefono Response\n");
		util.getStringBuilder().append(response.getTipoTelefono());
		util.getStringBuilder().append("\n==> Estado Telefono Response\n");
		util.getStringBuilder().append(response.getEstadoTelefono());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}


}
