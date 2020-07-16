package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadoactorsistema;

public interface IEstadoActorSistemaServ {

	public List<Estadoactorsistema> saveAll(List<Estadoactorsistema> entities) throws Exception;
	
	public Estadoactorsistema update(Estadoactorsistema entity) throws Exception;
	
	public List<Estadoactorsistema> updateAll(List<Estadoactorsistema> entities) throws Exception;
	
	public void delete(Estadoactorsistema entity) throws Exception;
	
	public void deleteAll(List<Estadoactorsistema> entities) throws Exception;
}
