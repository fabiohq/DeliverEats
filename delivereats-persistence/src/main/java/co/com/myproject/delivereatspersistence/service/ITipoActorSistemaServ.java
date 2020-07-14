package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Tipoactorsistema;

public interface ITipoActorSistemaServ {

	public List<Tipoactorsistema> findAll() throws Exception;
	
	public Optional<Tipoactorsistema> findById(Integer id) throws Exception;
	
	public Tipoactorsistema getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipoactorsistema save(Tipoactorsistema entity) throws Exception;
	
	public List<Tipoactorsistema> saveAll(List<Tipoactorsistema> entities) throws Exception;
	
	public Tipoactorsistema update(Tipoactorsistema entity) throws Exception;
	
	public List<Tipoactorsistema> updateAll(List<Tipoactorsistema> entities) throws Exception;
	
	public void delete(Tipoactorsistema entity) throws Exception;
	
	public void deleteAll(List<Tipoactorsistema> entities) throws Exception;
}
