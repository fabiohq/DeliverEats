package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.ActorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.EstadoactorsistemaVO;
import co.com.myproject.delivereatspersistence.vo.TipoactorsistemaVO;

public class GestionActorSistemaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private ActorsistemaVO actorSistema;
	private TipoactorsistemaVO tipoActorSistema;
	private EstadoactorsistemaVO estadoActorSistema;
	
	public ActorsistemaVO getActorSistema() {
		return actorSistema;
	}
	public void setActorSistema(ActorsistemaVO actorSistema) {
		this.actorSistema = actorSistema;
	}
	public TipoactorsistemaVO getTipoActorSistema() {
		return tipoActorSistema;
	}
	public void setTipoActorSistema(TipoactorsistemaVO tipoActorSistema) {
		this.tipoActorSistema = tipoActorSistema;
	}
	public EstadoactorsistemaVO getEstadoActorSistema() {
		return estadoActorSistema;
	}
	public void setEstadoActorSistema(EstadoactorsistemaVO estadoActorSistema) {
		this.estadoActorSistema = estadoActorSistema;
	}
	
	
}
