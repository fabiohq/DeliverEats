package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadopersonaVO;
import co.com.myproject.delivereatspersistence.vo.PersonaVO;
import co.com.myproject.delivereatspersistence.vo.TipopersonaVO;

public class GestionPersonaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private PersonaVO persona;
	private TipopersonaVO tipoPersona;
	private EstadopersonaVO estadoPersona;
	
	public PersonaVO getPersona() {
		return persona;
	}
	public void setPersona(PersonaVO persona) {
		this.persona = persona;
	}
	public TipopersonaVO getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(TipopersonaVO tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public EstadopersonaVO getEstadoPersona() {
		return estadoPersona;
	}
	public void setEstadoPersona(EstadopersonaVO estadoPersona) {
		this.estadoPersona = estadoPersona;
	}
	
	
}
