package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionRolDTO;
import co.com.myproject.delivereatspersistence.entity.Estadorol;
import co.com.myproject.delivereatspersistence.entity.Rol;
import co.com.myproject.delivereatspersistence.entity.Rolestadotipo;
import co.com.myproject.delivereatspersistence.entity.RolestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tiporol;
import co.com.myproject.delivereatspersistence.vo.EstadorolVO;
import co.com.myproject.delivereatspersistence.vo.RolVO;
import co.com.myproject.delivereatspersistence.vo.TiporolVO;

public class ProcesoGestionRolServImpl extends AbstractProcesoServ implements IProcesoGestionRolServ{

	@Override
	public GestionRolDTO crear(GestionRolDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionRolServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Rol\n");
		util.getStringBuilder().append(request.getRol()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		RolVO rolVO = request.getRol();
		Rol rol = new Rol();
		rol.setFechafin(rolVO.getFechafin());
		rol.setFechaini(rolVO.getFechaini());
		rol.setNombre(rolVO.getNombre());
		rol.setObsservacion(rolVO.getObsservacion());
		rol=rolServ.save(rol);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Rol\n");
		util.getStringBuilder().append(request.getTipoRol());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TiporolVO tipoRolVO = request.getTipoRol();
		Tiporol tipoRol = new Tiporol();
		tipoRol.setNombre(tipoRolVO.getNombre());
		tipoRol.setObservacion(tipoRolVO.getObservacion());
		tipoRol=tipoRolServ.save(tipoRol);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Rol\n");
		util.getStringBuilder().append(request.getEstadoRol());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadorolVO estadoRolVO = request.getEstadoRol();
		Estadorol estadoRol = new Estadorol();
		estadoRol.setCodigo(estadoRolVO.getCodigo());
		estadoRol.setNombre(estadoRolVO.getNombre());
		estadoRol=estadoRolServ.save(estadoRol);
		
		Rolestadotipo rolEstadoTipo = new Rolestadotipo();
		RolestadotipoPK rolestadotipoPK = new RolestadotipoPK();
		rolestadotipoPK.setIdestadorol(estadoRol.getIdestadorol());
		rolestadotipoPK.setIdrol(rol.getIdrol());
		rolestadotipoPK.setIdtiporol(tipoRol.getIdtiporol());		
		rolEstadoTipo.setRolestadotipoPK(rolestadotipoPK);
		rolEstadoTipoServ.save(rolEstadoTipo);
		
		GestionRolDTO response = request;
		response.getEstadoRol().setIdestadorol(estadoRol.getIdestadorol());
		response.getRol().setIdrol(rol.getIdrol());
		response.getTipoRol().setIdtiporol(tipoRol.getIdtiporol());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Rol CREAR Parametro response\n");
		util.getStringBuilder().append("==> Rol Response\n");
		util.getStringBuilder().append(response.getRol());
		util.getStringBuilder().append("\n==> Tipo Rol Response\n");
		util.getStringBuilder().append(response.getTipoRol());
		util.getStringBuilder().append("\n==> Estado Rol Response\n");
		util.getStringBuilder().append(response.getEstadoRol());
		util.pintarLog(log, util.getStringBuilder().toString());
		return null;
	}

}
