package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Telefono;

public interface ITelefonoServ {
	
	public Telefono getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Telefono save(Telefono entity) throws Exception;
	
	public List<Telefono> saveAll(List<Telefono> entities) throws Exception;
	
	public Telefono update(Telefono entity) throws Exception;
	
	public List<Telefono> updateAll(List<Telefono> entities) throws Exception;
	
	public void delete(Telefono entity) throws Exception;
	
	public void deleteAll(List<Telefono> entities) throws Exception;
}
