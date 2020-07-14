package co.com.myproject.delivereatspersistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.dto.GestionPersonaDTO;
import co.com.myproject.delivereatspersistence.entity.Estadopersona;
import co.com.myproject.delivereatspersistence.entity.Persona;
import co.com.myproject.delivereatspersistence.entity.Personaestadotipo;
import co.com.myproject.delivereatspersistence.entity.PersonaestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipopersona;
import co.com.myproject.delivereatspersistence.vo.EstadopersonaVO;
import co.com.myproject.delivereatspersistence.vo.PersonaVO;
import co.com.myproject.delivereatspersistence.vo.TipopersonaVO;

@Service
public class ProcesoGestionPersonaServImpl implements IProcesoGestionPersonaServ{

	@Autowired IPersonaServ PersonaServ;
	@Autowired ITipoPersonaServ tipoPersonaServ;
	@Autowired IEstadoPersonaServ estadoPersonaServ;
	@Autowired IPersonaEstadoTipoServ personaEstadoTipoServ;
	@Override	
	public GestionPersonaDTO crear(GestionPersonaDTO request) throws Exception {
		
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
		persona=PersonaServ.save(persona);
		
		TipopersonaVO tipoPersonaVO= request.getTipoPersona();
		Tipopersona tipoPersona = new Tipopersona();
		tipoPersona.setFechafin(tipoPersonaVO.getFechafin());
		tipoPersona.setFechaini(tipoPersonaVO.getFechaini());
		tipoPersona.setNombre(tipoPersonaVO.getNombre());
		tipoPersona.setObservacion(tipoPersonaVO.getObservacion());
		tipoPersona=tipoPersonaServ.save(tipoPersona);
		
		EstadopersonaVO estadoPersonaVO = request.getEstadoPersona();
		Estadopersona estadoPersona = new Estadopersona();
		estadoPersona.setCodigo(estadoPersonaVO.getCodigo());
		estadoPersona.setNombre(estadoPersonaVO.getNombre());
		estadoPersona=estadoPersonaServ.save(estadoPersona);
		
		Personaestadotipo personaEstadoTipo = new Personaestadotipo();
		PersonaestadotipoPK personaestadotipoPK = new PersonaestadotipoPK();
		personaestadotipoPK.setIdestadopersona(estadoPersona.getIdestadopersona());
		personaestadotipoPK.setIdpersona(persona.getIdpersona());
		personaestadotipoPK.setIdtipopersona(tipoPersona.getIdtipopersona());
		personaEstadoTipo.setPersonaestadotipoPK(personaestadotipoPK);
		personaEstadoTipo=personaEstadoTipoServ.save(personaEstadoTipo);
		
		GestionPersonaDTO response = request;
		estadoPersonaVO.setIdestadopersona(estadoPersona.getIdestadopersona());
		response.setEstadoPersona(estadoPersonaVO);
		personaVO.setIdpersona(persona.getIdpersona());
		response.setPersona(personaVO);
		tipoPersonaVO.setIdtipopersona(tipoPersona.getIdtipopersona());
		response.setTipoPersona(tipoPersonaVO);
		
		return response;
	}

	
}
