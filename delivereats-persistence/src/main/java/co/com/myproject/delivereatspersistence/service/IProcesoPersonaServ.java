package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Procesopersona;

public interface IProcesoPersonaServ {
	
	public Procesopersona getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Procesopersona save(Procesopersona entity) throws Exception;
	
	public List<Procesopersona> saveAll(List<Procesopersona> entities) throws Exception;
	
	public Procesopersona update(Procesopersona entity) throws Exception;
	
	public List<Procesopersona> updateAll(List<Procesopersona> entities) throws Exception;
	
	public void delete(Procesopersona entity) throws Exception;
	
	public void deleteAll(List<Procesopersona> entities) throws Exception;
}
