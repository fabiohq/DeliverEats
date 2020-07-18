package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Credenciales;

public interface ICredencialesServ {

	public Credenciales getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Credenciales save(Credenciales entity) throws Exception;
	
	public List<Credenciales> saveAll(List<Credenciales> entities) throws Exception;
	
	public Credenciales update(Credenciales entity) throws Exception;
	
	public List<Credenciales> updateAll(List<Credenciales> entities) throws Exception;
	
	public void delete(Credenciales entity) throws Exception;
	
	public void deleteAll(List<Credenciales> entities) throws Exception;
}
