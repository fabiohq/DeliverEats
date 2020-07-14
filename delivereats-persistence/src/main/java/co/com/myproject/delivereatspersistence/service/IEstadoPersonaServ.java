package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Estadopersona;

public interface IEstadoPersonaServ {

	public List<Estadopersona> findAll() throws Exception;
	
	public Optional<Estadopersona> findById(Integer id) throws Exception;
	
	public Estadopersona getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadopersona save(Estadopersona entity) throws Exception;
	
	public List<Estadopersona> saveAll(List<Estadopersona> entities) throws Exception;
	
	public Estadopersona update(Estadopersona entity) throws Exception;
	
	public List<Estadopersona> updateAll(List<Estadopersona> entities) throws Exception;
	
	public void delete(Estadopersona entity) throws Exception;
	
	public void deleteAll(List<Estadopersona> entities) throws Exception;
}
