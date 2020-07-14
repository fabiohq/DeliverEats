package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Persona;

public interface IPersonaServ {

	public List<Persona> findAll()throws Exception;
	
	public Optional<Persona> findById(Integer id) throws Exception;
	
	public Persona getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Persona save(Persona entity) throws Exception;
	
	public List<Persona> saveAll(List<Persona> entities) throws Exception;
	
	public Persona update(Persona entity) throws Exception;
	
	public List<Persona> updateAll(List<Persona> entities) throws Exception;
	
	public void delete(Persona entity) throws Exception;
	
	public void deleteAll(List<Persona> entities) throws Exception;
}
