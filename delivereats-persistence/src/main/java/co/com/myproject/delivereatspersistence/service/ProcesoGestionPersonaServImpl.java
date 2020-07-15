package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.dto.GestionPersonaDTO;
import co.com.myproject.delivereatspersistence.entity.Estadopersona;
import co.com.myproject.delivereatspersistence.entity.Persona;
import co.com.myproject.delivereatspersistence.entity.Personaestadotipo;
import co.com.myproject.delivereatspersistence.entity.PersonaestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipopersona;
import co.com.myproject.delivereatspersistence.helpers.AbstractUtil;
import co.com.myproject.delivereatspersistence.vo.EstadopersonaVO;
import co.com.myproject.delivereatspersistence.vo.PersonaVO;
import co.com.myproject.delivereatspersistence.vo.TipopersonaVO;

@Service
public class ProcesoGestionPersonaServImpl extends AbstractUtil implements IProcesoGestionPersonaServ{

	private Logger log;
	@Autowired IPersonaServ personaServ;
	@Autowired ITipoPersonaServ tipoPersonaServ;
	@Autowired IEstadoPersonaServ estadoPersonaServ;
	@Autowired IPersonaEstadoTipoServ personaEstadoTipoServ;
	@Override	
	public GestionPersonaDTO crear(GestionPersonaDTO request) throws Exception {
		
		log =util.getLoggger(ProcesoGestionPersonaServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando persona\n");
		util.getStringBuilder().append(request.getPersona()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		 
		
		PersonaVO personaVO = request.getPersona();
		Persona persona = new Persona();
		persona.setAnionacimiento(personaVO.getAnionacimiento());
		persona.setApellido1(personaVO.getApellido1());
		persona.setApellido2(personaVO.getApellido2());
		persona.setDianacimiento(personaVO.getDianacimiento());
		persona.setFechafin(personaVO.getFechafin());
		persona.setFechaini(personaVO.getFechaini());
		persona.setMesnacimiento(personaVO.getMesnacimiento());
		persona.setNombre1(personaVO.getNombre1());
		persona.setNombre2(personaVO.getNombre2());
		persona.setObservaciones(personaVO.getObservaciones());
		persona=personaServ.save(persona);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Persona\n");
		util.getStringBuilder().append(request.getTipoPersona());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipopersonaVO tipoPersonaVO= request.getTipoPersona();
		Tipopersona tipoPersona = new Tipopersona();
		tipoPersona.setFechafin(tipoPersonaVO.getFechafin());
		tipoPersona.setFechaini(tipoPersonaVO.getFechaini());
		tipoPersona.setNombre(tipoPersonaVO.getNombre());
		tipoPersona.setObservacion(tipoPersonaVO.getObservacion());
		tipoPersona=tipoPersonaServ.save(tipoPersona);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Persona\n");
		util.getStringBuilder().append(request.getEstadoPersona());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadopersonaVO estadoPersonaVO = request.getEstadoPersona();
		Estadopersona estadoPersona = new Estadopersona();
		estadoPersona.setCodigo(estadoPersonaVO.getCodigo());
		estadoPersona.setNombre(estadoPersonaVO.getNombre());
		estadoPersona=estadoPersonaServ.save(estadoPersona);
				
		PersonaestadotipoPK personaestadotipoPK = new PersonaestadotipoPK();
		personaestadotipoPK.setIdestadopersona(estadoPersona.getIdestadopersona());
		personaestadotipoPK.setIdpersona(persona.getIdpersona());
		personaestadotipoPK.setIdtipopersona(tipoPersona.getIdtipopersona());
		Personaestadotipo personaEstadoTipo = new Personaestadotipo();
		personaEstadoTipo.setPersonaestadotipoPK(personaestadotipoPK);
		personaEstadoTipo=personaEstadoTipoServ.save(personaEstadoTipo);
		
		GestionPersonaDTO response = request;
		estadoPersonaVO.setIdestadopersona(estadoPersona.getIdestadopersona());
		response.setEstadoPersona(estadoPersonaVO);
		personaVO.setIdpersona(persona.getIdpersona());
		response.setPersona(personaVO);
		tipoPersonaVO.setIdtipopersona(tipoPersona.getIdtipopersona());
		response.setTipoPersona(tipoPersonaVO);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Persona CREAR Parametro response\n");
		util.getStringBuilder().append("==> Persona\n");
		util.getStringBuilder().append(response.getPersona());
		util.getStringBuilder().append("\n==> Tipo Persona Response\n");
		util.getStringBuilder().append(response.getTipoPersona());
		util.getStringBuilder().append("\n==> Estado Persona Response\n");
		util.getStringBuilder().append(response.getEstadoPersona());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

	
}
