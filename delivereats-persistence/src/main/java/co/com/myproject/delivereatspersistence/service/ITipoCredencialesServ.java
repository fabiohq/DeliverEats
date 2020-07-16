package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Tipocredenciales;

public interface ITipoCredencialesServ {
	
	public Tipocredenciales getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Tipocredenciales save(Tipocredenciales entity) throws Exception;
	
	public List<Tipocredenciales> saveAll(List<Tipocredenciales> entities) throws Exception;
	
	public Tipocredenciales update(Tipocredenciales entity) throws Exception;
	
	public List<Tipocredenciales> updateAll(List<Tipocredenciales> entities) throws Exception;
	
	public void delete(Tipocredenciales entity) throws Exception;
	
	public void deleteAll(List<Tipocredenciales> entities) throws Exception;
}
