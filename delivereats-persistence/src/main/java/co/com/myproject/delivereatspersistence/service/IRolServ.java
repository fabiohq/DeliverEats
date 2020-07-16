package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Rol;

public interface IRolServ {
	
	public Rol getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Rol save(Rol entity) throws Exception;
	
	public List<Rol> saveAll(List<Rol> entities) throws Exception;
	
	public Rol update(Rol entity) throws Exception;
	
	public List<Rol> updateAll(List<Rol> entities) throws Exception;
	
	public void delete(Rol entity) throws Exception;
	
	public void deleteAll(List<Rol> entities) throws Exception;
}
