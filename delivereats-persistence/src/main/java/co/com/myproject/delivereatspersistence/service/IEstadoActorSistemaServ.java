package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Estadoactorsistema;

public interface IEstadoActorSistemaServ {

public List<Estadoactorsistema> findAll() throws Exception;
	
	public Optional<Estadoactorsistema> findById(Integer id) throws Exception;
	
	public Estadoactorsistema getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadoactorsistema save(Estadoactorsistema entity) throws Exception;
	
	public List<Estadoactorsistema> saveAll(List<Estadoactorsistema> entities) throws Exception;
	
	public Estadoactorsistema update(Estadoactorsistema entity) throws Exception;
	
	public List<Estadoactorsistema> updateAll(List<Estadoactorsistema> entities) throws Exception;
	
	public void delete(Estadoactorsistema entity) throws Exception;
	
	public void deleteAll(List<Estadoactorsistema> entities) throws Exception;
}
