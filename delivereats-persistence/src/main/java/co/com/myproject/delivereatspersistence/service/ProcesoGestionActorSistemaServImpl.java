package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionActorSistemaDTO;
import co.com.myproject.delivereatspersistence.entity.Actorsistema;
import co.com.myproject.delivereatspersistence.entity.Actorsistemaestadotipo;
import co.com.myproject.delivereatspersistence.entity.ActorsistemaestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Estadoactorsistema;
import co.com.myproject.delivereatspersistence.entity.Tipoactorsistema;
import co.com.myproject.delivereatspersistence.vo.ActorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.EstadoactorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.TipoactorsistemaVO;

public class ProcesoGestionActorSistemaServImpl extends AbstractProcesoServ implements IProcesoGestionActorSistemaServ{

	@Override
	public GestionActorSistemaDTO crear(GestionActorSistemaDTO request) throws Exception {
		Logger log =util.getLoggger(ProcesoGestionActorSistemaServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Actor Sistema\n");
		util.getStringBuilder().append(request.getActorSistema()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		ActorsistemaVO actorSistemaVO = request.getActorSistema();
		Actorsistema actorSistema = new Actorsistema();
		actorSistema.setIdactorsistema(actorSistemaVO.getIdactorsistema());
		actorSistema.setIdprocesopersona(actorSistemaVO.getIdprocesopersona());		
		actorSistema=actorSistemaServ.save(actorSistema);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Actor Sistema\n");
		util.getStringBuilder().append(request.getTipoActorSistema());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipoactorsistemaVO tipoActorsistemaVO = request.getTipoActorSistema();
		Tipoactorsistema tipoActorsistema = new Tipoactorsistema();
		tipoActorsistema.setCodigo(tipoActorsistemaVO.getCodigo());
		tipoActorsistema.setNombre(tipoActorsistemaVO.getNombre());
		tipoActorsistema.setObservaacion(tipoActorsistemaVO.getObservaacion());
		tipoActorsistema=tipoActorSistemaServ.save(tipoActorsistema);
				
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Actor Sistema\n");
		util.getStringBuilder().append(request.getEstadoActorSistema());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoactorsistemaVO estadoActorSistemaVO = request.getEstadoActorSistema();
		Estadoactorsistema estadoactorsistema = new Estadoactorsistema();
		estadoactorsistema.setCodgo(estadoActorSistemaVO.getCodgo());
		estadoactorsistema.setNombre(estadoActorSistemaVO.getNombre());
		estadoactorsistema = estadoActorSistemaServ.save(estadoactorsistema);
				
		Actorsistemaestadotipo actorsistemaestadotipo = new Actorsistemaestadotipo();
		ActorsistemaestadotipoPK actorsistemaestadotipoPK = new ActorsistemaestadotipoPK();
		actorsistemaestadotipoPK.setIdactorsistema(actorSistema.getIdactorsistema());
		actorsistemaestadotipoPK.setIdestadoactorsistema(estadoactorsistema.getIdestadoactorsistema());
		actorsistemaestadotipoPK.setIdtipoactorsistema(tipoActorsistema.getIdtipoactorsistema());
		actorsistemaestadotipo.setActorsistemaestadotipoPK(actorsistemaestadotipoPK);
		actorsistemaestadotipo=actorSistemaEstadoTipoServ.save(actorsistemaestadotipo);
					
		GestionActorSistemaDTO response = request;
		response.getActorSistema().setIdactorsistema(actorSistema.getIdactorsistema());
		response.getEstadoActorSistema().setIdestadoactorsistema(estadoactorsistema.getIdestadoactorsistema());
		response.getTipoActorSistema().setIdtipoactorsistema(tipoActorsistema.getIdtipoactorsistema());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Actor Sistema CREAR Parametro response\n");
		util.getStringBuilder().append("==> Actor Sistema Response\n");
		util.getStringBuilder().append(response.getActorSistema());
		util.getStringBuilder().append("\n==> Estado Actor Sistema Response\n");
		util.getStringBuilder().append(response.getEstadoActorSistema());
		util.getStringBuilder().append("\n==> Tipo Actor Sistema Response\n");
		util.getStringBuilder().append(response.getTipoActorSistema());
		util.pintarLog(log, util.getStringBuilder().toString());
		return response;
	}

	
}
