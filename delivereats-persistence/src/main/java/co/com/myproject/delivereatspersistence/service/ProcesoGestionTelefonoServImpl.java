package co.com.myproject.delivereatspersistence.service;

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
		
		TelefonoVO telefonoVO = request.getTelefono();
		Telefono telefono = new Telefono();
		telefono.setFechaini(telefonoVO.getFechaini());
		telefono.setFehcafin(telefonoVO.getFehcafin());
		telefono.setNumero(telefonoVO.getNumero());
		telefono.setObservacion(telefonoVO.getObservacion());
		telefono=telefonoServ.save(telefono);
		
		TipotelefonoVO tipoTelefonoVO = request.getTipoTelefono();
		Tipotelefono tipoTelefono = new Tipotelefono();
		tipoTelefono.setNombre(tipoTelefonoVO.getNombre());
		tipoTelefono.setObservacion(tipoTelefonoVO.getObservacion());
		tipoTelefono=tipoTelefonoServ.save(tipoTelefono);
		
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
		
		telefonoVO.setIdtelefono(telefono.getIdtelefono());
		tipoTelefonoVO.setIdtipotelefono(tipoTelefono.getIdtipotelefono());
		estadoTelefonoVO.setIdestadotelefono(estadoTelefono.getIdestadotelefono());
		GestionTelefonoDTO response = new GestionTelefonoDTO();
		response.setEstadoTelefono(estadoTelefonoVO);
		response.setTelefono(telefonoVO);
		response.setTipoTelefono(tipoTelefonoVO);
		
		return response;
	}


}
