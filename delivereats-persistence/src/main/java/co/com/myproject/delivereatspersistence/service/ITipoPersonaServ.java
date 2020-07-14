package co.com.myproject.delivereatspersistence.service;

import java.util.List;
import java.util.Optional;

import co.com.myproject.delivereatspersistence.entity.Tipopersona;

public interface ITipoPersonaServ {

	public List<Tipopersona> findAll() throws Exception;
	
	public Optional<Tipopersona> findById(Integer id) throws Exception;
	
	public Tipopersona getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipopersona save(Tipopersona entity) throws Exception;
	
	public List<Tipopersona> saveAll(List<Tipopersona> entities) throws Exception;
	
	public Tipopersona update(Tipopersona entity) throws Exception;
	
	public List<Tipopersona> updateAll(List<Tipopersona> entities) throws Exception;
	
	public void delete(Tipopersona entity) throws Exception;
	
	public void deleteAll(List<Tipopersona> entities)throws Exception;
}
