package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Estadocredenciales;

public interface IEstadoCredencialesServ {

	public Estadocredenciales getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Estadocredenciales save(Estadocredenciales entity) throws Exception;
	
	public List<Estadocredenciales> saveAll(List<Estadocredenciales> entities) throws Exception;
	
	public Estadocredenciales update(Estadocredenciales entity) throws Exception;
	
	public List<Estadocredenciales> updateAll(List<Estadocredenciales> entities) throws Exception;
	
	public void delete(Estadocredenciales entity) throws Exception;
	
	public void deleteAll(List<Estadocredenciales> entities) throws Exception;
}
